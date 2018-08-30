package com.UAT.RallyChoice.Automation.Utilities;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
                                strict = true,
                                monochrome = true, 
                                features = "src/test/resources/Feature",
                                glue = "com.UAT.RallyChoice.Automation.Steps",
                                plugin = {	"pretty", "html:target/cucumber-html-report", 
                                       		 "json:target/cucumber-reports/Cucumber.json"}, 
                                tags={"@RallyChoice3"}
                                )
                                

public class CucumberRunner extends AbstractTestNGCucumberTests {

}

