package displate_frontend.common;

import displate_frontend.infrastructure_driver.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
    protected String url;
    public WebDriver driver;
    public Wait wait;
    public Actions actions;

    public BasePage(String url) {
        this.url = url;
        this.driver = Hooks.driver;
        this.wait = new Wait(Hooks.driver);
        this.actions = new Actions(Hooks.driver);
    }

    public String getUrl() {
        return url;
    }

    public void scrollWithJavaScript(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
