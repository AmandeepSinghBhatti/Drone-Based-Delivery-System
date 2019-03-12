Feature: Net Promoter Score calculation

Scenario: Verify the nps is calculated as per formula

Given a list of orders
When list is passed to the system
Then nps is calculated correctly as per requirement

Scenario: verify the delivery time calculation

Given coordinates and timestamp
When coordinates and timestamp are given to the system
Then time for delivery is calculated correctly

