package com.fernandoalberto.tedxcompanion;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Datos extends AppCompatActivity {

    CircleImageView perfil;
    TextView Nombre, Taller, Descripcion;
    ImageView logo, creditosizq, creditosder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_datos);

        logo= findViewById(R.id.iv_datos_tedx);
        creditosizq= findViewById(R.id.datos_creditos_izq);
        creditosder= findViewById(R.id.datos_creditos_der);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditosizq.setAnimation(myanim);
        creditosder.setAnimation(myanim);

        perfil= findViewById(R.id.perfil_iv);
        Nombre= findViewById(R.id.perfil_nombre);
        Taller= findViewById(R.id.perfil_taller);
        Descripcion= findViewById(R.id.perfil_descripcion);

        Descripcion.setAnimation(myanim);

        switch (Splash.listaClick.get(DetallesSector.indice).getNombre()){
            case "Mirna Medina": perfil.setImageResource(R.drawable.mirna_medina_circulo);
                break;
            case "Alejandro Félix": perfil.setImageResource(R.drawable.alejandro_felix_circulo);
                break;
            case "Miguel Ángel Vicente Renteria": perfil.setImageResource(R.drawable.miguel_renteria_circulo);
                break;
            case "Ana Retamoza": perfil.setImageResource(R.drawable.ana_retamoza_circulo);
                break;
            case "Gerardo López Romero": perfil.setImageResource(R.drawable.gerardo_lopez_circulo);
                break;
            case "Mariela Guadalupe Hernández": perfil.setImageResource(R.drawable.mariela_guadalupe_circulo);
                break;
            case "Luis Daniel Cordero Escobedo": perfil.setImageResource(R.drawable.luis_escobedo_circulo);
                break;
            case "Krishna Daniela Valdez Ramírez":perfil.setImageResource(R.drawable.krishna_ramirez_circulo);
                break;
            case "María Stone": perfil.setImageResource(R.drawable.maria_stone_circulo);
                break;
            case "Hector Serrano Castro": perfil.setImageResource(R.drawable.hector_serrano_circulo);
                break;
            case "Gilberto Castro":perfil.setImageResource(R.drawable.gilberto_castro_circulo);
                break;
            case "Ayesha Peraza": perfil.setImageResource(R.drawable.ayesha_peraza_circulo);
                break;
            case "Dylan Kenjiro": perfil.setImageResource(R.drawable.dylan_kenjiro_circulo);
                break;
            case "Tim Urban": perfil.setImageResource(R.drawable.tim_urba_circulo);
                break;
            case "Jorge Ramos": perfil.setImageResource(R.drawable.jorge_ramos_circulo);
                break;
            case "Jorge Drexler": perfil.setImageResource(R.drawable.jorge_drexler_circulo);
                break;
            case "Christoph Niemann": perfil.setImageResource(R.drawable.neimann_circulo);
                break;
        }

        Nombre.setText(Splash.listaClick.get(DetallesSector.indice).getNombre());
        Taller.setText(Splash.listaClick.get(DetallesSector.indice).getTaller());
        Descripcion.setText(Splash.listaClick.get(DetallesSector.indice).getDescipcion());
    }
}
