import java.util.*;

public class RegistroCursos {
    public static void main(String[] args) {
        Set<String> codigosUnicos = new HashSet<>();
        Map<String,String> cursos = new LinkedHashMap<>();
        codigosUnicos.add("JAVA-01"); codigosUnicos.add("JAVA-01");
        cursos.put("JAVA-01", "Java básico"); cursos.put("SCALA-01", "Scala básico");
        // LinkedHashMap conserva el orden de inserción mientras mantiene acceso por clave.
        System.out.println(codigosUnicos);
        System.out.println(cursos);
    }
}
