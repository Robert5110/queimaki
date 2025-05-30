package com.example.queimakiandroid.login.data;

public class Login {

    private String nomeUser;
    private String emailUser;
    private String senhaUser;

    public void setNomeUser(String nomeUser){
        this.nomeUser = nomeUser;
    }
    public String getNomeUser(){
        return this.nomeUser;
    }
    public void setEmailUser(String emailUser){
        this.emailUser = emailUser;
    }
    public String getEmailUser(){
        return this.emailUser;
    }
    public void  setSenhaUser(String senhaUser){
        this.senhaUser = senhaUser;
    }

    public String getSenhaUser(){
        return this.senhaUser;
    }

}
