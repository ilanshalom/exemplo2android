package com.example.exermplo2androidx;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View v){
        try {
            Intent myintent = new Intent(getApplicationContext(), com.example.exermplo2androidx.Tela2.class);
            String nome = ((EditText) findViewById(R.id.editText)).getText().toString();
            int idade = Integer.parseInt(((EditText) findViewById(R.id.editText2)).getText().toString());
            String comidas = "";
            CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
            CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
            CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3);
            if (check1.isChecked()) {
                comidas += check1.getText() + "\n";
            }
            if (check2.isChecked()) {
                comidas += check2.getText() + "\n";
            }
            if (check3.isChecked()) {
                comidas += check3.getText() + "\n";
            }
            myintent.putExtra("nome", nome);
            myintent.putExtra("idade", idade);
            myintent.putExtra("comidas", comidas);
            startActivity(myintent);
        }
        catch(Exception eee) {
            Snackbar.make(v, "Digite todos os dados corretamente, por favor.",
                    Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }
}
