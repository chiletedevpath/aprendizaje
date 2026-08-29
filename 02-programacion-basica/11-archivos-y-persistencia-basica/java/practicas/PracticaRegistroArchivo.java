import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PracticaRegistroArchivo {
    public static void main(String[] args) {
        Path archivo = Path.of("registro-cursos.txt");
        List<String> cursos = List.of("Java", "Scala", "Git");

        try {
            // Files.write() guarda cada elemento de la lista como una línea.
            Files.write(archivo, cursos);
            for (String curso : Files.readAllLines(archivo)) {
                System.out.println("Curso: " + curso);
            }
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            System.out.println("No se pudo acceder al archivo: " + e.getMessage());
        }
    }
}
