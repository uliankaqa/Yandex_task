package com.example.testTask.fw;

import com.example.testTask.fw.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class NavigationHelper extends BaseHelper {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToMenuItem(String link) {
        click(By.cssSelector("[href='/catalog--"+link+"']"));
    }

    public void selectElectroniceDepartment() {
        click(By.xpath("//span[contains(., 'Электроника')]"));
    }

    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void switchToNextStep() {
        List<String> avialableTabs = new ArrayList<>(wd.getWindowHandles());
        if (!avialableTabs.isEmpty()) {
            wd.switchTo().window(avialableTabs.get(1));
        }
    }
}
