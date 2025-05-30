package com.example.queimakiandroid.login.utils;

import com.example.queimakiandroid.login.data.Login;
import com.example.queimakiandroid.login.utils.LoginService;
import com.example.queimakiandroid.login.data.Login;
import com.example.queimakiandroid.shared.utils.RetrofitClient;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginLibs {
    private String resp;
    public LoginLibs(){}


    public String LoginUser(Login login)
    {
        LoginService service = RetrofitClient
                .getRetrofitInstance()
                .create(LoginService.class);
        Call<String> call = service.loginUser(login);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful())
                {
                    resp = response.body();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

                resp = t.getMessage();

            }
        });
        return resp;

    }
}
