package com.bank.pro;

import com.bank.exception.InvalidLoginCredentials;

public class A {
    
    public boolean validate(String username,String password) throws InvalidLoginCredentials{
        if(username.equals("admin"))
            if(password.equals("1234")){
                return true;
            }
        throw new InvalidLoginCredentials();
        
    }
}
