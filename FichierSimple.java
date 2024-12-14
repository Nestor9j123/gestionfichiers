/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfichiers;

/**
 *
 * @author DevNestor
 */
public class FichierSimple extends Fichier {
    private int taille;

    // Constructeur
    public FichierSimple(String nom, String dateCreation, int taille) {
        super(nom, dateCreation);
        this.taille = taille;
    }

    // Implémentation de la méthode getTaille() pour un fichier simple
    @Override
    public int getTaille() {
        return taille;
    }

    // Implémentation de la méthode getURL() pour un fichier simple
    @Override
    public String getURL() {
        return getNom(); // L'URL d'un fichier simple est son nom
    }

    // Méthode toString() pour afficher un fichier simple
    @Override
    public String toString() {
        return "Fichier Simple: " + getNom() + " (Taille: " + getTaille() + " octets, URL: " + getURL() + ")";
    }
}


