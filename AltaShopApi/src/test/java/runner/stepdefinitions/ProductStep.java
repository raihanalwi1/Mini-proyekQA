package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.product.Product;
import runner.product.GetById;

public class ProductStep {
    @Steps
    Product p;
    @Steps
    GetById gbi;

    @Given("I set url get product")
    public void iSetUrlGetProduct() {
        p.setUrlGetProduct();
    }

    @When("I want to get product")
    public void iWantToViewProduct() {
        p.requestGetProduct();
    }

    @Then("I will get code get product")
    public void iWillGetCodeGetProduct() {
        p.verifedStatusCode200();
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

    @When("I want to delete product")
    public void iWantToDeleteProduct() {
        p.requestDeleteProduct();
    }
    @Then("I will get code")
    public void iWillGetCode() {
        p.verifedStatusCode200();
    }
    @When("I want to new product with name {string} desc {string} price {int} and categories {int}")
    public void iWantToNewProductWithNameDescPriceAndCategories(String name, String desc, int price, int cate) {
        p.requestCreate(name, desc, price, cate);
    }
    @Then("I will get code {string}")
    public void iWillGetCode(String arg0) {
        if (arg0.equals("200")){
            p.verifedStatusCode200();
        }else if (arg0.equals("400")){
            p.verifedStatusCode400();
        }else if (arg0.equals("500")){
            p.verifedStatusCode500();
        }
    }

}
