package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent i = getIntent();

        /*String areaStr = i.getStringExtra("area");
        int area = Integer.parseInt(areaStr);
        TextView bemvindo = findViewById(R.id.textBemVindo);
        double ac = 3.14 * (area * area);
        double circ = (2 * 3.14) * area;
        bemvindo.setText("A area do Circulo é: "+ ac +" e a circunferência é: "+ circ);*/
    }
    public void entrarClicado(View v){
        Intent ivan = new Intent(this,tela3.class);
        startActivity(ivan);
    }
}
