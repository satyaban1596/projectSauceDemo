@Reg
Feature: Verify login functionality
 
Scenario Outline: Test login functionality with valid data


When user input "<UserName>" and "<Password>"
And hit the login button 
Then validate successfully login
Examples:
|UserName|Password|
|standard_user|secret_sauce|


Scenario: Test login functionality with invalid data


When user input "standard" and "secret"
And hit the login button 
Then validate error messege



Scenario: Test login functionality with blank data


When user input "" and ""
And hit the login button 
Then validate  invalid error messege for blank page


