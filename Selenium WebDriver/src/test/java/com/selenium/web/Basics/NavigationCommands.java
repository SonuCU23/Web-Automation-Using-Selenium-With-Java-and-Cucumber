package com.selenium.web.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {

        // To execute navigation commands you should have navigation history
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.linkedin.com/");
        driver.get("https://www.youtube.com");
        Thread.sleep(5000);

        /***
         *  Navigation nav = driver.navigate();
         *  nav.back();
         * */

        driver.navigate().back(); // moves backward -> x
        Thread.sleep(5000);
        driver.navigate().back(); // moves backward -> google
        Thread.sleep(5000);
        driver.navigate().forward(); // moves forward -> x
        Thread.sleep(5000);
        driver.navigate().forward(); // moves forward -> YouTube
        Thread.sleep(5000);
        driver.navigate().refresh();

        /***
         *
         *  Difference b/w driver.navigate().to("https://www.google.com") & driver.get("https://www.google.com)
         *      -> driver.get() belongs to WebDriver
         *      -> driver.navigate().to() belongs to Navigation, it internally calls get(url) method
         */

    }
}
