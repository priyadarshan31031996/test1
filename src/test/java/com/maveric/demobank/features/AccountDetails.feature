Feature: verify details for demo bank

 Scenario Outline: verify login details with valid credetials
    Given user is on bank page     
    When user enters "<username>" and "<password>" 
    And user click login button
    Then user has to enter the "<PIN number>" and Click on Validate PIN
Examples:    
 |username  |password   |PIN number|
 |1234556666|MavDemo@01 |12345|
  
Scenario: verify account details
		Given user click the account details button
		Then account details page is displayed 

Scenario: verify account statement
		Given use click the account statement button
		Then transaction statement is displayeduser user is on bank page on bank page

Scenario: verify the fund tranfers
		Given user click the fund transfer button
		When user fill the form
		And click the transfer button
		Then the OTP page is displayed
		When user enter the OTP and Clicking validate VAT
		Then successful transfer page with transaction details is displayed	

Scenario: verify the sign out
		Given user click the sign out button
