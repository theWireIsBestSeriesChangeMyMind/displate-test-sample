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

    @FindBy(xpath = "//div[@id = 'animatedContainer']//span[text() = 'Gloss']/..")
    public WebElement glossyFinishRadioButton;

    public HomePage() {
        super("https://displate.com/");
        PageFactory.initElements(driver, this);
    }
}
