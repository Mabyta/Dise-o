package com.lsc.mabel.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Boolean nuevoTema=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.MyTema);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiar(View view){
        Intent intent=new Intent(getApplicationContext(),ScrollingActivity.class);
        intent.putExtra("nuevoTema",nuevoTema);
        startActivity(intent);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            nuevoTema=extras.getBoolean("nuevoTema");
        }
    }
}
