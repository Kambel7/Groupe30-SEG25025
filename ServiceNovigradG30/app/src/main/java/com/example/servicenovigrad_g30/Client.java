package com.example.servicenovigrad_g30;

public class Client {

    private String prenom,nom,username,password;
    private String sexe;
    private String jour,mois,annee;
    private String adresse,ville,province;

    Client(){}

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getJour(){
        return jour;
    }
    public void setJour(String jour){
        this.jour = jour;
    }
    public String getMois(){
        return mois;
    }
    public void setMois(String mois){
        this.mois = mois;
    }
    public String getAnnee(){
        return annee;
    }
    public void setAneee(String annee){
        this.annee = annee;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getVille(){
        return ville;
    }
    public void setVille(String ville){
        this.ville =ville;
    }
    public String getProvince(){
        return province;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public String getSexe(){
        return sexe;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }

    public String toString() {
        if (sexe.equals("M")) {
            return "Monsieur "+prenom+" "+nom;
        } else {
            return "Madame "+prenom+" "+nom;
        }
    }
}
