package com.bridgelabz.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://www.bookswagon.com/index.aspx");
        driver.manage().window().maximize();
    }
}
