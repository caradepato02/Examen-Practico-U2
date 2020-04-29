package com.example.examen_practico_u2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterRestaurante extends ArrayAdapter<Resturante> {
    private Context context;
    private int resourse;
    private ArrayList<Resturante> objects;

    public AdapterRestaurante(@NonNull Context context, int resource, ArrayList<Resturante> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourse = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) context).getLayoutInflater().inflate(resourse, parent, false);
        }
        ImageView imgVwimagen;
        imgVwimagen = convertView.findViewById(R.id.listaImgVwImagen);
        imgVwimagen.setImageResource(objects.get(position).intValue());
        return convertView;
        Resturante resturante = objects.get(position);

        CircleImageView cImgImagen;
        TextView txtVwNombre, txtVwDescripcion, txtVwDirTel;
        ImageView imgVwEstrella1, imgVwEstrella2, imgVwEstrella3;
        cImgImagen = convertView.findViewById(R.id.listaRestcImgImagem);
        txtVwNombre = convertView.findViewById(R.id.listaRestTxtVwNombre);
        txtVwDescripcion = convertView.findViewById(R.id.listaRestTxtVwDescripcion);
        txtVwDirTel = convertView.findViewById(R.id.listaRestTxtVwDirTel);
        imgVwEstrella1 = convertView.findViewById(R.id.listaRestImgVwEstrella1);
        imgVwEstrella2 = convertView.findViewById(R.id.listaRestImgVwEstrella2);
        imgVwEstrella3 = convertView.findViewById(R.id.listaRestImgVwEstrella3);

        cImgImagen.setImageResource(resturante.getIdImagen());

    }
}
