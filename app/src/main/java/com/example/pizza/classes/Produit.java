package com.example.pizza.classes;
import java.io.Serializable;

public class Produit implements Serializable {
    private static int nextId = 1; // Variable statique pour l'ID auto-incrémenté.
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private float duree;
    private String detailsIngredients;
    private String description;
    private String preparation;
    private int comp;

    public Produit(String nom, int nbrIngredients, int photo, float duree, String detailsIngredients, String description, String preparation, int comp) {
        this.id = nextId++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngredients = detailsIngredients;
        this.description = description;
        this.preparation = preparation;
        this.comp = comp;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public String getDetailsIngredients() {
        return detailsIngredients;
    }

    public void setDetailsIngredients(String detailsIngredients) {
        this.detailsIngredients = detailsIngredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngredients='" + detailsIngredients + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", comp=" + comp +
                '}';
    }
}
