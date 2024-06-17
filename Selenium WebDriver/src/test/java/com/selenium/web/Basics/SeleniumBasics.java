package com.selenium.web.Basics;


import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {

        /**
         * To Handle different browsers we have different classes
         *  Chrome Driver - webdriver.chrome.driver
         *  Firefox Driver - webdriver.gecko.driver
         *  Safari Driver
         * */


        // Below steps are only required if using 4.5.0 or below

        //Option 1 - Manually maintain drivers
        //System.setProperty ("webdriver.chrome.driver", "/Users/mukeshotwani/Downloads/chromedriver107");

        //Option 2- Use WDM - WebDriverManager
        // Checks browser version, check do we have driver, download ,cache,build path

        ChromeDriver driver = new ChromeDriver();

        // open google.com
        driver.get("https://www.google.com"); // open URL
        System.out.println("Title of the page: " + driver.getTitle()); // get title of web page
        System.out.println("Current URL: " + driver.getCurrentUrl());  // get Current URL

        // get the page source
        String src = driver.getPageSource();
        System.out.println("Page Source: " + src);

        // opening multiple web pages

        // open facebook.com
        driver.get("https://x.com");
        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());


        // open youtube.com
        driver.get("https://www.youtube.com");
        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // close the browser -> all associated windows will be closed
        driver.quit();

        // close the current or active window
        // driver.close();

    }
}

/** Default behaviour of selenium that until page is not loaded successfully it will wait
 *
 * Sometimes even your application loaded but you title takes extra second to appear but at the moment you page loaded
 * selenium moves to next statement that's why it appears blank.
 * But In selenium there is some methods, we can put condition -> please wait until title = "title_name"
 *
 *
 * Chrome - ChromeDriver- Google - 107,107
 * Firefox- GeckoDriver - Mozila - 106,106 107,107
 * Chrome - webdriver.chrome.driver
 * Firefox -webdriver.gecko.driver
 *
 *
 */




