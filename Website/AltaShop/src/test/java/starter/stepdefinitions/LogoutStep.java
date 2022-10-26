package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.LogoutPage;

public class LogoutStep extends PageObject {
    @Steps
    LogoutPage lp;
    LoginStep ls;
    @And("I click logout button")
    public void iClickLogoutButton() {
        lp.ClickBtnLogout();
    }

    @Then("I will get the result logout")
    public void iWillGetTheResultLogout() {

    }

    @And("I login")
    public void iLogin() {
        ls.iWillLogin();
    }
}
