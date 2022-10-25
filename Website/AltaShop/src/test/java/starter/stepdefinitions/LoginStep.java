package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage lp;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        lp.openLogin();
    }

    @When("I input email {string}")
    public void iInputEmail(String email) {
        lp.InputEmail(email);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        lp.InputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        lp.ClickBtnLogin();
    }

    @Then("I will get the result {string}")
    public void iWillGetTheResult(String arg0) {
        if(arg0.equals("failed")){
            lp.ErrorMessage();
        }
    }
    @Step
    public void iWillLogin(){
        lp.openLogin();
        lp.InputEmail("naixxy1@mail.com");
        lp.InputPassword("naixxy");
        lp.ClickBtnLogin();
    }
}
