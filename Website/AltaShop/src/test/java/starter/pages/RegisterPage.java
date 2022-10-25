package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public void openRegister(){
        openAt("/auth/register");
    }
    private By inputFullname(){
        return By.id("input-701");
    }
    private By inputEmail(){
        return By.id("input-704");
    }
    private By inputPassword(){
        return By.id("input-707");
    }
    private By btnRegister(){
        return By.xpath("//a[text() = 'Register']");
    }
    private By btnSubmitRegister(){
        return By.xpath("//button[@class ='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//div[@role ='alert']");
    }
    public void InputFullname(String fullname){
        $(inputFullname()).type(fullname);
    }
    public void InputEmail(String email){
        $(inputEmail()).type(email);
    }
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }
    public void ClickBtnRegister(){
        $(btnRegister()).click();
    }
    public void ClickBtnSubmitRegister(){
        $(btnSubmitRegister()).click();
    }
    public void ErrorMessage(){
        $(errorMessage()).isDisplayed();
    }
}
