@Regression
Feature: Sign in Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @SignIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'amoul005@gmail.com' and password 'Amal123$'
    And User click on login button
    Then User should be logged in into Account

  @Register
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email              | password | confirmPassword |
      | amal | amoul005@gmail.com | Amal123@ | Amal123@        |
    And User click on SignUp button
    Then Verify user account is created
