import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ArchivosTextoBasicos {
    public static void main(String[] args) {
        Path archivo = Path.of("avance-demo.txt");

        try {
            // write crea o reemplaza el archivo con las líneas indicadas.
            Files.write(archivo, List.of("Java=70", "Scala=25"));

            // readAllLines carga el contenido completo para este ejemplo pequeño.
            Files.readAllLines(archivo).forEach(System.out::println);

            // Se elimina el archivo para no dejar residuos del ejemplo.
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            System.out.println("No se pudo procesar el archivo: " + e.getMessage());
        }
    }
}
