package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Horarios, WEB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Horarios = findViewById(R.id.btn_Horarios);
        WEB = findViewById(R.id.btn_WEB);

        Horarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Horarios.class);
                startActivity(intent);
            }
        });

        WEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ted.com/tedx/events/31019"));
                startActivity(browserIntent);
            }
        });
    }
}
