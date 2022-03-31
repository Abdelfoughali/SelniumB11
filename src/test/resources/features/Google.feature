Feature: Testing google functionalities
  Scenario: Happy path google search functionality
    Given I navigate to google.com
    When I search for techtorial
    Then I get more than 10 links on the pages