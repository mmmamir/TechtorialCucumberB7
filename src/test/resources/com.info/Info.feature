Feature: Print Info

  Scenario: Validate information
    And the user print firstname
    * the user print lastname
    * the user should see the fullName
    And the user print the city