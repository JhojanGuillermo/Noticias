package noticas.app.tecsup.com.noticias;

/**
 * Created by JShanksX13 on 30/05/2017.
 */

public class Noticia {

    private Integer id;

    private String tema;

    private String titulo;

    private String fecha;

    private String hora;

    private String detalles;

    private String picture;

    public Noticia(int i, String nacimiento, String s, String s1, String s2, String abcsdsdsd){

    }

    public Noticia(Integer id, String tema, String titulo, String fecha, String hora, String detalles, String picture) {
        this.id = id;
        this.tema = tema;
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.detalles = detalles;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id=" + id +
                ", tema='" + tema + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", detalles='" + detalles + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
