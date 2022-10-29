package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;

public class HomeStep {
    @Steps
    HomePage hp;
    @Steps
    LoginStep ls;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        hp.openHome();
    }

    @When("I click button detail")
    public void iClickButtonDetail() {
        hp.BtnDetailProduct();
    }

    @Then("I will get the detail")
    public void iWillGetTheDetail() {
        hp.openDetail();
    }

    @When("I click button buy")
    public void iClickButtonBuy() {
        hp.BtnBuyProduct();
    }

    @Then("I will get the product to order")
    public void iWillGetTheProductToOrder() {
        hp.BadgeOrder();
    }

    @When("I am login")
    public void iAmLogin() {
        ls.iWillLogin();
    }

    @Then("I will get transaction page")
    public void iWillGetTransactionPage() {
        hp.openTransaction();

    }

    @Then("I am on the transaction page")
    public void iAmOnTheTransactionPage() {
        hp.openTransaction();
    }
}
