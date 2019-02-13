Feature: Login into application

  Scenario Outline: Health & Fitness Tag displayed test
    Given Initilize browser with CHromeBrowser
    And Navigate to "https://www.hsn.com/"
    And click health button in the main menu
    When confirm that health and fittness tag is displayed
    Then click Home button to get back to HomePage
    Given move the cursor on to member login button, click on "Create Account" button
    And click on no thanks button
    When user fills <firstname> <lastname> <emailID> <emailIDconfirm> <password> <passwordConfirm> sections and click on submit button
    Then Verify that new user account form is succesfully submitted
    And quit browser
    Examples:
      |  |firstname||lastname||emailID                ||emailIDconfirm          ||password  ||passwordConfirm|
      |  |michael  ||schumaer||mschumaer@hayda.com    ||mschumaer@hayda.com     ||abcd12345 ||abcd12345      |
      |  |john     ||brown   ||johnbrown@hayda.com    ||johnbrown@hayda.com     ||Fadd123   ||Fadd123        |
      |  |jenny    ||johnes  ||johnesjenny@hayda.com  ||johnesjenny@hayda.com   ||pARIsd123 ||pARIsd123      |






