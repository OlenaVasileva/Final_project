Feature: EditListingSteps

  Scenario: User edits the price of their listing

    Given the user is logged in and on the main page edit
    When the user fills out the new listing form and publishes it
    And the user Scroll Up
    And the user enters the name of their listing into the Search field
    And the user clicks the Apply button
    And the user clicks on their found listing
    And the user clicks the Edit Listing button
    And the user enters a new price into the Cost field
    And the user clicks the Save Changes button
    Then the user should see a confirmation message First listing