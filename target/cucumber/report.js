$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/maveric/demobank/features/AccountDetails.feature");
formatter.feature({
  "name": "verify details for demo bank",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify login details with valid credetials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on bank page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to enter the \"\u003cPIN number\u003e\" and Click on Validate PIN",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "PIN number"
      ]
    },
    {
      "cells": [
        "1234556666",
        "MavDemo@01",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify login details with valid credetials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on bank page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_is_on_bank_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"1234556666\" and \"MavDemo@01\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.maveric.demobank.common.SeMethods.locateElement(SeMethods.java:111)\r\n\tat com.maveric.demobank.stepdef.US1_TC_001.then4(US1_TC_001.java:60)\r\n\tat com.maveric.demobank.stepdef.US2_TC_002.user_enters_username_and_password(US2_TC_002.java:58)\r\n\tat ✽.user enters \"1234556666\" and \"MavDemo@01\"(file:///C:/Users/admin/Documents/Maveric%20Systems/Materials/Selenium/GroupActivity2/DemoBank/src/test/java/com/maveric/demobank/features/AccountDetails.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter the \"12345\" and Click on Validate PIN",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_has_to_enter_the_PIN_number_and_Click_on_Validate_PIN(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verify account details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the account details button",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_click_the_account_details_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using link text\u003dAccount Details\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN-PC\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.maveric.demobank.stepdef.US2_TC_002.user_click_the_account_details_button(US2_TC_002.java:101)\r\n\tat ✽.user click the account details button(file:///C:/Users/admin/Documents/Maveric%20Systems/Materials/Selenium/GroupActivity2/DemoBank/src/test/java/com/maveric/demobank/features/AccountDetails.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "account details page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.account_details_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verify account statement",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "use click the account statement button",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.use_click_the_account_statement_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN-PC\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53214}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9fe96fda3c4ad764ee81dbc2f7a90b97\n*** Element info: {Using\u003dlink text, value\u003dAccount Statement}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.maveric.demobank.stepdef.US2_TC_002.use_click_the_account_statement_button(US2_TC_002.java:81)\r\n\tat ✽.use click the account statement button(file:///C:/Users/admin/Documents/Maveric%20Systems/Materials/Selenium/GroupActivity2/DemoBank/src/test/java/com/maveric/demobank/features/AccountDetails.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "transaction statement is displayeduser user is on bank page on bank page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "verify the fund tranfers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the fund transfer button",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_click_the_fund_transfer_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN-PC\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53214}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9fe96fda3c4ad764ee81dbc2f7a90b97\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Fund Transfers\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.maveric.demobank.stepdef.US2_TC_002.user_click_the_fund_transfer_button(US2_TC_002.java:120)\r\n\tat ✽.user click the fund transfer button(file:///C:/Users/admin/Documents/Maveric%20Systems/Materials/Selenium/GroupActivity2/DemoBank/src/test/java/com/maveric/demobank/features/AccountDetails.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user fill the form",
  "keyword": "When "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_fill_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click the transfer button",
  "keyword": "And "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.click_the_transfer_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the OTP page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.the_OTP_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the OTP and Clicking validate VAT",
  "keyword": "When "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_enter_the_OTP_and_Clicking_validate_VAT()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "successful transfer page with transaction details is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.successful_transfer_page_with_transaction_details_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verify the sign out",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click the sign out button",
  "keyword": "Given "
});
formatter.match({
  "location": "com.maveric.demobank.stepdef.US2_TC_002.user_click_the_sign_out_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ADMIN-PC\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53214}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9fe96fda3c4ad764ee81dbc2f7a90b97\n*** Element info: {Using\u003dlink text, value\u003dSign Out}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.maveric.demobank.stepdef.US2_TC_002.user_click_the_sign_out_button(US2_TC_002.java:179)\r\n\tat ✽.user click the sign out button(file:///C:/Users/admin/Documents/Maveric%20Systems/Materials/Selenium/GroupActivity2/DemoBank/src/test/java/com/maveric/demobank/features/AccountDetails.feature:29)\r\n",
  "status": "failed"
});
});