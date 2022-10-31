Feature: Hello
  As a user
  I want to home
  So I can manage my home

  Scenario: Home
    Given I set url home
    When I want to view home
    Then I will get code home
