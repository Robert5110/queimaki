package com.example.queimakiandroid.cadastro.presetation;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.queimakiandroid.R;
import com.example.queimakiandroid.cadastro.data.cadastroData;
import com.example.queimakiandroid.cadastro.utils.cadastroLibs;
import com.example.queimakiandroid.MainActivity;
import com.example.queimakiandroid.login.presetation.LoginActivity;


public class cadastroActivity extends AppCompatActivity {

    private String resp;

    private EditText nome_field;
    private EditText email_field;
    private EditText senha_filed;
    private EditText confirma_field;
    private TextView issue_lb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nome_field = findViewById(R.id.nomeOrmail_field);
        email_field = findViewById(R.id.email_field);
        senha_filed = findViewById(R.id.senha_field);
        confirma_field = findViewById(R.id.confrima_field);
        issue_lb = findViewById(R.id.issue_lb);
        issue_lb.setVisibility(GONE);

    }
    public void gotoMainActivity(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void gotoLoginActivity(View view)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    public void cadastroService(View view)
    {
        String issue = "*";
        String nome = nome_field.getText().toString();
        String email = email_field.getText().toString();
        String senha = senha_filed.getText().toString();
        String confirma_senha = confirma_field.getText().toString();
        if (nome.isEmpty()) issue += "nome obrigatorio\n";
        if (email.isEmpty()) issue += "email obrigatorio\n";
        if (senha.isEmpty() || !senha.equals(confirma_senha)) issue += "O campo senha e obrigatorio e deve ser igual a confirmação \n";
        {
            cadastroLibs libs = new cadastroLibs();
            cadastroData cadastroData = new cadastroData();
            cadastroData.setNomeUser(nome);
            cadastroData.setEmailUser(email);
            cadastroData.setSenhaUser(senha);
            issue = libs.CadastroUser(cadastroData);

        }
        issue_lb.setText(issue);
        issue_lb.setVisibility(VISIBLE);

    }

}