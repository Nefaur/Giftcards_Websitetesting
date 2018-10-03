$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("I:/eclipse-workspace/giftcards.bdd/src/main/resources/TestResource/ValidLogin.feature");
formatter.feature({
  "name": "Login function test",
  "description": "Description: Test to check whether a user can follow the process to login and logout of Member Page.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "User enters valids username and password to enter authorized login homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Validlogin.user_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to \"https://www.giftcards.com/\" website",
  "keyword": "When "
});
formatter.match({
  "location": "Validlogin.user_goes_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hovers to sign_in_link",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_hovers_to_sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks sign_in_link",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_clicks_sign_in_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"moltenboy.robin@gmail.com\" as username",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"A1234567@\" as password",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to member page",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_is_taken_to_member_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logsout",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_logsout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_closes_browser()"
});
formatter.result({
  "status": "passed"
});
});