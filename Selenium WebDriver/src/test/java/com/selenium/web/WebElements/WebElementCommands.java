package com.selenium.web.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

    /**
     *  Selenium has direct locators & Indirect locators
     *
     *      Direct Locator
     *          - id, name, className, linkText, partialLinkText, tagName
     *
     *      Indirect Locator
     *          - XPATH, CSSSelector
     *
     *      Selenium 4 Onwards we have another selector -> Relative Selector
     *
     *  WebElement - Interface - which represents element on page
     *
     *  findElement vs findElements
     *      -> findElement - find element and throws exception when element not found
     *      -> findElements - find element and return List of WebElements when element not found ->  size 0
     * */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");

        /*
            WebElement userName = driver.findElement(By.id("email")); // NoSuchElementException - If element not found
            userName.sendKeys("ineuron@ineuron.ai");  // IllegalArgumentException - If keys to send is null
            Thread.sleep(5000);
            userName.clear();
         */

        /*
             Exception with findElement and No Exception with findElements
             driver.findElements(By.id("email"));
             driver.findElements(By.id("email")).get(0).sendKeys("abc"); // IndexOutOfBoundException
        */

        driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
        driver.findElement(By.id("password1")).sendKeys("ineuron");
        driver.findElement(By.className("submit-btn")).click();


        /* driver.findElement(By.className("submit-btn")).sendKeys("ad"); // here we are trying to sendKeys for submit button , we didn't get any exception
        this may not be always true */



    }
}
