package com.example.app.pages;

import org.openqa.selenium.By;

public class LoginPage {
    private By btn = By.xpath("//android.view.View[1]/android.widget.Button");
    private By textUsername = By.xpath("//android.widget.EditText[1]");
    private By textPassword = By.xpath("//android.widget.EditText[2]");
    private By btnLogin = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

}
