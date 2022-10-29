Feature: Order
  As a user
  I want to order product
  So I can manage order

  Scenario: Order product
    Given I am on the home page
    And I click button buy
    And I click order button
    When I click button add
    And Text qty has change
    And I click button delete
    And Text qty has change
    And I click button checkout order
    Then I will get the result
#    Examples:
#    | qty| result |
#    |  |  empty |
#    | 2 |  two |


