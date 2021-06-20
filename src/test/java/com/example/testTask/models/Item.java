package com.example.testTask.models;

import org.openqa.selenium.By;

public class Item {
    private  String priceFrom;
    private  String priceTo;
    private  By itemType;

    public Item withPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
        return this;
    }

    public Item withPriceTo(String priceTo) {
        this.priceTo = priceTo;
        return this;
    }

    public Item withItemType(By itemType) {
        this.itemType = itemType;
        return this;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public By getItemType() {
        return itemType;
    }
}
