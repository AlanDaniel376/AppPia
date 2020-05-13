package com.example.pia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class dashboard extends AppCompatActivity implements View.OnClickListener {
    private CardView cardItinerario, cardInventario, cardDevoluciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Defining CardsViews
        cardItinerario   = (CardView) findViewById(R.id.cardItinerario);
        cardInventario   = (CardView) findViewById(R.id.cardInventario);
        cardDevoluciones = (CardView) findViewById(R.id.cardDevoluciones) ;

        // Add click listener to the cards
        cardItinerario.setOnClickListener(this);
        cardInventario.setOnClickListener(this);
        cardDevoluciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.cardItinerario:
                i = new Intent(this, Itinerario.class);
                startActivity(i);
                break;

            case R.id.cardInventario:
                i = new Intent(this, Inventario.class);
                startActivity(i);
                break;

            case R.id.cardDevoluciones:
                i = new Intent(this, devoluciones.class);
                startActivity(i);
                break;
        }
    }
}
