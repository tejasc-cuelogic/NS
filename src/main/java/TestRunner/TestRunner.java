package TestRunner;
 

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
//		, format = {"pretty", "html:target/Destination"}
//		, plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
//		, tags = { "~@ignore" }
		, tags = "@smoke"
		)
 
public class TestRunner {
	public static void main(String[] args)
	{
		//JUnitCore.main("Cucumber.TestRunner");
	}

}