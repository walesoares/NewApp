$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User is able to navigate to from homepage",
  "description": "",
  "id": "user-is-able-to-navigate-to-from-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User is on the home page",
  "description": "",
  "id": "user-is-able-to-navigate-to-from-homepage;user-is-on-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "when a user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "when the user click the sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "then the login page should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("SignupPage.feature");
formatter.feature({
  "line": 3,
  "name": "Sign in as a registered user",
  "description": "",
  "id": "sign-in-as-a-registered-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@test1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User has the right username and wrong password",
  "description": "",
  "id": "sign-in-as-a-registered-user;user-has-the-right-username-and-wrong-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "when the user is on the sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "when user chooses to sign in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user provides the following details",
  "rows": [
    {
      "cells": [
        "Email address",
        "Password"
      ],
      "line": 11
    },
    {
      "cells": [
        "walesoares@gmail",
        "lagos"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "when the user clickk sign in",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should get an error",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});