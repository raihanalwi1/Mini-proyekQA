package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.OrderPage;

public class OrderStep {
    @Steps
    LoginStep ls;
    @Steps
    OrderPage op;
    @And("I click order button")
    public void iClickOrderButton() {
        op.ClickBtnOrder();
    }

    @When("I click button add")
    public void iClickButtonAdd() {
        op.ClickBtnPlus();
    }

    @And("I click button delete")
    public void iClickButtonDelete() {
        op.ClickBtnMin();
    }

    @And("I click button checkout order")
    public void iClickButtonCheckoutOrder() {
        //harus login  dulu biar bisa checkout

        op.ClickBayarProduct();
        ls.iWillLogin();
    }

    @Then("I will get the result")
    public void iWillGetTheResult() {
        op.HeaderTransaction();
    }

    @And("Text qty has change")
    public void textQtyHasChange() {
        op.Qty();
    }
}
