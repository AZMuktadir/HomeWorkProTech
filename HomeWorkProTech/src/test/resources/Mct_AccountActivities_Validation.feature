

Feature: Account holder Activities Mechanism
    In order to get all membership benefit from multicart ecommerce
  	I want to register myself and validate my profile with my account activites like change password etc.

  @Act
  Scenario: Successfull registration with validate account holder activites
    Given I open browser chrome
    And I land on multicart landing page
    When I navigate to registration page
    And I complete registration for MR Fname
    And I expect to see profile name MR Fname
    Then I navigate to My account page 
    And I validate all My account activites 

