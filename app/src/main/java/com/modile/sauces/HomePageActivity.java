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

        //declarationde la session
        SharedPreferences session = getSharedPreferences("session",0);

        //recuperation d'un element de la session
        boolean sessionActive = session.getBoolean("session_active",false);
        int userId = session.getInt("session_Id",-1);


        if (!sessionActive){
            Intent loginIntent = new Intent(this,LoginActivity.class);//pour passer de la page a une autres
            startActivity(loginIntent);//pour demarre l'activity
            finish(); //pour tier l'activity
        }

        //µµ************************************* recuperation dE composant *****************************

        configureButtonAjout();
        configureButtonProfil();
        configureButtonListDoc();
    }

    //les fonction de l'application
    private void configureButtonAjout(){
        Button configureButtonAjout =findViewById(R.id.Ajout);
        configureButtonAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ajoutIntent = new Intent(HomePageActivity.this,AjoutDocActivity.class );
                startActivity(ajoutIntent);
            }
        });
    }

    private void configureButtonProfil(){
        Button configureButtonProfil = findViewById(R.id.Profil);
        configureButtonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profilIntent = new Intent(HomePageActivity.this,ProfilActivity.class );
                startActivity(profilIntent);
            }
        });

    }

    private void configureButtonListDoc(){
        Button configureButtonListDoc = findViewById(R.id.List_Doc);
        configureButtonListDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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