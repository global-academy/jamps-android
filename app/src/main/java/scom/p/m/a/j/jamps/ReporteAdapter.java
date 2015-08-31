package scom.p.m.a.j.jamps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Daniel on 8/8/2015.
 */
public class ReporteAdapter extends ArrayAdapter<Reporte> {
        public ReporteAdapter(Context context, int resource, List<Reporte> reportes) {
        super (context, resource, reportes);
    }
        @Override
        public View getView (int position, View convertView, ViewGroup parent){
        View itemView = LayoutInflater.from(getContext())
                .inflate (R.layout. reporte, parent, false);
        Reporte reporte = getItem(position);

        TextView textViewTitulo = (TextView)itemView.findViewById(R.id.titulo);
        TextView textViewTipo = (TextView)itemView.findViewById(R.id.tipo);
        textViewTipo.setText(reporte.getTipo());
        textViewTitulo.setText (reporte.titulo);
        ImageView imageView = (ImageView)itemView.findViewById(R.id.imagen);
        //cargar imagen
        Picasso.with(getContext()).load(reporte.getImagen()).resize(300,300).centerCrop().into(imageView);
        return itemView;
    }

}
