package com.example.alumno.lav5clase10;

import android.content.DialogInterface;
import android.view.View;

/**
 * Created by alumno on 08/06/2017.
 */

public class Listener implements View.OnClickListener {

    private ILanzar lanzar;

    public Listener(ILanzar i){
        this.lanzar=i;
    }


    @Override
    public void onClick(View v) {
        lanzar.lanzarClick();
    }
}
