@fieldsValidations
Feature: Verify Drop down-AplaNumericField-Numeric fields

  @dropDown
  Scenario Outline: Verify Drop down Selection
    Given user launch application
    When  user accept application permissions "USD" "Let me handle it" "Disable crash reports"
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName>"
    Then  user selects the "<currency>" from the drop down

    Examples: 
      | accountName    | currency        |
      | dropdownselect | USD - US Dollar |

  @aplhaNumeric
  Scenario Outline: Verify alphaNumeric input field
    Given user launch application
    When  user accept application permissions "USD" "Let me handle it" "Disable crash reports"
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName>"
    And   user tap on save button
    Then  user should see the "<accountName>" in dash board list

    Examples: 
      | accountName     |
      | alphanumeric123 |

  @numeric
  Scenario Outline: Verify numeric field Selection
    Given user launch application
    When  user accept application permissions "USD" "Let me handle it" "Disable crash reports"
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName>"
    And   user tap on save button
    Then  user should see the "<accountName>" in dash board list
    Then  user should select account from the list "<accountName>"
    And   user tap on plus icon to create new transaction
    Then  user fills the "<amount>" field
    Then  user click on save button in new transaction page
    And   user should verify amount field allows only numberic values

    Examples: 
      | accountName     | amount |
      | alphanumeric123 | 500*   |
      
  @pageNavigations
  Scenario: Verify pageNavigation assertions
    Given  user launch application
    When   user validates "Welcome to GnuCash" screen title
    When   user tap on next button
    And    user validates "Default Currency" screen title
    When   user tap on next button
    And    user validates "Account Setup" screen title
    When   user tap on next button
    And    user validates "Feedback Options" screen title

  @search
  Scenario Outline: Verify search field
    Given user launch application
    When user accept application permissions "USD" "Let me handle it" "Disable crash reports"
    Then user should see the dash board screen
    And user tap on plus icon to create new account
    And user fills new account name field with "<accountName>"
    And user tap on save button
    And user search for created account "<accountName>"
    Then user should see the "<accountName>" in dash board list

    Examples: 
      | accountName     |
      | alphanumeric123 |
