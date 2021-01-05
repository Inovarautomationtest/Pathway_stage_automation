Feature: check the all functions of Partial Cancelation flow for all users

@Marketuser1
Scenario: Rise a Partial Cancelation Request with first Market User
Given enter url application into "chrome" for Partial cancelation flow with "stage"
When first Market User login with valid creditinals for Partial cancelation process with "stage" 
Then Rise a Partial Cancelation Request with first Market User 1636
Then logout first MarketUser after rise a Partial cancelation process

@RPMuser1
Scenario: Check the status of the  Partial Cancelation application with first RPM User

When first RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a  Partial Cancelation Request with first RPM User 1636
Then logout First RPM User after rise a Partial cancelation process

@NOCuser1
Scenario: Check the status of the Partial Cancelation application  with First NOC User

When first NOC User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with first NOC User 1636
Then logout First NOC User after rise a Partial cancelation process

@LegalUser1
Scenario: Check the status of the Partial cancelation application  with First Legal User

When First Legal User login with valid creditinals for Partial cancelation process
Then Request send to FCC of Partial cancelation process with  First Legal User 1636
Then Partial Cancelation application send to FCC from the under review page with First Legal user 1636
Then logout First Legal User after rise a Partial cancelation process

@Marketuser2
Scenario: Rise a Partial Cancelation Request with second Market User

When second Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with second Market User 1628
Then logout second MarketUser after rise a Partial cancelation process

@RPMuser2
Scenario: Check the status of the Partial Cancelation application  with second RPM User

When second RPM User login with valid creditinals for Partial cancelation process
Then check the "Rejected" status a Partial Cancelation Request with second RPM User 1628
Then logout second RPM User after rise a Partial cancelation process

@Marketuser3
Scenario: Rise a Partial Cancelation Request with Third Market User

When Third Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with Third Market User 1629
Then logout Third MarketUser after rise a Partial cancelation process

@RPMuser3
Scenario: Check the status of the  Partial Cancelation application with Third RPM User

When Third RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with Third RPM User 1629
Then logout Third RPM User after rise a Partial cancelation process

@NOCuser3
Scenario: Check the status of the Partial Cancelation apllication  with Third NOC User

When Third NOC User login with valid creditinals for Partial cancelation process
Then check the "Rejected" status a Partial Cancelation Request with Third NOC User 1629
Then logout Third NOC User after rise a Partial cancelation process

@Marketuser4
Scenario: Rise a Partial Cancelation Request with fourth Market User

When fourth Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with fourth Market User 1630
Then logout fourth MarketUser after rise a Partial cancelation process

@RPMuser4
Scenario: Check the status of the  Partial Cancelation application with fourth RPM User

When fourth RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with fourth RPM User 1630
Then logout fourth RPM User after rise a Partial cancelation process

@NOCuser4
Scenario: Check the status of the Partial Cancelation apllication  with fourth NOC User

When fourth NOC User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a  Partial Cancelation Request with fourth NOC User 1630
Then logout fourth NOC User after rise a Partial cancelation process

@legaluser4
Scenario: Chcek the status of the partial cancelation application for with Fourth Legal user
When fourth Legal User login with valid creditinals for partial cancelationprocess
Then partial cancelation Request reject with  fourth Legal User 1630
Then logout fourth Legal User after rise a partial cancelation process

@RPMUSER5
Scenario: Rise a Partial Cancelation apllication Request with fifth RPM User

When fifth RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  fifth RPM User 1631
Then logout  fifth RPM User after rise a Partial Cancelation process

@NOCuser5
Scenario: Check the status of the Partial Cancelation  with Fifth NOC User

When fifth NOC User login with valid creditinals for Partial Cancelation process
Then check the "Approved" status a Partial Cancelation Request with  fifth NOC User 1631
Then logout  fifth NOC User after rise a Partial Cancelation process

@LegalUser5
Scenario: Check the status of the Partial Cancelation apllication for with fifth Legal User

When fifth Legal User login with valid creditinals for Partial Cancelation process
Then Request send to FCC of Partial Cancelation Request with  fifth Legal User 1631
Then Partial cancelation Application send to FCC from The under review page with Legal user 1631
Then logout fifth Legal User after rise a Partial Cancelation process

@RPMUSER6
Scenario: Rise a Partial Cancelation Request with sixth RPM User

When sixth RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  sixth RPM User 1632
Then logout  sixth RPM User after rise a Partial Cancelation process

@NOCuser6
Scenario: Check the status of the Partial Cancelation process with sixth NOC User

When sixth NOC User login with valid creditinals for Partial Cancelation process
Then check the "Rejcted" status a Partial Cancelation Request with  sixth NOC User 1632
Then logout  sixth NOC User after rise a Partial Cancelation process

@RPMUSER7
Scenario: Rise a Partial Cancelation Request with seventh RPM User

When seventh RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  Seventh RPM User 1633
Then logout  seventh RPM User after rise a Partial Cancelation process

@NOCuser7
Scenario: Check the status of the Partial Cancelation apllication for with seventh NOC User

When seventh NOC User login with valid creditinals for Partial Cancelation process
Then check the "Approved" status a Partial Cancelation Request with  seventh NOC User 1633
Then logout  seventh NOC User after rise a Partial Cancelation process

@legaluser7
Scenario: Chcek the status of the partial cancelation application for with seventh Legal user
When seventh Legal User login with valid creditinals for partial cancelationprocess
Then partial cancelation Request reject with  seventh Legal User 1633
Then logout seventh Legal User after rise a partial cancelation process

@Marketuser8
Scenario: Rise a Partial Cancelation Request with eigth Market User

When eigth Market User login with valid creditinals for Partial cancelation process 
Then Rise a Partial Cancelation Request with eigth Market User 1634
Then logout eigth MarketUser after rise a Partial cancelation process

@RPMuser8
Scenario: Check the status of the  Partial Cancelation application with eigth RPM User

When eigth RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a  Partial Cancelation Request with eigth RPM User 1634
Then logout eigth RPM User after rise a Partial cancelation process

@NOCuser8
Scenario: Check the status of the Partial Cancelation application  with eigth NOC User

When eigth NOC User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with eigth NOC User 1634
Then logout eigth NOC User after rise a Partial cancelation process

@LegalUser8
Scenario: Check the status of the Partial cancelation application  with eigth Legal User

When eigth Legal User login with valid creditinals for Partial cancelation process
Then Request send to FCC of Partial cancelation process with  eigth Legal User 1634
Then application rejected from the Under review page for Partial cancelation with eigth legal user 1634
Then logout eigth Legal User after rise a Partial cancelation process

@RPMUSER9
Scenario: Rise a Partial Cancelation apllication Request with ninth RPM User

When ninth RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  ninth RPM User 1635
Then logout  ninth RPM User after rise a Partial Cancelation process

@NOCuser9
Scenario: Check the status of the Partial Cancelation  with ninth NOC User

When ninth NOC User login with valid creditinals for Partial Cancelation process
Then check the "Approved" status a Partial Cancelation Request with  ninth NOC User 1635
Then logout  ninth NOC User after rise a Partial Cancelation process

@LegalUser9
Scenario: Check the status of the Partial Cancelation apllication for with ninth Legal User

When ninth Legal User login with valid creditinals for Partial Cancelation process
Then Request send to FCC of Partial Cancelation Request with  ninth Legal User 1635
Then Partial cancelation Application reject from The under review page with ninth Legal user 1635
Then logout ninth Legal User after rise a Partial Cancelation process