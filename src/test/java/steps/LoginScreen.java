package steps;

import org.cucumber.LoginTestEng;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.SeleniumMethods;


public class LoginScreen extends SeleniumMethods {
	LoginTestEng loginTest = new LoginTestEng();
		
	@Before
	public void before(Scenario sc) {	
		startTestModule(sc.getId(), sc.getName());	
		test = startTestCase(sc.getId());		
	}
	@After
	public void after() {
		closeAllBrowsers();
	}
	
	@Given ("^I launch the browser$")
	public void I_launch_the_browser() {
		loginTest.launchBrowser();
	}
	
	
	@And ("^I pass the URL$")
	public void I_pass_the_URL() {
		loginTest.passURL();
	}
	
	@And ("^I enter correct (.*) and (.*)$")
    public void I_enter_correct_username_and_password(String uname, String pwd) {
		loginTest.enterUserNameAndPassword();
	}
	@Then ("^I should be able to login$")
	public void I_should_be_able_to_login() {
		
	}


}
