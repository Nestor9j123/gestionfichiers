/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfichiers;

/**
 *
 * @author DevNestor
 */
import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Fichier {
    private List<Fichier> fichiers;

    // Constructeur
    public Repertoire(String nom, String dateCreation) {
        super(nom, dateCreation);
        this.fichiers = new ArrayList<>();
    }

    // Ajouter un fichier ou un sous-répertoire
    public void ajouterFichier(Fichier fichier) {
        fichiers.add(fichier);
    }

    // Calculer la taille du répertoire (sommes des tailles des fichiers et sous-répertoires)
    @Override
    public int getTaille() {
        int tailleTotale = 0;
        for (Fichier fichier : fichiers) {
            tailleTotale += fichier.getTaille();
        }
        return tailleTotale;
    }

    // Obtenir l'URL du répertoire
    @Override
    public String getURL() {
        return "/" + getNom();
    }

    // Méthode toString() pour afficher un répertoire
    @Override
    public String toString() {
        return "Repertoire: " + getNom() + " (Taille: " + getTaille() + " octets, URL: " + getURL() + ")";
    }
}


