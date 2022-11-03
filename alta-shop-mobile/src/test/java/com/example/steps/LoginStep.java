package com.example.steps;

import com.example.app.pages.HomePage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {
    @Steps
    LoginPage lp;
    @Steps
    HomePage hp;

    @When("I input email {string} and password {string}")
    public void iInputUsernameAndPassword(String email, String password) throws InterruptedException {
        lp.inputTextEmail(email);
        lp.inputTextPassword(password);
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        lp.ClickBtnLogin();
    }

    @Then("I get result {string}")
    public void iGetResult(String result) throws InterruptedException {
        if (result.equals("reqEmail")){
            lp.EmailMessageDisplay();
        }else if(result.equals("reqPassword")){
            lp.PasswordMessageDisplay();
        }else if(result.equals("error")){
            lp.ErrorMessageDisplay();
        }else if(result.equals("pass")){
            hp.DescHeaderDisplayed();
        }
    }

    @And("I click button login account")
    public void iClickButtonLoginAccount() throws InterruptedException {
        lp.ClickBtn();
    }

//logout step
    @When("I will login")
    public void iWillLogin() throws InterruptedException {
        lp.iWillLogin();
    }

    @And("I click button logout")
    public void iClickButtonLogout() {
        lp.ClickBtnLogout();
    }
}
