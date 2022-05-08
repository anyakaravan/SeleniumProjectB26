package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


        // Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
}
