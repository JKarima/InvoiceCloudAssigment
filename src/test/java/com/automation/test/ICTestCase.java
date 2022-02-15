package com.automation.test;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


//C# Selenium Assessment Instructions
//
//1. Create a public repo
//
//2. Using dotnet (any version), Selenium with local chrome driver, write a scenario that:
//              a. Navigates to The Internet (the-internet.herokuapp.com)
//              b. Adds n number of elements
//              c. Asserts that n number of elements exist on the page
public class ICTestCase {
    public static void main(String[] args) throws Exception {

        verifyCheckBtn(6);
    }

    public static void verifyCheckBtn(int n)throws Exception{
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);

        WebElement add = driver.findElement(By.xpath("//button[text()='Add Element']"));
        Thread.sleep(3000);

        int nBefore = n;
        System.out.println(n);
        while( n > 0 ){
            add.click();
            n--;
        }
        System.out.println(n);

        List<WebElement> listDeletBtn = driver.findElements(By.xpath("//button[text() ='Delete']"));
        int expected = listDeletBtn.size();

        Thread.sleep(3000);

        driver.quit();
        Assert.assertEquals(nBefore, expected);
    }

}
