@authentication
Feature: Authentication

  Narrative:
  As a user
  I want another people cannot access my account
  So that I trust my data is secure

  Scenario: authentication failed
    Given User is on the home page
    When input with wrong password
    Then notification problem is displayed