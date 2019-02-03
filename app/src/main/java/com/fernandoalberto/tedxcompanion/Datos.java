package com.fernandoalberto.tedxcompanion;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class Datos extends AppCompatActivity {

    CircleImageView perfil;
    TextView Nombre, Taller, Descripcion;
    ImageView logo, creditos;
    static int drawableRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_datos);
        supportPostponeEnterTransition();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Fade fade = new Fade();
            fade.excludeTarget(android.R.id.statusBarBackground, true);
            fade.excludeTarget(android.R.id.navigationBarBackground, true);

            getWindow().setEnterTransition(fade);
            getWindow().setExitTransition(fade);
        }

        logo= findViewById(R.id.iv_datos_tedx);
        creditos= findViewById(R.id.iv_am_creditos_datos);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditos.setAnimation(myanim);

        perfil= findViewById(R.id.perfil_iv);
        Nombre= findViewById(R.id.perfil_nombre);
        Taller= findViewById(R.id.perfil_taller);
        Descripcion= findViewById(R.id.perfil_descripcion);

        Descripcion.setAnimation(myanim);
       /* Nombre.setAnimation(myanim);
        Taller.setAnimation(myanim);*/

        Bundle extras = getIntent().getExtras();
        switch (Splash.listaClick.get(DetallesSector.indice).getNombre()){
            case "Mirna Medina": drawableRes= R.drawable.mirna_medina_circulo;
                break;
            case "Alejandro Félix": drawableRes= R.drawable.alejandro_felix_circulo;
                break;
            case "Miguel Ángel Vicente Renteria": drawableRes= R.drawable.miguel_renteria_circulo;
                break;
            case "Ana Retamoza": drawableRes= (R.drawable.ana_retamoza_circulo);
                break;
            case "Gerardo López Romero": drawableRes=(R.drawable.gerardo_lopez_circulo);
                break;
            case "Mariela Guadalupe Hernández": drawableRes=(R.drawable.mariela_guadalupe_circulo);
                break;
            case "Luis Daniel Cordero Escobedo": drawableRes=(R.drawable.luis_escobedo_circulo);
                break;
            case "Krishna Daniela Valdez Ramírez":drawableRes=(R.drawable.krishna_ramirez_circulo);
                break;
            case "María Stone": drawableRes=(R.drawable.maria_stone_circulo);
                break;
            case "Hector Serrano Castro": drawableRes=(R.drawable.hector_serrano_circulo);
                break;
            case "Gilberto Castro":drawableRes=(R.drawable.gilberto_castro_circulo);
                break;
            case "Ayesha Peraza": drawableRes=(R.drawable.ayesha_peraza_circulo);
                break;
            case "Dylan Kenjiro": drawableRes=(R.drawable.dylan_kenjiro_circulo);
                break;
            case "Tim Urban": drawableRes=(R.drawable.tim_urba_circulo);
                break;
            case "Jorge Ramos": drawableRes=(R.drawable.jorge_ramos_circulo);
                break;
            case "Jorge Drexler": drawableRes=(R.drawable.jorge_drexler_circulo);
                break;
            case "Christoph Niemann": drawableRes=(R.drawable.neimann_circulo);
                break;
        }

        Nombre.setText(Splash.listaClick.get(DetallesSector.indice).getNombre());
        Taller.setText(Splash.listaClick.get(DetallesSector.indice).getTaller());
        Descripcion.setText(Splash.listaClick.get(DetallesSector.indice).getDescipcion());

        Picasso.get().load(drawableRes).into(perfil, new Callback() {
                    @Override
                    public void onSuccess() {
                        supportStartPostponedEnterTransition();
                    }

                    @Override
                    public void onError(Exception e) {
                        supportFinishAfterTransition();
                    }
                });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            String imageTransitionName = extras.getString(DetallesSector.EXTRA_PERFIL_IMAGE_TRANSITION_NAME);
            perfil.setTransitionName(imageTransitionName);
            String nombreTransitionName = extras.getString(DetallesSector.EXTRA_PERFIL_NOMBRE_TRANSITION_NAME);
            Nombre.setTransitionName(nombreTransitionName);
            String tallerTransitionName = extras.getString(DetallesSector.EXTRA_PERFIL_TALLER_TRANSITION_NAME);
            Taller.setTransitionName(tallerTransitionName);
        }
    }
}
