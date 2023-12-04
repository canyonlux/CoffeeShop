package com.example.coffee_shops;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura el RecyclerView con el adaptador y el LinearLayoutManager vertical
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Lista de cafeterías de ejemplo
        List<CoffeeShop> coffeeShops = new ArrayList<>();
        coffeeShops.add(new CoffeeShop("Antico Caffè Greco", 4.5f, R.drawable.images));
        coffeeShops.add(new CoffeeShop("Café de Flore", 4.0f, R.drawable.images1));
        coffeeShops.add(new CoffeeShop("Caffe Reggio", 3.5f, R.drawable.images2));
        coffeeShops.add(new CoffeeShop("Caffè Florian", 4.8f, R.drawable.images3));
        coffeeShops.add(new CoffeeShop("Antico Caffè Greco", 4.5f, R.drawable.images4));
        coffeeShops.add(new CoffeeShop("Café de Flore", 4.0f, R.drawable.images5));
        coffeeShops.add(new CoffeeShop("Caffe Reggio", 3.5f, R.drawable.images6));




        CoffeeShopAdapter adapter = new CoffeeShopAdapter(coffeeShops);
        recyclerView.setAdapter(adapter);
    }
}