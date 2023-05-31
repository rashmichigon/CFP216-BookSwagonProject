package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class BookDropdown extends BaseClass {

    @BeforeTest
    public void init()
    {
        setUp();
    }

    @Test
    public void selectFromDropdownList() throws InterruptedException {
        WebElement bookDropdown = driver.findElement(By.xpath("//a[@class='desktopdropdowninit dropdown-toggle']"));
        bookDropdown.click();

        List<WebElement> listOptions = driver.findElements(By.xpath("//a[@href='https://www.bookswagon.com/science-mathematics-books']"));
        int totalCount = listOptions.size();
        System.out.println("Total Options : "+totalCount);

        for(WebElement element : listOptions) {
            String elementText = element.getText();
            System.out.println("element Text : " + elementText);
            if (elementText.contains("Science & Mathematics")) {
                element.click();
                break;
            }
        }
    }

    @Test
    public void selectParticularBook()
    {
        WebElement physicsBook = driver.findElement(By.xpath("//a[@href='https://www.bookswagon.com/book/concepts-phyics-hc-h-c/9788177091878']"));
        physicsBook.click();
        WebElement buyNow = driver.findElement(By.xpath("//input[@value='Buy Now']"));
        buyNow.click();
    }

    @Test
    public void placeOrder()
    {
        WebElement element = driver.findElement(By.id("BookCart_lvCart_imgPayment"));
        element.click();
    }
    }

