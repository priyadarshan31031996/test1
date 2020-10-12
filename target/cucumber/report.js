$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/maveric/demobank/features/login.feature");
formatter.feature({
  "name": "DemoBank Loginpage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Verify User able to Loing DemoBank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user Navigate to DemoBank Logingpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.given1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title of the Loginpage is DemoBank",
  "keyword": "When "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.when2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters AccountNumber and password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.then4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on validation pageThen",
  "keyword": "And "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.and3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters PIN Number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.then5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters FundTransfer details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.user_fill_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on SignOut",
  "keyword": "And "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.signOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US1_TC_001.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});