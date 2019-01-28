package com.fernandoalberto.tedxcompanion;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;
import android.widget.Toast;

public class DetallesSector extends AppCompatActivity {

    TextView Titulo;
    RecyclerView rv;
    adapter_rv_cardview adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detalles_sector);
        Titulo= findViewById(R.id.ds_tv_Titulo);
        rv= findViewById(R.id.ds_rv_personas);

        Titulo.setText(Horarios.Titulo);
        LayoutAnimationController layoutAnimationController= AnimationUtils.loadLayoutAnimation(getApplicationContext(), R.anim.layout_slide_from_bottom);
        rv.setLayoutManager(new LinearLayoutManager(DetallesSector.this));
        adapter = new adapter_rv_cardview(Splash.listaClick, getApplicationContext(), rv);
        rv.setAdapter(adapter);
        rv.setLayoutAnimation(layoutAnimationController);
        rv.getAdapter().notifyDataSetChanged();
        rv.scheduleLayoutAnimation();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
