Feature: View product details

  @loggedIn
  Scenario: User views details of a product
    Given user navigates to home page
    And home page is visible
    When user clicks on Products button
    Then user should be navigated to All Products Page
    And products list should be visible
    When user clicks on View Products of "Premium Polo T-Shirts" product
    Then product detail page should be displayed
    And product details should be visible
