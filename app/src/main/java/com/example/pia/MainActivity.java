package com.example.pia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText  TXT_USR, TXT_PASS;
    Button BTN_L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TXT_USR  = (EditText)findViewById(R.id.input_email);
        TXT_PASS = (EditText)findViewById(R.id.input_password);
        BTN_L    = (Button)findViewById(R.id.login);

        BTN_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String V_USER = TXT_USR.getText().toString();
                String V_PASS = TXT_PASS.getText().toString();

                if (V_USER.equals("admin") && V_PASS.equals("12345"))
                {
                    Intent intent = new Intent(getApplicationContext(),Clientes.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña invalidos",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

     }
}
