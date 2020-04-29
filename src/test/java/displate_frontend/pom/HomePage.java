package displate_frontend.pom;

import displate_frontend.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "main")
    public WebElement container;

    @FindBy(css = "input.search__input")
    public WebElement searchbar;

    @FindBy(css = "span.black-friday-text-regular")
    public WebElement topBarPromoCode;

    @FindBy(id = "search-results")
    public WebElement searchResultsContainer;

    @FindBy(css = "div.displate-tile.displate-tile--search")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//div[@class = 'search-results__filter search-results__filter--category-search']//div[text() = 'Maps']/..")
    public WebElement mapsCategoryButton;

    @FindBy(css = "div.gallery-container")
    public WebElement productContainer;

    @FindBy(xpath = "//a[text() = 'Select finish & add frame']")
    public WebElement selectFinishAndAddFrameButton;

    @FindBy(xpath = "//span[text() = 'Gloss'][@class = 'input-radio__label']")
    public WebElement glossyFinishRadioButton;

    @FindBy(xpath = "//div[@class = 'hero-options product-page-description-container']//button/span")
    public WebElement addToCartButton;

    @FindBy(css = "a.aside-menu__item.aside-menu__item--cart")
    public WebElement cartNavbarButton;

    public HomePage() {
        super("https://displate.com/");
        PageFactory.initElements(driver, this);
    }
}
