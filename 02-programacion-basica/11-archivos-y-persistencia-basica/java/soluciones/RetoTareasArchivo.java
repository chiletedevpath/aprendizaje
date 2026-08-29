import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class RetoTareasArchivo {
    public static void main(String[] args) {
        Path archivo = Path.of("tareas-devpath.txt");
        List<String> tareas = List.of("Estudiar Java", "Practicar Scala", "Revisar Git");

        try {
// Files.write() persiste cada elemento de la lista como una línea del archivo.
            Files.write(archivo, tareas);
            List<String> guardadas = Files.readAllLines(archivo);
            for (int i = 0; i < guardadas.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, guardadas.get(i));
            }
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}
