package com.cukeserp.utilities.seleniumcucumber;

public interface BaseTest {
    MiscellaneousMethods      miscmethodObj = new MiscellaneousMethods ();
    NavigateMethods           navigationObj = new NavigateMethods();
    AssertionMethods          assertionObj  = new AssertionMethods();
    ClickElementsMethods      clickObj      = new ClickElementsMethods();
    ConfigurationMethods      configObj     = new ConfigurationMethods();
    InputMethods              inputObj      = new InputMethods();
    ProgressMethods           progressObj   = new ProgressMethods();
    JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
    ScreenShotMethods         screenshotObj = new ScreenShotMethods();



}
