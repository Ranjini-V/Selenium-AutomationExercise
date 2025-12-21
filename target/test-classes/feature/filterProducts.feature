Feature: Filter products on home page

@loggedIn
Scenario: Filter products by selecting Women -> Tops category
  Given user is on the home page
  When user selects "Women" category
  And user selects "Tops" subcategory
  Then women's tops products should be displayed

@productsDisplayed 
Scenario: Add top to cart 
When user clicks add to cart
And user clicks on "View Cart"
Then user is navigated to Cart Page


