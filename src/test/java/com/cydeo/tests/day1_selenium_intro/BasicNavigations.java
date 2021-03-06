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

//this line will maximaze the browse size
      driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
         //3 go to tesla.com
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        //get the current URL of the page
        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //stiop code exec
        Thread.sleep(3000);


        //use selenium to navigate back
        driver.navigate().back();

        //stiop code exec
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stiop code exec
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate.to
        driver.navigate().to("https://www.google.com");

        //get the current title of the page after getting the google page
        //System.out.println("driver.getTitle() = " + driver.getTitle()); or another way
   currentTitle = driver.getTitle();
        System.out.println(currentTitle);

        //get the current URL of the page
     currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //this will close the currently opened window
        driver.close();


        //this will close all of the opened windows
        driver.quit();
    }
}
