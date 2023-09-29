Feature: Verify Cart page functionality

Scenario: Verify user able to redirect cart page or not

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
Then Validate User able to see the Cart page or not


Scenario: Verify continue shopping button is clickable or not after product add to cart

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
And user click the continue shopping button
Then Validate successfull back in to home page


Scenario: Verify user able to click Remove button after product add

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
And user hit on Remove button
Then validate successfully removed the product from cart


Scenario: Verify user able to click cheackout button after product add to cart 

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
And user Click on Cheackout button
Then validate successfully click of checkout button


Scenario: Verify user able to fill up with valid data in cheackout information page

When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
And click the basketCart after add product
And user Click on Cheackout button
And user enter Information "satyaban" "mahunta" "751021"
And User Click the continue button
Then click the finish button
Then Validate successful order confirmation


