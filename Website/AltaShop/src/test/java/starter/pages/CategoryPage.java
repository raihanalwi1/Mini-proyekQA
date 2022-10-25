package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {
    private By btnCategory(){
        return By.id("input-16");
    }
    private By btnItemCategory(){
        return By.id("v-menu__content theme--light menuable__content__active");
    }
    private By headerCategory(){
        return By.xpath("//div[@class = 'row align-stretch'");
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
