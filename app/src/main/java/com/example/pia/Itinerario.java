package com.example.pia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Itinerario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerario);
    }

    //metodo boton siguiente
       public void Visitas(View view) {
         Intent visitas = new Intent(this, Inventario.class);
          startActivity(visitas);
    }
}
