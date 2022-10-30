package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserRule extends ExternalResource {
    WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void before() throws Throwable {
        WebDriverManager.chromedriver().setup();
      /*String browser = System.getenv("browser");
        if ("ff".equals(browser)) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }
*/
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Override
    protected void after() {
        driver.quit();
    }
}