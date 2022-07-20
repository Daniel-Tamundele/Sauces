package com.modile.sauces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class AjoutDocActivity extends AppCompatActivity {
    private EditText descruption;
    private EditText prommotion;
    private EditText categorie;
    private EditText date_depo;
    private ProgressBar progressBar;
    private TextView nom_image;
    private Button ajouter_photo;
    private Button ajouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_doc);

        //initialisation
        initialisation();

        //recuperation
        Ajouter_Photo();;





    }
    private void initialisation(){
        descruption = findViewById(R.id.Descruption);
        prommotion = findViewById(R.id.Promotion);
        categorie = findViewById(R.id.Categorie);
        date_depo =findViewById(R.id.Date);
        progressBar = findViewById(R.id.Progression_Bar_Ajout_Doc);
        nom_image = findViewById(R.id.Nom_Image);
        ajouter_photo = findViewById(R.id.Ajouter_photo);
        ajouter = findViewById(R.id.Ajout);
    }


    private void Ajouter_Photo(){
        ajouter_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperation
                String descrupt = descruption.getText().toString();
                String promo = prommotion.getText().toString();
                String catego = categorie.getText().toString();
                String datte = date_depo.getText().toString();

                if (descrupt.isEmpty()){
                    Toast.makeText(AjoutDocActivity.this,"designation est vide",Toast.LENGTH_LONG).show();
                    return;
                }else if (promo.isEmpty()){
                Toast.makeText(AjoutDocActivity.this,"Promotion est vide",Toast.LENGTH_LONG).show();
                    return;
                }else if (catego.isEmpty()){
                    Toast.makeText(AjoutDocActivity.this,"Categorie est vide",Toast.LENGTH_LONG).show();
                    return;
                }else if (datte.isEmpty()){
                    Toast.makeText(AjoutDocActivity.this,"date est vide",Toast.LENGTH_LONG).show();
                    return;
                }else {
                    Intent ajouter_PhotoIntent = new Intent(AjoutDocActivity.this,HomePageActivity.class );
                    startActivity(ajouter_PhotoIntent);
                }
            }
        });

    }
    private void Ajout(){
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}