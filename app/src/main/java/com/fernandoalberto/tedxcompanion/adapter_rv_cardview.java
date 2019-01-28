package com.fernandoalberto.tedxcompanion;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_rv_cardview extends RecyclerView.Adapter<adapter_rv_cardview.CardviewHolder> implements View.OnClickListener {

    ArrayList<Conferencistas> conferencistas;
    private View.OnClickListener listener;
    private Context mContext;
    private View view;
    int lastPosition=0;

    public adapter_rv_cardview(ArrayList<Conferencistas> conferencistas, Context mContext, View view){
        this.conferencistas= conferencistas;
        this.mContext= mContext;
        this.view= view;
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
        view= cardviewHolder.itemView;
        //if (i >= lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.item_scroll);
            view.startAnimation(animation);
       // }
        //lastPosition = i;
        Conferencistas conferencista= conferencistas.get(i);
        switch (conferencista.getNombre()){
            case "Mirna Medina": cardviewHolder.ivPerfil.setImageResource(R.drawable.mirna_medina_circulo);
                break;
            case "Alejandro Félix": cardviewHolder.ivPerfil.setImageResource(R.drawable.alejandro_felix_circulo);
                break;
            case "Miguel Ángel Vicente Renteria": cardviewHolder.ivPerfil.setImageResource(R.drawable.miguel_renteria_circulo);
                break;
            case "Ana Retamoza": cardviewHolder.ivPerfil.setImageResource(R.drawable.ana_retamoza_circulo);
                break;
            case "Gerardo López Romero": cardviewHolder.ivPerfil.setImageResource(R.drawable.gerardo_lopez_circulo);
                break;
            case "Mariela Guadalupe Hernández": cardviewHolder.ivPerfil.setImageResource(R.drawable.mariela_guadalupe_circulo);
                break;
            case "Luis Daniel Cordero Escobedo": cardviewHolder.ivPerfil.setImageResource(R.drawable.luis_escobedo_circulo);
                break;
            case "Krishna Daniela Valdez Ramírez": cardviewHolder.ivPerfil.setImageResource(R.drawable.krishna_ramirez_circulo);
                break;
            case "María Stone": cardviewHolder.ivPerfil.setImageResource(R.drawable.maria_stone_circulo);
                break;
            case "Hector Serrano Castro": cardviewHolder.ivPerfil.setImageResource(R.drawable.hector_serrano_circulo);
                break;
            case "Gilberto Castro": cardviewHolder.ivPerfil.setImageResource(R.drawable.gilberto_castro_circulo);
                break;
            case "Ayesha Peraza": cardviewHolder.ivPerfil.setImageResource(R.drawable.ayesha_peraza_circulo);
                break;
            case "Dylan Kenjiro": cardviewHolder.ivPerfil.setImageResource(R.drawable.dylan_kenjiro_circulo);
                break;
        }
        cardviewHolder.txtNombre.setText(conferencista.getNombre());
        cardviewHolder.txtTaller.setText(conferencista.getTaller());
        cardviewHolder.txtHorario.setText(conferencista.getHora_Inicio() + "  -  " + conferencista.getHora_Final());
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
