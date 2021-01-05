Feature: check the functionality of Renewel request for all scenarios

@RPMUSER1
Scenario: Rise a Renewal apllication Request with first RPM User
Given enter url application into "chrome" for Renewal flow with "stage"
When first RPM User login with valid creditinals for Renewal process with "stage"
Then Rise a Renewal Request with  first RPM User 1616
Then logout  first RPM User after rise a Renewal process

@NOCuser1
Scenario: Check the status of the  Renewal application  with first NOC User

When first NOC User login with valid creditinals for renewal process
Then check the "Approved" status a Renewal Request with  first NOC User 1616
Then logout  first NOC User after rise a Renewal process

@LegalUser1
Scenario: Check the status of the Renewal apllication for with first Legal User

When first Legal User login with valid creditinals for Renewal process
Then Request send to FCC of Renewal Request with  first Legal User 1616
Then reewalapplication sendtoFCC from underreviewpage with First legal user 1616
Then logout first Legal User after rise a Renewal process

@RPMUSER2
Scenario: Rise a Renewal apllication Request with second RPM User

When second RPM User login with valid creditinals for Renewal process
Then Rise a Renewal Request with  second RPM User 1617
Then logout  second RPM User after rise a Renewal process

@NOCuser2
Scenario: Check the status of the  Renewal application  with second NOC User

When second NOC User login with valid creditinals for renewal process
Then check the "Rejected" status a Renewal Request with  second NOC User 1617
Then logout  second NOC User after rise a Renewal process

@RPMUSER3
Scenario: Rise a Renewal apllication Request with third RPM User

When third RPM User login with valid creditinals for Renewal process
Then Rise a Renewal Request with  third RPM User 1607
Then logout  third RPM User after rise a Renewal process

@NOCuser3
Scenario: Check the status of the  Renewal application  with third NOC User

When third NOC User login with valid creditinals for renewal process
Then check the "Approved" status a Renewal Request with  third NOC User 1607
Then logout  third NOC User after rise a Renewal process

@legaluser3
Scenario: Chcek the status of the Full Renewal application for with third Legal user
When third Legal User login with valid creditinals for Full Renewalprocess
Then Full Renewal Request reject with  third Legal User 1607
Then logout third Legal User after rise a Full Renewal process

@RPMUSER4
Scenario: Rise a Renewal apllication Request with fourth RPM User

When fourth RPM User login with valid creditinals for Renewal process
Then Rise a Renewal Request with  fourth RPM User 1604
Then logout  fourth RPM User after rise a Renewal process

@NOCuser4
Scenario: Check the status of the  Renewal application  with fourth NOC User

When fourth NOC User login with valid creditinals for renewal process
Then check the "Approved" status a Renewal Request with  fourth NOC User 1604
Then logout  fourth NOC User after rise a Renewal process

@LegalUser4
Scenario: Check the status of the Renewal apllication for with fourth Legal User

When fourth Legal User login with valid creditinals for Renewal process
Then Request send to FCC of Renewal Request with  fourth Legal User 1604
Then reewalapplication reject from underreviewpage with fourth legal user 1604 
Then logout fourth Legal User after rise a Renewal process
