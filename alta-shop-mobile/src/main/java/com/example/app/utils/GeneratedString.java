package com.example.app.utils;

import java.util.Random;

public class GeneratedString {
    public String randomEmail(){
        Random random = new Random();
        String email = "babu" + random.nextInt(5) + "gmail.com";
        return email;
    }
}
