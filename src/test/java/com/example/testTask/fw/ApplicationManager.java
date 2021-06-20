package com.example.testTask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private WebDriver wd;
    private NavigationHelper navigate;
    private ItemHelper item;
    private SearchHelper search;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public NavigationHelper navigate() {
        return navigate;
    }

    public ItemHelper item() {
        return item;
    }

    public SearchHelper search() {
        return search;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("http://yandex.ru/");
        navigate = new NavigationHelper(wd);
        item = new ItemHelper(wd);
        search = new SearchHelper(wd);
    }

    public void stop() {
        wd.quit();
    }
}
