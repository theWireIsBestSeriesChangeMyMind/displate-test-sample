package displate_frontEnd.common;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected String url;
    protected WebDriver driver;
    protected Wait wait;

    public BasePage(WebDriver driver, String url) {
        this.url = url;
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public String getUrl() {
        return url;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Wait getWait() {
        return wait;
    }
}
