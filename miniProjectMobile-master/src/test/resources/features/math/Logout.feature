@logout
Feature: Logout
  As a user
  I want to logout
  So I can logout my account

  Scenario: Logout account
  Given I click signin button
  And I am on login page
  And I input valid email
  And I input Valid password
  And I click login Button
  When I am on product page
  And I click loguot button
  Then I go to Product Page

  Scenario: Logout account and go to login page
  Given I click signin button
  And I am on login page
  And I input valid email
  And I input Valid password
  And I click login Button
  When I am on product page
  And I click loguot button
    And I click signin button
  Then I go to Login page

