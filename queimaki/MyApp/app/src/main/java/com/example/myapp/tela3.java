package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

    public class tela3 extends AppCompatActivity {
        private PasswordDAO passwordDAO;
        private int passwordId;
        private EditText editName, editLogin, editPassword, editNotes;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_tela3);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;

            });
            editName = findViewById(R.id.editName);
            editLogin = findViewById(R.id.editLogin);
            editPassword = findViewById(R.id.editPassword);
            editNotes = findViewById(R.id.editNotes);
            passwordDAO = new PasswordDAO(this);
            passwordDAO.getList();
            Intent intent = getIntent();
            passwordId = intent.getIntExtra("passwordId", -1);

            // Verifica se uma senha foi passada como parâmetro
            if (passwordId != -1) {
                Password password = passwordDAO.get(passwordId);
                editName.setText(password.getName());
                editLogin.setText(password.getLogin());
                editPassword.setText(password.getPassword());
                editNotes.setText(password.getNotes());
            }
        }
        public void entrarClicado(View v) {
            Password password = new Password(passwordId,
                    editName.getText().toString(),
                    editLogin.getText().toString(),
                    editPassword.getText().toString(),
                    editNotes.getText().toString());
            boolean result;
            if (passwordId == -1) result = passwordDAO.add(password);
            else                  result = passwordDAO.update(password);
            if (result) finish();
        }

    }
