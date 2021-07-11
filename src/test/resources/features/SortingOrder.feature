@sortingOrder
Feature: Sorting Order

  Narrative:
  As a user
  I want to sort by price
  So that I can get the best price

  Background: authentication success
    Given User is on the home page
    When input with right authentication

  Scenario: sorting order
    Given User is already search a book
    When sort by Price, low to high
    Then result is sorted by Price, low to high