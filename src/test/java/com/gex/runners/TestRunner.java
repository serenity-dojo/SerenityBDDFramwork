package com.gex.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
@CucumberOptions(

		plugin= {"pretty","html:target/htmlreports"},
        features = "src/test/resources/features/gex.feature",
        glue = ("com/gex/steps/steps")
	    
                 
)


public class TestRunner {}



