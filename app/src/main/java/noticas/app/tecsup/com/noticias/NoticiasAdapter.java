package noticas.app.tecsup.com.noticias;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JShanksX13 on 30/05/2017.
 */

public class NoticiasAdapter extends RecyclerView.Adapter<NoticiasAdapter.ViewHolder> {

    private Activity activity;

    private List<Noticia> noticias;

    public NoticiasAdapter(){
        this.noticias = new ArrayList<>();
    }

    public NoticiasAdapter(Activity activity, List<Noticia> noticias){
        this.noticias = noticias;
        this.activity = activity;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView picture;
        public TextView tema;
        public TextView titulo;
        public TextView fecha;
        public TextView hora;
        public TextView detalles;

        public ViewHolder(View itemView){
            super (itemView);
            picture = (ImageView) itemView.findViewById(R.id.picture_image);
            tema = (TextView) itemView.findViewById(R.id.tema);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            fecha = (TextView) itemView.findViewById(R.id.fecha);
            hora = (TextView) itemView.findViewById(R.id.hora);
            detalles = (TextView) itemView.findViewById(R.id.descripcion);
        }
    }

    @Override
    public NoticiasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final NoticiasAdapter.ViewHolder viewHolder, int position) {
        final Noticia noticia = this.noticias.get(position);
        viewHolder.tema.setText(noticia.getTema());
        viewHolder.titulo.setText(noticia.getTitulo());
        viewHolder.fecha.setText(noticia.getFecha());
        viewHolder.hora.setText(noticia.getHora());
        viewHolder.detalles.setText(noticia.getDetalles());

        Context context = viewHolder.itemView.getContext();
        int idRes = context.getResources().getIdentifier(noticia.getPicture(), "drawable", context.getPackageName());
        viewHolder.picture.setImageResource(idRes);

        //ver su respectivo detalle
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, NoticiaDetalleActivity.class);

                    intent.putExtra("ID", noticia.getId());
//                    intent.putExtra("TITULO", noticia.getTitulo())
//                            .putExtra("FECHA", noticia.getFecha())
//                            .putExtra("HORA", noticia.getHora())
//                            .putExtra("DETALLES", noticia.getDetalles())
//                            .putExtra("PICTURE", noticia.getPicture());

                    activity.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.noticias.size();
    }

}
