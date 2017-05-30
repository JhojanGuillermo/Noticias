package noticas.app.tecsup.com.noticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView noticiasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticiasList = (RecyclerView) findViewById(R.id.noticias_list);

        noticiasList.setLayoutManager(new LinearLayoutManager(this));

        List<Noticia> noticias = NoticiaRepository.getNoticias();
        noticiasList.setAdapter(new NoticiasAdapter(this, noticias));
    }
}
