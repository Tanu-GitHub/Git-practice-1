
Feature: Search a product in cart
  
 Scenario: Positive test for search product
    Given User is an greencart landing page
    When User searched with shortname "Tom" and extracted with original product
    Then User searched for same "Tom" shrotname in offers page 
    And Validate product name in offer page and matches with landing page

