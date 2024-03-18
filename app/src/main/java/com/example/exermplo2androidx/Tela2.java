package com.example.exermplo2androidx;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        TextView nome = (TextView)findViewById(R.id.textView);
        TextView idade = (TextView)findViewById(R.id.textView2);
        TextView comidas = (TextView)findViewById(R.id.textView3);

        Intent myintent = getIntent();

        nome.setText(myintent.getStringExtra("nome"));
        idade.setText(myintent.getIntExtra("idade",0)+"");
        comidas.setText(myintent.getStringExtra("comidas"));
    }

    public void voltar(View v){
        finish();
    }

}
