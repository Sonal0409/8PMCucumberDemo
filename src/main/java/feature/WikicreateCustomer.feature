Feature: creation of new account in wikipedia
Scenario: To test account creation in wiki page

Given User is on chrome browser and opens wiki home page
When user is on Wiki page
Then click on create Account link
Given Create Account Page has opened
And Check all the fileds are displayed
Then Enter Username, password, retype, email and click on create account button
Then check if account is created or not

Scenario: To test login link on create account page
When user is on Create account Page
Then clcik on Login link
And check if user is on login Page of wiki pedia