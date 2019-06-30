Feature: User creates new feed

  Scenario: User creates new feed from main home view
    Given User is on the Architect home view
    And User selects New Feed
    And User fills in feed info
    Then a new feed should be present