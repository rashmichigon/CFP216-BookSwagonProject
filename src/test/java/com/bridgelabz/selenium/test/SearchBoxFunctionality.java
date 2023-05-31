package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBoxFunctionality extends BaseClass {

    @BeforeTest
    public void init()
    {
        setUp();
    }

    @Test
    public void searchBooks() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.id("inputbar"));
        searchBox.sendKeys("Story Books for Kids");

        WebElement searchButton = driver.findElement(By.id("btnTopSearch"));
        searchButton.click();

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);

        WebElement bookClick = driver.findElement(By.xpath("//*[contains(text(),'Diary of a Wimpy Kid: Rodrick Rules (Book 2)')]"));
        bookClick.click();

        WebElement buyNow = driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/a[1]/input[1]"));
        buyNow.click();

        Thread.sleep(2000);

        WebElement closeButton = driver.findElement(By.id("cboxClose"));
        closeButton.click();
    }
}
