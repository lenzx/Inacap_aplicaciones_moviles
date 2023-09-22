package com.example.hotel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Menu extends AppCompatActivity {

    ListView listaView;
    List<String> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listaView = (ListView) findViewById(R.id.LV_MENU_LISTA);
        List<Item> listaObjetos = new ArrayList<Item>();
        listaObjetos.add(new Item("Hamburguesa",9990,"La mejor Hamburguesa", R.drawable.hamburguesa));
        listaObjetos.add(new Item("Papas Fritas",5990,"La mejor Papa", R.drawable.papitas));
        ItemAdapter adaptador = new ItemAdapter(this, listaObjetos);
        listaView.setAdapter(adaptador);

        listaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Item itemSeleccionado = listaObjetos.get(position);
                Intent intent = new Intent(Menu.this, DetallesItemActivity.class);

                intent.putExtra("nombre", itemSeleccionado.getNombre());
                intent.putExtra("precio", itemSeleccionado.getPrecio());
                intent.putExtra("descripcion", itemSeleccionado.getDescripcion());
                intent.putExtra("imagenResId", itemSeleccionado.getImagenResId());

                startActivity(intent);

            }
        });
    }
}
