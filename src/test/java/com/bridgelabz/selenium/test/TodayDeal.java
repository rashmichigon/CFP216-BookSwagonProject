package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TodayDeal extends BaseClass {

    @BeforeTest
    public void init()
    {
        setUp();
    }

    @Test
    public void clickOnTodayDealLink()
    {
        WebElement todayDealLink = driver.findElement(By.xpath("//a[@href='https://www.bookswagon.com/dealoftheday/TodaysDeal/B88F238E7C9E']"));
        todayDealLink.click();
    }

    @Test
    public void clickOnParticularBook() throws InterruptedException
    {
        WebElement bookClicking = driver.findElement(By.xpath("//img[@class='card-img-top bklazy']"));
        bookClicking.click();
    }
}
