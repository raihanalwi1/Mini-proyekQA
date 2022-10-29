package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By btnLogout(){
        return By.xpath("//div[text() = ' Logout ']");
    }
    private By btn(){
        return By.xpath("/html/body/div/div/header/div/button[2]/span/i");
    }
    public void ClickBtn(){
        $(btn()).click();
    }
    public void ClickBtnLogout(){
        $(btnLogout()).click();
    }
}
