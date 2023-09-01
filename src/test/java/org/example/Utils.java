package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils {
    public static void waitForElementToLoad(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);


    }
}