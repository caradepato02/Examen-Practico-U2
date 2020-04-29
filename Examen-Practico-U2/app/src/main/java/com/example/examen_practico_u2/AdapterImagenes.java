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

public class AdapterImagenes extends ArrayAdapter<Integer> {
    private Context context;
    private int resourse;
    private ArrayList<Integer> objects;
    public AdapterImagenes(@NonNull Context context, int resource, ArrayList<Integer> objects){
        super(context, resource,objects);
        this.context = context;
        this.resourse = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity)context).getLayoutInflater().inflate(resourse, parent, false);
        }
        ImageView imgVwimagen;
        imgVwimagen = convertView.findViewById(R.id.listaLstImgVwImagen);
        imgVwimagen.setImageResource(objects.get(position).intValue());
        return convertView;
    }

}
