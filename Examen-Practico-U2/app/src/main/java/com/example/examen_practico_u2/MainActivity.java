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
            case R.id.btnCapturar:
                startActivity(intentCapturar);
                break;
            case R.id.btnMostrar:
                startActivity(intentMostrar);
                break;
            case R.id.btnSalir:
                finish();
                break;


        }
    }

    public static void addRestaurante(Resturante resta) {
        arraylstRestaurantes.add(resta);
    }
    public static ArrayList<Resturante> getArraylstRestaurantes(){return arraylstRestaurantes;}
    public static Resturante getRestaurante(int posicion){
        return arraylstRestaurantes.get(posicion);
    }
}
