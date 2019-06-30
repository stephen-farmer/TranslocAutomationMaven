Feature: Feed Sharing

  Scenario: Share a feed from the Architect home screen
    Given User is on the Architect home view
    When User selects a feed's overflow menu
    And User selects share
    And User confirms share
    Then Feed should be shared successfully