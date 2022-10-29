package starter.utils;

import java.util.Random;

public class GeneratedString {
    public String randomEmail(){
        Random random = new Random();
        String email = "naixxy" +  random.nextInt() + "@mail.co";
        return email;
    }
    public String randomFullname(){
        Random random = new Random();
        String fullname = "naixxy" +  random.nextInt();
        return fullname;
    }
}
