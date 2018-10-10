$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("I:/eclipse-workspace/giftcards.bdd/src/main/resources/TestResource/Features/ValidLogin.feature");
formatter.feature({
  "name": "Login function test",
  "description": "Description: Test to check whether a user can follow the process to login and logout of Member Page.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@First"
    },
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
      "name": "@First"
    },
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
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d70.0.3538.16 (16ed95b41bb05e565b11fb66ac33c660b721f778),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NEFAUR\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 70.0.3538.16 (16ed95b41bb05..., userDataDir: C:\\Users\\Asus\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62726}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 90c2eaae54bf52c52b91f9078c7f8610\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:286)\r\n\tat com.giftcards.pages.LoginPage.validUserClickSubmit(LoginPage.java:113)\r\n\tat com.giftcards.steps.Validlogin.user_clicks_on_submit_button(Validlogin.java:56)\r\n\tat ✽.User clicks on submit button(I:/eclipse-workspace/giftcards.bdd/src/main/resources/TestResource/Features/ValidLogin.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User is taken to member page",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_is_taken_to_member_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User logsout",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_logsout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User closes browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Validlogin.user_closes_browser()"
});
formatter.result({
  "status": "skipped"
});
});