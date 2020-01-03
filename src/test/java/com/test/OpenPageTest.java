package com.test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class OpenPageTest {

    private WebDriver driver;

    @Test
    @Tag("feature")
    public void opener() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("79.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        driver = new RemoteWebDriver(
                URI.create("http://ec2-18-217-133-244.us-east-2.compute.amazonaws.com:4444/wd/hub").toURL(),
                capabilities
        );
        //driver = new ChromeDriver();
        //

        openUrl("http://store.apple.com/");
        makeScreenshot(driver);
    }

    @Step("Page opening with url {0}")
    private void openUrl(String url) {
        driver.get(url);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
