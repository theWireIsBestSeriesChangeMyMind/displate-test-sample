package displate_frontEnd.steps;

import displate_frontEnd.infrastructure_driver.Hooks;
import displate_frontEnd.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplateTestSteps extends Hooks {
    private HomePage homePage = new HomePage(getDriver());

    @Given("Homepage is open")
    public void homepageIsOpen() {
        homePage.getDriver().get(homePage.getUrl());
        homePage.getWait().delay(5);
    }

    @And("First element is clicked in {string} section on home page")
    public void firstElementIsClickedInSectionOnHomePage(String arg0) {
    }

    @And("Product page is loaded")
    public void productPageIsLoaded() {
    }

    @And("{string} button is clicked")
    public void selectFinishAddFrameButtonIsClicked() {
    }

    @And("{string} finished is picked")
    public void finishedIsPicked(String arg0) {
    }

    @And("Product is added to cart")
    public void productIsAddedToCart() {
    }

    @And("Cart on navbar is clicked")
    public void cartOnNavbarIsClicked() {
    }

    @When("Discount code {string} is applied")
    public void discountCodeIsApplied(String arg0) {
    }

    @Then("Price is reduced by {int} percent")
    public void priceIsReducedByPercent(int arg0) {
    }
}
