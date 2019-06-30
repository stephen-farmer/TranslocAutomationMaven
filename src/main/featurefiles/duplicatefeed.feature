Feature: Duplication of feeds

  Scenario: Duplicate a feed from the main Architect home view

    Given User is on the Architect home view
    When User selects a feed's overflow menu
    And User selects duplicate
    And User confirms duplicate
    Then Feed should be duplicated