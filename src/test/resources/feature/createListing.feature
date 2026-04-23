Feature: CreateListingSteps

  Scenario: Successful login with valid credentials

    Given the user is logged in and on the main page
    When the user sees the header New Listing
    And the user enters name listing
    And the user Scroll Down
    And the user enters description listing
    And the user enters price listing
    And the user clicks the post listing button
    Then the user sees the header First Listing