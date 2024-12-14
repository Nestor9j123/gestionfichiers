/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfichiers;

/**
 *
 * @author DevNestor
 */
public abstract class Fichier {
    private String nom;
    private String dateCreation;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

   

    
    

    public Fichier(String nom, String dateCreation) {
        this.nom = nom;
        this.dateCreation = dateCreation;
    }
    
    public abstract int getTaille();
    
    public String getURL(){
            return nom;
    }
        
    }

    

