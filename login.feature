Feature: validate the login functionality
Scenario: verify login with valid user name and password
Given user enter url
When user enter valid username and password
And user click on login button
Then validate user navigate to homepage

Scenario: verify login with valid username and invalid password
Given user enter url
When user enter valid username and invalid password
And user click on login button
Then validate error message

Scenario: verify login with invalid username and valid password
Given user enter url
When user enter invalid username and valid password
And user click on login button
Then validate user error message

Scenario: verify login with blank username and password
Given user enter url
When user blank username and password
And user click on login button
Then validate the error message on blank
