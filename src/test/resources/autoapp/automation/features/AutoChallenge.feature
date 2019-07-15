@automationChallenge
Feature: Automation Challenge
@important
  Scenario Outline: Validate incorrect email address
    Given I am in HomePage
    And click Sign In
    When I enter incorrect <emailaddress>
    Then Validate the errorMessage

    Examples: 
      | emailaddress | 
      | demo2        | 

  Scenario Outline: Validate the selected colour of the dress
    Given I am in HomePage
    When Select the <colour> of the T-Shirt and add to cart
    Then Validate the <productName>, <colour> and <quantity>

    Examples: 
      | colour | productName                 | quantity |
      | blue   | Faded Short Sleeve T-shirts |        1 |
      
      
   Scenario Outline: Check whether Megamenu works  
   Given I am in HomePage
   When I navigate to summerdresses page using the megamenu 
   Then Title is validated <title>
   
   Examples:
   |title|
   |Summer Dresses - My Store|
   
   
   
   
