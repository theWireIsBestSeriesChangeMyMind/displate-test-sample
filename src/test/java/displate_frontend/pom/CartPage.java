package displate_frontend.pom;

import displate_frontend.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(id = "cart-load-wrapper")
    public WebElement cartContainer;

    @FindBy(id = "select-country")
    public WebElement countrySelect;

    @FindBy(css = "div.discount")
    public WebElement discountButton;

    @FindBy(id = "discount-code")
    public WebElement discountInput;

    @FindBy(id = "discount-apply")
    public WebElement applyDiscountButton;

    @FindBy(id = "checkout-btn-ab1")
    public WebElement checkoutButton;

    @FindBy(id = "order-total")
    public WebElement orderTotal;

    public CartPage() {
        super("https://displate.com/cart");
        PageFactory.initElements(driver, this);
    }
}
