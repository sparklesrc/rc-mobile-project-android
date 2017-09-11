package pe.com.sparkles.rc_mobile_project_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SPARKLES on 10/09/2017.
 */

public class RecomendacionesAdapter extends BaseAdapter {
    // Declare Variables
    Context context;
    int[] imagenes;
    String[] nombres;
    String[] descripciones;
    LayoutInflater inflater;

    public RecomendacionesAdapter(Context context, int[] imagenes, String[] nombres, String[] descripciones ) {
        this.context = context;
        this.imagenes = imagenes;
        this.nombres = nombres;
        this.descripciones = descripciones;
    }

    @Override
    public int getCount() {
        return nombres.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        ImageView imgImg;
        TextView txtNombreLugar;
        TextView txtDescripcionLugar;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.lista_recomendaciones_row, parent, false);

        // Locate the TextViews in listview_item.xml
        imgImg = (ImageView) itemView.findViewById(R.id.img_lugar);
        txtNombreLugar = (TextView) itemView.findViewById(R.id.tv_nombre_lugar);
        txtDescripcionLugar = (TextView) itemView.findViewById(R.id.tv_descripcion_lugar);

        // Capture position and set to the TextViews
        //imgImg.setImageResource(imagenes[position]);
        txtNombreLugar.setText(nombres[position]);
        txtDescripcionLugar.setText(descripciones[position]);

        return itemView;
    }
}