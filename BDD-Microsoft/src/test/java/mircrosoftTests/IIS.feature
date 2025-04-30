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
Feature: Web scraping of text
  I want to implement web scraping of any text element in IIS Windows Server page

  @tag1
  Scenario: Web scraping
    Given I am in IIS Windows Server Home Page
    When I click on Internet Information Services button
    When I click on Get started with IIS button
    Then I have reached overview of IIS page and do web scraping on any text element

