
Feature: Valid Login

Background:
  Given User is in the homepage

Scenario: Valid Login
  When User enters valid credentials
  Then Successful login