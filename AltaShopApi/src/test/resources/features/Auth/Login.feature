Feature: Login
  As a user
  I want to login
  So I can manage my account

 Scenario Outline: Login with email and password
    Given I set url login
    When I want to use email "<email>" and password "<password>"
    Then I will get code login "<status>"
   Examples:
   | email            | password | status |
   | someone@mail.com | 123123 | succes   |
   | someone@mail.com | 000000 | failed   |
   | someone@mail.com |  |     failed     |
   |              | 123123 | failed       |
   | win@mail.co | 123123 | failed        |