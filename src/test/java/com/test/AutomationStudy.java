package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AutomationStudy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().setSize(new Dimension(800,600));
        wd.get("http://automationprctice.com");
        System.out.println(wd.getTitle());
        System.out.println(wd.getCurrentUrl());
        wd.get("http://the-internet.herokuapp.com/windows");

        WebElement we = wd.findElement(By.xpath("//a[text()='Click Here']"));
        we.click();

        Set<String> set = wd.getWindowHandles();
        List<String> list = new ArrayList<String>(set);
        wd.switchTo().window(list.get(1));
        wd.close();
    }
}
