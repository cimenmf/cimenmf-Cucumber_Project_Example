package com.cukeserp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cukeserp.utilities.Driver;

import java.util.List;

public class InboxPage {

    public InboxPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }


    @FindBy (css = "div.o_control_panel>ol>li")
    public WebElement inboxBreadCrumb;

    @FindBy (xpath = "//li[@style='display: block;']/a/span")
    public List<WebElement> allHeaders;

    @FindBy (css = ".oe_topbar_name")
    public WebElement actualUsername;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[2]")
    public WebElement crmButton;


}
