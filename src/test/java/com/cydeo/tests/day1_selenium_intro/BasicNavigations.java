package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2 create instance orf the Seleniumweb driver
        //this is the line oppening an empty browser
        WebDriver driver =new ChromeDriver();


         //3 go to tesla.com
        driver.get("https://www.tesla.com");

        //stiop code exec
        Thread.sleep(3000);


        //use selenium to navigate back
        driver.navigate().back();

    }
}
