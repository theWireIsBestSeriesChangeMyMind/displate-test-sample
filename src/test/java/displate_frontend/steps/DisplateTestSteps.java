package displate_frontend.steps;

import displate_frontend.pom.CartPage;
import displate_frontend.pom.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DisplateTestSteps {
    private HomePage homePage = new HomePage();
    private CartPage cartPage = new CartPage();

    @Given("Homepage is open")
    public void homepageIsOpen() {
        System.out.println(homePage.driver);
        homePage.driver.get(homePage.getUrl());
        homePage.wait.forElementToBeDisplayed(homePage.container, "Main page container");
        homePage.wait.delay(6000);
    }

    @And("User search {string}")
    public void userSearch(String searchedText) {
        homePage.searchbar.sendKeys(searchedText);
        homePage.searchbar.sendKeys(Keys.ENTER);
        homePage.wait.delay(5000);
    }

    @And("User filter by category \'Maps\'")
    public void userFilterByCategory() {
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
        homePage.wait.delay(3000);
    }

    @And("\'Select finish & add frame\' button is clicked")
    public void selectFinishAddFrameButtonIsClicked() {
        homePage.wait.forElementToBeDisplayed(homePage.selectFinishAndAddFrameButton, "Select finish button");
        homePage.selectFinishAndAddFrameButton.click();
        homePage.wait.delay(3000);
    }

    @And("\'Gloss\' finished is picked")
    public void finishedIsPicked() {
        homePage.glossyFinishRadioButton.click();
        homePage.wait.delay(3000);
    }

    @And("Product is added to cart")
    public void productIsAddedToCart() {
        homePage.addToCartButton.click();
        homePage.wait.delay(1000);
    }

    @And("Cart on navbar is clicked")
    public void cartOnNavbarIsClicked() {
        homePage.cartNavbarButton.click();
        homePage.wait.delay(5000);
    }

    @And("Cart page is loaded")
    public void cartPageIsLoaded() {
        cartPage.wait.forElementToBeDisplayed(cartPage.cartContainer, "Cart container");
        cartPage.wait.delay(3000);
    }

    @And("\'I have a discount code\' button is clicked")
    public void iHaveADiscountCodeButtonIsClicked() {
        cartPage.wait.elementToBeClickable(cartPage.discountButton, "I have a discount button");
        cartPage.discountButton.click();
        cartPage.wait.delay(1000);
    }

    @When("Discount code from navbar is applied")
    public void discountCodeFromNavbarIsApplied() {
        String[] promoArray = homePage.topBarPromoCode.getText().split("\\|");
        String promoText = promoArray[1].replace("Use code:", "").trim();
        cartPage.discountInput.sendKeys(promoText);
        cartPage.applyDiscountButton.click();
        cartPage.wait.delay(4000);
    }

    @And("{string} is picked in \'Ship to\' select")
    public void isPickedInShipToSelect(String countryName) {
        cartPage.countrySelect.click();
        cartPage.wait.delay(500);
        WebElement country = cartPage.driver.findElement(By.xpath("//div[@class='simplebar-scroll-content']//div[text() = '" + countryName + "']"));
        cartPage.scrollWithJavaScript(country);
        country.click();
        cartPage.wait.delay(3000);
        cartPage.cartContainer.click(); //click is to get rid of pop-up after picking United States
    }

    @Then("Price is lower then {double} USD")
    public void priceIsLowerThenUSD(double price) {
        cartPage.wait.delay(2000);
        double currentPrice = Double.parseDouble(cartPage.orderTotal.getText().replace(" USD", "").trim());
        Assert.assertTrue(currentPrice < price);
    }

    @Then("Promo code is available at the top")
    public void promoCodeIsAvailableAtTheTop() {
        String[] promoArray = homePage.topBarPromoCode.getText().split("\\|");
        String promoText = promoArray[1].replace("Use code:", "").trim();
        Assert.assertFalse(promoText.isEmpty());
    }
}
