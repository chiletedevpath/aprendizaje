import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirLeerArchivo {
    public static void main(String[] args) {
        Path archivo = Path.of("devpath-demo.txt");

        try {
            // Files.writeString() guarda texto usando una ruta del sistema.
            Files.writeString(archivo, "Programación básica");
            // Files.readString() recupera todo el contenido como String.
            String contenido = Files.readString(archivo);
            System.out.println(contenido);
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            System.out.println("No fue posible trabajar con el archivo: " + e.getMessage());
        }
    }
}
