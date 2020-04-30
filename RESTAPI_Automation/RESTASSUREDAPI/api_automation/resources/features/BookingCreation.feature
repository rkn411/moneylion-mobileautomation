@bookingCreation
Feature: verify create booking and verify booking ID .

  Scenario: Create booking and verify booking ID generated
    When User submit the post request as per the data in  Json/property file 
    And User should validate success status code
    And User should validate response for booking id

   