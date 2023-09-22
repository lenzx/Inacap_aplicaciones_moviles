package com.example.hotel_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    private Context context;
    private List<Item> items;

    public ItemAdapter(Context context, List<Item> items) {
        super(context, 0, items);
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = items.get(position);

        TextView nombreTextView = listItemView.findViewById(R.id.TXT_ITEM_NOMBRE);
        TextView precioTextView = listItemView.findViewById(R.id.TXT_ITEM_PRECIO);
        TextView descripcionTextView = listItemView.findViewById(R.id.TXT_VIEW_DESCRIPCION);
        ImageView imagenImageView = listItemView.findViewById(R.id.IMG_ITEM_IMAGEN);

        nombreTextView.setText(currentItem.getNombre());
        precioTextView.setText("Precio: $" + currentItem.getPrecio());
        descripcionTextView.setText("Descripcion: \n" + currentItem.getDescripcion());
        imagenImageView.setImageResource(currentItem.getImagenResId());

        return listItemView;
    }
}
