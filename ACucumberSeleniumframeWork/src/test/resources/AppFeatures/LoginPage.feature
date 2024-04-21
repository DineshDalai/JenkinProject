Feature: Free CRM Application Funtionality
 

  @tag1
  Scenario: Free CRM Login Funtionality
  Given User on browser page and Enter url "https://admin-demo.nopcommerce.com/login"
    And User enters mail as "admin@yourstore.com" and password as "admin"
     And Click on Login
     Then Page Title is "Dashboard / nopCommerce administration"
     Then User click logout button
     Then After logout Page Title should be "Your store. Login"
    And Close browser