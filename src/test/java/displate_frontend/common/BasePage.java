package displate_frontend.common;

import displate_frontend.infrastructure_driver.Hooks;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected String url;
    public WebDriver driver;
    public Wait wait;

    public BasePage(String url) {
        this.url = url;
        this.driver = Hooks.getDriver();
        this.wait = new Wait(Hooks.getDriver());
        System.out.println("teraz basepage");
    }

    public String getUrl() {
        return url;
    }
}
