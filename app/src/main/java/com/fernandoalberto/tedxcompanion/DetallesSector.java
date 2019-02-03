package com.fernandoalberto.tedxcompanion;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v4.util.Pair;
import android.transition.Fade;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetallesSector extends AppCompatActivity implements PerfilItemClickListener {

    RecyclerView rv;
    adapter_rv_cardview adapter;
    ImageView logo, creditos;
    static int indice;
    static String Nombre;
    public static final String EXTRA_PERFIL_IMAGE_TRANSITION_NAME = "perfil_image_transition_name";
    public static final String EXTRA_PERFIL_NOMBRE_TRANSITION_NAME = "perfil_nombre_transition_name";
    public static final String EXTRA_PERFIL_TALLER_TRANSITION_NAME = "perfil_taller_transition_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detalles_sector);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Fade fade = new Fade();
            fade.excludeTarget(android.R.id.statusBarBackground, true);
            fade.excludeTarget(android.R.id.navigationBarBackground, true);

            getWindow().setEnterTransition(fade);
            getWindow().setExitTransition(fade);
        }

        rv= findViewById(R.id.ds_rv_personas);

        logo= findViewById(R.id.iv_detalles_tedx);
        creditos= findViewById(R.id.iv_am_creditos_detalles);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo.setAnimation(myanim);
        creditos.setAnimation(myanim);

        LayoutAnimationController layoutAnimationController= AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_slide_from_bottom);
        rv.setLayoutManager(new GridLayoutManager(this, 1));
        adapter = new adapter_rv_cardview(Splash.listaClick, getApplicationContext(), rv, this);
        rv.setAdapter(adapter);
        rv.setLayoutAnimation(layoutAnimationController);
        rv.getAdapter().notifyDataSetChanged();
        rv.scheduleLayoutAnimation();
    }

    @Override
    public void onPerfilItemClick(ImageView foto, TextView nombre, TextView taller) {
        /*Intent intent = new Intent(this, Datos.class);
        intent.putExtra(EXTRA_PERFIL_IMAGE_TRANSITION_NAME, ViewCompat.getTransitionName(nombre));
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                sharedImageView,
                ViewCompat.getTransitionName(sharedImageView));
        startActivity(intent, options.toBundle());*/
        Intent intent = new Intent(this, Datos.class);
        intent.putExtra(EXTRA_PERFIL_IMAGE_TRANSITION_NAME,  ViewCompat.getTransitionName(foto));
        intent.putExtra(EXTRA_PERFIL_NOMBRE_TRANSITION_NAME,  ViewCompat.getTransitionName(nombre));
        intent.putExtra(EXTRA_PERFIL_TALLER_TRANSITION_NAME,  ViewCompat.getTransitionName(taller));
        Pair<View, String> p1 = Pair.create((View)foto, EXTRA_PERFIL_IMAGE_TRANSITION_NAME);
        Pair<View, String> p2 = Pair.create((View)nombre, EXTRA_PERFIL_NOMBRE_TRANSITION_NAME);
        Pair<View, String> p3 = Pair.create((View)taller, EXTRA_PERFIL_TALLER_TRANSITION_NAME);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(DetallesSector.this, p1, p2, p3);
        startActivity(intent, options.toBundle());
    }
}
