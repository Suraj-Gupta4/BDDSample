@PhaseOne
Feature: CRM Contact & Deal Feature

@RegressionTest
Scenario: Create Contact
Given User is loggedIn
When User create a new contact

Scenario: View Contact
Given User is loggedIn
When User view contact details

@SmokeTest
Scenario: Update Contact
Given User is loggedIn
When User update a contact details

@RegressionTest
Scenario: Create Deal
Given User is loggedIn
When User create a new Deal

@RegressionTest @SmokeTest
Scenario: View Deal
Given User is loggedIn
When User view Deal details

@SmokeTest
Scenario: Update Deal
Given User is loggedIn
When User update a Deal details

Scenario: Logout
When User logout from App