package noticas.app.tecsup.com.noticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NoticiaDetalleActivity extends AppCompatActivity {

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_detalle);

        if (this.getIntent().getExtras() != null){
            Bundle bundle = this.getIntent().getExtras();
            id = bundle.getInt("ID");
        }

        //llamara al servicio por ID o buscar en tu lista el objeto por ese ID

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("Noticia " + id);
    }
}
