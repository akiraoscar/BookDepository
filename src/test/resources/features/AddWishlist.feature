@addWishlist
Feature: Add Wishlist

  Narrative:
  As a user
  I want to adjust amount in basket
  So that The amount is adjusted

  Background: authentication success
    Given User is on the home page
    When input with right authentication

  Scenario: add to wishlist
    Given User is already on detail book page
    When add to wishlist
    Then item is added to wishlist