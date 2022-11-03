package com.example.steps;

import com.example.app.pages.HomePage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {
    @Steps
    RegisterPage rp;
    @Steps
    HomePage hp;
    @And("I click button register account")
    public void iClickButtonRegisterAccount() throws InterruptedException {
        rp.ClickBtn();
    }

    @When("I input fullname {string}")
    public void iInputFullname(String fullname) throws InterruptedException {
        rp.inputTextFullname(fullname);
    }

    @And("I input email {string}")
    public void iInputEmail(String email) throws InterruptedException {
        rp.inputTextEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) throws InterruptedException {
        rp.inputTextPassword(password);
    }

    @And("I click button register")
    public void iClickButtonRegister() {
        rp.ClickBtnSubmitRegister();
    }

    @Then("I get result register {string}")
    public void iGetResultRegister(String result) throws InterruptedException {
        if (result.equals("pass")){
            hp.DescHeaderDisplayed();
        }else if (result.equals("reqFullname")){
            rp.RequiredFullname();
        }else if (result.equals("reqEmail")){
            rp.RequiredEmail();
        }else if (result.equals("reqPassword")){
            rp.RequiredPassword();
        }else if (result.equals("error")){
            rp.ErrorMessage();
        }
    }
}
