package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Horarios extends AppCompatActivity {

    LinearLayout linearLayout;
    ImageView logo, creditos;
    CardView cv_registro, cv_mira_futuro, cv_personalidad, cv_radical, cv_prospectiva, cv_pasion_haver, cv_detras_miedo;
    static String Titulo= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_horarios);
        linearLayout= findViewById(R.id.llhorario);
        logo= findViewById(R.id.iv_horarios_tedx);
        creditos= findViewById(R.id.iv_am_creditos_horarios);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditos.setAnimation(myanim);

        LayoutAnimationController layoutAnimationController= AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_slide_from_bottom);
        linearLayout.setLayoutAnimation(layoutAnimationController);
        linearLayout.scheduleLayoutAnimation();

        cv_registro=findViewById(R.id.h_cv_Registro);
        cv_mira_futuro= findViewById(R.id.h_cv_Mira_futuro);
        cv_personalidad=findViewById(R.id.h_cv_Personalidad);
        cv_radical= findViewById(R.id.h_cv_Radical);
        cv_prospectiva=findViewById(R.id.h_cv_Prospectiva);
        cv_pasion_haver= findViewById(R.id.h_cv_Pasion_hacer);
        cv_detras_miedo=findViewById(R.id.h_cv_Detras_miedo);

        cv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titulo= "Registro y Acceso";
            }
        });

        cv_mira_futuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(6).getNombre(), Splash.listaConferencistas.get(6).getTaller(), Splash.listaConferencistas.get(6).getDescipcion(), "10:00 AM", "10:30 AM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(3).getNombre(), Splash.listaConferencistas.get(3).getTaller(), Splash.listaConferencistas.get(3).getDescipcion(), "10:30 AM", "11:00 AM"));
                Titulo= "Mira hacia el futuro";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });

        cv_personalidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(12).getNombre(), Splash.listaConferencistas.get(12).getTaller(), Splash.listaConferencistas.get(12).getDescipcion(), "11:20 AM", "11:40 AM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(13).getNombre(), Splash.listaConferencistas.get(13).getTaller(), Splash.listaConferencistas.get(13).getDescipcion(), "11:40 AM", "12:00 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(1).getNombre(), Splash.listaConferencistas.get(1).getTaller(), Splash.listaConferencistas.get(1).getDescipcion(), "12:00 AM", "12:20 PM"));
                Titulo= "Personalidad";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });

        cv_radical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(4).getNombre(), Splash.listaConferencistas.get(4).getTaller(), Splash.listaConferencistas.get(4).getDescipcion(), "12:40 PM", "1:00 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(9).getNombre(), Splash.listaConferencistas.get(9).getTaller(), Splash.listaConferencistas.get(9).getDescipcion(), "1:00 PM", "1:20 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(14).getNombre(), Splash.listaConferencistas.get(14).getTaller(), Splash.listaConferencistas.get(14).getDescipcion(), "1:20 PM", "1:40 PM"));
                Titulo= "Radical";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });

        cv_prospectiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(11).getNombre(), Splash.listaConferencistas.get(11).getTaller(), Splash.listaConferencistas.get(11).getDescipcion(), "2:00 PM", "2:20 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(10).getNombre(), Splash.listaConferencistas.get(10).getTaller(), Splash.listaConferencistas.get(10).getDescipcion(), "2:20 PM", "2:40 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(8).getNombre(), Splash.listaConferencistas.get(8).getTaller(), Splash.listaConferencistas.get(8).getDescipcion(), "2:40 PM", "3:00 PM"));
                Titulo= "Prospectiva";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });

        cv_pasion_haver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(16).getNombre(), Splash.listaConferencistas.get(16).getTaller(), Splash.listaConferencistas.get(16).getDescipcion(), "4:30 PM", "4:50 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(7).getNombre(), Splash.listaConferencistas.get(7).getTaller(), Splash.listaConferencistas.get(7).getDescipcion(), "4:50 PM", "5:10 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(15).getNombre(), Splash.listaConferencistas.get(15).getTaller(), Splash.listaConferencistas.get(15).getDescipcion(), "5:10 PM", "5:30 PM"));
                Titulo= "Pasión por hacer";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });

        cv_detras_miedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Splash.listaClick.clear();
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(5).getNombre(), Splash.listaConferencistas.get(5).getTaller(), Splash.listaConferencistas.get(5).getDescipcion(), "5:50 PM", "6:10 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(0).getNombre(), Splash.listaConferencistas.get(0).getTaller(), Splash.listaConferencistas.get(0).getDescipcion(), "6:10 PM", "6:30 PM"));
                Splash.listaClick.add(new Conferencistas(Splash.listaConferencistas.get(2).getNombre(), Splash.listaConferencistas.get(2).getTaller(), Splash.listaConferencistas.get(2).getDescipcion(), "6:30 PM", "6:50 PM"));
                Titulo= "Detrás del miedo";
                Intent intent= new Intent(Horarios.this, DetallesSector.class);
                startActivity(intent);
            }
        });
    }
}
