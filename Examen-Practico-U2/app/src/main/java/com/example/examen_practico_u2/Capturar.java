package com.example.examen_practico_u2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Capturar extends AppCompatActivity implements View.OnClickListener {
    Intent intentSelector;
    int codeSeleccionar;
    ImageView imgVwImagen;
    Button btnGuardar;
    Drawable drawImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar);
        intentSelector = new Intent(this,Seleccionar_imagen.class);
        imgVwImagen = findViewById(R.id.capImgVwImagen);
        btnGuardar = findViewById(R.id.capBtnGuardar);

        imgVwImagen.setOnClickListener(this);
        btnGuardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.capImgVwImagen:
                startActivityForResult(intentSelector,codeSeleccionar);
                break;
            case R.id.capBtnGuardar:

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        drawImagen = getDrawable(data.getIntExtra("idImagen",R.drawable.burritos));
        imgVwImagen.setImageDrawable(drawImagen);
    }
}
