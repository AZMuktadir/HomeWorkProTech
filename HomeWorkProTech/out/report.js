$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mct_AccountActivities_Validation.feature");
formatter.feature({
  "line": 3,
  "name": "Account holder Activities Mechanism",
  "description": "  In order to get all membership benefit from multicart ecommerce\n\tI want to register myself and validate my profile with my account activites like change password etc.",
  "id": "account-holder-activities-mechanism",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Successfull registration with validate account holder activites",
  "description": "",
  "id": "account-holder-activities-mechanism;successfull-registration-with-validate-account-holder-activites",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Act"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I land on multicart landing page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I navigate to registration page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I complete registration for MR Fname",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I expect to see profile name MR Fname",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to My account page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I validate all My account activites",
  "keyword": "And "
});
formatter.match({
  "location": "MctMyAccountActSteps.i_open_browser_chrome()"
});
formatter.result({
  "duration": 6113335700,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_land_on_multicart_landing_page()"
});
formatter.result({
  "duration": 1213695600,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_navigate_to_registration_page()"
});
formatter.result({
  "duration": 2313674900,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_complete_registration_for_MR_Fname()"
});
formatter.result({
  "duration": 3179140700,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_expect_to_see_profile_name_MR_Fname()"
});
formatter.result({
  "duration": 28367900,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_navigate_to_My_account_page()"
});
formatter.result({
  "duration": 564184300,
  "status": "passed"
});
formatter.match({
  "location": "MctMyAccountActSteps.i_validate_all_My_account_activites()"
});
formatter.result({
  "duration": 2002058900,
  "error_message": "java.lang.NullPointerException\r\n\tat mct_account_pageobjectmodel.HomePage.validateAccountAct(HomePage.java:58)\r\n\tat mct_accountActivitesValidate.MctMyAccountActSteps.i_validate_all_My_account_activites(MctMyAccountActSteps.java:72)\r\n\tat ✽.And I validate all My account activites(Mct_AccountActivities_Validation.feature:15)\r\n",
  "status": "failed"
});
});