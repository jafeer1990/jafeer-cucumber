package org.cucumber;

import utils.SeleniumMethods;

public class LoginTestEng extends SeleniumMethods{
	
	public void launchBrowser() {
		startApp("chrome");
	}

	public void passURL() {
		passURL("http://policyuat.gettameeni.com");
	}
	
	public void enterUserNameAndPassword() {
		
	}
}
