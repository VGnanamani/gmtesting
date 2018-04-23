package com.cucumber.workings;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"Features"},
        glue= {"StepDefinition"},
        tags = {"@Login or @Execute"},
        		 plugin= {"pretty","html:target/cucumber-reports"},
        monochrome=true)



/*@CucumberOptions(features= {"classpath:Functionalities.feature","classpath:Functionality-addAcc.features"}, 
                 glue= {"StepDefinition"},
                 plugin= {"pretty","junit:targe/cucumber-reports/Cucumber.xml"},
                 monochrome=true)*/


public class FinalClass {

	
	
	
}
