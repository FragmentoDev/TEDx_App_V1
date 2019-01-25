package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView  tedx, creditos;
    Button Horarios, WEB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Horarios = findViewById(R.id.btn_Horarios);
        WEB = findViewById(R.id.btn_WEB);
        tedx= findViewById(R.id.iv_am_tedx);
        creditos= findViewById(R.id.iv_am_creditos);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        Animation scroll = AnimationUtils.loadAnimation(this,R.anim.item_slide_left);

        tedx.setAnimation(myanim);
        creditos.setAnimation(myanim);

        Horarios.setAnimation(scroll);
        WEB.setAnimation(scroll);

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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tedxlosmochis.com/"));
                startActivity(browserIntent);
            }
        });
    }
}
