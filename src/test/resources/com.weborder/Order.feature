@order
Feature: WebOrder Page Food Order

  @tc6 @regression
  Scenario: Validation of Food Order For Office
    Given the user is in webOrder home page
    When the user select "Office" options
    And  the user is on the group order page
    Then the user send invitees note "Test"
    And the user send invite list
    |kushal@gamil.com |
    |priyanka@gamil.com |
    |patel@gamil.com |
    |naveen@gamil.com |
    |gopal@gamil.com |
    |sendeep@gamil.com |
    |ajeesh@gamil.com |
    |sammer@gamil.com |

    And the user validate "View Group Order" text
    * the user validate total participant is 1