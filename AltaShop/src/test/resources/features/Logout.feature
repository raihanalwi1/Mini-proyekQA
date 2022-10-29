Feature: Logout
  As a user
  I want to logout account
  So I can logout

  Scenario: Logout
    Given I am on the login page
    And I login
    When I click button
    Then I will get the result logout