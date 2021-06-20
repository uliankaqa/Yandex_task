package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class BaseHelper {
    public WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }

    public boolean isElementPresent(By by) {
        return wd.findElements(by).size() > 0;
    }
    public boolean isElementPresent1(By locator) {
        try {
            wd.findElements(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void pause() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    
}
