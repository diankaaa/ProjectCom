@LG
Feature: Log in


  Scenario: Log in test
    Given user is on the home page
    When user logs in
    Then user click on the Log in as a User button
    And  User page is displayed on the left side
    Then user clicks on the Log in as a Product owner button
    And user PO page is displayed on the left side
    Then user clicks on the Log in as Government staff Admin as a button
    And user Gov Staff page is displayed on the left side
    Then user clicks on Log out button
    And user going to the main page and sees the text home-component works!
