package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/Features",glue={"StepDefination","Helper"},tags="@Reg",
			plugin="html:target/htmlReports/Test.html")
	
	public class TestRunner {

}
