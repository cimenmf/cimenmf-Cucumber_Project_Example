package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CalendarSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @When("hover to the List option on the right top corner")
    public void hover_to_the_List_option_on_the_right_top_corner() {
        hover(pages.getCalendar().listView);
    }






    @Then("User click on day button")
    public void user_click_on_day_button() {
        pages.getCalendar().dayButton.click();
    }

    @Then("User click on the all day box")
    public void user_click_on_the_all_day_box() {
       pages.getCalendar().allDayBox.click();
    }

    @When("User types in {string} as their event name")
    public void user_types_in_as_their_event_name(String testing) {
        pages.getCalendar().summaryInputBox.sendKeys(testing);
    }

    @Then("User click on create button")
    public void user_click_on_create_button() {
        pages.getCalendar().popOutCreate_button.click();
    }



    @Then("I log in as user")
    public void iLogInAsUser() {
        pages.getLoginPage().userLogin();
    }

    @Given("I open url")
    public void iOpenUrl() {
       String url= ConfigurationReader.getProperties ( "url" );
        Driver.getDriver ( ).get ( url );
    }



    @When("I click the BritErpDemo button")
    public void iClickTheBritErpDemoButton() {
        pages.getLandingPage().BriteErpDemo_button.click();
    }

    @Given("User open url")
    public void userOpenUrl() {
       String url= ConfigurationReader.getProperties("url");
       Driver.getDriver().get(url);
    }

    @When("User clicks BriteErpDemo button")
    public void userClicksBriteErpDemoButton() {
        pages.getLandingPage().BriteErpDemo_button.click();
    }

    @When("User navigates to Calendar tab")
    public void userNavigatesToCalendarTab() {
        pages.getHeaderPage().calendar_button.click();
    }

    @When("User clicks on eight o'clock box")
    public void userClicksOnEightOClockBox() {
        pages.getCalendar().eightAmBox.click();
    }

    @And("User clicks on edit button")
    public void userClicksOnEditButton() {
        pages.getCalendar().editButton.click();
    }



    @Then("User inserts {string} into the attendees box")
    public void userInsertsIntoTheAttendeesBox(String user) {
            pages.getCalendar().attendeesBox.sendKeys(user);
    }

    @And("User clicks on day button")
    public void userClicksOnDayButton() {
        pages.getCalendar().dayButton.click();
    }

    @Then("User clicks on the right arrow two times")
    public void userClicksOnTheRightArrowTwoTimes() {
        pages.getCalendar().nextDayButton.click();
        pages.getCalendar().nextDayButton.click();
    }


    @Then("User clicks on the six o'clock box")
    public void userClicksOnTheSixOClockBox() {
        pages.getCalendar().sixAmBox.click();

    }

    @Then("User clicks on options tab")
    public void userClicksOnOptionsTab() {
        pages.getCalendar().optionsEditButton.click();
    }

    @Then("User clicks on all day checkbox")
    public void userClicksOnAllDayCheckbox() {
        pages.getCalendar().allDayCheckBox.click();
    }

    @Given("User signs in as a manager")
    public void userSignsInAsAManager() {
        pages.getLoginPage().managerLogin();

    }

    @Then("manager clicks on Calendar tab button")
    public void managerClicksOnCalendarTabButton() {
        pages.getHeaderPage().calendar_button.click();

    }

    @When("manager is on calendar page,clicks on the day button")
    public void managerIsOnCalendarPageClicksOnTheDayButton() {
        pages.getCalendar().dayButton.click();
    }

    @Then("logs in as a Manager")
    public void logsInAsAManager() {
        pages.getLoginPage().managerLogin();
    }

    @Then("Manager clicks on calendar tab")
    public void managerClicksOnCalendarTab() {
        pages.getHeaderPage().calendar_button.click();
    }

    @Then("Manager clicks on day button")
    public void managerClicksOnDayButton() {
        pages.getCalendar().dayButton.click();
    }

    @And("Manager clicks on six am box")
    public void managerClicksOnSixAmBox() {
        pages.getCalendar().sixAmBox.click();
    }

    @Then("Manager verifies {string} is displayed")
    public void managerVerifiesIsDisplayed(String expected) {
        String actual=pages.getCalendar().testingPurposes.getText();
        Assert.assertEquals(actual,expected);
    }

    @Then("Manager clicks on edit button")
    public void managerClicksOnEditButton() {
        pages.getCalendar().editButton.click();
    }

    @And("Manager verifies edit button is enabled")
    public void managerVerifiesEditButtonIsEnabled() {
        pages.getCalendar().sixAmBox.click();
        Assert.assertTrue(pages.getCalendar().sixAmBox.isEnabled());
    }


    @And("Manager clicks on the eight o clock box")
    public void managerClicksOnTheEightOClockBox() {
        pages.getCalendar().eightAmBox.click();

    }

    @Then("Manager clicks on options tab")
    public void managerClicksOnOptionsTab() {
        pages.getCalendar().optionsEditButton.click();

    }

    @Then("Manager clicks on recurrent check box")
    public void managerClicksOnRecurrentCheckBox() {
        pages.getCalendar().recurrentCheckBox.click();

    }

    @And("Manager verifies the check box was selected")
    public void managerVerifiesTheCheckBoxWasSelected() {
        Assert.assertTrue(pages.getCalendar().recurrentCheckBox.isSelected());
    }

    @When("User is logged in as {string}")
    public void userIsLoggedInAs(String user) {
        pages.getLoginPage().userLogin();
    }

    @When("User clicks on the BritErpDemo button")
    public void userClicksOnTheBritErpDemoButton() {

    }

    @When("User navigates to the Calendar tab")
    public void userNavigatesToTheCalendarTab() {
        pages.getHeaderPage().calendar_button.click();
    }

    @Then("Manager clicks on the right arrow button ,adjacent to day button,twice")
    public void managerClicksOnTheRightArrowButtonAdjacentToDayButtonTwice() {
        pages.getCalendar().today_button.click();
    }

    @And("Manager Verifies day button was selected")
    public void managerVerifiesDayButtonWasSelected() {
        Assert.assertTrue(pages.getCalendar().today_button.isEnabled());
    }
}


