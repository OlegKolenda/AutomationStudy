package com.test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AutomationStudy_2 {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @Test
    @DisplayName("Chrome start/finish")
    @Tag("Junior")
    public void test() {
        WebElement we = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(we);
        WebElement we2 = driver.findElement(By.xpath("//p"));
        we2.clear();
        driver.switchTo().defaultContent();
    }

    @AfterAll
    public static void cleanUp() {
        driver.quit();
    }
}