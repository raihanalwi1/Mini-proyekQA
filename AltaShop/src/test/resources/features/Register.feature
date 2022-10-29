Feature: Register
  As a user
  I want to register account
  So I can manage my new account

  Scenario Outline: Register account
    Given I am on the register page
    When I input fullname register "<fullname>"
    And I input email register "<emailReg>"
    And I input password register "<passwordReg>"
    And I click submit register button
    Then I will get the result register "<result>"
    Examples:
    | fullname | emailReg | passwordReg | result |
    | benar | benar | 1234  | success |
    |         | naixxy@co.uk | 1234 | failed |
    | naixxy12 |             | 1234 | failed |
    | naixxy12 | naixxy@co.uk |  | failed |
    |         |              |  | failed |