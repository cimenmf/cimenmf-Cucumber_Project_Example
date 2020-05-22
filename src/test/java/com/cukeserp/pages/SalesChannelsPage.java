package com.cukeserp.pages;

import com.cukeserp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesChannelsPage {
    public SalesChannelsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[1]/a/span")
    public WebElement SalesChannelsButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement CreateButton;

    //   @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[2]")
    //  public WebElement Import;

    @FindBy(xpath = "//div//ol//li")
    public WebElement Pipeline;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement salesChannelText;

    @FindBy(xpath = "//*[@class='o_form_label oe_edit_only']")
    public WebElement SalesName;


    @FindBy(xpath  = "//input[@name='alias_name']")
    public WebElement Email ;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/table[1]/tbody/tr[3]/td[1]/label")
    public WebElement EmailAlias;

    @FindBy(css = "div.o_input_dropdown")
    public WebElement dropDowlLeader;

    @FindBy(css = "ul#ui-id-3>li:first-of-type>a")
    public WebElement ChannelLeader_backUp;

    @FindBy(xpath = "//ul[@id='ui-id-3']/li[1]")
    public WebElement Administrator ;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[2]")
    public WebElement ImportButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
    public WebElement ImportAFile;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement dropDownAdministrator;

    @FindBy(xpath = "//li[@class='ui-menu-item']")
    public WebElement admin;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])")
    public WebElement channelListOptions;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement channelListOptions_first;

    @FindBy(xpath = "//li[@class='ui-menu-item']")
    public List<WebElement> channelLeaders;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement AddButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/button[3]")
    public WebElement CancelButton;

    @FindBy(xpath = "//*[@placeholder='Salesteam name...']")
    public WebElement SalesTeamName;


    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[1]")
    public WebElement channelLeader_box;

    public void getChannelLeader(String channel){
        for (int i = 0; i <channelLeaders.size() ; i++) {
            if( channelLeaders.get(i).getText().equalsIgnoreCase(channel)){
                channelLeaders.get(i).click();
                break;
            }
        }

    }
}