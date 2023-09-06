package com.example.demoweb.service;

public class DiService {
    private String message;

    public DiService(){}
    public DiService(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void print(){
        System.out.println("Print: " + this.message);
    }
}
