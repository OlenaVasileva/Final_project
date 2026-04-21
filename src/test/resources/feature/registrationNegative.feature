Feature: RegistrationNegativeSteps

  Scenario: Successful registration with a same email

    Given the user is registered negative
    When the user clicks the Sign In button negative
    And the user clicks the No Account button negative
    And the user enters a unique valid email negative
    And the user enters a complex password negative
    And the user confirms the password negative
    And the user clicks the Create Account button negative
    Then the user sees the error message

