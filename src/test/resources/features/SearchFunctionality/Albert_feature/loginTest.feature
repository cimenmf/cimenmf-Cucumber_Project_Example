Feature: Calendar Module
  As a user, when I enter correct login information, I should be able to login to the application
  and access the Calendar Module homepage


  Background:
    Given user is on the login page

  @loginManager
  Scenario: Login as manager
    When user logs in as manager
    Then breadcrumb is displayed
    And the user is logged in

#  @loginUser
#  Scenario: Login as user
#    When user logs in as general user
#    Then breadcrumb is displayed
#    And the user is logged in




