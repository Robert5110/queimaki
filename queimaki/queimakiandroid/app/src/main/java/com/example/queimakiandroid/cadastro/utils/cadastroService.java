package com.example.queimakiandroid.cadastro.utils;

import com.example.queimakiandroid.cadastro.data.cadastroData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface cadastroService {
    @POST("demo/v1/auth/cadastro")
    Call<String> cadastroUser(@Body cadastroData cadastroData);

}
