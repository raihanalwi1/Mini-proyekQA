Feature: Order
  As a user
  I want to order product
  So I can manage my order product

  Scenario Outline: Create order
    Given I set url order
    When I want to create product <id> with qty <qty>
    Then I will get code status "<code>"
    Examples:
    | id | qty | code |
    | 11 | 1 | 200     |
    | 1 | 1 | 200     |


  Scenario: Get all order
    Given I set url get order
    When I want to get all order
    Then I will get code order

  Scenario Outline: Get order by id
    Given I set url get order by id "<id>"
    When I want to get by id order
    Then I will get result "<code>"
    Examples:
    | id | code |
    | 1 | 200 |
    |  | 400 |
    | 0 | 404 |