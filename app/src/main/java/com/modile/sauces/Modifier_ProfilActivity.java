package com.modile.sauces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Modifier_ProfilActivity extends AppCompatActivity {

    /* DECLARATIONS DES VARIABLES */
    private EditText Ancien;
    private EditText Nouveau;
    private EditText Confirmer;
    private EditText Modifier;
    private Button Submit_Modifier_Profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_profil);

        /* RECUPERATION DES COMPOSANTS SUR LE LAYOUT */
        initialise();

        /* ECOUTER D'EVENEMENT */
        Submit_Modifier_Profiel();
    }
    /* LES FONCTION */

    private void initialise(){
        Ancien = findViewById(R.id.Ancien_mot_de_passe);
        Nouveau = findViewById(R.id.Nouveau_mot_de_passe);
        Confirmer = findViewById(R.id.Confirmer_mot_de_passe);
        Modifier = findViewById(R.id.Modifier);
        Submit_Modifier_Profil = findViewById(R.id.Button_Modifier_profil);
    }

    /* ECOUTER D'EVENEMENT SUR LEBUTTON Submit_Modifier_Profiel */
    private void Submit_Modifier_Profiel(){
        Submit_Modifier_Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* DECLARATION DES VARIABLE QUI VA MEPERMETRE A VERIFIERLES CHAMPS SI ILS ONT VIDE */
                String ancien = Ancien.getText().toString();
                String nouveau = Nouveau.getText().toString();
                String confirmer = Confirmer.getText().toString();
                String modifier = Modifier.getText().toString();

                if (ancien.isEmpty()){
                    Toast.makeText(Modifier_ProfilActivity.this,"Ancien mot de passe est vide",Toast.LENGTH_SHORT).show();
                    return;
                }else if (nouveau.isEmpty()){
                    Toast.makeText(Modifier_ProfilActivity.this,"nouveau mot de passe est vide",Toast.LENGTH_SHORT).show();
                    return;
                }else if (confirmer.isEmpty()){
                    Toast.makeText(Modifier_ProfilActivity.this,"Confirmer",Toast.LENGTH_SHORT).show();
                    return;
                }else if (modifier.isEmpty()){
                    Toast.makeText(Modifier_ProfilActivity.this,"modifier",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    Toast.makeText(Modifier_ProfilActivity.this,"Profil Modifier",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}