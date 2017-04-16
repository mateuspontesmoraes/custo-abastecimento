package com.mpontes.calculoabastecimento;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcular;
    private EditText edtVlrCombustivel;
    private EditText edtLitros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = (Button) findViewById(R.id.btnCalc);
        edtVlrCombustivel = (EditText) findViewById(R.id.edtVlrCombustivel);
        edtLitros = (EditText) findViewById(R.id.edtLitros);

        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double total = Double.parseDouble(edtLitros.getText().toString()) *
                            Double.parseDouble(edtVlrCombustivel.getText().toString());

        new AlertDialog.Builder(this)
                .setTitle("Calcula Combustive")
                .setMessage("Total a pagar R$" + total)
                .setCancelable(false)
                .setPositiveButton("ok", null).show();
    }
}
