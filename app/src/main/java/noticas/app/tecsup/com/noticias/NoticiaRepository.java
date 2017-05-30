package noticas.app.tecsup.com.noticias;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JShanksX13 on 30/05/2017.
 */

public class NoticiaRepository {

    private static List<Noticia> noticias;

    static {
        noticias = new ArrayList<>();
        noticias.add(new Noticia(1, "NACIMIENTO", "Tips para lograr una experiencia de compra diferencial.", "01/06/17", "8:50", "ABCSDSDSD", ""));
        noticias.add(new Noticia(2, "NACIMIENTO", "Tips para lograr una experiencia de compra diferencial.", "01/06/17", "8:50", "ABCSDSDSD", ""));

    }

    public static List<Noticia> getNoticias(){
        return noticias;
    }
}
