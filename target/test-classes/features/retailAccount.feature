@Regression
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'amoul005@gmail.com' and password 'Amal123$'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @updateProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'Amel Baher' and Phone '7033070987'
    And User click on Update button
    Then user profile information should be updated

  @addPayment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 1234503073765345 | Ahmed Azzam |              2 |           2025 |          678 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'


  @editPayment
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 234560337333234 | Chaimaa brahim |               2 |           2027 |          345 |
    And user click on Update Your Card button
    Then a message should  display 'Payment Method updated Successfully'

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User clicks on the Add address option
    And user fills the new address form with below information
      | country  | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryV | fullnameValue | PhoneV      | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    Then a message  displayed 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
      | United States | Chocho     |  2024576546 | 123 main st   |   2 | Dali |VA  |  22343 |
    And User click update Your Address button
    Then a message should be displayed after editing 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
