@cart
Feature: Cart
  As a user
  I want to see my cart
  So i can manage my cart

  Scenario: add one product in cart
    Given I am on product page
    When  I click beli button
    Then product in cart is one

  Scenario: add two product in cart
    Given I am on product page
    When I click beli two product button
    Then product in cart is two

  Scenario: add one product in cart with login
    Given I am on product page
    When I click signin button
    And I input valid email
    And I input Valid password
    And I click login Button
    And I click beli button
    Then product in cart is one
