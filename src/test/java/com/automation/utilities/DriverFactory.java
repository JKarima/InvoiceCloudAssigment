package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createADriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    }
}
