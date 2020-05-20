package com.example.pia;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class ventas extends AppCompatActivity {

    Button show;
    Dialog myDialog;
    Button edit, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
        show = (Button)findViewById(R.id.buttonDia);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCustomAlertDialog();

            }
        });

    }

    public void myCustomAlertDialog(){

        myDialog = new Dialog(ventas.this);
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myDialog.setContentView(R.layout.customdialog);
        myDialog.setTitle("Ventas");

        edit = (Button) myDialog.findViewById(R.id.edit);
        back = (Button) myDialog.findViewById(R.id.back);

        edit.setEnabled(true);
        back.setEnabled(true);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.cancel();

            }
        });

       myDialog.show();

    }
}
