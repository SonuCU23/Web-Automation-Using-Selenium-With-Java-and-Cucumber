package com.selenium.web.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDisable {
    public static void main(String[] args) {
        /** This program will help you find exception which comes when you deal with disable element */
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
        driver2.findElement(By.name("lname")).sendKeys("sonu"); // throw exception
    }
}
