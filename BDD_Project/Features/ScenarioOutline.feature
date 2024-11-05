Feature: Data Driven Login

  Scenario Outline: 
    Given User is in the homepage
    When User enters "<UserName>" and "<Password>"
    Then Successful login

    Examples: 
      | UserName | Password |
      | Sham     | Shams    |
      | Mak      |        7 |
