package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GeneratedString;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {
    private By btnRegiterAcc = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By textFullname = By.xpath("//android.widget.EditText[1]");
    private By textEmail = By.xpath("//android.widget.EditText[2]");
    private By textPassword = By.xpath("//android.widget.EditText[3]");
    private By btnSubmitRegister = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By requiredFullname = By.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
    private By requiredEmail = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By requiredPassword = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    private By errorMessage = By.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    public void RequiredFullname(){
        isDisplay(requiredFullname);
    }
    public void RequiredEmail(){
        isDisplay(requiredEmail);
    }
    public void RequiredPassword(){
        isDisplay(requiredPassword);
    }
    public void ErrorMessage(){
        isDisplay(errorMessage);
    }
    public void ClickBtn() throws InterruptedException {
        click(btnRegiterAcc);
        Thread.sleep(2000);
    }
    public void inputTextFullname(String fullname) throws InterruptedException {
        click(textFullname);
        Thread.sleep(2000);

        clear(textFullname);
        AndroidElement elm = find(textFullname);
        elm.sendKeys(fullname);
    }
    public void inputTextEmail(String email) throws InterruptedException {
        click(textEmail);
        clear(textEmail);
        GeneratedString generatedString = new GeneratedString();
        if (email.equals("benar")){
            email = generatedString.randomEmail();
        }
        Thread.sleep(2000);
        AndroidElement elm = find(textEmail);
        elm.sendKeys(email);
    }
    public void inputTextPassword(String password) throws InterruptedException {
        click(textPassword);
        clear(textPassword);
        Thread.sleep(2000);

        AndroidElement elm = find(textPassword);
        elm.sendKeys(password);
    }
    public void ClickBtnSubmitRegister(){
        click(btnSubmitRegister);
    }
}
