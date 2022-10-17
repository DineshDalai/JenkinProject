Feature: Login
  


  Scenario: Sucessfull Login with valid credentials
    Given User lunch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Logout link
    Then Page Title should be "Your store. Login"
    And Close browser