package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestClass extends BaseClass {

    @BeforeTest
    public void init()
    {
        setUp();
    }

    @Test
    public void loginIntoApplication() throws IOException {
        WebElement myAccount = driver.findElement(By.id("ctl00_lblUser"));
        myAccount.click();
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));

        TakesScreenshot src =(TakesScreenshot) driver;
        File srcShot = src.getScreenshotAs(OutputType.FILE);
        File destShot = new File("C:\\Users\\Admin\\IdeaProjects\\BookSwagonProject\\Screenshots\\image1.png");
        FileHandler.copy(srcShot,destShot);

        WebElement emailID = driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']"));
        emailID.sendKeys("rashmichigoni@gmail.com");

        WebElement passWord = driver.findElement(By.id("ctl00_phBody_SignIn_txtPassword"));
        passWord.sendKeys("Rashmi@123");

        WebElement loginSubmit = driver.findElement(By.id("ctl00_phBody_SignIn_btnLogin"));
        loginSubmit.click();

        File sourceShot = loginSubmit.getScreenshotAs(OutputType.FILE);
        File destinationShot = new File("C:\\Users\\Admin\\IdeaProjects\\BookSwagonProject\\Screenshots\\image1.png");
        try {
            FileHandler.copy(srcShot,destShot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

