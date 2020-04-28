Feature: Displate tests

  Scenario:
    Given Homepage is open
    And First element is clicked in "Maps" section on home page
    And Product page is loaded
    And 'Select finish & add frame' button is clicked
    And "Gloss" finished is picked
    And Product is added to cart
    And Cart on navbar is clicked
    And 'I have a discount code' button is clicked
    When Discount code "FREE" is applied
    Then Price is reduced by 22 percent
