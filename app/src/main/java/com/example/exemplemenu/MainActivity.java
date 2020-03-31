package com.example.exemplemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        try{
            //On va chercher notre toolbar dans layout
            Toolbar toolbar = findViewById(R.id.toolbar);
            //On remplace l'actionBar par notre toolbar
            setSupportActionBar(toolbar);
        }
        catch (Exception ex){
            String message = ex.getMessage();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //On associe un menu à notre activité
        getMenuInflater().inflate(R.menu.mnu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.add_click:
                Toast.makeText(context, "mon message Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.starclick:
                Toast.makeText(context, "mon message Star", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
