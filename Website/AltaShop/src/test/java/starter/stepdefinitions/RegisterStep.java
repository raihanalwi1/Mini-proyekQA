package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    LoginPage lp;
    @Steps
    RegisterPage rp;
    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        rp.openRegister();
    }
    @And("I click register button")
    public void iClickRegisterButton() {
        rp.ClickBtnRegister();
    }

    @When("I input fullname register {string}")
    public void iInputFullnameRegister(String fullname) {
        rp.InputFullname(fullname);
    }

    @And("I input email register {string}")
    public void iInputEmailRegister(String email) {
        rp.InputEmail(email);
    }

    @And("I input password register {string}")
    public void iInputPasswordRegister(String password) {
        rp.InputPassword(password);
    }

    @And("I click submit register button")
    public void iClickSubmitRegisterButton() {
        rp.ClickBtnSubmitRegister();
    }

    @Then("I will get the result register {string}")
    public void iWillGetTheResultRegister(String result) {
        if (result.equals("success")){
            lp.openLogin();
        }else if(result.equals("failed")){
            rp.ErrorMessage();
        }
    }


}
