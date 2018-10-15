package com.lsc.mabel.materialdesign;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    private boolean nuevoTema=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extra=getIntent().getExtras();
        nuevoTema=extra.getBoolean("nuevoTema");
        if(nuevoTema)
            setTheme(R.style.MyTema);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Cambiando tema", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                setTheme(R.style.MyTema);
                TextView textoLargo=(TextView) findViewById(R.id.textoLargo);
                textoLargo.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
                nuevoTema=true;
                Intent regresar=new Intent();
                regresar.putExtra("nuevoTema",nuevoTema);
                setResult(RESULT_OK,regresar);
                finish();
            }
        });
    }
 }
