Feature: login to the application
Scenario: login to the application with valid credentials
Given open app url
When user is on login page
And user is loggedin with valid credentials
Then user is navigated to home page
 
Examples:
| Username |Password|
| Admin | admin123 |