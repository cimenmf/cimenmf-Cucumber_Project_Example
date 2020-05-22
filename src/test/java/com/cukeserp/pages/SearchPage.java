package com.cukeserp.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.cukeserp.utilities.Driver;
import org.testng.Assert;

import java.util.*;

public class SearchPage {

    public SearchPage ( ) {
        PageFactory.initElements ( Driver.getDriver ( ) , this );
    }


    @FindBy ( xpath = "//span[@class='o_searchview_more fa fa-search-plus']" )
    public WebElement MgniffierIcone;

    @FindBy ( xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[2]" )
    public WebElement CalanderModule;

    @FindBy(css = "div.o_searchview>span")
    public WebElement magnifierIcon;

    @FindBy ( xpath = "(//div[@class='btn-group o_dropdown'])[1]" )
    public WebElement FilterButton;

    @FindBy ( xpath = "(//span[@class='fa fa-star'])[1]" )
    public WebElement FilterDropDown;

    @FindBy ( xpath = "//li[@class='o_add_filter o_closed_menu']" )
    public WebElement AddCustomFilter;

    @FindBy ( xpath = "//input[@class='o_searchview_input']" )
    public WebElement SearchBox;

    @FindBy(css = "div.o_facet_values>span")
    public WebElement searchTermTag;

    @FindBy ( xpath = "//select[@class='o_input o_searchview_extended_prop_field']" )
    public WebElement SelectFromActionNeededButton;

    public void Select_List ( int index ) {
        Select list = new Select ( SelectFromActionNeededButton );
        list.selectByIndex ( index );

    }
    @FindBy(xpath = "//li[@class='o_save_search o_open_menu']")
    public WebElement FavoriteSaveCurrentSearchButton;

    @FindBy(xpath = "//li[@class='o_save_search o_closed_menu']")
    public WebElement FavoriteSaveCurrentSearchButton1;

    @FindBy ( xpath = "//button[@class='btn btn-primary btn-sm o_apply_filter']")
    public WebElement ApplyButton;

    @FindBy ( xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement ClickOnGroupByDropDown;

    @FindBy ( xpath = "//li[@class='o_add_custom_group o_closed_menu']" )
    public WebElement AddCustomDropDownGroup;

    @FindBy ( xpath = "//select[@class='o_input o_add_group o_group_selector']" )
    public WebElement DroupDownListUnderGroupBy;

    public void  list(String index){
        Select select=new Select(DroupDownListUnderGroupBy);
        select.selectByVisibleText(index);
    }

    @FindBy ( xpath = "//button[@class='btn btn-primary btn-sm o_add_group o_select_group']" )
    public WebElement applyButtonInGroup;

    @FindBy ( xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]" )
    public WebElement ClickOnFavoritesDropDown;

    @FindBy ( xpath = "//li[@class='o_save_search o_closed_menu']" )
    public WebElement clickOnSaveCurrentSearch;

    @FindBy ( xpath = "//li[@class='o_save_name']/input")
    public WebElement SendTextOnSaveCurrentSearchBox;

    @FindBy ( xpath = "//button[@class='btn btn-primary btn-sm']" )
    public WebElement SaveButtonOnFavorites;

    @FindBy ( xpath = "//li[@class='o_add_to_dashboard_link o_closed_menu']" )
    public WebElement ClickToDashBoradIcone;

    @FindBy ( xpath = "//input[@class='o_add_to_dashboard_input']")
    public WebElement sendTextToSaveToDashBorad;

    @FindBy ( xpath = "//button[@class='btn btn-primary btn-sm o_add_to_dashboard_button']" )
    public WebElement AddButtonUnderADDToMyDash;

    @FindBy ( xpath = "(//div[@class='o_cp_right']/div/div/button)[1]")
    public WebElement filters_button;

    @FindBy ( xpath = "//li[@title='My Events']/a" )
    public WebElement MyEvents_filter;

    @FindBy ( css = "div.o_searchview_facet" )
    public WebElement MyEvents_SearchBarIcon;

    @FindBy ( css = "div.o_searchview_facet>div>span" )
    public WebElement MyEvents_Label_SearchBarIcon;

    @FindBy ( xpath = "//li[@title='My Meetings']/a" )
    public WebElement MyMeetings_filter;

    @FindBy ( css = "div.o_facet_values" )
    public WebElement MyMeetings_SearchBarIcon;

    @FindBy ( css = "div.o_facet_values>span" )
    public WebElement MyMeetings_Label_SearchBarIcon;

    @FindBy ( xpath = "//li[@data-index='2']/a" )
    public WebElement UnreadMessages_filter;

    @FindBy ( css = "div.o_facet_values>span" )
    public WebElement UnreadMessages_Label_SearchBarIcon;

    @FindBy ( css = "div.o_facet_values" )
    public WebElement UnreadMessages_SearchBarIcon;

    @FindBy ( css = "li.o_add_filter.o_closed_menu>a" )
    public WebElement RevealCustomFilter_button;

    @FindBy ( css = "select.o_input.o_searchview_extended_prop_field" )
    public WebElement CustomFilter_SelectElement;

    @FindBy ( css = "select.o_input.o_searchview_extended_prop_op" )
    public WebElement CustomFilterBoolean_SelectElement;

    public void select_filterFormActions(int index){
        Select select = new Select ( CustomFilter_SelectElement );
       select.selectByIndex(index);

    }

    /**
     * This is just the frame of a select method. Keep in mind that which ever you choose will effect the boolean dropdown
     * Also note that when you add an additional custom filter, it duplicates an li node above
     * the filter menu buttons -- these are not dynamic enough selector paths to withstand that.
     * You must refactor selectors for both dropdowns before adding custom filters
     **/
    public void CustomFilter_DropDownMenu ( ) {
        Select select = new Select ( CustomFilter_SelectElement );
    }

    /**
     * Remember that the choice of the above custom filter will determine the boolean Options
     * Needs be tailored to suit
     **/
    public void CustomFilterDynamicBoolean_DropDown ( ) {
        Select select = new Select ( CustomFilterBoolean_SelectElement );
    }

    @FindBy ( css = "button.btn.btn-primary.btn-sm.o_apply_filter")
    public WebElement ApplyCustomFilter_Button;

    @FindBy ( css = "button.btn.btn-default.btn-sm.o_add_condition" )
    public WebElement AdditionalCustomFeature_button;

    @FindBy ( xpath = "(//div[@class='o_cp_right']/div/div/button)[2]" )
    public WebElement GroupBy_button;

    @FindBy(css = "div.btn-group.o_dropdown:last-of-type>button")
    public WebElement Favorites_button;

    @FindBy ( xpath = "//ul[@class='dropdown-menu o_group_by_menu']/li[1]/a" )
    public WebElement groupResponsible_button;

    @FindBy ( css = "div.o_facet_values" )
    public WebElement Responsible_SearchBarIcon;

    @FindBy ( css = "div.o_facet_values>span" )
    public WebElement Responsible_Label_SearchBarIcon;

    @FindBy ( xpath = "//ul[@class='dropdown-menu o_group_by_menu']/li[2]/a" )
    public WebElement groupAvailability_button;

    @FindBy ( css = "div.o_facet_values" )
    public WebElement Availability_SearchBarIcon;

    @FindBy ( css = "div.o_facet_values>span" )
    public WebElement Availability_Label_SearchBarIcon;

    @FindBy ( xpath = "//ul[@class='dropdown-menu o_group_by_menu']/li[3]/a" )
    public WebElement groupPrivacy_button;

    @FindBy ( xpath = "//ul[@class='dropdown-menu o_group_by_menu']/li/a" )
    public List<WebElement> groupBy_addedItems;


       public boolean groupCount() {
          List<WebElement>addedItems=new ArrayList<>();
        addedItems.addAll(groupBy_addedItems);
        Set<WebElement>test = new HashSet<>();
        test.addAll(addedItems);

        return test.size()==addedItems.size();
       }




    @FindBy ( css = "div.o_facet_values" )
    public WebElement Privacy_SearchBarIcon;

    @FindBy ( css = "div.o_facet_values>span" )
    public WebElement Privacy_Label_SearchBarIcon;

    @FindBy ( css = "li.o_add_custom_group.o_closed_menu" )
    public WebElement AdditionalCustomGroup_button;

    @FindBy ( css = "select.o_input.o_add_group.o_group_selector" )
    public WebElement CustomGroupSelectElement;

    @FindBy ( css = "li.o-searchview-custom-private.selected" )
    public WebElement CustomSavedSearch_button;

    @FindBy ( css = "li.o_save_name>button" )
    public WebElement CustomSavedSearch_SavedButton;

    public String CustomSearchName ( ) {
        Faker faker = new Faker ( );
        return faker.artist ( ).name ( );
    }


    /**
     * Just the bones, add meat and season as required
     * note : Static list.
     **/
    public void CustomGroup_DropDown (String custom_group ) {
        Select select = new Select ( CustomGroupSelectElement );
        select.selectByVisibleText ( custom_group );
        Assert.assertEquals ( select.getFirstSelectedOption ().getText ().trim (), custom_group);
    }

    public List<String> getCustomGroups(){
        Select select = new Select ( CustomGroupSelectElement );
       List<WebElement> temp = select.getOptions();
       List<String > returns = new ArrayList<>();
       for(WebElement x: temp){

           returns.add(x.getAttribute("innerText").trim());
       }
       return returns;
    }

    @FindBy(xpath = "(//ul[@class='dropdown-menu o_favorites_menu']//a)[last()]")
    public WebElement getTextConfirmationOnFavoriteButton;

}
