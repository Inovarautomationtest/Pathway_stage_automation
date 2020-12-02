Feature: check the all functions of BuildOutflow flow for all users

@Marketuser1
Scenario: Rise a BuildOutflow Request with First Market User

Given enter url application into "chrome" for full BuildOutflow flow with "stage"
When  First Market User login with valid creditinals for full BuildOutflow process with "stage"
Then Rise a BuildOutflow Request with  First Market User 1682 with "06-18-2020"
Then logout  First MarketUser after rise a full BuildOutflow process

@RPMuser1
Scenario: Check the status of the BuildOutflow apllication for with First RPM User

When First RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with First RPM User 1682
Then logout First RPM User after rise a full BuildOutflow process

@NOCuser1
Scenario: Check the status of the BuildOutflow apllication for with First NOC User

When First NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  First NOC User 1682
Then logout First NOC User after rise a full BuildOutflow process

@LegalUser1
Scenario: Check the status of the BuildOutflow apllication for with First Legal User

When First Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  First Legal User 1682
Then application send to FCC from the under review page with First Legal User 1682
Then logout First Legal User after rise a full BuildOutflow process

 @MarketUser2
 Scenario: Rise a BuildOutflow Request with Second Market User

When Second Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with secondMarket User 1683 with "06-18-2020"
Then logout Second MarketUser after rise a full BuildOutflow process

@RPMuser2
Scenario: Check the status of the BuildOutflow apllication for with Second RPM User

When Second RPM User login with valid creditinals for full BuildOutflow process
Then check the "Rejeted" status a BuildOutflow Request with Second RPM User 1683
Then logout RPM Second User after rise a full BuildOutflow process


 @MarketUser3
 Scenario: Rise a BuildOutflow Request with Third Market User

When Third Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  Third Market User 1684 with "06-18-2020"
Then logout  Third MarketUser after rise a full BuildOutflow process

@RPMuser3
Scenario: Check the status of the BuildOutflow apllication for with Third RPM User

When Third RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with Third RPM User 1684
Then logout Third RPM User after rise a full BuildOutflow process

@NOCuser3
Scenario: Check the status of the BuildOutflow apllication for with Third NOC User

When Third NOC User login with valid creditinals for full BuildOutflow process
Then check the "Rejected" status a BuildOutflow Request with  Third NOC User 1684
Then logout  Third NOC User after rise a full BuildOutflow process

@MarketUser4
 Scenario: Rise a BuildOutflow Request with fourth Market User

When fourth Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  fourth Market User 1685 with "06-18-2020"
Then logout  fourth MarketUser after rise a full BuildOutflow process

@RPMuser4
Scenario: Check the status of the BuildOutflow apllication for with fourth RPM User

When fourth RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with fourth RPM User 1685
Then logout fourth RPM User after rise a full BuildOutflow process

@NOCuser4
Scenario: Check the status of the BuildOutflow apllication for with fourth NOC User

When fourth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  fourth NOC User 1685
Then logout  fourth NOC User after rise a full BuildOutflow process

@legaluser4
Scenario: Chcek the status of the Buildoutflow application for with Fourth Legal user
When fourth Legal User login with valid creditinals for full BuildOutflow process
Then BuildOutflow Request reject with  fourth Legal User 1685
Then logout fourth Legal User after rise a full BuildOutflow process

@RPMUSER5
Scenario: Rise a BuildOutflow Request with fifth RPM User

When fifth RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  fifth RPM User 1686 with "06-18-2020"
Then logout  fifth RPM User after rise a full BuildOutflow process

@NOCuser5
Scenario: Check the status of the BuildOutflow apllication for with Fifth NOC User

When fifth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  fifth NOC User 1686
Then logout  fifth NOC User after rise a full BuildOutflow process

@LegalUser5
Scenario: Check the status of the BuildOutflow apllication for with fifth Legal User

When fifth Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  fifth Legal User 1686
Then buildout application send to FCC from the underreview page with fifth Legal user 1686
Then logout fifth Legal User after rise a full BuildOutflow process

@RPMUSER6
Scenario: Rise a BuildOutflow Request with sixth RPM User

When sixth RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  sixth RPM User 1687 with "06-18-2020"
Then logout  sixth RPM User after rise a full BuildOutflow process

@NOCuser6
Scenario: Check the status of the BuildOutflow apllication for with sixth NOC User

When sixth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Rejcted" status a BuildOutflow Request with  sixth NOC User 1687
Then logout  sixth NOC User after rise a full BuildOutflow process

@RPMUSER7
Scenario: Rise a BuildOutflow Request with seventh RPM User

When seventh RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  Seventh RPM User 1689 with "06-18-2020"
Then logout  seventh RPM User after rise a full BuildOutflow process

@NOCuser7
Scenario: Check the status of the BuildOutflow apllication for with seventh NOC User

When seventh NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  seventh NOC User 1689
Then logout  seventh NOC User after rise a full BuildOutflow process

@legaluser7
Scenario: Chcek the status of the Buildoutflow application for with seventh Legal user
When seventh Legal User login with valid creditinals for full BuildOutflow process
Then BuildOutflow Request reject with  seventh Legal User 1685
Then logout seventh Legal User after rise a full BuildOutflow process

@Marketuser8
Scenario: Rise a BuildOutflow Request with eighth Market User

When  eighth Market User login with valid creditinals for full BuildOutflow process with "stage"
Then Rise a BuildOutflow Request with  eighth Market User 1682 with "06-18-2020"
Then logout  eighth MarketUser after rise a full BuildOutflow process

@RPMuser8
Scenario: Check the status of the BuildOutflow apllication for with eighth RPM User

When eighth RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with eighth RPM User 1682
Then logout eighth RPM User after rise a full BuildOutflow process

@NOCuser8
Scenario: Check the status of the BuildOutflow apllication for with eighth NOC User

When eighth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  eighth NOC User 1682
Then logout eighth NOC User after rise a full BuildOutflow process

@LegalUser8
Scenario: Check the status of the BuildOutflow apllication for with eighth Legal User

When eighth Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  eighth Legal User 1682
Then reject Under review application with eighth Legal user 1682
Then logout eighth Legal User after rise a full BuildOutflow process

@RPMUSER9
Scenario: Rise a BuildOutflow Request with ninth RPM User

When ninth RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  ninth RPM User 1686 with "06-18-2020"
Then logout  ninth RPM User after rise a full BuildOutflow process

@NOCuser9
Scenario: Check the status of the BuildOutflow apllication for with ninth NOC User

When ninth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  ninth NOC User 1686
Then logout  ninth NOC User after rise a full BuildOutflow process

@LegalUser9
Scenario: Check the status of the BuildOutflow apllication for with ninth Legal User

When ninth Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  ninth Legal User 1686
Then reject Under review application with ninth Legal user 1682
Then logout ninth Legal User after rise a full BuildOutflow process



