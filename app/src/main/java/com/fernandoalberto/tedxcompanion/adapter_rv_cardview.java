package com.fernandoalberto.tedxcompanion;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
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
        Conferencistas conferencista= conferencistas.get(i);
        switch (i){
            case 0: cardviewHolder.ivPerfil.setImageResource(R.drawable.mirna_medina);
                break;
            case 1: cardviewHolder.ivPerfil.setImageResource(R.drawable.alejandro_felix);
                break;
            case 2: cardviewHolder.ivPerfil.setImageResource(R.drawable.miguel_renteria);
                break;
            case 3: cardviewHolder.ivPerfil.setImageResource(R.drawable.ana_retamoza);
                break;
            case 4: cardviewHolder.ivPerfil.setImageResource(R.drawable.gerardo_lopez);
                break;
            case 5: cardviewHolder.ivPerfil.setImageResource(R.drawable.mariela_guadalupe);
                break;
            case 6: cardviewHolder.ivPerfil.setImageResource(R.drawable.luis_escobedo);
                break;
            case 7: cardviewHolder.ivPerfil.setImageResource(R.drawable.krishna_ramirez);
                break;
            case 8: cardviewHolder.ivPerfil.setImageResource(R.drawable.maria_stone);
                break;
            case 9: cardviewHolder.ivPerfil.setImageResource(R.drawable.hector_serrano);
                break;
            case 10: cardviewHolder.ivPerfil.setImageResource(R.drawable.gilberto_castro);
                break;
            case 11: cardviewHolder.ivPerfil.setImageResource(R.drawable.ayesha_peraza);
                break;
            case 12: cardviewHolder.ivPerfil.setImageResource(R.drawable.dylan_kenjiro);
                break;
        }
        cardviewHolder.txtNombre.setText(conferencista.getNombre());
        cardviewHolder.txtTaller.setText(conferencista.getTaller());
        cardviewHolder.txtHorario.setText("Horario: " + conferencista.getHora_Inicio() + " - " + conferencista.getHora_Final());
        cardviewHolder.txtDescripcion.setText(conferencista.getDescipcion());
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
        TextView txtNombre, txtTaller, txtHorario, txtDescripcion;

        public CardviewHolder(View itemView){
            super(itemView);
            ivPerfil= itemView.findViewById(R.id.iv_cardview);
            txtNombre= itemView.findViewById(R.id.tv_Nombre_cardview);
            txtTaller= itemView.findViewById(R.id.tv_Taller_cardview);
            txtHorario= itemView.findViewById(R.id.tv_Hora_cardview);
            txtDescripcion= itemView.findViewById(R.id.tv_Descripcion_cardview);
        }
    }
}
