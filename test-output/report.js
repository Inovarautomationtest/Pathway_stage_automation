$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Pathway_finalscript/Pathway_stage/src/test/java/com/Pathway_stage/Base/Featurefiles/FullCancelationFlow.feature");
formatter.feature({
  "line": 1,
  "name": "check the full Cancelation flow for all Scenario",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Rise a Full Cancelation Request with first Market User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-first-market-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Marketuser1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "enter url application into \"chrome\" for full cancelation flow with \"Stage environement\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "first Market User login with valid creditinals for full cancelation process with \"stage\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Rise a full Cancelation Request with first Market User 1712",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "logout first MarketUser after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 28
    },
    {
      "val": "Stage environement",
      "offset": 68
    }
  ],
  "location": "FullCancelationflow.enter_url_application_into_for_full_cancelation_flow(String,String)"
});
formatter.result({
  "duration": 23706260700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stage",
      "offset": 82
    }
  ],
  "location": "FullCancelationflow.first_Market_User_login_with_valid_creditinals_for_full_cancelation_process(String)"
});
formatter.result({
  "duration": 34586344900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1712",
      "offset": 55
    }
  ],
  "location": "FullCancelationflow.rise_a_full_Cancelation_Request_with_first_Market_User(int)"
});
formatter.result({
  "duration": 98487257700,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_first_MarketUser_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 60402800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Check the status of the  full Cancelation application with first RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the--full-cancelation-application-with-first-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@RPMuser1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "first RPM User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "check the \"Approved\" status a Cancelation Request with first RPM User 1712",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "logout First RPM User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.first_RPM_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 59298737500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1712",
      "offset": 70
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_first_RPM_User(String,int)"
});
formatter.result({
  "duration": 45858964400,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_First_RPM_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 93661600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Check the status of the full Cancelation application  with First NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-application--with-first-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@NOCuser1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "first NOC User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "check the \"Approved\" status a Cancelation Request with first NOC User 1712",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "logout First NOC User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.first_NOC_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 60059655200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1712",
      "offset": 70
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_first_NOC_User(String,int)"
});
formatter.result({
  "duration": 59892359500,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_First_NOC_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 76307700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Check the status of the full cancelation application  with First Legal User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-application--with-first-legal-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@LegalUser1"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "First Legal User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Request send to FCC of full cancelation process with  First Legal User 1712",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "logout First Legal User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.first_Legal_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 52967196200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1712",
      "offset": 71
    }
  ],
  "location": "FullCancelationflow.request_send_to_FCC_of_full_cancelation_process_with_First_Legal_User(int)"
});
formatter.result({
  "duration": 48183346600,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_First_Legal_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 86871100,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Rise a Full Cancelation Request with second Market User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-second-market-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Marketuser2"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "second Market User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Rise a Cancelation Request with second Market User 1711",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "logout second MarketUser after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.second_Market_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 55688806400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1711",
      "offset": 51
    }
  ],
  "location": "FullCancelationflow.rise_a_Cancelation_Request_with_second_Market_User(int)"
});
formatter.result({
  "duration": 78479999000,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_second_MarketUser_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 69774600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Check the status of the full Cancelation application  with second RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-application--with-second-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@RPMuser2"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "second RPM User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "check the \"Rejected\" status a Cancelation Request with second RPM User 1711",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "logout second RPM User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.second_RPM_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 57489639200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rejected",
      "offset": 11
    },
    {
      "val": "1711",
      "offset": 71
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_second_RPM_User(String,int)"
});
formatter.result({
  "duration": 48850109300,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_second_RPM_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 82241500,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Rise a Full Cancelation Request with Third Market User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-third-market-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@Marketuser3"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "Third Market User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Rise a Cancelation Request with Third Market User 1710",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "logout Third MarketUser after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.third_Market_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 57309061300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1710",
      "offset": 50
    }
  ],
  "location": "FullCancelationflow.rise_a_Cancelation_Request_with_Third_Market_User(int)"
});
formatter.result({
  "duration": 81037999000,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_Third_MarketUser_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 70831700,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Check the status of the  full Cancelation application with Third RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the--full-cancelation-application-with-third-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@RPMuser3"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "Third RPM User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "check the \"Approved\" status a Cancelation Request with Third RPM User 1710",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "logout Third RPM User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.third_RPM_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 58068798100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1710",
      "offset": 70
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_Third_RPM_User(String,int)"
});
formatter.result({
  "duration": 45497187200,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_Third_RPM_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 68982600,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "Check the status of the full Cancelation apllication  with Third NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-apllication--with-third-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@NOCuser3"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "Third NOC User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "check the \"Rejected\" status a Cancelation Request with Third NOC User 1710",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "logout Third NOC User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.third_NOC_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 57495338000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rejected",
      "offset": 11
    },
    {
      "val": "1710",
      "offset": 70
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_Third_NOC_User(String,int)"
});
formatter.result({
  "duration": 51239044900,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_Third_NOC_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 71227600,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "Rise a Full Cancelation Request with fourth Market User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-fourth-market-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@Marketuser4"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "fourth Market User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "Rise a Cancelation Request with fourth Market User 1709",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "logout fourth MarketUser after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fourth_Market_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 53592353400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1709",
      "offset": 51
    }
  ],
  "location": "FullCancelationflow.rise_a_Cancelation_Request_with_fourth_Market_User(int)"
});
formatter.result({
  "duration": 74207769900,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fourth_MarketUser_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 71524600,
  "status": "passed"
});
formatter.scenario({
  "line": 74,
  "name": "Check the status of the  full Cancelation application with fourth RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the--full-cancelation-application-with-fourth-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 73,
      "name": "@RPMuser4"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "fourth RPM User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "check the \"Approved\" status a Cancelation Request with fourth RPM User 1709",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "logout fourth RPM User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fourth_RPM_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 60684618600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1709",
      "offset": 71
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_fourth_RPM_User(String,int)"
});
formatter.result({
  "duration": 45728713700,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fourth_RPM_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 71589800,
  "status": "passed"
});
formatter.scenario({
  "line": 81,
  "name": "Check the status of the full Cancelation apllication  with fourth NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-apllication--with-fourth-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 80,
      "name": "@NOCuser4"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "fourth NOC User login with valid creditinals for full cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "check the \"Approved\" status a Cancelation Request with fourth NOC User 1709",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "logout fourth NOC User after rise a full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fourth_NOC_User_login_with_valid_creditinals_for_full_cancelation_process()"
});
formatter.result({
  "duration": 60190232100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1709",
      "offset": 71
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_Cancelation_Request_with_fourth_NOC_User(String,int)"
});
formatter.result({
  "duration": 63733036900,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fourth_NOC_User_after_rise_a_full_cancelation_process()"
});
formatter.result({
  "duration": 79467700,
  "status": "passed"
});
formatter.scenario({
  "line": 88,
  "name": "Chcek the status of the Full cancelation application for with Fourth Legal user",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;chcek-the-status-of-the-full-cancelation-application-for-with-fourth-legal-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 87,
      "name": "@legaluser4"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "fourth Legal User login with valid creditinals for Full cancelationprocess",
  "keyword": "When "
});
formatter.step({
  "line": 90,
  "name": "Full cancelation Request reject with  fourth Legal User 1709",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "logout fourth Legal User after rise a Full cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fourth_Legal_User_login_with_valid_creditinals_for_Full_cancelationprocess()"
});
formatter.result({
  "duration": 53790602400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1709",
      "offset": 56
    }
  ],
  "location": "FullCancelationflow.full_cancelation_Request_reject_with_fourth_Legal_User(int)"
});
formatter.result({
  "duration": 50768847100,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fourth_Legal_User_after_rise_a_Full_cancelation_process()"
});
formatter.result({
  "duration": 63416400,
  "status": "passed"
});
formatter.scenario({
  "line": 94,
  "name": "Rise a full Cancelation apllication Request with fifth RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-apllication-request-with-fifth-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 93,
      "name": "@RPMUSER5"
    }
  ]
});
formatter.step({
  "line": 96,
  "name": "fifth RPM User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 97,
  "name": "Rise a full Cancelation Request with  fifth RPM User 1708",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "logout  fifth RPM User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fifth_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 64407234600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1708",
      "offset": 53
    }
  ],
  "location": "FullCancelationflow.rise_a_full_Cancelation_Request_with_fifth_RPM_User(int)"
});
formatter.result({
  "duration": 122802149100,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fifth_RPM_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 56556600,
  "status": "passed"
});
formatter.scenario({
  "line": 101,
  "name": "Check the status of the full Cancelation  with Fifth NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation--with-fifth-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 100,
      "name": "@NOCuser5"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "fifth NOC User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "check the \"Approved\" status a full Cancelation Request with  fifth NOC User 1708",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "logout  fifth NOC User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fifth_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 58511024800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1708",
      "offset": 76
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_full_Cancelation_Request_with_fifth_NOC_User(String,int)"
});
formatter.result({
  "duration": 42682118700,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fifth_NOC_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 75651300,
  "status": "passed"
});
formatter.scenario({
  "line": 108,
  "name": "Check the status of the full Cancelation apllication for with fifth Legal User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-apllication-for-with-fifth-legal-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 107,
      "name": "@LegalUser5"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "fifth Legal User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 111,
  "name": "Request send to FCC of full Cancelation Request with  fifth Legal User 1708",
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "logout fifth Legal User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.fifth_Legal_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 53093285000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1708",
      "offset": 71
    }
  ],
  "location": "FullCancelationflow.request_send_to_FCC_of_full_Cancelation_Request_with_fifth_Legal_User(int)"
});
formatter.result({
  "duration": 36856204300,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_fifth_Legal_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 75796500,
  "status": "passed"
});
formatter.scenario({
  "line": 115,
  "name": "Rise a full Cancelation Request with sixth RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-sixth-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 114,
      "name": "@RPMUSER6"
    }
  ]
});
formatter.step({
  "line": 117,
  "name": "sixth RPM User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 118,
  "name": "Rise a full Cancelation Request with  sixth RPM User 1707",
  "keyword": "Then "
});
formatter.step({
  "line": 119,
  "name": "logout  sixth RPM User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.sixth_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 57794641200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1707",
      "offset": 53
    }
  ],
  "location": "FullCancelationflow.rise_a_full_Cancelation_Request_with_sixth_RPM_User(int)"
});
formatter.result({
  "duration": 74849129400,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_sixth_RPM_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 67850100,
  "status": "passed"
});
formatter.scenario({
  "line": 122,
  "name": "Check the status of the full Cancelation process with sixth NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-process-with-sixth-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 121,
      "name": "@NOCuser6"
    }
  ]
});
formatter.step({
  "line": 124,
  "name": "sixth NOC User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "check the \"Rejcted\" status a full Cancelation Request with  sixth NOC User 1707",
  "keyword": "Then "
});
formatter.step({
  "line": 126,
  "name": "logout  sixth NOC User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.sixth_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 57278297900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rejcted",
      "offset": 11
    },
    {
      "val": "1707",
      "offset": 75
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_full_Cancelation_Request_with_sixth_NOC_User(String,int)"
});
formatter.result({
  "duration": 51600914600,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_sixth_NOC_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 82016500,
  "status": "passed"
});
formatter.scenario({
  "line": 129,
  "name": "Rise a full Cancelation Request with seventh RPM User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;rise-a-full-cancelation-request-with-seventh-rpm-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 128,
      "name": "@RPMUSER7"
    }
  ]
});
formatter.step({
  "line": 131,
  "name": "seventh RPM User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 132,
  "name": "Rise a full Cancelation Request with  Seventh RPM User 1706",
  "keyword": "Then "
});
formatter.step({
  "line": 133,
  "name": "logout  seventh RPM User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.seventh_RPM_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 57888015600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1706",
      "offset": 55
    }
  ],
  "location": "FullCancelationflow.rise_a_full_Cancelation_Request_with_Seventh_RPM_User(int)"
});
formatter.result({
  "duration": 74512907800,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_seventh_RPM_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 65718200,
  "status": "passed"
});
formatter.scenario({
  "line": 136,
  "name": "Check the status of the full Cancelation apllication for with seventh NOC User",
  "description": "",
  "id": "check-the-full-cancelation-flow-for-all-scenario;check-the-status-of-the-full-cancelation-apllication-for-with-seventh-noc-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 135,
      "name": "@NOCuser7"
    }
  ]
});
formatter.step({
  "line": 138,
  "name": "seventh NOC User login with valid creditinals for full Cancelation process",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "check the \"Approved\" status a full Cancelation Request with  seventh NOC User 1706",
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "logout  seventh NOC User after rise a full Cancelation process",
  "keyword": "Then "
});
formatter.match({
  "location": "FullCancelationflow.seventh_NOC_User_login_with_valid_creditinals_for_full_Cancelation_process()"
});
formatter.result({
  "duration": 60082397300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Approved",
      "offset": 11
    },
    {
      "val": "1706",
      "offset": 78
    }
  ],
  "location": "FullCancelationflow.check_the_status_a_full_Cancelation_Request_with_seventh_NOC_User(String,int)"
});
formatter.result({
  "duration": 42658588900,
  "status": "passed"
});
formatter.match({
  "location": "FullCancelationflow.logout_seventh_NOC_User_after_rise_a_full_Cancelation_process()"
});
formatter.result({
  "duration": 308938100,
  "status": "passed"
});
});