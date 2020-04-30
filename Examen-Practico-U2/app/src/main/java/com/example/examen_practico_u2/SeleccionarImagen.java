package com.example.examen_practico_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SeleccionarImagen extends AppCompatActivity implements ListView.OnItemClickListener {
    private ListView lstVwImagenes;
    private ArrayList<Integer> arraylstIdImgenes;//Array list para guardar los id de las imagenes


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_imagen);

        //qui se agregan los id de las imagenes
        arraylstIdImgenes = new ArrayList<Integer>();
        arraylstIdImgenes.add(R.drawable.burritos);
        arraylstIdImgenes.add(R.drawable.coffe);
        arraylstIdImgenes.add(R.drawable.churros);
        arraylstIdImgenes.add(R.drawable.cupcakes);
        arraylstIdImgenes.add(R.drawable.pizza);
        arraylstIdImgenes.add(R.drawable.pancakes);

        lstVwImagenes = findViewById(R.id.SelLstVwImagenes);
        lstVwImagenes.setOnItemClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwImagenes.setAdapter(new AdapterImagenes(this, R.layout.lista_imagenes, arraylstIdImgenes));//Adaptador para mostrar la lista de imagenes
    }

    //Se activa cuando se preciona un item
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentDatoImagen;
        intentDatoImagen = new Intent();
        intentDatoImagen.putExtra("idImagen", arraylstIdImgenes.get(position));//Coloca el id de la imagen seleccionada
        setResult(Activity.RESULT_OK, intentDatoImagen);//fija el intent y el codigo de resultado
        finish();
    }


}
