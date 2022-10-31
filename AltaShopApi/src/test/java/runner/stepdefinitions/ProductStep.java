package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.product.Product;
import runner.product.GetById;

public class ProductStep {
    @Steps
    Product gap;
    @Steps
    GetById gbi;
    @Given("I set url get product")
    public void iSetUrlGetProduct() {
        gap.setUrlGetProduct();
    }

    @When("I want to get product")
    public void iWantToViewProduct() {
        gap.requestGetProduct();
    }

    @Then("I will get code get product")
    public void iWillGetCodeGetProduct() {
        gap.verifedStatusCode200();
    }

    @Given("I set url get product by id")
    public void iSetUrlGetProductById() {
        gbi.setUrlGetByIdProduct();
    }

    @When("I want to get by id")
    public void iWantToGetById() {
        gbi.requestById();
    }

    @Then("I will get code get product by id")
    public void iWillGetCodeGetProductById() {
        gbi.verifStatusCode200();
    }
}
