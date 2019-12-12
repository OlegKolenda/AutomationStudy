package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AutomationStudy_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.get("http://the-internet.herokuapp.com/iframe");
        WebElement we = wd.findElement(By.xpath("//iframe"));
        wd.switchTo().frame(we);
        WebElement we2 = wd.findElement(By.xpath("//p"));
        we2.clear();
        wd.switchTo().defaultContent();

    }

}
