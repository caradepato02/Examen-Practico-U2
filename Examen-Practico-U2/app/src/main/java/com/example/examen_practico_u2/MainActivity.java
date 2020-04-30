package com.example.examen_practico_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intentCapturar, intentMostrar;
    private Button btnCapturar;
    private Button btnMostrar;
    private Button btnSalir;
    private static ArrayList<Resturante> arraylstRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentCapturar = new Intent(this, Capturar.class);
        intentMostrar = new Intent(this, Mostrar.class);
        //vinculcion
        btnCapturar = findViewById(R.id.btnCapturar);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnSalir = findViewById(R.id.btnSalir);

        btnCapturar.setOnClickListener(this);
        btnMostrar.setOnClickListener(this);
        btnSalir.setOnClickListener(this);
        arraylstRestaurantes = new ArrayList<Resturante>();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCapturar://Click a boton "capturar"
                startActivity(intentCapturar);//inicia la actividad Capturar
                break;
            case R.id.btnMostrar://Click a boton "mostrar"
                startActivity(intentMostrar);//inicia la actividad Mostrar
                break;
            case R.id.btnSalir://Click a boton "salir"
                finish();
                break;

        }
    }
    //metodos estaticos para mnipular la lista
    public static void addRestaurante(Resturante resta) {
        arraylstRestaurantes.add(resta);
    }
    public static ArrayList<Resturante> getArraylstRestaurantes(){return arraylstRestaurantes;}
    public static Resturante getRestaurante(int posicion){
        return arraylstRestaurantes.get(posicion);
    }
}
