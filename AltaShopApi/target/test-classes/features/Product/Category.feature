Feature: Product Category
  As a user
  I want to category product
  So I can manage my category product

  Scenario Outline: Product category create
    Given I set url get category create
    When I want to name "<name>" and description "<desc>"
    Then I will get code category "<status>"
    Examples:
    | name | desc              | status |
    | kopi | cobain deh mantap | 200    |
    |      |  rasa susu        | 500    |
    | susu |                   | 200    |
    |      |                   | 500    |

  Scenario: Get all category Product
    Given I set url get category
    When I want to get body all category
    Then I will get code all category

  Scenario Outline: Get category by id
    Given I set url get category
    When I want to get body by id category "<gid>"
    Then I will get code by id "<code>"
    Examples:
    | gid | code |
    | 2 | 200 |
    | 1 | 404 |
    | - | 400 |
