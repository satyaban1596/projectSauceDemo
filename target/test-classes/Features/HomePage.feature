Feature: Verify all HomePage Functionality

Scenario: Check Add to cart functionality by adding a single product


When user input "standard_user" and "secret_sauce"
And hit the login button
And user add a Product to basketCart
Then validate successfully add or not


Scenario: Check Add to cart functionality by adding multi products


When user input "standard_user" and "secret_sauce"
And hit the login button
And user add multi Products to basketCart
Then validate successfully add multi products or not


Scenario: verify suuceesful dropdown choose


When user input "standard_user" and "secret_sauce"
And hit the login button
And user hit Dropdown and Choose a Dropdown Value
Then Validate Successfully Dropdown choose or not


Scenario: Check Remove product options after adding multi products


When user input "standard_user" and "secret_sauce"
And hit the login button
And user add multi Products to basketCart
And user remove some product after add
Then Validate is it Removable or not


Scenario: Verify weather product image is clickable and again back to Home page 

When user input "standard_user" and "secret_sauce"
And hit the login button
And user hit on a product image 
And Validate it redirect to right page or not
And user Back to Home or Product Page   
Then Validate user able to get back to Product page or not


Scenario: verify weather user able to see the cart page after add multi product to cart


When user input "standard_user" and "secret_sauce"
And hit the login button
And user add multi Products to basketCart
And click the basketCart after add product
Then Validate weather user able to see that products in cart page with price
And user enter Information "satyaban" "mahunta" "751021"




















