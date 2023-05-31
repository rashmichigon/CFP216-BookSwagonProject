package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RequestBook extends BaseClass {

    @BeforeTest
    public void init()
    {
        setUp();
    }

    @Test
    public void requestABook()
    {
        WebElement element = driver.findElement(By.xpath("//a[@href='https://www.bookswagon.com/requestbook']"));
        element.click();
    }

    @Test
    public void enterBookDetails()
    {

       try
       {
           WebElement isbnEnter = driver.findElement(By.xpath("//input[@id='ctl00_phBody_RequestBook_txtISBN']"));
           isbnEnter.sendKeys("978-0-141-02919-1");
       }
       catch(NoSuchElementException e)
       {
           System.out.println("Handled No Such Element ");
       }

//        WebElement bookTitle = driver.findElement(By.id("ctl00_phBody_RequestBook_txtTitle"));
//        WebElement bookAuthor = driver.findElement(By.id("ctl00_phBody_RequestBook_txtAuthor"));
//        WebElement emailID = driver.findElement(By.id("ctl00_phBody_RequestBook_txtEmailReq"));
//        WebElement phoneNo = driver.findElement(By.id("ctl00_phBody_RequestBook_txtPhone"));
//        WebElement submitButton = driver.findElement(By.id("ctl00_phBody_RequestBook_imgbtnSave"));
//
//
//        bookTitle.sendKeys("Quiet");
//        bookAuthor.sendKeys("Susan Cain");
//        emailID.sendKeys("rashmichigoni@gmail.com");
//        phoneNo.sendKeys("9980629862");
//        submitButton.click();
    }
}
