package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private final int Duracion= 3200;
    ImageView logo, fragmento, creditos;
    TextView texto, elaborado;
    ProgressBar progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);

        logo= findViewById(R.id.splashlogotedx);
        texto= findViewById(R.id.splash_texto);
        progreso= findViewById(R.id.spalshProgressbar);
        elaborado= findViewById(R.id.splash_texto_elaborado);
        fragmento= findViewById(R.id.spashfragmento);
        creditos= findViewById(R.id.spashcreditos);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        texto.setAnimation(myanim);
        progreso.setAnimation(myanim);
        elaborado.setAnimation(myanim);
        fragmento.setAnimation(myanim);
        creditos.setAnimation(myanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, Duracion);
    }
}
