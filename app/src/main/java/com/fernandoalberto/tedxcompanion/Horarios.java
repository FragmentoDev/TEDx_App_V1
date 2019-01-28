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
    adapter_rv_cardview adapter;
    ImageView logo, creditosizq, creditosder;
    CardView cv_registro, cv_mira_futuro, cv_personalidad, cv_radical, cv_prospectiva, cv_pasion_haver, cv_detras_miedo, cv_despedida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_horarios);
        linearLayout= findViewById(R.id.llhorario);
        logo= findViewById(R.id.iv_horarios_tedx);
        creditosizq= findViewById(R.id.horarios_creditos_izq);
        creditosder= findViewById(R.id.horarios_creditos_der);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditosizq.setAnimation(myanim);
        creditosder.setAnimation(myanim);

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
        cv_despedida=findViewById(R.id.h_cv_Despedida);

        cv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Registro", Toast.LENGTH_SHORT).show();
            }
        });

        cv_mira_futuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mira Futuro", Toast.LENGTH_SHORT).show();
            }
        });

        cv_personalidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Personalidad", Toast.LENGTH_SHORT).show();
            }
        });

        cv_radical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Radical", Toast.LENGTH_SHORT).show();
            }
        });

        cv_prospectiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Prospectiva", Toast.LENGTH_SHORT).show();
            }
        });

        cv_pasion_haver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pasión por hacer", Toast.LENGTH_SHORT).show();
            }
        });

        cv_detras_miedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Detras del miedo", Toast.LENGTH_SHORT).show();
            }
        });

        cv_despedida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Despedida", Toast.LENGTH_SHORT).show();
            }
        });
        /*rv= findViewById(R.id.rv_horario);
        rv.setLayoutManager(new LinearLayoutManager(Horarios.this));
        adapter = new adapter_rv_cardview(Splash.listaConferencistas, getApplicationContext(), rv);
        rv.setAdapter(adapter);
        rv.setLayoutAnimation(layoutAnimationController);
        rv.getAdapter().notifyDataSetChanged();
        rv.scheduleLayoutAnimation();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}
