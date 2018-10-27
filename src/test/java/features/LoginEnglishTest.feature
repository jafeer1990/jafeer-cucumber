@LoginEngTest
Feature: Tameeni English

@test1
Scenario Outline: To Test the login with correct credentials
Given I launch the browser
And I pass the URL
And I enter correct <uname> and <password>
Then I should be able to login
Examples:
|			uname			|password|
|abbasbriskst.ar@gmail.com	| 123456 |

@test2
Scenario Outline: To Test the login with correct credentials
Given I launch the browser
And I pass the URL
And I enter correct <uname> and <password>
Then I should be able to login
Examples:
|			uname			|password|
|abbasbriskst.ar@gmail.com	| 123456 |

