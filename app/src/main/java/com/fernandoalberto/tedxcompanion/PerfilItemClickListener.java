package com.fernandoalberto.tedxcompanion;

import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by msc10 on 19/02/2017.
 */

public interface PerfilItemClickListener {
    void onPerfilItemClick(ImageView foto, TextView nombre, TextView tema);
}

