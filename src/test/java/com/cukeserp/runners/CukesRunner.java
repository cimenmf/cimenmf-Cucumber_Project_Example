package com.cukeserp.runners;


import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

@RunWith ( Cucumber.class )
@CucumberOptions (
        plugin = {
                "json:target/cucumber.json" ,
                "html:target/cucumber/" ,
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/ImportFunctionality/Aiman_feature/PhaseV",
        glue = "com.cukeserp.step_definitions"
        ,dryRun = false
        
      // ,monochrome=true

)
public class CukesRunner {

}



