@test1
Feature: User is able to navigate to from homepage

  @regression
  Scenario: User is on the home page
    Given when a user is on the homepage
    When when the user click the sign in button
    Then then the login page should be displayed


