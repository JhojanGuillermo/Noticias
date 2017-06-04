package noticas.app.tecsup.com.noticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaDetalleActivity extends AppCompatActivity {

    private int id;

    private String titulo;

    private String fecha;

    private String hora;

    private String detalles;

    private int picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_detalle);

        if (this.getIntent().getExtras() != null){
            Bundle bundle = this.getIntent().getExtras();
            //id = bundle.getInt("ID");
            titulo = bundle.getString("TITULO");
            fecha = bundle.getString("FECHA");
            hora = bundle.getString("HORA");
            detalles = bundle.getString("DETALLES");
            picture = bundle.getInt("PICTURE");
        }

        //llamara al servicio por ID o buscar en tu lista el objeto por ese ID

        //TextView textView = (TextView) findViewById(R.id.textview);
        //textView.setText("Noticia " + id);
        TextView tit = (TextView) findViewById(R.id.text_titulo);
        tit.setText(titulo);
        TextView fech = (TextView) findViewById(R.id.text_fecha);
        fech.setText(fecha);
        TextView hor = (TextView) findViewById(R.id.text_hora);
        hor.setText(hora);
        TextView det = (TextView) findViewById(R.id.text_descripcion);
        det.setText(detalles);
        ImageView img = (ImageView) findViewById(R.id.portada);
        img.setImageResource(picture);
    }
}
