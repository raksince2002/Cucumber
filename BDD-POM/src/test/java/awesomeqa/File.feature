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
@tag
Feature: Login and Register feature of AwesomeQA
  I want to register and login in AwesomeQA application using valid credentials

  @tag1
  Scenario: Register in AwesomeQA application
    Given I am in Register page of AwesomeQA application
    When I enter my firstname
    When I enter my lastname
    When I enter email address
    When I enter my telephone number
    When I enter my password and confirm it
    When I accept the Privacy Policy
    And I click on Register button
    Then I have created my Account successfully

  @tag2
  Scenario: Login in Automation exercise using valid credentials
  	Given I am in Login page of AwesomeQA application
    When I enter my email address
    When I enter my password
    And I click on login button
    Then I have logged into AwesomeQA application
