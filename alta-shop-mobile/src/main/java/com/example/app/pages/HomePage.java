package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class HomePage extends BasePageObject {
    private By descHeader = By.xpath("//android.view.View[@content-desc=\"Products\"]");
    private By btnAddProduct = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    private By cart = By.xpath("//android.widget.Button[@content-desc=\"1\"]");

    public void DescHeaderDisplayed() throws InterruptedException {
        isDisplay(descHeader);
        Thread.sleep(2000);
    }
    public void ClickBtnAdd(){
        click(btnAddProduct);
    }
    public void CartDisplayed(){
        isDisplay(cart);
    }
}
