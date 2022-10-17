
Feature: Customers
  
  Scenario: Add a new customer
    Given User lunch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then user can view dashboard
    When user click on customer menu
    And Click on customer Menu Item
    And Click Add new button
    Then User can view add new customer page
    When User enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully."
    And Close browser