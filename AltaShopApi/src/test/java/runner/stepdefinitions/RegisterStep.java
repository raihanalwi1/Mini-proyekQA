package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.auth.Register;

public class RegisterStep {
    @Steps
    Register r;
    @Given("I set url register")
    public void iSetUrlRegister() {
        r.setUrlRegister();
    }
    @When("I want to email {string} password {string} and fullname {string}")
    public void iWantToEmailPasswordAndFullname(String email, String password, String fullname) {
        r.requestWithEmailPasswordAndFullname(email, password, fullname);
    }

    @Then("I will get code register {string}")
    public void iWillGetCodeRegister(String arg0) {
        if (arg0.equals("200")){
            r.verifyStatusCode200();
        }else if(arg0.equals("400")){
            r.verifyStatusCode400();
        }
    }
}
