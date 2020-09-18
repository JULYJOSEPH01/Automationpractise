@shoppingdresses
Feature: Purchasing dresses using automation testscript

  Background: User signin the application
    Given User signin the application

  Scenario Outline: verify user enable to signin functionality properly
    Then verify user should  enter "<emailid>" in specific textbox
    And Verify user shoud enter "<password>" in textbox
    And Verify user should click on the signin button
    Examples: 
      | emailid               | password   |
      | julytilda21@gmail.com | joseph1990 |
    
    @Sc10
  Scenario: Verify user should click on search box
    And Verify user should enter data in text field
    And Verify user should click on search button
    When Verify user should enter  into new page

    @Sc10
  Scenario: To verify user enable to select dresses
    Then Verify user should clik on add to cart button
    And Verify user should click on proceed
    And Verify user should click on proceed in address
    When user should purchased sucessfully
