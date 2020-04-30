package com.example.examen_practico_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Mostrar extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lstVwListaResta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        lstVwListaResta = findViewById(R.id.mostrarLstVwListaRest);
        lstVwListaResta.setOnItemClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwListaResta.setAdapter(new AdapterRestaurante(this,R.layout.lista_restaurantes,MainActivity.getArraylstRestaurantes()));//Adaptador para mostrar la lista de restaurantes
    }

    //Se activa cuando se preciona un item
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentResta;
        intentResta = new Intent(this,Evaluar.class);
        intentResta.putExtra("posicion", position);
        startActivity(intentResta);
    }

}
