Feature: Search product
Scenario: : Searching for a substring of the id

Given there is a product with id 1
When I search with 1
Then 1 product should have been found with id 1
