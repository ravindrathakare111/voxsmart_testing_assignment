Feature: functional tests for coinmarketcap

  Scenario Outline: Open coinmarketcap and verify results count 100 is displayed on 1st page
    And I sing in as <user> on coinmarketcap
    Then I verify <result_count> results are displayed on page <page_no>
    Examples:
      | user               | result_count | page_no |
      | xracing@3kk43.com  |  100         |   1     |


  Scenario Outline: Verify that cryptocurrencies are succefully added in watchList
    And I sing in as <user> on coinmarketcap
    Then I verify <result_count> results are displayed on page <page_no>
    And I select between 5 random cryptocurrencies and add to watchlist
    And I open the watchlist in a different browser tab
    Then I verify all the options selected are added to the watchlist
    Examples:
      | user               | result_count | page_no |
      | xracing@3kk43.com  |  100         |   1     |

  Scenario Outline: Verify historical data of cryptocurrencies
    And I sing in as <user> on coinmarketcap
    Then I verify <result_count> results are displayed on page <page_no>
    And I navigate and record historical data of the <cryptocurreny> to current date
    And I verify data recorded in previous step with date filter
    Then I verify all the options selected are added to the watchlist
    Examples:
      | user               | result_count | page_no | cryptocurreny |
      | xracing@3kk43.com  |  100         |   1     | etherium      |