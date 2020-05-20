package com.example.pia;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Clientes extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    //Assign Variable
    EditText etSource, etDestination;
    Button   btnTrack;
    Button   btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        etSource      = findViewById(R.id.et_Source);
        etDestination = findViewById(R.id.et_Destination);
        btnTrack      = findViewById(R.id.btn_track);
        btnMenu       = findViewById(R.id.btnDashboard);

        btnTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get value from editText

                String sSource      = etSource.getText().toString().trim();
                String sDestination = etDestination.getText().toString().trim();

                //Check condition
                if (sSource.equals("")&&sDestination.equals("")) {
                    //When both value blank
                    Toast.makeText(getApplicationContext(),
                            "Enter both location",Toast.LENGTH_SHORT).show();
                }else {
                    //When both value fill
                    //Display Track

                    DisplayTrack(sSource,sDestination);

                }

            }
        });

        //Spinner
        Spinner spinner = findViewById(R.id.Clientes);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.clientes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    private void DisplayTrack(String sSource, String sDestination) {

         try {
             //When google maps is installed
             //Initialize uri
             Uri uri = Uri.parse("https://www.google.co.in/maps/dir" + sSource + "/"
             + sDestination);
             //Initialize intent with action view
             Intent intent = new Intent(Intent.ACTION_VIEW,uri);
             //Set package
             intent.setPackage("com.google.android.apps.maps");
             //Set flag
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             //Start ACTIVITY
             startActivity(intent);


         }catch (ActivityNotFoundException e){
              //When google map is not installed
             //Initialize uri
             Uri uri = Uri.parse("https://www.google.com.mx/maps/dir/" + sSource + "/"
                     + sDestination);
             //Initialize intent with action view
             Intent intent = new Intent(Intent.ACTION_VIEW,uri);
             //Set flag
             intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             //Start Activity
             startActivity(intent);
         }

    }


    public void Siguiente (View view){

        Intent siguiente = new Intent(this, dashboard.class);
        startActivity(siguiente);
    }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String text = parent.getItemAtPosition(position).toString();
            Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

    }

}
