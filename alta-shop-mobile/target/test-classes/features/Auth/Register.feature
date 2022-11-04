Feature: Register
  As a user
  I want to register account
  So I can manage account

  Scenario Outline: Register user
    Given I am on the home page
    And I click button login account
    And I click button register account
    When I input fullname "<fullname>"
    And I input email "<email>"
    And I input password "<password>"
    And I click button register
    Then I get result register "<result>"
    Examples:
    | fullname        | email          | password  | result |
    | bapa budi       | benar | bapabudi1 | pass |
    |                 | babu@gmail.com | bapabudi1 | reqFullname |
    | anak budi       |                | bapabudi1 | reqEmail |
    | bukan bapa budi | babu@gmail.com |         | reqPassword |
    | bukan bapa budi | babu@gmail | anak budi | error |
