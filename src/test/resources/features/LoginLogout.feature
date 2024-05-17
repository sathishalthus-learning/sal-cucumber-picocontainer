@login
Feature: Login Feature

  @successfulLogin
  Scenario: Logging in successfully
    Given navigated to login page
    When passing credentials
    Then should see products page
    And logs out
