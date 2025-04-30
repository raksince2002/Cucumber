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
Feature: Register feature in Automtion Exercise application
  I want to register in Automation Exercise application

  @tag1
  Scenario Outline: Register in Automtion Exercise application
  	Given I am in login and signup page of the application
    When I enter the <name>
    When I give the email address as <email>
    Then I verify the <status>

    Examples: 
      | name  | email | status  |
      | Rakesh |rakeshdivakar2002@gmail.com| success |
      | RK |bnbnhnhnh@gmail.com| Fail    |
