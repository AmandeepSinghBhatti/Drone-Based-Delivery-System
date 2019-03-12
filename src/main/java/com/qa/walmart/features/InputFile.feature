Feature: Input File for new Orders

Scenario: Verify a new Order is created

Given order Number, coordinates, timeStamp
When these values are sent for creating an Order 
Then a new customer order is created