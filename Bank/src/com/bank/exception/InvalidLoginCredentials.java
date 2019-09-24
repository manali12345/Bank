package com.bank.exception;

public class InvalidLoginCredentials extends Exception {
    public String getMessage(){
        return "Invalid Credentials";
    }
}
