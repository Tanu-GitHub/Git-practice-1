package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue="stepdefinationpackage",monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests
 {
	

}
