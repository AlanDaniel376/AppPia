package com.example.pia;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class devoluciones extends AppCompatActivity {

    Button show;
    Dialog myDialog;
    Button editd, backd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devoluciones);
        show = (Button)findViewById(R.id.buttonDev);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCustomAlertDialogD();

            }
        });


    }

    public void myCustomAlertDialogD(){

        myDialog = new Dialog(devoluciones.this);
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myDialog.setContentView(R.layout.customdialogventas);
        myDialog.setTitle("Devoluciones");

        editd = (Button) myDialog.findViewById(R.id.editd);
        backd = (Button) myDialog.findViewById(R.id.backd);

        editd.setEnabled(true);
        backd.setEnabled(true);

        editd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        backd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.cancel();

            }
        });

        myDialog.show();

    }
}
