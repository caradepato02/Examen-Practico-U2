package com.example.examen_practico_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Intent intentCapturar;
    private Button btnCapturar;
    private Button btnMostrar;
    private Button btnSalir;
    private static ArrayList<Resturante> arraylstRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentCapturar = new Intent(this, Capturar.class);
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
                break;
            case R.id.btnSalir:
                break;


        }
    }

    public static void addRestaurante(Resturante resta) {
        arraylstRestaurantes.add(resta);
    }
}
