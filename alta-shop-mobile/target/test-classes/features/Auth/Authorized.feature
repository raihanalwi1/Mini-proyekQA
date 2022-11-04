Feature: Authorized
  As a user
  I want to user login
  So I can manage my account


#  Scenario Outline: Login user
#    Given I am on the home page
#    And I click button login account
#    When I input email "<email>" and password "<password>"
#    And I click button login
#    Then I get result "<result>"
#    Examples:
#    | email         | password | result |
#    | nai@gmail.com | password  | pass |
#    |               | 132       | reqEmail |
#    | pai           |           | reqPassword |
#    | inisalah      | password  | error |
#    | nai@gmail.com | iya salah  | error |
#
#  Scenario: Logout user
#    Given I am on the home page
#    And I click button login account
#    When I will login
#    And I click button logout
#    Then I am on the home page