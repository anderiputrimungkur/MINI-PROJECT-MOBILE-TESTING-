@login
Feature: Login
  As a User
  I want to add login
  So I can manage my account

  Scenario: login with valid email and valid password
    Given I click signin button
    And I am on login page
    When I input valid email
    And I input Valid password
    And I click login Button
    Then I go to Product Page

  Scenario: login with invalid email and invalid password
    Given I click signin button
    And I am on login page
    When I input invalid email
    And I input inValid password
    And I click login Button
    Then I get error message account invalid

    Scenario: login with null email and valid password
      Given I click signin button
      And I am on login page
      When I input Valid password
      And I click login Button
      Then I get error message email can not empty

    Scenario: login with valid email and null password
      Given I click signin button
      And I am on login page
      When I input valid email
      And I click login Button
      Then I get error message password can not empty

  Scenario: login with null email and null password
      Given I click signin button
      And I am on login page
      When I click login Button
      Then I get error message email can not empty
And I get error message password can not empty