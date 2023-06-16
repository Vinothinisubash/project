Feature: getting reques Url

  Scenario: Getting request from reques website
    When Hit the api
    And Get the response from website
    And print the response
    Then print the particular path