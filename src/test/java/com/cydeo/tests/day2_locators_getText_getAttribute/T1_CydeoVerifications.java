package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

       // TC #1: Cydeo practice tool verifications
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
      //  3. Verify URL contains
       if( driver.getCurrentUrl().contains("cydeo")){
           System.out.println("URL verification Passed");
       }else{
           System.out.println("URL verification FAILED");
       }
      //  Expected: cydeo
      //  4. Verify title:
      //  Expected: Practice
     String   expected= "Practice";
      String actual=  driver.getTitle();

if(actual.equals(expected)){
    System.out.println("Title verification Passed");
}else {
    System.out.println("Title verification FAILED");
}

driver.close();


    }
}
