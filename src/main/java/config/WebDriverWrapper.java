package config;

import operations.AutomationOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class WebDriverWrapper implements WebDriver {
    protected WebDriver driver;

    private WebDriverWait driverWait;
    private static int timeout = 10;
    protected static AutomationOperations ops = AutomationOperations.instance(); //remove this static if possible

    // This passes in the driver to the automation instance. This is what initializes the driver
    @BeforeSuite
    public void initAutomationOperations() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver");
        }
        driver = new ChromeDriver();

        AutomationOperations automationOperations = AutomationOperations.instance();
        automationOperations.navOps.init(driver);
        automationOperations.userOps.init(driver);
    }

    @AfterClass
    public void teardown() {
        driver.close();
    }

    public boolean elementExists(By by) {
        return driver.findElement(by).isDisplayed();
    }

    // Implement the required methods from the WebDriver interface
    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }
}
