package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.SeleniumMethods;

@CucumberOptions (features = {"src/test/java/features"},
					glue = {"steps"},
					monochrome = true,
					tags = {"@LoginEngTest"}
					)
@RunWith(Cucumber.class)

public class Runner extends SeleniumMethods {
	
	@BeforeClass
    public static void setUp(){
		startResult();
    }

	@AfterClass
    public static void tearDown(){
		endResult();
    }

}