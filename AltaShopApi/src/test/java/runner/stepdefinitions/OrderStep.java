package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.order.CreateOrder;

public class OrderStep {
    @Steps
    CreateOrder co;

    @Given("I set url order")
    public void iSetUrlOrder() {
        co.setUrlCreateOrder();
    }

    @When("I want to create product {int} with qty {int}")
    public void iWantToCreateProductWithQty(int id, int qty) {

        co.requestIdAndQty(id, qty);
    }

    @Then("I will get code status {string}")
    public void iWillGetCodeStatus(String code) {
        if(code.equals("200")){
            co.verifyStatusCode200();
        }else if(code.equals("400")) {
            co.verifyStatusCode400();
        }
    }

//    @When("I want to create product <id> with qty <qty>")
//    public void iWantToCreateProductIdWithQtyQty() {
//
    }


    
