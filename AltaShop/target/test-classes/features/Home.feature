Feature: Home
  As a user
  I want to watch home page
  So I can view

  Scenario: Home detail product
    Given I am on the home page
    When I click button detail
    Then I will get the detail

  Scenario: Home product to buy
    Given I am on the home page
    When I click button buy
    Then I will get the product to order

  Scenario: Transaction list
    Given I am on the login page
    When I am login
    And I click button
    Then I will get transaction page

  Scenario: Transaction list without login
    Given I am on the home page
    Then I am on the transaction page
