Feature: addition

  Background:
    Given I have entered https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php

  @addition
  Scenario: Add two numbers
    Given I have entered 123 into the calculator
    And I have also entered 456 into the calculator
    When I press add
    Then the result should be 579 on the screen
