package com.example.myapp;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class PasswordDAO {

    private Context context;
    private static ArrayList<Password> passwordsList = new ArrayList<>();

    public PasswordDAO(Context context) {
        this.context = context;
    }

    public ArrayList<Password> getList() {
        if (passwordsList.size() == 0) {
            passwordsList.add(new Password(0, "Facebook", "dovahkiin@gmail.com",
                    "FusRoDah123", ""));
            passwordsList.add(new Password(1, "GMail", "dovahkiin",
                    "Teste123", ""));
            passwordsList.add(new Password(2, "IComp", "dfrd@icomp.ufam.edu.br",
                    "Java4242", "Mudar a senha!"));
            passwordsList.add(new Password(3, "Steam", "dovahkiin",
                    "FusRoDah123", "Conta do Brasil"));
        }
        return passwordsList;
    }

    public boolean add(Password password) {
        password.setId(passwordsList.size());
        passwordsList.add(password);
        Toast.makeText(context, "Senha salva!", Toast.LENGTH_SHORT).show();
        return true;
    }

    public boolean update(Password password) {
        passwordsList.set(password.getId(), password);
        Toast.makeText(context, "Senha atualizada!", Toast.LENGTH_SHORT).show();
        return true;
    }

    public Password get(int id) {
        return passwordsList.get(id);
    }

}
