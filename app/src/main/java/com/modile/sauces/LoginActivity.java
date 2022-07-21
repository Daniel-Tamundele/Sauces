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

        /* RECUPERATION DES COMPOSANTS DEPUIT LE LAYOUT */

        EditText editText1 = findViewById(R.id.Matricule);
        EditText editText2 = findViewById(R.id.Password);
        Button button = findViewById(R.id.Sabmit);
        ProgressBar progressBar = findViewById(R.id.Progression_Bar);

        /* ECOUTE D'EVENEMENT SUR LE BUTTON SE CONNECTER */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* RECUPERATION DES INFORMATION SUR LESCHAMPS */
                String matricule = editText1.getText().toString();
                String password = editText2.getText().toString();

                /* VERIFICATION DES CHAMPS SI IL NE PAS VIDE*/
                if (matricule.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Matricule est vide",Toast.LENGTH_LONG).show();
                    return;

                }else if (password.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Passwold est vide",Toast.LENGTH_LONG).show();
                    return;
                }else {

                    /* VISIBILITER DE LA BAR DE PROGRESTION */
                    progressBar.setVisibility(View.VISIBLE);

                    /* DESACTIVATION DU BUTON SE CONNECTER */
                    button.setEnabled(false);//pour desactiver un conposant

                    /* DECLARATION DE LA SSSION */
                    SharedPreferences session = getSharedPreferences("session",0);

                    // /* POUR CHAMGER L'ETAT DE LA VARIABLE DE LA SESSION */
                    session.edit().putBoolean("session_active",true).apply();

                }

            }
        });
    }
}