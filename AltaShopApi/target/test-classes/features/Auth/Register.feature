Feature: Register
  As a user
  I want to register
  So I can create my account

  Scenario Outline: Register with email password and fullname
    Given I set url register
    When I want to email "<email>" password "<password>" and fullname "<fullname>"
    Then I will get code register "<status>"
    Examples:
    | email        | password | fullname  | status |
    | aji@mail.com | jiji     | ajiaji    | 400 |
    | naixxy1      | password | nai nai   | 200 |
    |              | password | nai nai   | 400 |
    | nai          |          | nai nai   | 400 |
    | ian          | password |           | 400 |
    |              |          |           | 400 |
