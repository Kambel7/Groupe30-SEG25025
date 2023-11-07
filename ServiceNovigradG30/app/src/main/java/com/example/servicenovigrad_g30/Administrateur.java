package com.example.servicenovigrad_g30;

public class Administrateur {
    private String nom,password;

    public Administrateur(String nom, String password){
        this.nom = nom;
        this.password = password;
    }
    public String getNom(){
        return nom;
    }
    public String getPassword(){
        return password;
    }
    public String toString() {

            return "Bonjour Administrateur "+nom;

    }
}
