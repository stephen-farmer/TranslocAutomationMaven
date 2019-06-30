package automationtests;

import config.ResourceLocator;
import config.WebDriverWrapper;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class QuickTest extends WebDriverWrapper {

    @Test
    public void quickTest() {
        ops.navOps.navigateToURL(ResourceLocator.STAGING_ENV);
        ops.navOps.login("qa_user_3", "n4km@XrhP4MA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
