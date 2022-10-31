Feature: Product
  As a user
  I want to product
  So I can manage my product

  Scenario: Get Product
    Given I set url get product
    When I want to get product
    Then I will get code get product

#  Scenario:
#    Given I set url get product
#    When I set body
#    Then I will get code

  Scenario: Get Product By id
    Given I set url get product by id
    When I want to get by id
    Then I will get code get product by id