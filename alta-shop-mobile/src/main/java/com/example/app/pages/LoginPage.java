package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.driver.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {
    private By headerDisplay= By.xpath("//android.view.View[@content-desc=\"Login\"]");
    private By btn = By.xpath("(//android.widget.Button)[1]");
    private By textEmail = By.xpath("//android.widget.EditText[1]");
    private By textPassword = By.xpath("//android.widget.EditText[2]");
    private By btnLogin = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By requiredMessageEmail = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By requiredMessagePassword = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    private By errorMessage = By.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");

    public void headerDisplay(){
        AndroidElement headerElm = driver.findElement(headerDisplay);
        headerElm.isDisplayed();
    }
    public void ClickBtn() throws InterruptedException {
        click(btn);
        Thread.sleep(2000);
    }
    public void inputTextEmail(String email) throws InterruptedException {
        click(textEmail);
        Thread.sleep(2000);
        AndroidElement elm = find(textEmail);
        elm.sendKeys(email);
    }
    public void inputTextPassword(String password) throws InterruptedException {
        click(textPassword);
        Thread.sleep(2000);
        AndroidElement elm = find(textPassword);
        elm.sendKeys(password);
    }
    public void ClickBtnLogin(){
        click(btnLogin);
    }
    public void EmailMessageDisplay(){
        isDisplay(requiredMessageEmail);
    }
    public void PasswordMessageDisplay(){
        isDisplay(requiredMessagePassword);
    }
    public void ErrorMessageDisplay(){
        isDisplay(errorMessage);
    }
    public void iWillLogin() throws InterruptedException {
        click(textPassword);
        Thread.sleep(2000);
        AndroidElement elm = find(textEmail);
        elm.sendKeys("nai@gmail.com");
        click(textPassword);
        elm.sendKeys("password");
        click(btnLogin);
    }
    public void ClickBtnLogout(){
        click(btn);
    }

}
