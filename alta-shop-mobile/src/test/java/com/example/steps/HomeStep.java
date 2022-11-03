package com.example.steps;

import com.example.app.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStep {
    @Steps
    HomePage hp;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() throws InterruptedException {
        hp.DescHeaderDisplayed();
    }

    @When("I click button buy")
    public void iClickButtonBuy() {
        hp.ClickBtnAdd();
    }

    @Then("So product will to cart")
    public void soProductWillToCart() {
        hp.CartDisplayed();
    }
}
