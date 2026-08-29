import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class ServidorMinimo {
    public static void main(String[] args) throws Exception {
        // HttpServer abre un puerto local y recibe peticiones HTTP sin usar un framework.
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

        servidor.createContext("/salud", exchange -> {
            byte[] cuerpo = "Backend operativo".getBytes(StandardCharsets.UTF_8);
            // 200 indica que la petición fue procesada correctamente.
            exchange.sendResponseHeaders(200, cuerpo.length);
            exchange.getResponseBody().write(cuerpo);
            exchange.close();
        });

        servidor.start();
        System.out.println("Servidor disponible en http://localhost:8080/salud");
    }
}
