package com.modile.sauces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //********************* pour recuperé les composant depuis les disgin**********************

        EditText editText1 = findViewById(R.id.Matricule);
        EditText editText2 = findViewById(R.id.Password);
        Button button = findViewById(R.id.Sabmit);
        ProgressBar progressBar = findViewById(R.id.Progression_Bar);

        //********************** ecutaire d'evenement ********************************************

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pour recuperé les information sur les champs
                String matricule = editText1.getText().toString();
                String password = editText2.getText().toString();

                //verificatioon des champs de sesi
                if (matricule.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Matricule est vide",Toast.LENGTH_LONG).show();//pour envoyer un message
                    return;

                }else if (password.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Passwold est vide",Toast.LENGTH_LONG).show();
                    return;
                }else {

                    progressBar.setVisibility(View.VISIBLE);//pour randre visible
                    button.setEnabled(false);//pour desactiver un conposant

                    //pour changer l'etat de variabledans la session
                    SharedPreferences session = getSharedPreferences("session",0);//declarationde la session
                    session.edit().putBoolean("session_active",true).apply();

                }

            }
        });
    }
}