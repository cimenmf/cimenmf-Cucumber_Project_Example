package com.cukeserp.utilities;

import com.cukeserp.pages.*;

public class Pages {

    private CalendarListViewPage calendarListViewPage;
    private CalendarPage         calendarPage;
    private HeaderPage           headerPage;
    private HelpPage             helpPage;
    private ImportPage           importPage;
    private InboxPage            inboxPage;
    private LandingPage          landingPage;
    private LoginPage            loginPage;
    private SearchPage           searchPage;
    private SalesChannelsPage    salesChannelsPage;
    private UniversalPage        universalPage;
    private ContactPage          contactPage;
    private NotesPage            notesPage;
    private MaintenancePage      maintenancePage;
    private TimeSheetsPage       timeSheetsPage;
    private InventoryPage        inventoryPage;

// ------------------------------------------------------------------------Methods--------------------------------------------------------------------------------------------------

    public CalendarListViewPage getCalendarListViewPage ( ) { return (calendarListViewPage == null) ? calendarListViewPage = new CalendarListViewPage ( ) : calendarListViewPage; }

    public CalendarPage getCalendar ( ) { return (calendarPage == null) ? calendarPage = new CalendarPage ( ) : calendarPage; }

    public HeaderPage getHeaderPage ( ) {
        return (headerPage == null) ? headerPage = new HeaderPage ( ) : headerPage;
    }

    public HelpPage getHelpPage ( ) {
        return (helpPage == null) ? helpPage = new HelpPage ( ) : helpPage;
    }

    public ImportPage getImportPage ( ) {
        return (importPage == null) ? importPage = new ImportPage ( ) : importPage;
    }

    public ContactPage getContactPage(){
        return (contactPage == null) ? contactPage = new ContactPage () : contactPage;
    }

    public InventoryPage getInventoryPage (){
        return (inventoryPage == null) ? inventoryPage = new InventoryPage () : inventoryPage;
    }

    public InboxPage getInboxPage ( ) {
        return (inboxPage == null) ? inboxPage = new InboxPage ( ) : inboxPage;
    }

    public LandingPage getLandingPage ( ) { return (landingPage == null) ? landingPage = new LandingPage ( ) : landingPage; }

    public LoginPage getLoginPage ( ) {
        return (loginPage == null) ? loginPage = new LoginPage ( ) : loginPage;
    }

    public SearchPage getSearchPage ( ) {
        return (searchPage == null) ? searchPage = new SearchPage ( ) : searchPage;
    }

    public SalesChannelsPage getSalesChannelsPage(){return (salesChannelsPage==null) ? salesChannelsPage = new SalesChannelsPage() : salesChannelsPage; }

    public UniversalPage getUniversalPage(){return (universalPage == null) ? universalPage = new UniversalPage() : universalPage; }

    public NotesPage getNotesPage(){return (notesPage == null) ? notesPage = new NotesPage() : notesPage; }

    public MaintenancePage getMaintenancePage(){return (maintenancePage == null) ? maintenancePage = new MaintenancePage() : maintenancePage; }

    public TimeSheetsPage getTimeSheetsPage() {return  (timeSheetsPage == null) ? timeSheetsPage = new TimeSheetsPage() : timeSheetsPage; };



}

