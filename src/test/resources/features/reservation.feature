Feature: Reserve a flight
  As a user I want to book a flight

  Scenario: Reserve a flight
    Given Arcangel wants to select a flight
    When Arcangel wants to make the reservation
    Then Arcangel makes the reservation