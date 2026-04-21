Feature: DeleteListingSteps

  Scenario: User delete the price of their listing

    Given the user is logged in and on the main page Delete
    When the user fills out the new listing form and publishes it Delete
    And the user Scroll Up Delete
    And the user enters the name of their listing into the Search field Delete
    And the user clicks the Apply button Delete
    And the user clicks on their found listing Delete
    And the user clicks the Delete Listing button
    Then the user should see a confirmation message First listing Delete