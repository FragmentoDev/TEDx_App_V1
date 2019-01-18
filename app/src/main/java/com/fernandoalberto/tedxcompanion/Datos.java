package com.fernandoalberto.tedxcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Datos extends AppCompatActivity {

    ImageView ivFoto;
    TextView txtNombre, txtTaller, txtHorario, txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        this.setTitle("Detalles de Conferencia");

        ivFoto= findViewById(R.id.iv_foto);
        txtNombre= findViewById(R.id.tv_Nombre_datos);
        txtTaller= findViewById(R.id.tv_Taller_datos);
        txtHorario= findViewById(R.id.tv_Horario_datos);
        txtDescripcion= findViewById(R.id.tv_Descipcion_datos);

        txtNombre.setText(Horarios.listaConferencistas.get(Horarios.Index).getNombre());
        txtTaller.setText(Horarios.listaConferencistas.get(Horarios.Index).getTaller());
        txtHorario.setText("Horario: " + Horarios.listaConferencistas.get(Horarios.Index).getHora_Inicio() + " - " + Horarios.listaConferencistas.get(Horarios.Index).getHora_Final());
        txtDescripcion.setText(Horarios.listaConferencistas.get(Horarios.Index).getDescipcion());
    }
}
