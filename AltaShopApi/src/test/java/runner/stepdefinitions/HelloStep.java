package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.project.Hello;

public class HelloStep {
    @Steps
    Hello h;
    @Given("I set url home")
    public void iSetUrlHome() {
        h.setUrlHome();
    }

    @When("I want to view home")
    public void iWantToViewHome() {
        h.requestHome();
    }

    @Then("I will get code home")
    public void iWillGetCodeHome() {
        h.verifyStatusCode200();
    }
}
