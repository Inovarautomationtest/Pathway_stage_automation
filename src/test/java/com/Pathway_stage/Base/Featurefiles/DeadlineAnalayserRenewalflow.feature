
#Author: sai.kumar@inovarconsulting.co.in

Feature: check the Renewal functionlaity of Deadanalyser for Pathway

@RPMUSER1
Scenario: Rise a Renewal request with RPMUSER1 for deadline analyser moduel
Given enter url application into "chrome" for Deadlineanlayser in the "Stage" environment with first RPMUSER for Renewal process
When first RPMUSER login with valid credtinlas for Deadline analyser Renewal process
Then rise a Renewal request with  first RPMUSER in the deadline analyser section with "5-05-2020" to "8-52-2020"
Then close browser after  Renewal Request rise a request with RPMUSER1 

@NOCUser1
Scenario: Check the status of the renwal application with first NOCuser for deadline analyser moduel

When first NOC user login with valid credtinals  for renewal process for Deadline analyser moduel
Then Check the "approved" status of the Renewal application for deadLine analyser moduel with  first NOC user
Then close browser after check the status of the renewal application with  first NOC user for deadLine analyser moduel

@LegalUser1
Scenario: Check the status of the cancelation application with first Legaluser for deadline analyser moduel

When first legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel
Then Check the "approved" status of the renewal application for deadLine analyser moduel with  first Legalsuer
Then close browser after check the status of the renewal application with  first legal user for deadLine analyser moduel

@RPMUSER2
Scenario: Rise a Renewal request with  second RPMUSER for deadline analyser moduel
Given enter url application into "chrome" for Deadlineanlayser in the "Stage" environment with  second RPMUSER  for renewal process
When  second RPMUSER login with valid credtinlas for Deadline analyser  Renewal process
Then rise a renewal request with  second RPMUSER in the deadline analyser section with "5-05-2020" to "8-52-2020"
Then close browser after rise a renewal request with  second RPMUSER

@NOCUser2
Scenario: Check the status of the renewal application with second NOCuser for deadline analyser moduel

When second NOC user login with valid credtinals  for renewal process for Deadline analyser moduel
Then Check the "Rejected" status of the renewal application for deadLine analyser moduel with second NOC user
Then close browser after check the status of the renewal application with second NOC user for deadLine analyser moduel

@RPMUSER3
Scenario: Rise a renewal request with  Third RPMUSER for deadline analyser moduel
Given enter url application into "chrome" for Deadlineanlayser in the "Stage" environment with  Third RPMUSER for renewal process
When Third RPMUSER login with valid credtinlas for Deadline analyser renewal process
Then rise a renewal request with Third RPMUSER in the deadline analyser section with "5-05-2020" to "8-52-2020"
Then close browser after rise a renewal request with Third RPMUSER

@NOCUser3
Scenario: Check the status of the renewal application with Third NOCuser for deadline analyser moduel

When third NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel
Then Check the "approved" status of the renewal application for deadLine analyser moduel with Third NOCuser
Then close browser after check the status of the renewal application with Third NOCuser for deadLine analyser moduel

@LegalUser3
Scenario: Check the status of the renewal application with Third Legaluser for deadline analyser moduel

When third legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel
Then Check the "Rejected" status of the renewal application for deadLine analyser moduel with Third Legalsuer
Then close browser after check the status of the renewal application with Third legal user  for deadLine analyser moduel


