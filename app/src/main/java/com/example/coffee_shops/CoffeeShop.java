package com.example.coffee_shops;

public class CoffeeShop {

    private String name; // Nombre de la cafetería
    private float rating; // Calificación de la cafetería
    private int imageResource;

    // Constructor para crear una nueva instancia de CoffeeShop
    public CoffeeShop(String name, float rating, int imageResource) {
        this.name = name;
        this.rating = rating;
        this.imageResource = imageResource;
    }

    // Getter para el nombre
    public String getName() {
        return name;
    }

    // Setter para el nombre
    public void setName(String name) {
        this.name = name;
    }

    // Getter para la calificación
    public float getRating() {
        return rating;
    }

    // Setter para la calificación
    public void setRating(float rating) {
        this.rating = rating;
    }
    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    // Puedes agregar aquí más atributos, getters y setters si es necesario
}
