package com.fernandoalberto.tedxcompanion;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetallesSector extends AppCompatActivity implements PerfilItemClickListener {

    RecyclerView rv;
    adapter_rv_cardview adapter;
    ImageView logo, creditos;
    static int indice;
    public static final String EXTRA_PERFIL_IMAGE_TRANSITION_NAME = "perfil_image_transition_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detalles_sector);
        rv= findViewById(R.id.ds_rv_personas);

        logo= findViewById(R.id.iv_detalles_tedx);
        creditos= findViewById(R.id.iv_am_creditos_detalles);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditos.setAnimation(myanim);
        LayoutAnimationController layoutAnimationController= AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_slide_from_bottom);
        rv.setLayoutManager(new LinearLayoutManager(DetallesSector.this));
        adapter = new adapter_rv_cardview(Splash.listaClick, getApplicationContext(), rv, this);
        rv.setAdapter(adapter);
        rv.setLayoutAnimation(layoutAnimationController);
        rv.getAdapter().notifyDataSetChanged();
        rv.scheduleLayoutAnimation();

    }

    @Override
    public void onPerfilItemClick(int pos, Conferencistas conferencistas, CircleImageView sharedImageView) {
        Intent intent = new Intent(getApplicationContext(), Datos.class);
        intent.putExtra(EXTRA_PERFIL_IMAGE_TRANSITION_NAME, ViewCompat.getTransitionName(sharedImageView));
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                sharedImageView,
                ViewCompat.getTransitionName(sharedImageView));
        startActivity(intent, options.toBundle());
    }
}
