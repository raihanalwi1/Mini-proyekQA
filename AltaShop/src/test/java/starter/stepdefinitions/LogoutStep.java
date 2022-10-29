package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.LogoutPage;

public class LogoutStep extends PageObject {
    @Steps
    LogoutPage lp;
    @Steps
    LoginStep ls;
    @Steps
    HomeStep hs;
    @Then("I will get the result logout")
    public void iWillGetTheResultLogout() {
        ls.iAmOnTheLoginPage();
    }

    @And("I login")
    public void iLogin() {
        ls.iAmOnTheLoginPage();
        ls.iWillLogin();
        hs.iAmOnTheHomePage();
    }

    @When("I click button")
    public void iClickButton() {

        lp.ClickBtn();
    }
}
