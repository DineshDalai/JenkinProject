#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#   Given User Lunch chrome browser and Enter url

Feature: Free CRM Application Funtionality
 

  @tag1
  Scenario: Free CRM Login Funtionality
  Given User Lunch chrome browser
  And User Enter url "https://classic.freecrm.com/index.html"
    Then User Validate All the elements visibility
    When User Click on the SignUp link
    And User able to see the signup page
    When User enter valid user name as "<Selenium_50>" and valid password as "<Abcd@123456>"
    And User click login button


#When User enter valid user name "Selenium_50" and valid password "Abcd@123456"

