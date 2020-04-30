@fields
Feature: Verify Drop down-AplaNumericField-Numeric fields

  @dropDown
  Scenario Outline: Verify Drop down Selection
    Given user launch application
    When  user accept application permissions "USD" "Create default accounts" "Disable crash reports"
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
    When  user accept application permissions "USD" "Create default accounts" "Disable crash reports"
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
    When  user accept application permissions
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName>"
    And   user tap on save button
    Then  user should see the "<accountName>" in dash board list
    Then  user should select account from the list "<accountName>"
    Then  user fills the "<amount>" field
    And   user should verify amount field with "<invalid>" data
    Then  user click on spend button

    Examples: 
      | accountName     | amount |  | invalid |
      | alphanumeric123 |    500 |  | invalid |

  @pageNavigations
  Scenario Outline: Verify pageNavigation assertions
    Given user launch application
    When  user accept application permissions
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName>"
    And   user tap on save button

    Examples: 
      | accountName |
      | alpha       |

  @search
  Scenario Outline: Verify search field
    Given user launch application
    When  user accept application permissions
    Then  user should see the dash board screen
    And   user tap on plus icon to create new account
    And   user fills new account name field with "<accountName >"
    And   user tap on save button
    And   use select the search button
    Then  user should verify the "<accountName>" in dash board list

    Examples: 
      | accountName     |
      | alphanumeric123 |
