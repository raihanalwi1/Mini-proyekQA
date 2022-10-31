package runner.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import runner.product.category.Get;

public class GetCategoryProductStep {
    @Steps
    Get g;
    @Given("I set url get category")
    public void iSetUrlGetCategory() {
        g.setUrlGetCategory();
    }

    @When("I want to get body all category")
    public void iWantToGetBodyAllCategory() {
        g.requestGetAll();
    }

    @Then("I will get code all category")
    public void iWillGetCodeAllCategory() {
        g.verifStatusCode200();
    }

    @When("I want to get body by id category {string}")
    public void iWantToGetBodyByIdCategory(String gid) {
        g.requestGetById(gid);
    }

    @Then("I will get code by id {string}")
    public void iWillGetCodeById(String arg0) {

        if (arg0.equals("200")){
            g.verifStatusCode200();
        }else if (arg0.equals("404")){
            g.verifStatusCode404();
        }else if (arg0.equals("400")){
            g.verifStatusCode400();
        }
    }


}
