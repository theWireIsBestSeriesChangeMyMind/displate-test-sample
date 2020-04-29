package displate_frontend.steps;

import displate_frontend.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class DisplateTestSteps {
    private HomePage homePage = new HomePage();

    @Given("Homepage is open")
    public void homepageIsOpen() {
        System.out.println(homePage.driver);
        homePage.driver.get(homePage.getUrl());
        homePage.wait.forElementToBeDisplayed(homePage.container, "Main page container");
        homePage.wait.delay(5000);
    }

    @And("User search {string}")
    public void userSearch(String searchedText) {
        homePage.searchbar.sendKeys(searchedText);
        homePage.searchbar.sendKeys(Keys.ENTER);
        homePage.wait.delay(5000);
    }

    @And("User filter by category {string}")
    public void userFilterByCategory(String arg0) {
        homePage.wait.forElementToBeDisplayed(homePage.searchResultsContainer, "Search results container");
        homePage.wait.elementToBeClickable(homePage.mapsCategoryButton, "Map category filter button");
        homePage.mapsCategoryButton.click();
        homePage.wait.forLoading(10);
        homePage.wait.delay(3000);
    }

    @And("First result is clicked result section")
    public void firstResultIsClickedResultSection() {
        homePage.searchResults.get(0).click();
        homePage.wait.forLoading(10);
        homePage.wait.delay(3000);
    }

    @And("Product page is loaded")
    public void productPageIsLoaded() {
        homePage.wait.forElementToBeDisplayed(homePage.productContainer, "Product container");
        homePage.wait.delay(5000);
    }

    @And("\'Select finish & add frame\' button is clicked")
    public void selectFinishAddFrameButtonIsClicked() {
        homePage.wait.forElementToBeDisplayed(homePage.selectFinishAndAddFrameButton, "Select finish button");
        homePage.selectFinishAndAddFrameButton.click();
        homePage.wait.delay(3000);
    }

    @And("\'Gloss\' finished is picked")
    public void finishedIsPicked() {
        homePage.wait.elementToBeClickable(homePage.glossyFinishRadioButton, "radio button glossy");
        homePage.glossyFinishRadioButton.click();
        homePage.wait.delay(5000);
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

    @Then("Promo code is available at the top")
    public void promoCodeIsAvailableAtTheTop() {

    }
}
