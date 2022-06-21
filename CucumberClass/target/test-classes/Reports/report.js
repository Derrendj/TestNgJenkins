$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login.feature");
formatter.feature({
  "name": "to verify facebook website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "to verify facebook login details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to enter into the adactin url",
  "keyword": "Given "
});
formatter.step({
  "name": "to enter login \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "to click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "enter the \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoom Type\u003e\",\"\u003cNumber of Rooms\u003e\",\"\u003cCheck In Date\u003e\",\"\u003cCheck Out Date\u003e\",\"\u003cAdults per Room\u003e\" and \"\u003cChildren per Room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "select hotel and click continue",
  "keyword": "And "
});
formatter.step({
  "name": "enter the \"\u003cFirst Name\u003e\",\"\u003cLast Name\u003e\",\"\u003cBilling address\u003e\",\"\u003cCredit Card No\u003e\",\"\u003cCredit Card Type\u003e\",\"\u003cExpiry Month\u003e\",\"\u003cExpiry Year\u003e\" and \"\u003cCVV\u003e\".",
  "keyword": "And "
});
formatter.step({
  "name": "user should get the order id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Location",
        "Hotels",
        "Room Type",
        "Number of Rooms",
        "Check In Date",
        "Check Out Date",
        "Adults per Room",
        "Children per Room",
        "First Name",
        "Last Name",
        "Billing address",
        "Credit Card No",
        "Credit Card Type",
        "Expiry Month",
        "Expiry Year",
        "CVV"
      ]
    },
    {
      "cells": [
        "SubashS96",
        "Subash@S96",
        "Sydney",
        "Hotel Sunshine",
        "Standard",
        "1 - One",
        "16/11/2021",
        "17/11/2021",
        "2",
        "1",
        "Subash",
        "Karan",
        "Chennai",
        "1234567890123456",
        "VISA",
        "March",
        "2022",
        "263"
      ]
    }
  ]
});
formatter.scenario({
  "name": "to verify facebook login details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "to enter into the adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "loginstep.to_enter_into_the_adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter login \"SubashS96\" and \"Subash@S96\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginstep.to_enter_login_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginstep.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"Sydney\",\"Hotel Sunshine\",\"Standard\",\"1 - One\",\"16/11/2021\",\"17/11/2021\",\"2\" and \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginstep.enter_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select hotel and click continue",
  "keyword": "And "
});
formatter.match({
  "location": "loginstep.select_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"Subash\",\"Karan\",\"Chennai\",\"1234567890123456\",\"VISA\",\"March\",\"2022\" and \"263\".",
  "keyword": "And "
});
formatter.match({
  "location": "loginstep.enter_the_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstep.user_should_get_the_order_id()"
});
formatter.result({
  "status": "passed"
});
});