Feature: creation of new account in wikipedia
Scenario: To test account creation in wiki page

Given User is on chrome browser and opens wiki home page
When user is on Wiki page
Then click on create Account link
Given Create Account Page has opened
And Check all the fileds are displayed
Then Enter Username, password, retype, email and click on create account button
And click on login link