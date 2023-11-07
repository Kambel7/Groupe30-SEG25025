package com.example.servicenovigrad_g30;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.servicenovigrad_g30.R.id.AdministrateurAfficheBonjourText;
import static com.example.servicenovigrad_g30.R.id.AdministrateurConnexionErreurText;
import static com.example.servicenovigrad_g30.R.id.AdministrateurSetPasswordConnexionText;
import static com.example.servicenovigrad_g30.R.id.AdministrateurSetUsernameConnexionText;
import static com.example.servicenovigrad_g30.R.id.EmployerAfficheBonjourText;
import static com.example.servicenovigrad_g30.R.id.EmployerErreurConnectionText;
import static com.example.servicenovigrad_g30.R.id.EmployerInscriptionErreurText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetAdresseText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetFermetureText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetOuvertureText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetProvinceText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetVilleText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetNomdelaSuccursaleText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetPasswordConnexionText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetUsernameConnexionText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetPasswordInscriptionText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetPermisConduireText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetPieceIdentiteText;
import static com.example.servicenovigrad_g30.R.id.EmployerSetCartesanteText;
import static com.example.servicenovigrad_g30.R.id.ClientSetUsernameInscriptionText;
import static com.example.servicenovigrad_g30.R.id.ClientSetAdresseText;
import static com.example.servicenovigrad_g30.R.id.ClientSetNomText;
import static com.example.servicenovigrad_g30.R.id.ClientSetPrenomText;
import static com.example.servicenovigrad_g30.R.id.ClientSetJourText;
import static com.example.servicenovigrad_g30.R.id.ClientSetMoisText;
import static com.example.servicenovigrad_g30.R.id.ClientSetAnneeText;
import static com.example.servicenovigrad_g30.R.id.ClientSetVilleText;
import static com.example.servicenovigrad_g30.R.id.ClientSetProvinceText;
import static com.example.servicenovigrad_g30.R.id.ClientAfficheBonjourText;
import static com.example.servicenovigrad_g30.R.id.ClientSetSexeText;
import static com.example.servicenovigrad_g30.R.id.ClientSetUsernameConnexionText;
import static com.example.servicenovigrad_g30.R.id.ClientSetPasswordConnexionText;
import static com.example.servicenovigrad_g30.R.id.ClientErreurConnexionText;
import static com.example.servicenovigrad_g30.R.id.ClientErreurInscriptionText;
import static com.example.servicenovigrad_g30.R.id.ClientSetPasswordInscriptionText;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Creation d'une liste de client et d'employer et d'un compte administrateur
    ArrayList <Client> clientlist = new ArrayList<Client>();
    ArrayList <Employer> Employerlist = new ArrayList<Employer>();
    Administrateur Admin = new Administrateur("admin","password123");

    //Instruction cree par Android Studio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Fonctions attribues a chaque bouton pour passer d'une page a l'autre (par exemple "RetourMainButton"
    // permet de revenir a la page principale
    public void AdministrateurButton(View view) {
        setContentView(R.layout.administrateurlayout);
    }

    public void EmployerButton(View view) {
        setContentView(R.layout.employerlayout);
    }

    public void ClientButton(View view) {
        setContentView(R.layout.clientlayout);
    }

    public void RetourMainButton(View view) {
        setContentView(R.layout.activity_main);

    }

    public void ClientConnexionButton(View view) {
        setContentView(R.layout.clientconnexionlayout);
    }
    public void EmployerConnexionButton(View view) {
        setContentView(R.layout.employerconnexionlayout);
    }
    public void AdministrateurConnexionButton(View view) {
        setContentView(R.layout.administrateurconnexionlayout);
    }

    public void ClientInscriptionButton(View view) {
        setContentView(R.layout.clientinscriptionlayout2);
    }
    public void EmployerInscriptionButton(View view) {
        setContentView(R.layout.employerinscriptionlayout);
    }

    // Permet de creer un employer en stockant les informations qu'il a saisi dans la page d'incription
    // Cette fonction va creer un objet de la classe Employer
    public void EmployerConnectedInscriptionButton(View view) {
        if(IncompletEmployer() == 0) {   //Verifie si toutes les cases sont remplis sur la fiche d'inscription
            int present = 0;

            //Verifie si l'employer n'existe pas deja avant de creer un nouvel employer
            EditText eText = (EditText) findViewById(EmployerSetNomdelaSuccursaleText);
            for (int i = 0; i < Employerlist.size(); i++) {
                if (eText.getText().toString().equals(Employerlist.get(i).getNom())) {
                    TextView TextErreurInscription = (TextView) findViewById(EmployerInscriptionErreurText);
                    TextErreurInscription.setText("Erreur : Ce nom de succursale existe deja");
                    present = 1;
                }
            }

            // Cree des variables pour lire le contenu de chacune des sections de la fiche d'inscription
            if (present == 0) {
                Employer employer1 = new Employer();
                EditText TextNom = (EditText) findViewById(EmployerSetNomdelaSuccursaleText);
                EditText TextPassword = (EditText) findViewById(EmployerSetPasswordInscriptionText);
                EditText TextOuverture = (EditText) findViewById(EmployerSetOuvertureText);
                EditText TextAdresse = (EditText) findViewById(EmployerSetAdresseText);
                EditText TextFermeture = (EditText) findViewById(EmployerSetFermetureText);
                EditText TextVille = (EditText) findViewById(EmployerSetVilleText);
                EditText TextProvince = (EditText) findViewById(EmployerSetProvinceText);
                EditText TextPermis = (EditText) findViewById(EmployerSetPermisConduireText);
                EditText TextCarte = (EditText) findViewById(EmployerSetCartesanteText);
                EditText TextPiece = (EditText) findViewById(EmployerSetPieceIdentiteText);

                //Stocke les valeurs lues precedemment dans les variables du nouvel employer cree
                employer1.setNom(TextNom.getText().toString());
                employer1.setPassword(TextPassword.getText().toString());
                employer1.setHeureOuverture(TextOuverture.getText().toString());
                employer1.setHeureFermeture(TextFermeture.getText().toString());
                employer1.setPermisDeConduire(TextPermis.getText().toString());
                employer1.setAdresse(TextAdresse.getText().toString());
                employer1.setCarteDeSante(TextCarte.getText().toString());
                employer1.setPieceIdentite(TextPiece.getText().toString());
                employer1.setProvince(TextProvince.getText().toString());
                employer1.setVille(TextVille.getText().toString());

                //Ajoute le nouvel employer a la liste d'employer existant
                Employerlist.add(employer1);

                //Quitte la page d'inscription vers la page de l'employer ou il pourra effectuer ses operations
                setContentView(R.layout.employerconnectedlayout2);

                // Affiche un message sur la page Employer
                TextView TextClientConnected = (TextView) findViewById(EmployerAfficheBonjourText);
                TextClientConnected.setText(employer1.toString());
            }
        }

        // Affiche une erreur si toutes les sections ne sont pas remplies sur le formulaire d'inscription
        else {
            TextView TextErreurInscription = (TextView) findViewById(EmployerInscriptionErreurText);
            TextErreurInscription.setText("Erreur : Certains champs sont invalides");
        }
    }

    // Permet de lire les informations que l'employer a entre sur la page de connexion et laisser
    // l'employer se connecter si les infos sont correctes
    public void EmployerConnectedConnexionButton(View view) {
        int present =0;

        // Lis les valeurs entrees pour la connexion (Username et password)
        EditText TextUsername = (EditText) findViewById(EmployerSetUsernameConnexionText);
        EditText TextPassword = (EditText) findViewById(EmployerSetPasswordConnexionText);

        // Verifie si l'employer existe deja (si le nom d'utilisateur est deja present dans la liste
        // des employers
        for( int i=0; i<Employerlist.size();i++){
            if(TextUsername.getText().toString().equals(Employerlist.get(i).getNom()) && TextPassword.getText().toString().equals(Employerlist.get(i).getPassword())){
                setContentView(R.layout.employerconnectedlayout2);
                TextView TextEmployerConnected = (TextView) findViewById(EmployerAfficheBonjourText);
                TextEmployerConnected.setText(Employerlist.get(i).toString());
                present = 1;
            }
        }

        // Renvoie un message d'erreur si l'employer n'existe pas encore
        if(present == 0){
            TextView TextErreurConnexion = (TextView) findViewById(EmployerErreurConnectionText);
            TextErreurConnexion.setText("Erreur : Cette succursale n'existe pas encore");
        }
    }

    //Verifie que toutes les cases sont remplis sur le formulaire d'inscription Employer
    public int IncompletEmployer() {
        int Incomplet = 0;

        //Cree des variables pour stocker les donnees entrees sur le formulaire d'inscription
        EditText TextNom = (EditText) findViewById(EmployerSetNomdelaSuccursaleText);
        EditText TextPassword = (EditText) findViewById(EmployerSetPasswordInscriptionText);
        EditText TextOuverture = (EditText) findViewById(EmployerSetOuvertureText);
        EditText TextAdresse = (EditText) findViewById(EmployerSetAdresseText);
        EditText TextFermeture = (EditText) findViewById(EmployerSetFermetureText);
        EditText TextVille = (EditText) findViewById(EmployerSetVilleText);
        EditText TextProvince = (EditText) findViewById(EmployerSetProvinceText);
        EditText TextPermis = (EditText) findViewById(EmployerSetPermisConduireText);
        EditText TextCarte = (EditText) findViewById(EmployerSetCartesanteText);
        EditText TextPiece = (EditText) findViewById(EmployerSetPieceIdentiteText);

        //Verifie si une des valeurs est vide
        if (TextOuverture.getText().toString().equals("") || Integer.parseInt(TextOuverture.getText().toString()) > 24) {
            Incomplet = 1;
        }
        if (TextPassword.getText().toString().equals("")) {
            Incomplet = 1;
        }
        if (TextNom.getText().toString().equals("")) {
            Incomplet = 1;
        }
        if (TextAdresse.getText().toString().equals("")) {
            Incomplet = 1;
        }
        if (TextFermeture.getText().toString().equals("") || Integer.parseInt(TextOuverture.getText().toString()) > 24) {
            Incomplet = 1;
        }
        if (TextPermis.getText().toString().equals("Y") || TextPermis.getText().toString().equals("N") ) {}
        else{
            Incomplet = 1;
        }
        if (TextCarte.getText().toString().equals("Y") || TextCarte.getText().toString().equals("N") ) {}
        else{
            Incomplet = 1;
        }
        if (TextPiece.getText().toString().equals("Y") || TextPiece.getText().toString().equals("N")) {}
        else{
            Incomplet = 1;
        }
        if (TextVille.getText().toString().equals("")) {
            Incomplet = 1;
        }
        if (TextProvince.getText().toString().equals("")) {
            Incomplet = 1;
        }
        return Incomplet;
    }

    //Verifie que toutes les cases sont remplis sur le formulaire d'inscription Client
    public int IncompletClient(){
        int Incomplet = 0;

        //Cree des variables pour stocker les donnees entrees sur le formulaire d'inscription
        EditText TextNom = (EditText) findViewById(ClientSetNomText);
        EditText TextPrenom = (EditText) findViewById(ClientSetPrenomText);
        EditText TextUsername = (EditText) findViewById(ClientSetUsernameInscriptionText);
        EditText TextAdresse = (EditText) findViewById(ClientSetAdresseText);
        EditText TextJour = (EditText) findViewById(ClientSetJourText);
        EditText TextMois = (EditText) findViewById(ClientSetMoisText);
        EditText TextAnnee = (EditText) findViewById(ClientSetAnneeText);
        EditText TextVille = (EditText) findViewById(ClientSetVilleText);
        EditText TextProvince = (EditText) findViewById(ClientSetProvinceText);
        EditText TextSexe = (EditText) findViewById(ClientSetSexeText);
        EditText TextPassword = (EditText) findViewById(ClientSetPasswordInscriptionText);

        //Verifie si une des valeurs est vide
        if(TextPrenom.getText().toString().equals("")){
            Incomplet = 1;
        }
        if(TextPassword.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextNom.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextAdresse.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextJour.getText().toString().equals("") || Integer.parseInt(TextJour.getText().toString()) > 31){
            Incomplet = 1;
        }if(TextMois.getText().toString().equals("") || Integer.parseInt(TextMois.getText().toString()) > 12){
            Incomplet = 1;
        }if(TextAnnee.getText().toString().equals("") || Integer.parseInt(TextAnnee.getText().toString()) > 2023 || Integer.parseInt(TextAnnee.getText().toString()) < 1900){
            Incomplet = 1;
        }if(TextUsername.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextVille.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextProvince.getText().toString().equals("")){
            Incomplet = 1;
        }if(TextSexe.getText().toString().equals("M") || TextSexe.getText().toString().equals("F")){}
        else {Incomplet = 1;
        }
        return Incomplet;
    }

    // Permet de creer un client en stockant les informations qu'il a saisi dans la page d'incription
    // Cette fonction va creer un objet de la classe Client
    public void ClientConnectedInscriptionButton(View view) {
        if(IncompletClient() == 0) {  //Verifie si toutes les cases sont remplis sur la fiche d'inscription
            int present = 0;

            //Verifie si le client n'existe pas deja avant de creer un nouveau Client
            EditText eText = (EditText) findViewById(ClientSetUsernameInscriptionText);
            for (int i = 0; i < clientlist.size(); i++) {
                if (eText.getText().toString().equals(clientlist.get(i).getUsername())) {
                    TextView TextErreurInscription = (TextView) findViewById(ClientErreurInscriptionText);
                    TextErreurInscription.setText("Erreur : Ce nom d'utilisateur existe deja");
                    present = 1;
                }
            }

            // Cree des variables pour lire le contenu de chacune des sections de la fiche d'inscription
            if (present == 0) {
                Client client1 = new Client();
                EditText TextNom = (EditText) findViewById(ClientSetNomText);
                EditText TextPrenom = (EditText) findViewById(ClientSetPrenomText);
                EditText TextUsername = (EditText) findViewById(ClientSetUsernameInscriptionText);
                EditText TextAdresse = (EditText) findViewById(ClientSetAdresseText);
                EditText TextJour = (EditText) findViewById(ClientSetJourText);
                EditText TextMois = (EditText) findViewById(ClientSetMoisText);
                EditText TextAnnee = (EditText) findViewById(ClientSetAnneeText);
                EditText TextVille = (EditText) findViewById(ClientSetVilleText);
                EditText TextProvince = (EditText) findViewById(ClientSetProvinceText);
                EditText TextSexe = (EditText) findViewById(ClientSetSexeText);
                EditText TextPassword = (EditText) findViewById(ClientSetPasswordInscriptionText);

                //Stocke les valeurs lues precedemment dans les variables du nouveau Client cree
                client1.setPrenom(TextPrenom.getText().toString());
                client1.setPassword(TextPassword.getText().toString());
                client1.setSexe(TextSexe.getText().toString());
                client1.setNom(TextNom.getText().toString());
                client1.setUsername(TextUsername.getText().toString());
                client1.setAdresse(TextAdresse.getText().toString());
                client1.setJour(TextJour.getText().toString());
                client1.setMois(TextMois.getText().toString());
                client1.setAneee(TextAnnee.getText().toString());
                client1.setProvince(TextProvince.getText().toString());
                client1.setVille(TextVille.getText().toString());

                //Ajoute le nouvel employer a la liste d'employer existant
                clientlist.add(client1);

                //Quitte la page d'inscription vers la page du client ou il pourra effectuer ses operations
                setContentView(R.layout.clientconnectedlayout);

                // Affiche un message sur la page Client
                TextView TextClientConnected = (TextView) findViewById(ClientAfficheBonjourText);
                TextClientConnected.setText(client1.toString());
            }
        }

        // Affiche une erreur si toutes les sections ne sont pas remplies sur le formulaire d'inscription
        else{
            TextView TextErreurInscription = (TextView) findViewById(ClientErreurInscriptionText);
            TextErreurInscription.setText("Erreur : Certains champs sont invalides");
        }

    }

    // Permet de lire les informations que le client a entre sur la page de connexion et laisser
    // le client se connecter si les infos sont correctes
    public void ClientConnectedConnexionButton(View view) {
        int present =0;

        // Lis les valeurs entrees pour la connexion (Username et password)
        EditText TextUsername = (EditText) findViewById(ClientSetUsernameConnexionText);
        EditText TextPassword = (EditText) findViewById(ClientSetPasswordConnexionText);

        // Verifie si le client existe deja (si le nom d'utilisateur est deja present dans la liste
        // des Clients
        for( int i=0; i<clientlist.size();i++){
            if(TextUsername.getText().toString().equals(clientlist.get(i).getUsername()) && TextPassword.getText().toString().equals(clientlist.get(i).getPassword())){
                setContentView(R.layout.clientconnectedlayout);
                TextView TextClientConnected = (TextView) findViewById(ClientAfficheBonjourText);
                TextClientConnected.setText(clientlist.get(i).toString());
                present = 1;
            }
        }
        // Renvoie un message d'erreur si l'employer n'existe pas encore
        if(present == 0){
            TextView TextErreurConnexion = (TextView) findViewById(ClientErreurConnexionText);
            TextErreurConnexion.setText("Erreur : Ce client n'existe pas encore");
        }
    }

    // Permet de lire les informations que l'administrateur a entre sur la page de connexion et laisser
    // l'administrateur se connecter si les infos sont correctes
    public void AdministrateurConnectedButton(View view) {
        int present =0;

        // Lis les valeurs entrees pour la connexion (Username et password)
        EditText TextUsername = (EditText) findViewById(AdministrateurSetUsernameConnexionText);
        EditText TextPassword = (EditText) findViewById(AdministrateurSetPasswordConnexionText);

        // Verifie si l'administrateur existe deja (si le nom d'utilisateur est deja present dans la liste
        // d'administrateur
            if(TextUsername.getText().toString().equals(Admin.getNom()) && TextPassword.getText().toString().equals(Admin.getPassword())){
                setContentView(R.layout.administrateurconnectedlayout);
                TextView TextEmployerConnected = (TextView) findViewById(AdministrateurAfficheBonjourText);
                TextEmployerConnected.setText(Admin.toString());
                present = 1;
            }

        // Renvoie un message d'erreur si l'employer n'existe pas encore
        if(present == 0){
            TextView TextErreurConnexion = (TextView) findViewById(AdministrateurConnexionErreurText);
            TextErreurConnexion.setText("Erreur : Cet Administrateur n'existe pas");
        }
    }


}


