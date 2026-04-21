Feature: registration

  Scenario: Successful registration with a unique email

    Given the user is on the main page
    When the user clicks the Sign In button
    And the user clicks the No Account button
    And the user enters a unique valid email
    And the user enters a complex password
    And the user confirms the password
    And the user clicks the Create Account button
    And the user clicks on the profile photo
    Then the user is redirected to the My Profile page

