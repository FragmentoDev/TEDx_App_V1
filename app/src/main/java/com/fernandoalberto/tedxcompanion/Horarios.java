package com.fernandoalberto.tedxcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Horarios extends AppCompatActivity {

    static ArrayList<Conferencistas> listaConferencistas = new ArrayList<Conferencistas>();
    RecyclerView rv;
    adapter_rv_cardview adapter;
    static int Index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);
        rv= findViewById(R.id.rv_horario);

        listaConferencistas.clear();
        listaConferencistas.add(new Conferencistas("Fernando Lerma", "Desarrollo Movil", "Introducción a aplicaciones moviles",4 , 5));
        listaConferencistas.add(new Conferencistas("Eider Diaz", "Desarrollo Movil Avanzado", "Desarrollo de aplicaciones moviles mas avanzadas",5 , 6));
        listaConferencistas.add(new Conferencistas("Oscar Hernandez", "Emprendimiento", "Aprender a emprender",6 , 7));
        listaConferencistas.add(new Conferencistas("Luis Vega", "Desarrollo de páginas web", "Introducción a paginas web",7 , 8));
        listaConferencistas.add(new Conferencistas("Alguien mas", "Desarrollo de flojera", "Introducción a ser flojo",8 , 12));

        rv.setLayoutManager(new LinearLayoutManager(Horarios.this));
        adapter = new adapter_rv_cardview(listaConferencistas);
        rv.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Index= rv.getChildAdapterPosition(v);
                Intent intent= new Intent(Horarios.this, Datos.class);
                startActivity(intent);
            }
        });
    }
}
