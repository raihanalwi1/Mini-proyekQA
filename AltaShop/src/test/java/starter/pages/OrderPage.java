package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    public void openOrder(){
        openAt("/order");
    }
    private By btnOrder(){
        return By.xpath("//span[@class = 'v-badge v-badge--bottom v-badge--left v-badge--overlap theme--dark']");
    }
    private By headerTransaction(){
        return By.xpath("//div[@class='v-main__wrap']");
    }
    private By qty(){
        return By.xpath("//span[@class='mx-3 label-quantity']");
    }
    private By btnPlus(){
        return By.xpath("//span[text() ='+']");
    }
    private By btnMin(){
        return By.xpath("//span[text() ='-']");
    }
    private By btnBayarProduct(){
        return By.id("button-bayar");
    }
    private By alert(){
        return By.xpath("//div[@class ='v-card v-sheet theme--light']");
    }
    public void HeaderTransaction(){
        $(headerTransaction()).isDisplayed();
    }
    public void ClickBtnOrder(){
        $(btnOrder()).click();
    }
    public void Qty(){
        $(qty()).isDisplayed();
    }
    public void Alert(){
        $(alert()).isDisplayed();
    }
    public void ClickBtnPlus(){
        $(btnPlus()).click();
    }
    public void ClickBtnMin(){
        $(btnMin()).click();
    }
    public void ClickBayarProduct(){
        $(btnBayarProduct()).click();
    }

}
