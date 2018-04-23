$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Functionalities.feature");
formatter.feature({
  "name": "Launch application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tagSignup"
    }
  ]
});
formatter.scenario({
  "name": "Login with valid users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tagSignup"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario_Login.launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter URL and view login page",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario_Login.enter_URL_and_view_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"testprodadmin\" and \"core@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Scenario_Login.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario_Login.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario_Login.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Features/Functionality-addAcc.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tagAddAcc"
    }
  ]
});
formatter.scenario({
  "name": "Navigating to Authenticate tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tagAddAcc"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "In landing page click on the settings icon",
  "keyword": "Given "
});
formatter.match({
  "location": "Add_Cloud_Account.in_landing_page_click_on_the_settings_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select cloud accounts option",
  "keyword": "And "
});
formatter.match({
  "location": "Add_Cloud_Account.select_cloud_accounts_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page loads and cloud accounts title appears",
  "keyword": "When "
});
formatter.match({
  "location": "Add_Cloud_Account.page_loads_and_cloud_accounts_title_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Azure Rm option",
  "keyword": "And "
});
formatter.match({
  "location": "Add_Cloud_Account.select_Azure_Rm_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Add cloud account",
  "keyword": "And "
});
formatter.match({
  "location": "Add_Cloud_Account.select_Add_cloud_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Authentication option should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_Cloud_Account.authentication_option_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating fileds in Authentcate tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tagAddAcc"
    },
    {
      "name": "@tag4"
    }
  ]
});
});