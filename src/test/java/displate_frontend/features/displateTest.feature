Feature: Displate tests

  Scenario: Simple smoke test to check if everything works fine
    Given Homepage is open
    Then Promo code is available at the top

  Scenario: The test you requested for
    Given Homepage is open
    And User search "Nurburgring"
    And User filter by category 'Maps'
    And First result is clicked result section
    And Product page is loaded
#    And 'Select finish & add frame' button is clicked
    And 'Gloss' finished is picked
    And Product is added to cart
    And Cart on navbar is clicked
    And Cart page is loaded
    And "United States" is picked in 'Ship to' select
    And 'I have a discount code' button is clicked
    When Discount code from navbar is applied
    Then Price is lower then 67.29 USD
