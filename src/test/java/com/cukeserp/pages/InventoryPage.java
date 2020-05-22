package com.cukeserp.pages;

import com.cukeserp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    public InventoryPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked']/li)[5]")
    public WebElement products;

    @FindBy(xpath = "//input[@name='default_code']")
    public WebElement internalReference;

    @FindBy(xpath = "//span[@name='default_code']")
    public WebElement productInternalReference;

    @FindBy(xpath = "//div[@name='list_price']//input")
    public WebElement salesPrice;

    @FindBy(xpath = "//span[@name='list_price']")
    public WebElement productSalesPrice;

    @FindBy(xpath = "(//input[@class='o_input'])[2]")
    public WebElement cost;

    @FindBy(xpath = "//span[@name='standard_price']")
    public WebElement productCost;
}
