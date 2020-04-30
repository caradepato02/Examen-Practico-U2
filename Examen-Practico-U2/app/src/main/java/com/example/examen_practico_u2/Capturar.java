package com.example.examen_practico_u2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Capturar extends AppCompatActivity implements View.OnClickListener {
    private Intent intentSelector;
    private ImageView imgVwImagen;
    private Button btnGuardar;
    private Drawable drawImagen;
    private EditText editTxtNombre, editTxtDescripcion, editTxtDirTel;

    private String sNombre, sDescripcion, sDirtel;
    private int idImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar);
        intentSelector = new Intent(this, SeleccionarImagen.class);

        imgVwImagen = findViewById(R.id.capImgVwImagen);
        btnGuardar = findViewById(R.id.capBtnGuardar);
        editTxtNombre = findViewById(R.id.capEditTxtNombre);
        editTxtDescripcion = findViewById(R.id.capEditTxtDescripcion);
        editTxtDirTel = findViewById(R.id.capEditTxtDirTel);

        imgVwImagen.setOnClickListener(this);
        btnGuardar.setOnClickListener(this);
        idImagen = R.drawable.burritos;//Valor default

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.capImgVwImagen://Click a la imagen
                startActivityForResult(intentSelector, 1000);
                break;
            case R.id.capBtnGuardar://Click al boton
                sNombre = editTxtNombre.getText().toString();
                sDescripcion = editTxtDescripcion.getText().toString();
                sDirtel = editTxtDirTel.getText().toString();
                MainActivity.addRestaurante(new Resturante(idImagen,sNombre,sDescripcion,sDirtel));
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        idImagen = data.getIntExtra("idImagen",R.drawable.burritos);
        drawImagen = getDrawable(idImagen);
        imgVwImagen.setImageDrawable(drawImagen);
    }
}
