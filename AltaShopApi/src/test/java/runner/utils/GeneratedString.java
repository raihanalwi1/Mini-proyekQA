package runner.utils;

import java.util.Random;

public class GeneratedString {
    public String randomEmail(){
        Random random = new Random();
        String email = "naixxy" +  random.nextInt() + "@mail.co";
        return email;
    }
    public String randomPassword(){
        Random random = new Random();
        String password = "password" + random.nextInt();
        return password;
    }
    public String randomFullname(){
        Random random = new Random();
        String fullname = "naixxy" +  random.nextInt();
        return fullname;
    }
    public String nameCategory(){
        Random random = new Random();
        String name = "Kopi" + random.nextInt(1);
        return name;
    }
    public String descCategory(){
        Random random = new Random();
        String desc = "ini adalah" + random.nextInt(1);
        return desc;
    }
}
