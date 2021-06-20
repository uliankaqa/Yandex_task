package com.example.testTask.tests;

import com.example.testTask.models.Item;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase {

    @Test
    public void itemTest() {
        app.navigate().goToMarket();
        app.navigate().switchToNextStep();
        app.navigate().selectElectroniceDepartment();
        app.navigate().goToMenuItem("smartfony/16814639/list?glfilter=4940921%3A13475069&hid=91491");


        app.search().searchParam(new Item().withPriceFrom("20000").withPriceTo("35000").withItemType(By.xpath("//span[text()='Apple']")));

        String item2Name = app.item().getItemNameFromListByOrder(2);

       logger.info("Second Item : " + item2Name);

        app.search().goToSearch(item2Name);

        String foundItemName = app.item().getItemNameFromListByOrder(1);

        logger.info("Found Item: " + foundItemName);
        Assert.assertEquals(foundItemName, item2Name);
    }

}
