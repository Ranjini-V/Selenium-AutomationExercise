Feature: Cart functionality

Background:
  Given user is logged in

Scenario: Add product to cart and verify summary
  Given user is on products page
  When user adds product "Sleeveless Dress" to cart
  And user views the cart
  Then "Sleeveless Dress" should be visible in cart
