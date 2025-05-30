package com.example.myapp;

public class Password {
    private int id ;
    private String name;
    private String login;
    private String password;
    private String notes;

    Password(int id, String name, String login, String password, String notes){
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.notes = notes;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {return name;}
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getNotes() {
        return notes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
