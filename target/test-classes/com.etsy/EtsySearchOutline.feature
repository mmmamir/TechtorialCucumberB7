@outline
Feature: Etsy Search With Scenario Outline

  Background: Navigate
    Given the user navigates to the "https://www.Etsy.com"

  Scenario Outline: Etsy Search validation
    When the user search with "<searchValue>"
    Then the user should see the title "<title>"
    Examples:
      | searchValue | title       |
      | Hat         | Hat \| Etsy |
      | Key         | Key \| Etsy |
      | Pin         | Pin \| Etsy |

  # To organize files:
    # command + option + L for mac
    # control + alt + L for windows