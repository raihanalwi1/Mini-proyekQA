Feature: Login
  As a user
  I want to login
  So I can manage my transaction

#  @Logout
  Scenario Outline: Login with email and password
    Given I am on the login page
    When I input email "<email>"
    And I input password "<password>"
    And I click login button
    Then I will get the result "<result>"
    Examples:
    | email            | password | result |
    | naixxy1@mail.com | naixxy | success |
    | naixxy1@mail.com | hihi | failed |
    | naixxy1@mail.com |      | failed |
    |                  | a    | failed |
    |                  |     | failed |