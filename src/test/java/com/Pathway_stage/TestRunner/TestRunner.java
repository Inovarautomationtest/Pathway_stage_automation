package com.Pathway_stage.TestRunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"D:\\Pathway_stage\\src\\test\\java\\com\\Pathway_stage\\Base\\Featurefiles\\DeadlineAnalayserRenewalflow.feature"},
glue= "com.Pathway_stage.Stepdefinations", 
monochrome = true,dryRun = true, strict = true, 
format = {
        "pretty",
        "html:test-output",
       "json:target/Pathwayreports/Cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Deadlineanalsyser.html",
         "junit:junit_xml/cucumber.xml"})
public class TestRunner  extends AbstractTestNGCucumberTests{  
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("D:\\Pathway_stage\\extentreport.xml");
        	
        
    } 
  
     
	
	      
}


	