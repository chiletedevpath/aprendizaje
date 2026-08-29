import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class ServidorSaludYCursos {
    private static void responder(com.sun.net.httpserver.HttpExchange exchange, int estado, String texto) throws java.io.IOException {
        byte[] cuerpo = texto.getBytes(StandardCharsets.UTF_8);
        exchange.sendResponseHeaders(estado, cuerpo.length);
        exchange.getResponseBody().write(cuerpo);
        exchange.close();
    }

    public static void main(String[] args) throws Exception {
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);
        servidor.createContext("/salud", e -> responder(e, 200, "OK"));
        servidor.createContext("/cursos", e -> responder(e, 200, "[]"));
        servidor.start();
    }
}
