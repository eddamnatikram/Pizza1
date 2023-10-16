package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pizza Recipes");
        Intent intent = getIntent();
        int photo = intent.getIntExtra("photo", 0); // Supposons que "photo" est de type int pour la ressource d'image

        String nom = intent.getStringExtra("nom");
        String pizzaDescription = intent.getStringExtra("pizzaDescription");
        String pizzaIngredients = intent.getStringExtra("pizzaIngredients");
        ImageView pizzaImageView = findViewById(R.id.imageView1); // Assurez-vous que l'ID de l'ImageView correspond à celui dans votre mise en page XML
        pizzaImageView.setImageResource(photo);

        TextView pizzaNameTextView = findViewById(R.id.pizzaNameTextView);
        TextView descriptionTextView = findViewById(R.id.textView3);
        TextView ingredientsTextView = findViewById(R.id.textView4);
        pizzaNameTextView.setText(nom);
        descriptionTextView.setText("Description: " + pizzaDescription);
        ingredientsTextView.setText("Ingrédients: " + pizzaIngredients);
    }
}
