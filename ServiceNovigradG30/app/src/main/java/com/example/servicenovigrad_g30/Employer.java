package com.example.servicenovigrad_g30;

public class Employer {
    private String nom,password;
    private String permisDeConduire, carteDeSante, pieceIdentite;
    private String heureOuverture,heureFermeture;
    private String adresse,ville,province;

    Employer(){}

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
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
    public String getPermisDeConduire(){
        return permisDeConduire;
    }
    public void setPermisDeConduire(String permisDeConduire){
        this.permisDeConduire = permisDeConduire;
    }
    public String getCarteDeSante(){
        return carteDeSante;
    }
    public void setCarteDeSante(String carteDeSante){
        this.carteDeSante = carteDeSante;
    }
    public String getPieceIdentite(){
        return pieceIdentite;
    }
    public void setPieceIdentite(String pieceIdentite){
        this.pieceIdentite = pieceIdentite;
    }
    public String getHeureOuverture(){
        return heureOuverture;
    }
    public void setHeureOuverture(String heureOuverture){
        this.heureOuverture = heureOuverture;
    }
    public String getHeureFermeture(){
        return heureFermeture;
    }
    public void setHeureFermeture(String heureFermeture){
        this.heureFermeture = heureFermeture;
    }
    public String toString() {

            return "Vous etes dans la succursale "+nom;
    }

}
