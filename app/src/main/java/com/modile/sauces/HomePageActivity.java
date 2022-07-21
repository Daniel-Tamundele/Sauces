package com.modile.sauces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        /* POUR DONNEES UN NOM A UN ACTIVITY */
        getSupportActionBar().setTitle("Accueil");

        /* DECLARATION DE LA SESION */
        SharedPreferences session = getSharedPreferences("session",0);

        //recuperation d'un element de la session
        boolean sessionActive = session.getBoolean("session_active",false);
        int userId = session.getInt("session_Id",-1);

        /*
            ON VERIFIE SI L'UTILISATEUR EST DEJA CONNECTER
            SI IL NE PAS CONNECTER ON AFFICHIER LA PAGE DE LOGIN
            SI IL EST DEJA CONNECTER ON PASSE DE LA PAGE LOGIN VER HOME
        */
        if (!sessionActive){
            Intent loginIntent = new Intent(this,LoginActivity.class);
            startActivity(loginIntent);//pour /* DEMAREE L'ACTIVITER */
            finish(); /* POUR TIER L'ACTIVITY */
        }

        /* APPEL DE FONCTION */
        configureButtonAjout();
        configureButtonProfil();
        configureButtonListDoc();
    }

    /* les fonction de l'application */

    private void configureButtonAjout(){
        /* ON RECUPER LE COMPOSANT BUTTON DEPUIT LE LAYOUT */
        Button configureButtonAjout =findViewById(R.id.Ajout);

        /* LES COUTER D'EVENEMENT SUR LES BUTTON AJOUT */
        configureButtonAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* LES PASSAGE DE LA PAGE HOME VER AJOUTDOC */
                Intent ajoutIntent = new Intent(HomePageActivity.this,AjoutDocActivity.class );
                startActivity(ajoutIntent);
            }
        });
    }

    private void configureButtonProfil(){
        /* ON RECUPER LE COMPOSANT BUTTON DEPUIT LE LAYOUT */
        Button configureButtonProfil = findViewById(R.id.Profil);

        /* LES COUTER D'EVENEMENT SUR LES BUTTON PROFIL */
        configureButtonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* LES PASSAGE DE LA PAGE HOME VER PROFIL */
                Intent profilIntent = new Intent(HomePageActivity.this,ProfilActivity.class );
                startActivity(profilIntent);
            }
        });

    }

    private void configureButtonListDoc(){
        /* ON RECUPER LE COMPOSANT BUTTON DEPUIT LE LAYOUT */
        Button configureButtonListDoc = findViewById(R.id.List_Doc);

        /* LES COUTER D'EVENEMENT SUR LES BUTTON LISTDOC */
        configureButtonListDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* LES PASSAGE DE LA PAGE HOME VER LISTDOC */
                Intent listIntent = new Intent(HomePageActivity.this,ListDocActivity.class );
                startActivity(listIntent);
            }
        });
    }

}
//pour modifier
        /*session.edit()
                .putInt("session_Id",123)
                .putBoolean("session_active",true)
                .apply();
        */