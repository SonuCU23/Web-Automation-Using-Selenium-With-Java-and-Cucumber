package com.selenium.web.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCSS {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");

        WebElement username=driver.findElement(By.id("emaill"));

        System.out.println("Display Status "+username.isDisplayed ());

        System.out.println("Enable Status "+username. isEnabled ());

        System.out.println("PlaceHolder Values "+username.getAttribute("placeholder"));

        System.out.println("CSS Value "+username.getCssValue("font-size"));

        username. sendKeys ("ineuron@ineuron.ai");
        System.out.println("Value fetched from username "+username.getAttribute("value")) ;
    }
}
