Feature:Verify Home page
  Scenario:Verify prime option in home page
    Given user is on home page
    When User click on Prime label in home page
    Then Verify user is on Prime Page
    And User click on login to join prime button
    And Verify user is redirected to create account page
    And user enters the phone number in create accout page
    And user click on continue button in create account page
    And users enters the password in password text box
    And user clicks on back button "twice"
    Then user is on home page
    And user click on open menu label in home page
    And user click on best sellers tag in the menu bar
    Then verify user is on best seller page
    And user click on a product in best seller page
    Then verify user is redirected to Product detail page
#    And verify the product name in the PDP
