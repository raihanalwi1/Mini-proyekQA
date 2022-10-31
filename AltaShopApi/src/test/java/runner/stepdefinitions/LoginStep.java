package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.auth.Login;

public class LoginStep {
    @Steps
    Login l;
    @Given("I set url login")
    public void iSetUrl() {
        l.setUrlApi();
    }

    @When("I want to use email {string} and password {string}")
    public void iWantToUseEmailAndPasswordValid(String email, String password) {
        l.requestWithEmailAndPassword(email, password);
    }
    @Then("I will get code login {string}")
    public void iWillGetCode(String result) {
        if (result.equals("succes")){
            l.verifyStatusCode200();
        }else if (result.equals("failed")){
            l.verifyStatusCode400();
        }

    }

}
