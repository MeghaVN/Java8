package stepDefinitions;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class TestBase {
	
	@Before
	public void beforeScenarioMethod()
	{
		System.out.println("Executes before each Scenario");
	}
	@After
	public void genericAfterScenarioMethod()
	{
		System.out.println("Executes after each Scenario");
	}
	
	//@Test
	public void runTest()
	{
		System.out.println("Executing Junit tests");
	}
	@After("@smoketest")
	public void genericAfterTagScenarioMethod()
	{
		System.out.println("Executes after each Scenario DB test");
		//executes after each scenario which has tag smoke test
	}
	
	@BeforeStep
	public void genericBeforeStepScenarioMethod()
	{
		System.out.println("Executing before each step");
	}
	@AfterStep
	public void genericAfterStepScenarioMethod()
	{
		System.out.println("Executing after each step");
	}
	

}
