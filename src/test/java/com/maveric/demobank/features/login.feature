@login
Feature: DemoBank Loginpage
@test
Scenario: Verify User able to Loing DemoBank

Given user Navigate to DemoBank Logingpage
When  Title of the Loginpage is DemoBank
Then  user enters AccountNumber and password
And user is on validation pageThen
Then  user enters PIN Number
And Click on SignOut
And Close browser

