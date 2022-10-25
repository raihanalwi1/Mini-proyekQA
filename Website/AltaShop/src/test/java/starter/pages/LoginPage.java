package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public void openLogin(){
        openAt("/auth/login");
    }
    private By inputEmail(){
        return By.id("input-18");
    }
    private By inputPassword(){
        return By.id("input-21");
    }
    private By btnLogin(){
        return By.xpath("//button[@class = 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//div[@role = 'alert']");
    }
    public void InputEmail(String email){
        $(inputEmail()).type(email);
    }
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }
    public void ClickBtnLogin(){
        $(btnLogin()).click();
    }
    public void ErrorMessage(){
        $(errorMessage()).isDisplayed();
    }
}
