package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CategoryPage;

public class CategoryStep {
    @Steps
    CategoryPage cp;
    @When("I click category button")
    public void iClickCategoryButton() {
        cp.ClickBtnCategory();
    }

    @And("I click item category button")
    public void iClickItemCategoryButton() {
        cp.ClickBtnItemCategory();
    }

    @Then("I will get the category")
    public void iWillGetTheCategory() {
        cp.HeaderCategory();
    }
}
