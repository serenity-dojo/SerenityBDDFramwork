$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/gex.feature");
formatter.feature({
  "name": "premier  test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open a invoice",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I openGex",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on My invoices",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I select the first invoice",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am redirected to the contents of the invoice",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});