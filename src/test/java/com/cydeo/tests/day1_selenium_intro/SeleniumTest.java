package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1-Setting up the web driver manager
        //2 we created out web Driver
        WebDriverManager.chromedriver().setup();

      //2-Create instance of the chrome driver
        // this line will open our browers
        WebDriver driver = new ChromeDriver() ;

   //3-Test if driver is working as expected
        //this is the command
        driver.get("https://www.google.com");
        

    }
}
