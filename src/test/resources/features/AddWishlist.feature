@addWishlist
Feature: Add Wishlist

  Narrative:
  As a user
  I want to add to wishlist
  So that User can buy when they ready

  Background: authentication success
    Given User is on the home page
    When input with right authentication

  Scenario: add to wishlist
    Given User is already on detail book page
    When add to wishlist
    Then item is added to wishlist

  Scenario: delete wishlist
    When delete wishlist