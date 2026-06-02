Feature: Login functionality
@smoke
Scenario: Valid Login

Given user launches browser
When user enters username and password
Then user should login successfully