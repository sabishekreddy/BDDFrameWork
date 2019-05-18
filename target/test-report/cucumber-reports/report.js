$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginSample.feature");
formatter.feature({
  "line": 2,
  "name": "validate the login Functionality for utest",
  "description": "",
  "id": "validate-the-login-functionality-for-utest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sprint1"
    }
  ]
});
formatter.before({
  "duration": 9417890,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "validate the negative login functionality",
  "description": "",
  "id": "validate-the-login-functionality-for-utest;validate-the-negative-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@US0003"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to utest url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter email \"EMAIL\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "validate the error message \"EXPECTED\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.navigate_to_utest_url()"
});
formatter.result({
  "duration": 19893870560,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_sign_in_link()"
});
formatter.result({
  "duration": 7212835310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EMAIL",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.enter_email(String)"
});
formatter.result({
  "duration": 5197845255,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_sign_in_button()"
});
formatter.result({
  "duration": 6120584117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EXPECTED",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.validate_the_error_message(String)"
});
formatter.result({
  "duration": 99435200,
  "status": "passed"
});
formatter.after({
  "duration": 2223192823,
  "status": "passed"
});
});