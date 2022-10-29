package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public void openHome(){
        openAt("/");
    }
    public void openDetail(){
        openAt("/products/7");
    }
    public void openTransaction(){
        openAt("/transaction");
    }

    private By btnDetailProduct(){
        return By.xpath("//span[text() ='Detail']");
    }
    private By btnBuyProduct(){
        return By.xpath("//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By badgeOrder(){
        return By.xpath("//span[@class='v-badge__badge primary']");
    }

    public void BtnDetailProduct(){
        $(btnDetailProduct()).click();
    }
    public void BtnBuyProduct(){
        $(btnBuyProduct()).click();
    }
    public void BadgeOrder(){
        $(badgeOrder()).isDisplayed();
    }

}
