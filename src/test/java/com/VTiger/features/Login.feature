Feature: Verify all Login page Functionality


Scenario: Valid Login
Given user should be on login page
When user enters valid id and password
Then user should be login successfully
And Logout link should be visible
And close application


Scenario Outline: InValid Login
Given user should be on login page
When user enters invalid "<userid>" and "<password>"
Then user should be on login page with error message
And message should be "<message>"
And close application
Examples: 
|userid |password|message|
|admin1|admin1|You must specify a valid username and password.|
|admin2|admin2|You must specify a valid username and password.|
|admin3|admin3|You must specify a valid username and password.|


Scenario Outline: Verify Title
Given user should be on login page
Then "<Title>" should be matched
And close application
Examples:
|Title|
|vtiger CRM - Commercial Open Source CRM|


Scenario: Verify Logo
Given user should be on login page
Then logo should be displayed
And close application


Scenario: Valid Login with fixed data
Given user should be on login page
When user enters valid credentials
|userid|password|
|admin|admin|
Then user should be login successfully
And Logout link should be visible
And close application
