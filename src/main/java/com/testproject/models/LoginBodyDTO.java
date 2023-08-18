package com.testproject.models;

public class LoginBodyDTO {
    
    private String username;
    private String password;

    public LoginBodyDTO(){
        super();
    }

    public LoginBodyDTO(String username, String password){
        super();
        this.username=username;
        this.password=password;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
