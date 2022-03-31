Feature: Amazon search functionality
  Scenario: positive scenario for amazon research
    When I navigate to amazon home page
    And I search for I phone 13 cases
    Then I should get more than 20 results
    And I validate the search result number