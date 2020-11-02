$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfull login with Valid Credentials",
  "description": "",
  "id": "login;successfull-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\\\u0027\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "\"Catalog\" tab should be present",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 4471375100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\\\u0027",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 1387932400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 328415300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5266059900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 119226200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Catalog",
      "offset": 1
    }
  ],
  "location": "Steps.tab_should_be_present(String)"
});
formatter.result({
  "duration": 96538600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_log_out_link()"
});
formatter.result({
  "duration": 5155376200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 33733700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 695055900,
  "status": "passed"
});
});