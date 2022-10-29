package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import starter.utils.GeneratedString;

public class RegisterPage extends PageObject {
    public void openRegister(){
        openAt("/auth/register");
    }
    private By inputFullname(){
        return By.id("input-18");
    }
    private By inputEmail(){
        return By.id("input-21");

    }
    private By inputPassword(){
        return By.id("input-24");
    }
    private By btnRegister(){
        return By.xpath("//div/a[text() = 'Register']");
    }
    private By btnSubmitRegister(){
        return By.xpath("//button[@class ='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//div[@class ='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }
    public void InputFullname(String fullname){
//        GeneratedString generatedString = new GeneratedString();
//        fullname = generatedString.randomFullname();
        $(inputFullname()).type(fullname);
    }
    public void InputEmail(String email){
        GeneratedString generatedString = new GeneratedString();
        if (email.equals("benar")){
            email = generatedString.randomEmail();
            $(inputEmail()).type(email);
        }
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
