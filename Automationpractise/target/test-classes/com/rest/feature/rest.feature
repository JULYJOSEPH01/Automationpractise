Feature: Application requires API	

  Scenario: 	Verify get method for list users
    Given User specify end point"https://reqres.in/api/unknown/2"
    And User send get request
    Then user print response
    When User verify response status code is equal to 200