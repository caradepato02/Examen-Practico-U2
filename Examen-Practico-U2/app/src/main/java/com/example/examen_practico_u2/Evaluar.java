package com.example.examen_practico_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Evaluar extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    private TextView txtVwNombre, txtVwDescripcion, txtVwDirTel;
    private RatingBar raBarEstrellas;
    private int posicion;
    private Resturante resta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar);

        //Vinculacion
        txtVwNombre = findViewById(R.id.evaTxtVwNombre);
        txtVwDescripcion = findViewById(R.id.evaTxtVwDescripcion);
        txtVwDirTel = findViewById(R.id.evaTxtVwDirTel);
        raBarEstrellas = findViewById(R.id.evaRaBarEstrellas);

        posicion = getIntent().getIntExtra("posicion",0);//obtiene la posicion que se paso con el extra
        resta = MainActivity.getRestaurante(posicion);//Obtiene el Restaurante seleccionado
        raBarEstrellas.setOnRatingBarChangeListener(this);

        //Muestra los datos
        txtVwNombre.setText(resta.getsNombre());
        txtVwDescripcion.setText(resta.getsDescripcion());
        txtVwDirTel.setText(resta.getsDireccion());
        raBarEstrellas.setRating(0);//Valor default


    }
    //Se activa al cambiar el valor del RatingBar
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        resta.setCalificacion(rating);
    }
}
