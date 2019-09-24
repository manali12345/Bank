package com.bank.main;

import com.bank.screens.Login;

public class App {
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        //2 ways showed to start login in different thread. and to see which thread is running
        //and way to check in which thread it is running in constructor
        //threads make the thing faster and a single thread has a capacity
        // so every time u go to new screen a thread
        //else lblMsg.set
        System.out.println(new Thread().getName());
    }
}
