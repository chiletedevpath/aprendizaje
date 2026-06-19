import java.util.ArrayList;
import java.util.List;

public class DemoPublicaciones {
    public static void main(String[] args) {
        List<Publicacion> feed = new ArrayList<>();

        feed.add(new PostImagen("Usuario01", "Publicacion de ejemplo", "img_0001"));
        feed.add(new PostVideo("Usuario02", "Video de ejemplo", 45));
        feed.add(new PostImagen("Usuario03", "Imagen de ejemplo", "img_0002"));
        feed.add(new PostVideo("Usuario04", "Contenido de ejemplo", 120));
        feed.add(new PostImagen("Usuario05", "Registro de ejemplo", "img_0003"));

        int cantImagen = 0;
        int cantVideo = 0;

        System.out.println("============= FEED ============");
        for (Publicacion p : feed) {
            // El polimorfismo permite mostrar cada publicacion segun su tipo real.
            p.mostrar();
            System.out.println();

            if (p instanceof PostImagen) cantImagen++;
            else if (p instanceof PostVideo) cantVideo++;
        }
        System.out.println(" Total PostImagen: " + cantImagen);
        System.out.println(" Total PostVideo: " + cantVideo);

        boolean encontrado = false;
        for (Publicacion p : feed){
            if(p.getAutor().equals("Usuario01")){
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "Autor encontrado" : "Autor no encontrado");

    }
}

