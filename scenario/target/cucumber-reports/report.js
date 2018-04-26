$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Scenarios.feature");
formatter.feature({
  "name": "Canopy features",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag01"
    }
  ]
});
formatter.scenario({
  "name": "Create Report Template",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag01"
    },
    {
      "name": "@Scenario01"
    }
  ]
});
formatter.step({
  "name": "launch browser \"chrome\" and \"https://dev-engine.kurtosys.org\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario1.launch_browser_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"at_002\" and \"TechGeek12!\" and click Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Scenario1.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario1.click_on_the_Reports_from_left_navigation_bar_and_Under_Reports_menu_go_to_sub_menu_Reports_Templates_Design()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click create button and On the pop-up, enter any \"AutoTemplate\", choose \"Style template\" as \"BaseTemplateDL\" and click on Save",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.click_create_button_and_On_the_pop_up_enter_any_choose_template_as_and_click_on_Save(String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d65.0.3325.181)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 25 milliseconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593c\u0027, time: \u00272016-02-11 19:06:42\u0027\nSystem info: host: \u0027DESKTOP-HDMMR81\u0027, ip: \u002720.0.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7), userDataDir\u003dC:\\Users\\GNANAM~1\\AppData\\Local\\Temp\\scoped_dir10360_22061}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d65.0.3325.181, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0454e93438540dc98462b3c1d65187a4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:122)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy13.sendKeys(Unknown Source)\r\n\tat utility.CreateTemplatePage.create_template(CreateTemplatePage.java:70)\r\n\tat stepDefinition.Scenario1.click_create_button_and_On_the_pop_up_enter_any_choose_template_as_and_click_on_Save(Scenario1.java:60)\r\n\tat ✽.Click create button and On the pop-up, enter any \"AutoTemplate\", choose \"Style template\" as \"BaseTemplateDL\" and click on Save(Features/Scenarios.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "In the table, in the Name column, enter the unique report template name that you had previously given above step",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario1.in_the_table_in_the_Name_column_enter_the_unique_report_template_name_that_you_had_previously_given_above_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate that the template created by you is present in the table.",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.validate_that_the_template_created_by_you_is_present_in_the_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Logout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario1.logout_from_the_application()"
});
formatter.result({
  "status": "skipped"
});
});