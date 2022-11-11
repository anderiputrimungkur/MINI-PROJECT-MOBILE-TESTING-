@register
Feature: Register
  As a user
  I want to create account
  So I can have account

  Scenario: register account with null field
    Given I click signin button
    And I am on login page
    And I click register page button
    When I am on the Register page
    And I clear all field value
    And I click Register button
    Then I get error message nama lengkap can not empty

  Scenario: register account with field filled
    Given I click signin button
    And I am on login page
    And I click register page button
    And I am on the Register page
    When I input nama lengkap
    And I input email
    And I input password
    And I click Register button
    Then I go to Product Page


  Scenario: register account with available account
    Given I click signin button
    And I am on login page
    And I click register page button
    And I am on the Register page
    When I input available nama lengkap
    And I input available email
    And I input available password
    And I click Register button
    Then I get error message