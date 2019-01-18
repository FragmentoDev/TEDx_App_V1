package com.fernandoalberto.tedxcompanion;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_rv_cardview extends RecyclerView.Adapter<adapter_rv_cardview.CardviewHolder> implements View.OnClickListener {

    ArrayList<Conferencistas> conferencistas;
    private View.OnClickListener listener;

    public adapter_rv_cardview(ArrayList<Conferencistas> conferencistas){
        this.conferencistas= conferencistas;
    }

    @Override
    public CardviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_rv, viewGroup, false);
        CardviewHolder holder= new CardviewHolder(view);
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardviewHolder cardviewHolder, int i) {
        Conferencistas conferencista= conferencistas.get(i);
        //cardviewHolder.ivPerfil.setImageDrawable();
        cardviewHolder.txtNombre.setText(conferencista.getNombre());
        cardviewHolder.txtTaller.setText(conferencista.getTaller());
        cardviewHolder.txtHorario.setText("Horario: " + conferencista.getHora_Inicio() + " - " + conferencista.getHora_Final());
    }

    @Override
    public int getItemCount() {
        return conferencistas.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener= listener;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public static class CardviewHolder extends RecyclerView.ViewHolder{
        ImageView ivPerfil;
        TextView txtNombre, txtTaller, txtHorario;

        public CardviewHolder(View itemView){
            super(itemView);
            ivPerfil= itemView.findViewById(R.id.iv_cardview);
            txtNombre= itemView.findViewById(R.id.tv_Nombre_cardview);
            txtTaller= itemView.findViewById(R.id.tv_Taller_cardview);
            txtHorario= itemView.findViewById(R.id.tv_Hora_cardview);
        }
    }
}
