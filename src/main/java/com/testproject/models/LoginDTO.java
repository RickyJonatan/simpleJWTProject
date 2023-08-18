package com.testproject.models;

public class LoginDTO {
    private String jwt;
    private String errorMessage;

    public LoginDTO(){
        super();
    }
    public LoginDTO(String jwt, String errorMessage){
        this.jwt=jwt;
        this.errorMessage=errorMessage;
    }
    public String getJwt() {
        return this.jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
