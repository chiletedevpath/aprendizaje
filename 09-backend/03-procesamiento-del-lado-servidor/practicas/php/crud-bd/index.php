<?php
include "conexion.php";

$sql = "SELECT * FROM personas ORDER BY id DESC";
$resultado = $conexion->query($sql);
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>CRUD PHP MySQL</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="css/estilos.css">
</head>

<body>

<nav class="navbar-brand-devpath">
    <div class="container d-flex justify-content-between align-items-center">

        <div class="marca-contenedor">
            <img
                src="assets/marca-logo-texto-fondo.png"
                alt="Logo Chilete DevPath"
                class="logo-devpath"
            >

            <div>
                <h2 class="marca-principal">Chilete DevPath</h2>
                <span class="marca-subtitulo">Practica de aprendizaje</span>
            </div>
        </div>

        <div class="badge-tecnologias">
            PHP - MySQL - Bootstrap
        </div>
    </div>
</nav>

<div class="container py-5">

    <div class="hero-crud mb-4">
        <div>
            <h1 class="titulo-principal">CRUD PHP + MySQL</h1>
            <p class="descripcion-principal">
                Sistema basico para registrar, listar, editar y eliminar personas utilizando PHP, MySQL y phpMyAdmin.
            </p>
        </div>

        <div class="estado-sistema">
            <span class="punto-estado"></span>
            Sistema local activo
        </div>
    </div>

    <div class="row g-4">
        <div class="col-md-4">
            <div class="card shadow-sm">
                <div class="card-header bg-primary text-white">
                    <h5 class="mb-0">
                        <i class="bi bi-person-plus-fill"></i> Registrar persona
                    </h5>
                </div>

                <div class="card-body">
                    <form action="controlador/registrar_persona.php" method="POST">

                        <div class="mb-3">
                            <label class="form-label">Nombres</label>
                            <input type="text" name="nombres" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Apellidos</label>
                            <input type="text" name="apellidos" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">DNI</label>
                            <input type="text" name="dni" class="form-control" maxlength="15" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Correo</label>
                            <input type="email" name="correo" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Telefono</label>
                            <input type="text" name="telefono" class="form-control" maxlength="20" required>
                        </div>

                        <button type="submit" name="btnRegistrar" class="btn btn-primary w-100">
                            <i class="bi bi-save-fill"></i> Guardar
                        </button>

                    </form>
                </div>
            </div>
        </div>

        <div class="col-md-8">
            <div class="card shadow-sm">
                <div class="card-header bg-dark text-white">
                    <h5 class="mb-0">
                        <i class="bi bi-table"></i> Lista de personas
                    </h5>
                </div>

                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-hover align-middle">
                            <thead class="table-dark">
                                <tr>
                                    <th>ID</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>DNI</th>
                                    <th>Correo</th>
                                    <th>Telefono</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>

                            <tbody>
                            <?php if ($resultado && $resultado->num_rows > 0): ?>
                                <?php while ($fila = $resultado->fetch_assoc()): ?>
                                    <tr>
                                        <td><?php echo $fila["id"]; ?></td>
                                        <td><?php echo htmlspecialchars($fila["nombres"]); ?></td>
                                        <td><?php echo htmlspecialchars($fila["apellidos"]); ?></td>
                                        <td><?php echo htmlspecialchars($fila["dni"]); ?></td>
                                        <td><?php echo htmlspecialchars($fila["correo"]); ?></td>
                                        <td><?php echo htmlspecialchars($fila["telefono"]); ?></td>
                                        <td class="text-center">
                                            <button
                                                class="btn btn-warning btn-sm"
                                                data-bs-toggle="modal"
                                                data-bs-target="#modalEditar<?php echo $fila['id']; ?>">
                                                <i class="bi bi-pencil-square"></i>
                                            </button>

                                            <a
                                                href="controlador/eliminar_persona.php?id=<?php echo $fila['id']; ?>"
                                                class="btn btn-danger btn-sm"
                                                onclick="return confirm('Seguro que deseas eliminar este registro?');">
                                                <i class="bi bi-trash-fill"></i>
                                            </a>
                                        </td>
                                    </tr>

                                    <div class="modal fade" id="modalEditar<?php echo $fila['id']; ?>" tabindex="-1">
                                        <div class="modal-dialog">
                                            <div class="modal-content">

                                                <div class="modal-header bg-warning">
                                                    <h5 class="modal-title">
                                                        <i class="bi bi-pencil-square"></i> Editar persona
                                                    </h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                                </div>

                                                <form action="controlador/actualizar_persona.php" method="POST">
                                                    <div class="modal-body">

                                                        <input type="hidden" name="id" value="<?php echo $fila['id']; ?>">

                                                        <div class="mb-3">
                                                            <label class="form-label">Nombres</label>
                                                            <input type="text" name="nombres" class="form-control" value="<?php echo htmlspecialchars($fila['nombres']); ?>" required>
                                                        </div>

                                                        <div class="mb-3">
                                                            <label class="form-label">Apellidos</label>
                                                            <input type="text" name="apellidos" class="form-control" value="<?php echo htmlspecialchars($fila['apellidos']); ?>" required>
                                                        </div>

                                                        <div class="mb-3">
                                                            <label class="form-label">DNI</label>
                                                            <input type="text" name="dni" class="form-control" value="<?php echo htmlspecialchars($fila['dni']); ?>" required>
                                                        </div>

                                                        <div class="mb-3">
                                                            <label class="form-label">Correo</label>
                                                            <input type="email" name="correo" class="form-control" value="<?php echo htmlspecialchars($fila['correo']); ?>" required>
                                                        </div>

                                                        <div class="mb-3">
                                                            <label class="form-label">Telefono</label>
                                                            <input type="text" name="telefono" class="form-control" value="<?php echo htmlspecialchars($fila['telefono']); ?>" required>
                                                        </div>

                                                    </div>

                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
                                                            Cancelar
                                                        </button>
                                                        <button type="submit" name="btnActualizar" class="btn btn-warning">
                                                            Actualizar
                                                        </button>
                                                    </div>
                                                </form>

                                            </div>
                                        </div>
                                    </div>

                                <?php endwhile; ?>
                            <?php else: ?>
                                <tr>
                                    <td colspan="7" class="text-center text-muted">
                                        No hay personas registradas.
                                    </td>
                                </tr>
                            <?php endif; ?>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
