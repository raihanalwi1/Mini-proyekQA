package com.example.app.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.driver.AndroidDriverInit.driver;

public class BasePageObject {
    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }
    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 30, 2000);
    }
    public void click(By locator){
        AndroidElement elm = find(locator);
        elm.click();
    }
    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    // kamu ambil element yaitu By locator, tapi waktu nyari kamu harus nunggu dulu sampai si element itu visible / muncu
    public void inputText(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
    }
    public void isDisplay(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }
    public String getText(By locator){
        return find(locator).getText();
    }
    public void clear(By locator){
        find(locator).clear();
    }
}
