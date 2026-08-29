import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CombinarEstructuras {
    record Curso(String codigo, String nombre) {}

    public static void main(String[] args) {
        List<Curso> ordenRegistro = new ArrayList<>();
        Map<String, Curso> porCodigo = new HashMap<>();
        Set<String> categorias = new HashSet<>();

        Curso curso = new Curso("JAVA-01", "Java básico");
        ordenRegistro.add(curso);       // List conserva el orden de registro.
        porCodigo.put(curso.codigo(), curso); // Map permite localizar por clave.
        categorias.add("Programación"); // Set evita categorías duplicadas.

        System.out.println(porCodigo.get("JAVA-01"));
    }
}
