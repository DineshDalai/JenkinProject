Feature: Login Functionality for OpenCart E-Commerece website
  
   As a user of the opencart Website
   I want to be able to login in with my Account
   So that i can acess my account-related feature and manage my order

  Background: 
    Given I am on the OpenCart loginPage

  Scenario: Sucessfull login with valid credentials
    Given I have entered  a valid username and password
    When I click on the login button
    Then I should be loged in sucessfully

  Scenario Outline: Unsucessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username          |  | passsword       |  | error_message                                        |
      | invalid@email.com |  | invalidpassward |  | Waring: No match for E-Mail Address and/or Password. |
      | abcccc            |  | validpassword   |  | Waring: No match for E-Mail Address and/or Password. |
      | valid@email.com   |  | abccc           |  | Waring: No match for E-Mail Address and/or Password. |

  Scenario: Navigating to the forgetten page
    When I click on the "Forgotten Password" link
    Then I should redirect to the password reset page
