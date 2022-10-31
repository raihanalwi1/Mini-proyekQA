package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.product.category.CategoryCreate;

public class CategoryProductStep {
    @Steps
    CategoryCreate cc;
    @Given("I set url get category create")
    public void iSetUrlGetCategoryCreate() {
        cc.setUrl();
    }

    @When("I want to name {string} and description {string}")
    public void iWantToNameAndDescription(String name, String desc) {
        cc.requestCategoryWithNameAndDesc(name, desc);
    }

    @Then("I will get code category {string}")
    public void iWillGetCodeCategory(String arg0) {
        if(arg0.equals("200")){
            cc.verifStatusCode200();
        }else if(arg0.equals("400")){
            cc.verifStatusCode400();
        }else if(arg0.equals("500")){
            cc.verifStatusCode500();
        }
    }
}
