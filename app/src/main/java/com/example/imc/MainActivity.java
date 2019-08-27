package com.example.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view) {
        EditText eAltura = (EditText)findViewById(R.id.eAltura);
        EditText ePeso = (EditText)findViewById(R.id.ePeso);
        TextView eResultado = (TextView)findViewById(R.id.IMC);

        Double altura = Double.parseDouble(eAltura.getText().toString());
        Double peso = Double.parseDouble(ePeso.getText().toString());
        Double resultado = (peso/(altura*altura));

        eResultado.setText(String.format("%.2f",resultado));



    }

    public void abrirCreditos(View view) {
        Intent intent = new Intent(this, Creditos.class);
        startActivity(intent);
    }
}
