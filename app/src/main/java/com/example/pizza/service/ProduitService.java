package com.example.pizza.service;

import com.example.pizza.classes.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits; // Collection pour stocker les données

    public ProduitService() {
        produits = new ArrayList<>(); // Initialisation de la collection
    }

    @Override
    public boolean create(Produit object) {
        // Ajouter un produit à la collection (peut inclure la logique de validation)
        return produits.add(object);
    }

    @Override
    public boolean update(Produit object) {
        // Mettre à jour un produit dans la collection (peut inclure la logique de validation)
        int index = produits.indexOf(object);
        if (index != -1) {
            produits.set(index, object);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Produit object) {
        // Supprimer un produit de la collection
        return produits.remove(object);
    }

    @Override
    public List<Produit> findAll() {
        // Retourner tous les produits de la collection
        return produits;
    }

    @Override
    public Produit findById(int id) {
        // Rechercher un produit par ID dans la collection
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null; // Aucun produit trouvé avec l'ID spécifié
    }
}
