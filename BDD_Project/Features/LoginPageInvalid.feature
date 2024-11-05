
Feature: Invalid Login

Background:
  Given User is in the homepage

Scenario: Invalid Login
  When User enters invalid credentials
  Then Unsuccessful login with error message