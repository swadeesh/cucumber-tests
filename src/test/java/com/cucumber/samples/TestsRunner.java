package com.cucumber.samples;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/cucumber/features"
		,monochrome = true		
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"}
		,glue = "com.cucumber.samples"
		) 
public class TestsRunner {

//	@Test()
//	public void testApp()
//    {
//        //assertTrue( true );
//    }
}
