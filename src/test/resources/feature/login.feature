Feature: LoginUserSteps

  Scenario: Successful login with valid credentials
    Given the user is on the main page login
    When the user clicks the Sign In button login
    And the user enters unique valid email login
    And the user enters complex password login
    And the user clicks the Log in button login
    And the user clicks the Post an Ad Button login
    Then the New Ad page should be displayed login