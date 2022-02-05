package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task1 {
    public static void main(String[] args) {
    //TC #1: Cydeo practice tool verifications
     //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
       // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        //3. Verify URL contains
        //Expected: cydeo
       boolean containsCydeo= driver.getCurrentUrl().contains("cydeo");
        System.out.println("containsCydeo = " + containsCydeo);
        //4. Verify title:
       // Expected: Practice
        String expectedTitle= "Practice";
         String actualTitle=driver.getTitle();

  if(expectedTitle.equals(actualTitle) && containsCydeo){
    System.out.println("Actual result meets the requirement");
  }else{
    System.out.println("Actual result doesn't meets the requirement");
   }

    }
}
