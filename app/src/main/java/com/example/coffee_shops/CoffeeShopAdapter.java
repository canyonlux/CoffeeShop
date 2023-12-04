package com.example.coffee_shops;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CoffeeShopAdapter extends RecyclerView.Adapter<CoffeeShopAdapter.CoffeeShopViewHolder> {

    private List<CoffeeShop> coffeeShopList; // Lista de objetos CoffeeShop

    // Constructor del adaptador
    public CoffeeShopAdapter(List<CoffeeShop> coffeeShopList) {
        this.coffeeShopList = coffeeShopList;
    }

    @NonNull
    @Override
    public CoffeeShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflamos el layout item_coffee_shop.xml para cada elemento de la lista
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coffee_shop, parent, false);
        return new CoffeeShopViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeShopViewHolder holder, int position) {
        // Obtener el elemento de la lista basado en la posición
        CoffeeShop coffeeShop = coffeeShopList.get(position);

        // Configurar los valores de las vistas
        holder.coffeeShopImageView.setImageResource(coffeeShopList.get(position).getImageResource());
        holder.ratingBar.setRating(coffeeShop.getRating());
        holder.nameTextView.setText(coffeeShop.getName());
        holder.ratingTextView.setText(String.valueOf(coffeeShop.getRating()));

        // Establecer el listener para la RatingBar
        holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (fromUser) {
                    // Actualiza la calificación en el modelo y el TextView cuando el usuario cambie la calificación
                    coffeeShop.setRating(rating);
                    holder.ratingTextView.setText(String.format("%.1f", rating));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        // Devuelve el tamaño de la lista de cafeterías
        return coffeeShopList.size();
    }

    // Clase interna que define el ViewHolder
    public static class CoffeeShopViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public RatingBar ratingBar;
        public TextView ratingTextView;
        public ImageView coffeeShopImageView;

        public CoffeeShopViewHolder(View view) {
            super(view);
            nameTextView = view.findViewById(R.id.tvRating); // Asumiendo que tienes un TextView con id nameTextView en tu layout
            ratingBar = view.findViewById(R.id.ratingBar);
            ratingTextView = view.findViewById(R.id.tvRating);
            coffeeShopImageView = view.findViewById(R.id.coffeeShopImageView);
        }
    }
}
