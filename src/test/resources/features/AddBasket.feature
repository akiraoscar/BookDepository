@addBasket
Feature: Add Basket

  Narrative:
  As a user
  I want to adjust amount in basket
  So that The amount is adjusted

  Background: authentication success
    Given User is on the home page
    When input with right authentication

  Scenario: adjust amount in basket
    Given User is already add to basket
    When adjust amount 8 in basket
    Then amount 8 is adjusted