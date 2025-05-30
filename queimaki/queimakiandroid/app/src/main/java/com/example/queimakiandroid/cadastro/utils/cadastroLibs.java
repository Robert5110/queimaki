package com.example.queimakiandroid.cadastro.utils;

import com.example.queimakiandroid.cadastro.data.cadastroData;
import com.example.queimakiandroid.shared.utils.RetrofitClient;
import com.example.queimakiandroid.cadastro.utils.cadastroService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class cadastroLibs {

    private String resp;
    public cadastroLibs(){}

    public String CadastroUser(cadastroData cadastroData)
    {
         cadastroService service = RetrofitClient
                 .getRetrofitInstance()
                 .create(cadastroService.class);
         Call<String> call = service.cadastroUser(cadastroData);
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
