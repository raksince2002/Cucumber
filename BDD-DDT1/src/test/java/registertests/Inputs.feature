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
Feature: Register feature in DemoGurus99 Application
  I want to register in DemoGurus99 Application

  @tag1
  Scenario: Register with personal details of user in DemoGurus99 Application
    Given I am in the register page of DemoGurus99 Application
    When I enter the firstname
    When I enter the postalcode
    When I select the country based on my data
    When I enter the username
    When I enter the password and confirm it
    And I click on submit
    Then I have registered into this application
