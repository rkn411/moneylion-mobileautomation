$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fieldsValidations.feature");
formatter.feature({
  "name": "Verify Drop down-AplaNumericField-Numeric fields",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fieldsValidations"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify Drop down Selection",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dropDown"
    }
  ]
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.step({
  "name": "user fills new account name field with \"\u003caccountName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects the \"\u003ccurrency\u003e\" from the drop down",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountName",
        "currency"
      ]
    },
    {
      "cells": [
        "dropdownselect",
        "USD - US Dollar"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Drop down Selection",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fieldsValidations"
    },
    {
      "name": "@dropDown"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_accept_application_permissions(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_see_the_dash_board_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_plus_icon_to_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills new account name field with \"dropdownselect\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_fills_new_account_name_field_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the \"USD - US Dollar\" from the drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_selects_the_from_the_drop_down(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify Drop down Selection");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify alphaNumeric input field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@aplhaNumeric"
    }
  ]
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.step({
  "name": "user fills new account name field with \"\u003caccountName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see the \"\u003caccountName\u003e\" in dash board list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountName"
      ]
    },
    {
      "cells": [
        "alphanumeric123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify alphaNumeric input field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fieldsValidations"
    },
    {
      "name": "@aplhaNumeric"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_accept_application_permissions(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_see_the_dash_board_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_plus_icon_to_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills new account name field with \"alphanumeric123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_fills_new_account_name_field_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the \"alphanumeric123\" in dash board list",
  "keyword": "Then "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_should_see_the_in_dash_board_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Verify alphaNumeric input field");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify numeric field Selection",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@numeric"
    }
  ]
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.step({
  "name": "user fills new account name field with \"\u003caccountName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.step({
  "name": "user should see the \"\u003caccountName\u003e\" in dash board list",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select account from the list \"\u003caccountName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user tap on plus icon to create new transaction",
  "keyword": "And "
});
formatter.step({
  "name": "user fills the \"\u003camount\u003e\" field",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on save button in new transaction page",
  "keyword": "Then "
});
formatter.step({
  "name": "user should verify amount field allows only numberic values",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountName",
        "amount"
      ]
    },
    {
      "cells": [
        "alphanumeric123",
        "500*"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify numeric field Selection",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fieldsValidations"
    },
    {
      "name": "@numeric"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_accept_application_permissions(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_see_the_dash_board_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_plus_icon_to_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills new account name field with \"alphanumeric123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_fills_new_account_name_field_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the \"alphanumeric123\" in dash board list",
  "keyword": "Then "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_should_see_the_in_dash_board_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select account from the list \"alphanumeric123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_select_account_from_the_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on plus icon to create new transaction",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_plus_icon_to_create_new_transaction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the \"500*\" field",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_fills_the_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on save button in new transaction page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify amount field allows only numberic values",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_verify_amount_field_allows_only_numberic_values()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Verify numeric field Selection");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify pageNavigation assertions",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fieldsValidations"
    },
    {
      "name": "@pageNavigations"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Welcome to GnuCash\" screen title",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_validates_screen_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on next button",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_tap_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Default Currency\" screen title",
  "keyword": "And "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_validates_screen_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on next button",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_tap_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Account Setup\" screen title",
  "keyword": "And "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_validates_screen_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on next button",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_tap_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Feedback Options\" screen title",
  "keyword": "And "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_validates_screen_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Verify pageNavigation assertions");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify search field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.step({
  "name": "user fills new account name field with \"\u003caccountName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.step({
  "name": "user search for created account \"\u003caccountName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should see the \"\u003caccountName\u003e\" in dash board list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountName"
      ]
    },
    {
      "cells": [
        "alphanumeric123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify search field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fieldsValidations"
    },
    {
      "name": "@search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user accept application permissions \"USD\" \"Let me handle it\" \"Disable crash reports\"",
  "keyword": "When "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_accept_application_permissions(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the dash board screen",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinitions.user_should_see_the_dash_board_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on plus icon to create new account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_plus_icon_to_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills new account name field with \"alphanumeric123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_fills_new_account_name_field_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tap on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_tap_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for created account \"alphanumeric123\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountStepDefinitions.user_search_for_created_account(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the \"alphanumeric123\" in dash board list",
  "keyword": "Then "
});
formatter.match({
  "location": "GnuCashSetupStepDefinitions.user_should_see_the_in_dash_board_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Verify search field");
formatter.after({
  "status": "passed"
});
});