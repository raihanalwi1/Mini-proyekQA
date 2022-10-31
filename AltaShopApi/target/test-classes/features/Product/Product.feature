Feature: Product
  As a user
  I want to product
  So I can manage my product

  Scenario: Get all Product
    Given I set url get product
    When I want to get product
    Then I will get code get product

  Scenario Outline: Create new product
    Given I set url get product
    When I want to new product with name "<name>" desc "<desc>" price <price> and categories <cate>
    Then I will get code "<code>"
    Examples:
    | name   | desc                   | price | cate | code |
    | Pulpen | ini pulpen fabercaster | 2000 |    1 | 200 |
    |        | gaada nama product     | 2000 |    1 | 500 |
    | pensil |                        | 2000 |    1 | 200 |
    | pensil | 2b                     |   0   |    1 | 200 |
    | penghapus | putih               | 1000 |  0   | 200 |
    |        |                | 0 |  0   | 500 |


  Scenario: Delete a product
    Given I set url get product
    When I want to delete product
    Then  I will get code

  Scenario: Get Product By id
    Given I set url get product by id
    When I want to get by id
    Then I will get code get product by id