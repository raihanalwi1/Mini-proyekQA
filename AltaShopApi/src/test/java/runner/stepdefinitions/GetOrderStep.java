package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.order.Get;

public class GetOrderStep {
    @Steps
    Get ga;
    @Given("I set url get order")
    public void iSetUrlGetOrder() {
        ga.setUrlGetAllOrder();
    }

    @When("I want to get all order")
    public void iWantToGetAllOrder() {
        ga.requestGetAll();
    }

    @Then("I will get code order")
    public void iWillGetCodeOrder() {
        ga.verifyStatusCode200();
    }

    @Given("I set url get order by id {string}")
    public void iSetUrlGetOrderById(String id) {
        ga.setUrlGetById(id);
    }

    @When("I want to get by id order")
    public void iWantToGetByIdIdOrder() {
        ga.requestGetById();

    }
    @Then("I will get result {string}")
    public void iWillGetResult(String code) {
        if (code.equals("200")){
            ga.verifyStatusCode200();
        }else if(code.equals("404")){
            ga.verifyStatusCode404();
        }
    }
}
