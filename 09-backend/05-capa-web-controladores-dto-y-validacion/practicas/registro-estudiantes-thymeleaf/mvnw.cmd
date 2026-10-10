@echo off
setlocal
REM Arranque auxiliar para Windows: instala Maven 3.9.9 en .mvn si no existe.
REM En el primer uso se requiere conexión a Internet.
set "RUTA_PROYECTO=%~dp0"
set "MAVEN_DIR=%RUTA_PROYECTO%.mvn\apache-maven-3.9.9"

if not exist "%MAVEN_DIR%\bin\mvn.cmd" (
    echo [INFO] Descargando Apache Maven 3.9.9 para este proyecto...
    powershell -NoProfile -ExecutionPolicy Bypass -Command "$ErrorActionPreference = 'Stop'; $dest = Join-Path $env:RUTA_PROYECTO '.mvn'; $zip = Join-Path $env:TEMP 'apache-maven-3.9.9-bin.zip'; Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.9/apache-maven-3.9.9-bin.zip' -OutFile $zip; Expand-Archive -Path $zip -DestinationPath $dest -Force; Remove-Item $zip -Force"
    if errorlevel 1 (
        echo [ERROR] No se pudo descargar Maven. Revisa tu conexion.
        exit /b 1
    )
)
call "%MAVEN_DIR%\bin\mvn.cmd" %*
exit /b %ERRORLEVEL%
