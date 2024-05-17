Feature: Succesful Purchase

  Scenario: Purchase items
    Given navigated to loginpage
    And passing valid credentials
    When add items to cart
    And verify cart items
    And provide delivery details
    And confirm order and payment
    Then verify order confirmation
