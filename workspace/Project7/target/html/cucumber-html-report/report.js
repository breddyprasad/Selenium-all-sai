$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "verifying the cucumber",
  "description": "",
  "id": "verifying-the-cucumber",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "login scenario",
  "description": "",
  "id": "verifying-the-cucumber;login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Browser url and credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "we enter credentials",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.testGiven()"
});
formatter.result({
  "duration": 7985611252,
  "error_message": "java.io.IOException: Input is invalid JSON; does not start with \u0027{\u0027 or \u0027[\u0027, c\u003d-1\r\n\tat com.cedarsoftware.util.io.JsonReader.readJsonObject(JsonReader.java:1494)\r\n\tat com.cedarsoftware.util.io.JsonReader.readObject(JsonReader.java:707)\r\n\tat com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview.readFileContent(CucumberResultsOverview.java:76)\r\n\tat com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview.executeFeaturesOverviewReport(CucumberResultsOverview.java:153)\r\n\tat StepDefinitions.Login.testGiven(Login.java:26)\r\n\tat ✽.Given Browser url and credentials(login.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.testWhen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.testThen()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 33,
  "name": "logout scenario",
  "description": "",
  "id": "verifying-the-cucumber;logout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "we clicked on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "logout should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.testWhen2()"
});
formatter.result({
  "duration": 3092277,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinitions.Login.testWhen2(Login.java:46)\r\n\tat ✽.When we clicked on logout button(login.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.testThen2()"
});
formatter.result({
  "status": "skipped"
});
});