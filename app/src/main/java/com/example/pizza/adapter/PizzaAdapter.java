package com.example.pizza.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.ListPizzaActivity;
import com.example.pizza.ProductDetailsActivity;
import com.example.pizza.R;
import com.example.pizza.classes.Produit;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private Context context;
    private List<Produit> produitList;

    public PizzaAdapter(Context context, List<Produit> produitList) {
        this.context = context;
        this.produitList = produitList;
    }

    @Override
    public int getCount() {
        return produitList.size();
    }

    @Override
    public Object getItem(int position) {
        return produitList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_produit, null);
        }

        ImageView imageViewProduit = convertView.findViewById(R.id.pizzaImageView);
        TextView textViewNomProduit = convertView.findViewById(R.id.pizzaNameTextView);
        TextView textViewPrixProduit = convertView.findViewById(R.id.dureeTextView);

        Produit produit = produitList.get(position);

        imageViewProduit.setImageResource(produit.getPhoto());
        textViewNomProduit.setText(produit.getNom());
        textViewPrixProduit.setText(String.valueOf(produit.getDuree()));

        return convertView;
    }

}
