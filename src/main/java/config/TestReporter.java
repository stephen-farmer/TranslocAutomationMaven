package config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.MediaEntityBuilder;

import java.io.IOException;

public class TestReporter {
    ExtentHtmlReporter reporter;
    ExtentReports extent = new ExtentReports();
    ExtentTest logger;

    public void logTest(String testName, String fileName) {
        reporter = new ExtentHtmlReporter("./Reports/" + fileName + ".html");
        reporter.start();
        extent.attachReporter(reporter);
        logger = extent.createTest(testName);

        logger.log(Status.INFO, testName);
        extent.flush();
    }
}
