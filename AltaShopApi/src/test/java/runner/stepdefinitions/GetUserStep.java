package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.auth.GetUser;

public class GetUserStep {
    @Steps
    GetUser gu;
    @Given("I set url Get user")
    public void iSetUrlGetUser() {
        gu.setUrlGetUser();
    }

    @When("I want to get user information")
    public void iWantToGetUserInformation() {
        gu.requestGet();
    }

    @Then("I will get code get user")
    public void iWillGetCodeGetUser() {
        gu.verifStatusCode200();
    }
}
