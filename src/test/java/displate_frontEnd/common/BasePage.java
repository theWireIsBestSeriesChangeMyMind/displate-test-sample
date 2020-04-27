package displate_frontEnd.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected String url;
    protected WebDriver driver;
    protected Wait wait;

    public BasePage(WebDriver driver, String url) {
        this.url = url;
        this.driver = driver;
        this.wait = new Wait();
    }
}
