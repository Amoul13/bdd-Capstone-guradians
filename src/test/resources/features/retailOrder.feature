@Regression
Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'amoul005@gmail.com' and password 'Amal123$'
    And User click on login button
    And User should be logged in into Account

  @addItems
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    And the cart icon quantity should change to '2'
    Then empty cart

  @placeOrder
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User change the category to 'Electronics' search for an item Apex Legends
    And User search for an item 'Apex Legends' Apex Legends
    And User click on Apex Legends item
    And User select quantity '5' on Apex Legends
    And User click add to Cart button
    Then the cart icon quantity should change to '5' Apex Legends
    And User click on Cart option for Apex Legends
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed Successfully' Apex Legends

  @cancelOrder
  Scenario: Verify User can cancel the order
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  @ExtraAdded
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Then User search for item named 'Cleaning Gel'
    And User click on Search icon
    And User click on item Cleaning
    And User click add to Cart button
    And User click on Cart option
    And User click on Cart option for Apex Legends
    And User click on Proceed to Checkout button
    And User click on Place Your Order

  @returnOrder
  Scenario: Verify User can Return the order
    And User click on Orders section for return
    And User click on the first order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a cancelation message should  display 'Return was successfull'

  @Review
  Scenario: Verify User can write a review on order placed
    And User click on Orders section for review
    And User click on first order in the list
    And User click on Review button
    And User write Review headline 'Great Product' and 'Excelent condition'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
