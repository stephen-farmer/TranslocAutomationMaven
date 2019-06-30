package operations;

import config.ResourceLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserOperations implements OperationsListener {
    WebDriver driverWrapper;

    @Override
    public void init(WebDriver driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public int getNumberOfFeeds() {
        WebElement feeds = driverWrapper.findElement(By.xpath(ResourceLocator.FEED_CONTAINER));
        return feeds.findElements(By.className("jss5")).size();
    }

    public String getFeedName(String xpath) {
        return  driverWrapper.findElement(By.xpath(xpath)).getText();
    }
}
