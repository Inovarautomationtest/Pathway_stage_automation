Feature: check the full Cancelation flow for all Scenario

@Marketuser1
Scenario: Rise a Full Cancelation Request with first Market User
Given enter url application into "chrome" for full cancelation flow with "Stage environement"
When first Market User login with valid creditinals for full cancelation process with "stage"
Then Rise a full Cancelation Request with first Market User 1690
Then logout first MarketUser after rise a full cancelation process

@RPMuser1
Scenario: Check the status of the  full Cancelation application with first RPM User

When first RPM User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with first RPM User 1690
Then logout First RPM User after rise a full cancelation process

@NOCuser1
Scenario: Check the status of the full Cancelation application  with First NOC User

When first NOC User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with first NOC User 1690
Then logout First NOC User after rise a full cancelation process

@LegalUser1
Scenario: Check the status of the full cancelation application  with First Legal User

When First Legal User login with valid creditinals for full cancelation process
Then Request send to FCC of full cancelation process with  First Legal User 138
Then sendto FCC cancelation request in from under review tab with 138
Then Application Send to FCC from the Under review page with first legal user 138
Then logout First Legal User after rise a full cancelation process

@Marketuser2
Scenario: Rise a Full Cancelation Request with second Market User

When second Market User login with valid creditinals for full cancelation process
Then Rise a Cancelation Request with second Market User 1691
Then logout second MarketUser after rise a full cancelation process

@RPMuser2
Scenario: Check the status of the full Cancelation application  with second RPM User

When second RPM User login with valid creditinals for full cancelation process
Then check the "Rejected" status a Cancelation Request with second RPM User 1691
Then logout second RPM User after rise a full cancelation process

@Marketuser3
Scenario: Rise a Full Cancelation Request with Third Market User

When Third Market User login with valid creditinals for full cancelation process
Then Rise a Cancelation Request with Third Market User 1692
Then logout Third MarketUser after rise a full cancelation process

@RPMuser3
Scenario: Check the status of the  full Cancelation application with Third RPM User

When Third RPM User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with Third RPM User 1692
Then logout Third RPM User after rise a full cancelation process

@NOCuser3
Scenario: Check the status of the full Cancelation apllication  with Third NOC User

When Third NOC User login with valid creditinals for full cancelation process
Then check the "Rejected" status a Cancelation Request with Third NOC User 1692
Then logout Third NOC User after rise a full cancelation process

@Marketuser4
Scenario: Rise a Full Cancelation Request with fourth Market User

When fourth Market User login with valid creditinals for full cancelation process
Then Rise a Cancelation Request with fourth Market User 1693
Then logout fourth MarketUser after rise a full cancelation process

@RPMuser4
Scenario: Check the status of the  full Cancelation application with fourth RPM User

When fourth RPM User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with fourth RPM User 1693
Then logout fourth RPM User after rise a full cancelation process

@NOCuser4
Scenario: Check the status of the full Cancelation apllication  with fourth NOC User

When fourth NOC User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with fourth NOC User 1693
Then logout fourth NOC User after rise a full cancelation process

@legaluser4
Scenario: Chcek the status of the Full cancelation application for with Fourth Legal user
When fourth Legal User login with valid creditinals for Full cancelationprocess
Then Full cancelation Request reject with  fourth Legal User 1693
Then logout fourth Legal User after rise a Full cancelation process

@RPMUSER5
Scenario: Rise a full Cancelation apllication Request with fifth RPM User

When fifth RPM User login with valid creditinals for full Cancelation process
Then Rise a full Cancelation Request with  fifth RPM User 1694
Then logout  fifth RPM User after rise a full Cancelation process

@NOCuser5
Scenario: Check the status of the full Cancelation  with Fifth NOC User

When fifth NOC User login with valid creditinals for full Cancelation process
Then check the "Approved" status a full Cancelation Request with  fifth NOC User 1694
Then logout  fifth NOC User after rise a full Cancelation process

@LegalUser5
Scenario: Check the status of the full Cancelation apllication for with fifth Legal User

When fifth Legal User login with valid creditinals for full Cancelation process
Then Request send to FCC of full Cancelation Request with  fifth Legal User 882
Then request send to FCC from the underreview page with fifth legal user 882
Then logout fifth Legal User after rise a full Cancelation process

@RPMUSER6
Scenario: Rise a full Cancelation Request with sixth RPM User

When sixth RPM User login with valid creditinals for full Cancelation process
Then Rise a full Cancelation Request with  sixth RPM User 1695
Then logout  sixth RPM User after rise a full Cancelation process

@NOCuser6
Scenario: Check the status of the full Cancelation process with sixth NOC User

When sixth NOC User login with valid creditinals for full Cancelation process
Then check the "Rejcted" status a full Cancelation Request with  sixth NOC User 1695
Then logout  sixth NOC User after rise a full Cancelation process

@RPMUSER7
Scenario: Rise a full Cancelation Request with seventh RPM User

When seventh RPM User login with valid creditinals for full Cancelation process
Then Rise a full Cancelation Request with  Seventh RPM User 1696
Then logout  seventh RPM User after rise a full Cancelation process

@NOCuser7
Scenario: Check the status of the full Cancelation apllication for with seventh NOC User

When seventh NOC User login with valid creditinals for full Cancelation process
Then check the "Approved" status a full Cancelation Request with  seventh NOC User 1696
Then logout  seventh NOC User after rise a full Cancelation process

@legaluser7
Scenario: Chcek the status of the Full cancelation application for with seventh Legal user
When seventh Legal User login with valid creditinals for Full cancelationprocess
Then Full cancelation Request reject with  seventh Legal User 1693
Then logout seventh Legal User after rise a Full cancelation process

@Marketuser8
Scenario: Rise a Full Cancelation Request with eighth Market User
When eighth Market User login with valid creditinals for full cancelation process with "stage"
Then Rise a full Cancelation Request with eighth Market User 1690
Then logout eighth MarketUser after rise a full cancelation process

@RPMuser8
Scenario: Check the status of the  full Cancelation application with eighth RPM User

When eighth RPM User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with eighth RPM User 1690
Then logout eighth RPM User after rise a full cancelation process

@NOCuser8
Scenario: Check the status of the full Cancelation application  with eighth NOC User

When eighth NOC User login with valid creditinals for full cancelation process
Then check the "Approved" status a Cancelation Request with eighth NOC User 1690
Then logout eighth NOC User after rise a full cancelation process

@LegalUser8
Scenario: Check the status of the full cancelation application  with eighth Legal User

When eighth Legal User login with valid creditinals for full cancelation process
Then Request send to FCC of full cancelation process with  eighth Legal User 138
Then Reject cancelation request in from under review tab with eighth Legal user 138
Then logout eighth Legal User after rise a full cancelation process

@RPMUSER9
Scenario: Rise a full Cancelation apllication Request with ninth RPM User

When ninth RPM User login with valid creditinals for full Cancelation process
Then Rise a full Cancelation Request with  ninth RPM User 1694
Then logout  ninth RPM User after rise a full Cancelation process

@NOCuser9
Scenario: Check the status of the full Cancelation  with ninth NOC User

When ninth NOC User login with valid creditinals for full Cancelation process
Then check the "Approved" status a full Cancelation Request with  ninth NOC User 1694
Then logout  ninth NOC User after rise a full Cancelation process

@LegalUser9
Scenario: Check the status of the full Cancelation apllication for with ninth Legal User

When ninth Legal User login with valid creditinals for full Cancelation process
Then Request send to FCC of full Cancelation Request with  ninth Legal User 882
Then request reject from the underreview page with ninth legal user 882
Then logout ninth Legal User after rise a full Cancelation process





