package displate_frontend.infrastructure_driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        String headless = System.getProperty("headless");
        if (headless != null && headless.equals("true")) {
            options.addArguments("--headless");
        }
        options.addArguments("start-maximized", "--disable-popup-blocking");
        driver = new ChromeDriver(options);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

//    public static WebDriver getDriver() {
//        return driver;
//    }
}
