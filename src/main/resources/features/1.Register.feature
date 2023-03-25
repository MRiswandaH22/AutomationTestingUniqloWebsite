Feature: Register User Uniqlo
  Scenario: User succesful register into web Uniqlo
    Given User open browser and url
    When User enter valid email
    And User enter valid password
    And User click button showpassword
    And User enter valid codepost
    And User enter birthdate
    And User enter gender
    And User click button agreement
    And User click button register
    Then User go to page sendcode