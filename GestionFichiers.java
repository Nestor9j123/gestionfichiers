/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionfichiers;

/**
 *
 * @author DevNestor
 */
public class GestionFichiers {
  public static void main(String[] args) {
        // Création du répertoire root
  Repertoire root = new Repertoire("root", "01/01/2020");

        // Création de sous-répertoires
        Repertoire documents = new Repertoire("Documents", "01/01/2021");
        Repertoire images = new Repertoire("Images", "01/01/2022");

        // Création de fichiers simples
        FichierSimple fichier1 = new FichierSimple("fichier1.txt", "01/01/2023", 100);
        FichierSimple fichier2 = new FichierSimple("image1.jpg", "01/02/2023", 500);

        // Ajout de fichiers aux répertoires
        documents.ajouterFichier(fichier1);
        images.ajouterFichier(fichier2);

        // Ajout des sous-répertoires au répertoire root
        root.ajouterFichier(documents);
        root.ajouterFichier(images);

        // Affichage des informations
        System.out.println(fichier1);  // Affiche les informations sur le fichier simple
        System.out.println(fichier2);  // Affiche les informations sur le fichier simple

        System.out.println(documents); // Affiche les informations sur le répertoire Documents
        System.out.println(images);    // Affiche les informations sur le répertoire Images
        System.out.println(root);      // Affiche les informations sur le répertoire root
    }
}
