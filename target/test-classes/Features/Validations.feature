Feature: Login functionality for Ecommerce website

Scenario Outline: Login with valid credentials
  Given user opens ecommerce login page
  When user logs in with "<Username>" and "<Password>"
  Then user should be navigated to home page

Examples:
  | Username | Password |
  | Admin    | admin123 |
