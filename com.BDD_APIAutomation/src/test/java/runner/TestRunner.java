package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import utilities.PropertiesHelper;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "com.BDD_APIAutomation\\src\\test\\resources\\Features",
		glue = {"stepDefinitions"},
		plugin = {"pretty","html:target/reports/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		monochrome = true
		)


public class TestRunner {

	@BeforeClass
	public static void beforeClassMethod()
	{
		//String envVal=PropertiesHelper.getProperty("global", "env");
		//PropertiesHelper.getProperty(envVal,"baseURL");
	
		String url=PropertiesHelper.getProperty();
		System.out.println(url);
		RestAssured.baseURI= url;
		System.out.println("Calling before class..");
	}
	
	@AfterClass
	public static void afterClassMethod()
	{
		System.out.println("After class..");
	}

}

