package com.example.hotel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallesItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_item);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        double precio = intent.getDoubleExtra("precio", 0.0);
        String descripcion = intent.getStringExtra("descripcion");
        int imagenResId = intent.getIntExtra("imagenResId", 0);

        TextView nombreTextView = findViewById(R.id.TXT_ITEMVIEW_NOMBRE);
        TextView precioTextView = findViewById(R.id.TXT_ITEMVIEW_PRECIO);
        TextView descripcionTextView = findViewById(R.id.TXT_ITEMVIEW_DESCRIPCION);
        ImageView imagenImageView = findViewById(R.id.IMG_ITEMVIEW_IMAGEN);

        nombreTextView.setText(nombre);
        precioTextView.setText("Precio: $" + precio);
        descripcionTextView.setText("Descripcion: \n" + descripcion);
        imagenImageView.setImageResource(imagenResId);
    }
}