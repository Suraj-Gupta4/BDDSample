@PhaseTwo
Feature: CRM Task Feature

Background: User Login
When User is loggedIn


@RegressionTest
Scenario: Create Task
#Given User is loggedIn
When User create a new Task

Scenario: View Task
#Given User is loggedIn
When User view Task details

@SmokeTest
Scenario: Update Task
#Given User is loggedIn
When User update a Task details