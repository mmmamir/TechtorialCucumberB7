Feature: DuckDuckGo search functionality

  Scenario: search for Selenium

    Given user is on duckduckgo home page
    When user searches for selenium
    Then user sees result about selenium only


    #Go to the DuckDuckGo website search Selenium and validate search
    # results contains Selenium keywords