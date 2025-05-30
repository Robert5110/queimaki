package com.example.queimakiandroid.login.utils;

import com.example.queimakiandroid.login.data.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface LoginService {
    @POST("demo/v1/auth/login")
    Call<String> loginUser(@Body Login login);
}
