package com.example.testTask.fw;

import com.example.testTask.fw.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver wd) {
        super(wd);
    }

    public String getItemNameFromListByOrder(int itemNumber) {
        return wd.findElement(By.xpath("//div[@class=\"_38V6fgYMij\"]//article["+itemNumber+"]//h3")).getText();
    }
}
