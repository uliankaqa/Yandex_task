package com.example.testTask.fw;

import com.example.testTask.fw.BaseHelper;
import com.example.testTask.models.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends BaseHelper {

    public SearchHelper(WebDriver wd) {
        super(wd);
    }

    public void searchParam(Item item) {
        //click(By.cssSelector("[data-id=\"button-all\"]"));
        type(By.cssSelector("#glpricefrom"), item.getPriceFrom());
        type(By.cssSelector("#glpriceto"), item.getPriceTo());

        click(item.getItemType());
        wd.navigate().refresh();
    }

    public void goToSearch(String item2Name) {
        type(By.cssSelector("#header-search"), item2Name);
        click(By.cssSelector("[type='submit']"));
    }
}
