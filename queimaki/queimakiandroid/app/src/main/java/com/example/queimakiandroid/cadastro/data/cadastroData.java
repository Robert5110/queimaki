package com.example.queimakiandroid.cadastro.data;

public class cadastroData {
    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String confirmaSenha;

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
    public void setConfirmaSenha(String confirmaSenha){
        this.confirmaSenha = confirmaSenha;
    }
    public String getConfirmaSenha(){
        return this.confirmaSenha;
    }


}
