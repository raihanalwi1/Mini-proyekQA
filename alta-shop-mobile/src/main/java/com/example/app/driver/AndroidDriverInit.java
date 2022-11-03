package com.example.app.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {
    public static AndroidDriver<AndroidElement> driver; //drivfer ini adalah sebuah class

    public static void initialization() {
// ketika akan melakukan inisialiasi, kita harus menentukan desired capavilites dari dari driver yang akan dibangun
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("app", "C:\\Users\\alwi\\IdeaProjects\\alta-shop-mobile\\src\\test\\resources\\application\\app-release.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void close(){
        driver.quit();
    }
}
