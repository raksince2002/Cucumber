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
Feature: Login feature of Automation Exercise
  I want to login in Automation exercise application using valid credentials

  @tag1
  Scenario: Login in Automation exercise using valid credentials
    Given I am in Login page of AwesomeQA application
    When I enter my email address
    When I enter my password
    And I click on login button
    Then I have logged into AwesomeQA application 

  @tag2
  Scenario: Login in Automation exercise using invalid credentials
    Given I am in the Login page of AwesomeQA application
    When I enter invalid email address
    When I enter invalid password
    And Login button is clicked
    Then Error message is displayed
