package com.selenium.web.Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowCommand {
    public static void main(String[] args) {

        /**
         *
         *  Manage -> Manage cookies, timeout, windows
         *  Window -> Manage window
         * */

        WebDriver driver = new ChromeDriver();

    /**    Options opt = driver.manage();
        Window win = opt.window();

        win.maximize();
        driver.get("https://www.linkedin.com/");
        win.minimize();

     */
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");
//        driver.manage().window().minimize();
        driver.manage().window().setSize(new Dimension(0, 0));
        driver.manage().window().fullscreen();

    }
}
