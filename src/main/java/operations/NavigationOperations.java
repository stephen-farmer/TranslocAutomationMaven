package operations;

import config.ResourceLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationOperations implements OperationsListener {
    WebDriver driverWrapper;

    @Override
    public void init(WebDriver driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public void login(String username, String password) {
        driverWrapper.findElement(By.id(ResourceLocator.USERNAME_FIELD)).sendKeys(username);
        driverWrapper.findElement(By.id(ResourceLocator.PASSWORD_FIELD)).sendKeys(password);
        driverWrapper.findElement(By.id(ResourceLocator.PASSWORD_FIELD)).sendKeys(Keys.ENTER);
    }

    public void navigateToURL(String url) {
        driverWrapper.navigate().to(url);
    }

    public void confirmAndClosePopup() {
        driverWrapper.findElement(By.xpath(ResourceLocator.POPUP_CONFIRM)).click();
        driverWrapper.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driverWrapper.findElement(By.xpath(ResourceLocator.POPUP_CLOSE)).click();
    }
}
