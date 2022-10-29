package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {
    private By btnCategory(){
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[3]/div/i");
    }
    private By btnItemCategory(){
        return By.xpath("//div[text() ='gaming']");
    }
    private By headerCategory(){
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]");
    }
    public void ClickBtnCategory(){
        $(btnCategory()).click();
    }
    public void ClickBtnItemCategory(){
        $(btnItemCategory()).click();
    }
    public void HeaderCategory(){
        $(headerCategory()).isDisplayed();
    }
}
