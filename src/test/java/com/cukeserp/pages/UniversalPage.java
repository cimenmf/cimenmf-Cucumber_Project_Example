package com.cukeserp.pages;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniversalPage {
    public UniversalPage() {
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement create_button;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement save_button;

    @FindBy (xpath = "//button[@accesskey='a']")
    public WebElement edit_button;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement access_button;


    public WebElement getConfirmation_line(String name){
        BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.linkText(name)),10);
        return Driver.getDriver().findElement(By.linkText(name));
    }
}
