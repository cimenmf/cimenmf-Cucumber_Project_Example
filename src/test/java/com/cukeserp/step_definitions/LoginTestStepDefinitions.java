package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static com.cukeserp.utilities.ApplicationConstants.*;
import static com.cukeserp.utilities.BrowserUtils.*;

public class LoginTestStepDefinitions {
    Pages pages = new Pages ( );


    @Given ( "user is on the login page" )
    public void user_is_on_the_login_page ( ) {
        String url = ConfigurationReader.getProperties ( "url" );
        Driver.getDriver ( ).get ( url );
    }

    @When ( "user logs in as manager" )
    public void user_logs_in_as_manager ( ) {
        waitForClickablility ( pages.getLandingPage ( ).BriteErpDemo_button , 15 );
        pages.getLandingPage ( ).BriteErpDemo_button.click ( );
        pages.getLoginPage ( ).managerLogin ( );
    }

    @Then ( "breadcrumb is displayed" )
    public void breadcrumb_is_displayed ( ) {
        waitForVisibility ( pages.getInboxPage ( ).inboxBreadCrumb , 10 );
        Assert.assertEquals ( pages.getInboxPage ( ).inboxBreadCrumb.getAttribute ( "innerText" ).trim ( ) , INBOX_BREADCRUMB );
    }

    @Then ( "the title should be correct" )
    public void the_title_should_be_correct ( ) {
        waitUntilTitleEquals ( 15 , DISCUSS_PAGE_TITLE );
        Assert.assertEquals ( Driver.getDriver ( ).getTitle ( ).trim ( ) , DISCUSS_PAGE_TITLE );
    }

    @When ( "user logs in as general user" )
    public void user_logs_in_as_general_user ( ) {
        waitForClickablility ( pages.getLandingPage ( ).BriteErpDemo_button , 15 );
        pages.getLandingPage ( ).BriteErpDemo_button.click ( );
        pages.getLoginPage ( ).userLogin ( );
        pages.getHeaderPage().calendar_button.click();
    }

    @Then ( "the user is logged in" )
    public void the_user_is_logged_in ( ) {
        pages.getHeaderPage ( ).calendar_button.click ( );
        waitUntilTitleEquals ( 15 , CALENDAR_PAGE_TITLE );
        Assert.assertEquals ( Driver.getDriver ( ).getTitle ( ).trim ( ) , CALENDAR_PAGE_TITLE );
    }


}
