Feature: verify Logout functionality 

Scenario: cheack weather logout functionality work successfully

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
And user Click on Cheackout button
And user enter Information "satyaban" "mahunta" "751021"
And User Click the continue button
Then click the finish button
Then validate logout successfully