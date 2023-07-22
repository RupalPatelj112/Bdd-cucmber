$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dashboardPage.feature");
formatter.feature({
  "line": 2,
  "name": "Open Dashboard",
  "description": "\nAs a qa engineer\nI wanted to open the dashboard\nSo i can prove automation work as expected",
  "id": "open-dashboard",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15723734416,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Land into main page and click on login",
  "description": "",
  "id": "open-dashboard;land-into-main-page-and-click-on-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Launch the mwi website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "i can see its correct page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPage.launch_the_mwi_website()"
});
formatter.result({
  "duration": 8041836750,
  "status": "passed"
});
formatter.match({
  "location": "DashboardPage.i_can_see_its_correct_page()"
});
formatter.result({
  "duration": 2067029917,
  "error_message": "java.lang.AssertionError\n\tat com.dashboard.stepDefination.DashboardPage.i_can_see_its_correct_page(DashboardPage.java:20)\n\tat ✽.Then i can see its correct page(dashboardPage.feature:12)\n",
  "status": "failed"
});
formatter.after({
  "duration": 592982042,
  "status": "passed"
});
});