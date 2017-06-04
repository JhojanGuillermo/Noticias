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
        noticias.add(new Noticia(1, "AUMENTO", "Merecido aumento de sueldo.", "01/06/17", "12:50", "ASDFASFA", "sueldo"));
        noticias.add(new Noticia(2, "NACIMIENTO", "Tips para lograr una experiencia de compra diferencial.", "01/06/17", "8:50", "ABCSDSDSD", "nacimiento"));

    }

    public static List<Noticia> getNoticias(){
        return noticias;
    }
}
