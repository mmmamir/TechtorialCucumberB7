Feature: Validation of Product Page

  @product
  Scenario: Validation of New Product Creation
    Given the user navigates product website home page
    When the user enter the product info "MyMoney" and "4"
    And the user enters the address info "Techtorial", "2200 E Devon", "Des Plaines", "IL", "60018"
    * the user enter the card info "Visa", "1122334556", "05/22"
    And the user validate success message
    Then the user validate product details "MyMoney", "4", "Techtorial", "2200 E Devon", "Des Plaines", "IL", "60018", "Visa", "1122334556", "05/22"

  @product @outline
  Scenario Outline: Validation of New Product Creation
    Given the user navigates product website home page
    When the user enter the product info "<productName>" and "<quantity>"
    And the user enters the address info "<name>", "<street>", "<city>", "<state>", "<zipcode>"
    * the user enter the card info "<cardType>", "<cardNumber>", "<expireDate>"
    And the user validate success message
    Then the user validate product details "<productName>", "<quantity>", "<name>", "<street>", "<city>", "<state>", "<zipcode>", "<cardType>", "<cardNumber>", "<expireDate>"
    Examples:
    | productName | quantity | name        | street       | city        | state | zipcode | cardType        | cardNumber       | expireDate |
    | MyMoney     | 4        | Techtorial  | 2200 E Devon | Des Plaines | IL    | 60018   | Visa            | 1122334556       | 05/22      |
    | FamilyAlbum | 2        | Academy     | 2200 E Devon | Austin      | TX    | 90007   | MasterCard      | 4444555566667777 | 08/21      |
    | ScreenSaver | 5        | Techtorial1 | 2200 E Devon | Chicago     | IL    | 60066   | American Express | 5555666677778888 | 04/22      |
    | ScreenSaver | 5        | Techtorial1 | 2200 E Devon | Chicago     | IL    | 60066   | American Express | 5555666677778888 | 04/22      |