package com.example.mgonzalezlorenzo.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarTexto(View v){
        TextView txt = (TextView)findViewById(R.id.textView);;
        txt.setText("Hola Mundo");
    }
}
