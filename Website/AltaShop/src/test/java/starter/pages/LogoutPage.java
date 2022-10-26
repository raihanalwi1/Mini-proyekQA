package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By btnLogout(){
        return By.xpath("//div[text() = ' Logout ']");
    }
    public void ClickBtnLogout(){
        $(btnLogout()).click();
    }
}
