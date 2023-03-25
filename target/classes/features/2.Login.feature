Feature: Login User Uniqlo
  Scenario: User succesful login into web Uniqlo
    When User input valid email
    And User input valid password
    And User click button login
    Then User go to page home