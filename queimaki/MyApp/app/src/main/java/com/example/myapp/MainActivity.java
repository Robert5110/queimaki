package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void entrarClicado(View v){
        /*EditText editAno = findViewById(R.id.editAno);
        String number = editAno.getText().toString();
        EditText editNumber = findViewById(R.id.editAno);
        int numero = Integer.parseInt(number);
        int nasc = 2025 - numero;
        String sejabemvindo = " Sua idade é "+nasc+" anos";
        Toast.makeText(this, sejabemvindo, Toast.LENGTH_SHORT).show();*/

        /*Intent ivan = new Intent(this,Tela2.class);
        EditText editAno = findViewById(R.id.editAno);
        String nome = editAno.getText().toString();
        ivan.putExtra("area",nome);
        startActivity(ivan);*/

        Intent ivan = new Intent(this,Tela2.class);
        startActivity(ivan);
    }
}