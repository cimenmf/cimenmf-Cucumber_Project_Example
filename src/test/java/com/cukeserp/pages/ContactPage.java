package com.cukeserp.pages;
import com.cukeserp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement fullName;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement contactFullName;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement company;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//span[@name='street']")
    public WebElement contactStreet;

    @FindBy(xpath = "(//select[@class='o_input o_field_widget'])[1]")
    public WebElement addressType;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//span[@name='city']")
    public WebElement contactCity;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zip;

    @FindBy(xpath = "//span[@name='zip']")
    public WebElement contactZip;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement country;

    @FindBy(xpath = "//input[@name='function']")
    public WebElement jobPosition;

    @FindBy(xpath = "//span[@name='function']")
    public WebElement contactJobPosition;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//span[@name='phone']")
    public WebElement contactPhone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//a[@name='email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement website;

    @FindBy(xpath = "//a[@name='website']")
    public WebElement contactWebsite;


}
