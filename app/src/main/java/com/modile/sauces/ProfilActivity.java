package com.modile.sauces;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    /* POUR RECUPERER LE MNU */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tolbar_profil,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* ECOUTER D'EVENEMENT SUR LES ITEM */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        /* ON VERIFIER L'ID */
        if (item.getItemId() == R.id.Modifier_Profil){
            Toast.makeText(ProfilActivity.this,"Modifier",Toast.LENGTH_SHORT).show();
            Intent modifier = new Intent(ProfilActivity.this,Modifier_ProfilActivity.class );
            startActivity(modifier);
        }else {
            Toast.makeText(ProfilActivity.this,"Setings",Toast.LENGTH_SHORT).show();
            Intent parametre = new Intent(ProfilActivity.this,Modifier_ProfilActivity.class );
            startActivity(parametre);
        }
        return super.onOptionsItemSelected(item);
    }
}
