package com.cukeserp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cukeserp.utilities.Driver;

import java.util.List;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@name='recurrency']//input[@type='checkbox']")
    public WebElement recurrentCheckBox;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement testingPurposes;

    @FindBy (xpath = "//div[@class='o_chat_header']/span/a[2]")
    public WebElement chatClose;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button")
    public WebElement lastWeek_button;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button[2]")
    public WebElement today_button;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button[3]")
    public WebElement nextWeek_button;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button")
    public WebElement viewDay_button;

    @FindBy(xpath = "//button[contains(text(),'Day')]")
    public WebElement dayButton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[2]")
    public WebElement viewWeek_button;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']/button[3]")
    public WebElement viewMonth_button;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs']/i")
    public WebElement miniCalendarClose;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i")
    public WebElement miniCalendarOpen;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar']/div/div/div/a")
    public WebElement miniCalandarLastMonth;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar']/div/div/div/a[2]")
    public WebElement miniCalandarNextMonth;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button")
    public WebElement calandarView;

    @FindBy(xpath = "(//div[@class='btn-group btn-group-sm o_cp_switch_buttons'])/button[2]")
    public WebElement listView;

    @FindBy(xpath = "//div[@class='o_cp_searchview']/div/input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='o_searchview']/span")
    public WebElement advancedSearch_button;

    @FindBy(xpath = "(//table)[3]/tbody/tr/td[5]")
    public WebElement _011618_allDay;

    @FindBy(xpath = "//div[@class='fc-row fc-week fc-widget-content']//td[@class='fc-day fc-widget-content fc-fri fc-past']")
    public WebElement allDayBox;

    @FindBy(xpath="//div[@name='allday']")
    public WebElement allDayCheckBox;

    @FindBy(xpath = "//div[@class='modal-content']/div/div/input")
    public WebElement addMeetingBox_popOut;

    @FindBy(xpath ="//div[@class='modal-footer']/button")
    public WebElement popOutCreate_button;

    @FindBy(xpath="//input[@class='o_input']")
    public WebElement summaryInputBox;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[2]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='fc-view fc-month-view fc-basic-view']")
    public WebElement monthView;

    @FindBy(xpath =   "(//li[@class='active'])[2]" )
    public WebElement theCurrentMonthText;  // getAttribute

    @FindBy(xpath = "//span[@class='fa fa-arrow-right']")
    public WebElement nextMonth;

    @FindBy(xpath = "((//div[@class='fc-content-skeleton'])[3]/table/tbody/tr/td)[5]")
    public WebElement may15th;

    @FindBy(xpath = "(//div[@class='o_field_name o_field_type_char'])")
    public List<WebElement> events;

    @FindBy(xpath="//input[@placeholder='Select attendees...']")
    public WebElement attendeesBox;

    @FindBy(xpath= "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath="//input[@placeholder='e.g. Business Lunch']")
    public WebElement meetingSubjectBox;

    public WebElement getEvent(String text){
        for (WebElement event: events) {
            if(event.getText().toLowerCase().contains(text.toLowerCase()))
                return event;
        }
        return null;
    }

    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[3]")
    public WebElement nextDayButton;


    @FindBy(xpath = "//div[@class='fc-view fc-agendaWeek-view fc-agenda-view']")
    public WebElement view_table_weekly;

    @FindBy(xpath = "//div[@class='fc-slats']//tr[21]//td[2]")
    public WebElement click_table_weekly;

    @FindBy(xpath = "//button[@class='o_calendar_button_prev btn btn-sm btn-primary']//span")
    public WebElement back_week;

    @FindBy(xpath = "//button[@class='o_calendar_button_next btn btn-sm btn-primary']//span")
    public WebElement forth_week;

    @FindBy(xpath = "//span[@class='o_dropdown_button'])[2]")
    public WebElement editDropDown;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[1]")
    public WebElement editEventButton;

    @FindBy(xpath = "//input[@id='o_field_input_49']")
    public WebElement meetingSubject;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-default'])[1]")
    public WebElement deleteEvent;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement saveEditEvent;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs']/i")
    public WebElement close_mini_calendar;

    @FindBy(xpath = "//div[@class='o_calendar_sidebar_container hidden-xs o_sidebar_hidden']/i")
    public WebElement openMiniCalendar;

    @FindBy(xpath = "//div[@class='o_calendar_filter']/div/div[5]/span[2]")
    public WebElement removingFilter;

    @FindBy(xpath = "(//div[@class='o_calendar_filter_item'])[4]")
    public WebElement removingFilter2;

    @FindBy(xpath = "//a[.='Options']")
    public WebElement optionsEditButton;

    @FindBy (id = "o_field_input_83")
    public WebElement selectClass;

    @FindBy(xpath = "//*[@class='o_notification_manager']")
    public WebElement errorMessage;

    @FindBy (id = "o_field_input_79")
    public  WebElement selectClassManager;

    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr")
    public List<WebElement> allMeetings;

    @FindBy (xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionDropdownButton;

    @FindBy(xpath = "((//ul[@class='dropdown-menu'])[5]/li)[3]")
    public WebElement sendSMSbutton;

    @FindBy(id = "o_field_input_358")
    public WebElement phoneNumber;

    @FindBy(xpath = "//button[@class='btn btn-sm oe_highlight']" )
    public WebElement  sendButton;

    @FindBy(id = "o_field_input_359")
    public WebElement enterText;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement phoneNumberError;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[2]")
    public WebElement attachmentButton;

    @FindBy(xpath = "//input[@class='o_input_file']")
    public WebElement addAttachmentButton;

    @FindBy(xpath = "((//ul[@class='dropdown-menu'])[5]/li)[2]")
    public WebElement duplicateButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement duplicateInput;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveDuplicateButton;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement duplicatedMeetingName;

    @FindBy(xpath = "(//a[.='Meetings'])[1]")
    public WebElement meetingButton;

    @FindBy(xpath = "//div[@data-value='all']/div/input")
    public WebElement everybodysCalendarButton;

    @FindBy(xpath = "//div[@class='fc-row fc-widget-header']/table/thead/tr/th")
    public WebElement daysOfWeek;

    @FindBy(xpath="//tr[@data-time='08:00:00']//td[@class='fc-widget-content']")
    public WebElement eightAmBox;

    @FindBy(xpath = "//tr[@data-time='07:00:00']//td[@class='fc-widget-content']")
    public WebElement sevenAmBox;

    @FindBy(xpath ="//tr[@data-time='06:00:00']//td[@class='fc-widget-content']" )
    public WebElement sixAmBox;


}
