package displate_frontEnd.pom;

import displate_frontEnd.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver, "https://displate.com/");
        PageFactory.initElements(driver, this);
    }
}
