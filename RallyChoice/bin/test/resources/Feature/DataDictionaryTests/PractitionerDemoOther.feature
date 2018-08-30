Feature: As a Phycon user i want to perfrom Practitioner Demo Other Transaction

@Regression @Practitioner @DD
Scenario: As a Phycon user i want to perfrom Practitioner Demo Other Transaction

Given User logs into Phycon Application
|User Name|Password|
|PhyconAutoSubmitter|rules|

Then Switch App
|User Name|
|PhyconAutoSubmitter|

Then Create Practitioner Phycon Request from using below fields
|Submission Method|Subject|Search by|MPIN|
|Internal Submission|Practitioner|MPIN|30047|

Then Validate Header
|Reference Number - Read|Submitter Name|Current Status|
|Yes|PhyconAutoSubmitter|New-Draft|

Then Identify Transaction Details
|Transaction Category|Transaction Name|
|Demographic|Other|

Then Select Tin Details
|Select Tin Checkbox|
|Yes|

Then Select Platforms
|Platform1|
|NDB|

Then Click on "btn_Next" button in "EnterTranscationDetailsPage"

Then Enter Demographic Transaction Details
|Effective Date|Subject|Comments|
|Yes|Add|Phycon|

Then Validate GD creation in Summary Page

Then Validate Header
|Current Status|
|Pending-Completion|

Then Validate GD or PR case details
|Type|Case Status|Assigned To|
|GD|NEW-RESEARCH|PHYCONRESEARCHWB|

Then Logout
|User Name|
|PhyconAutoSubmitter|




Given Supervisor Login using below fields
|User Name|Password|
|PhyconAutoSupervisor|rules|

Then Switch App
|User Name|
|PhyConAutoSupervisor|

Then Navigate to Bulk Actions Page

Then Move PR from Work Basket to Operator
|Select WorkBasket|Transfer to an Operator|
|ResearchWB|PhyconAutoResearcher|

Then Logout
|User Name|
|PhyConAutoSupervisor|



Given Researcher submitted Login form using below fields
|User Name|Password|
|PhyconAutoResearcher|rules|

Then Switch App
|User Name|
|PhyConAutoResearcher|

Then Open GD or PR Screen
|Type|
|GD|

Then Validate Header
|Current Status|
|InProgress-Research|

Then Double Click on Pega element "flag_transaction" in "AssignmentPage"

Then Click on "chkbox_Done" button in "AssignmentPage"

Then Click on "btn_Apply" button in "AssignmentPage"

Then Click on "btn_Submmit" button in "AssignmentPage"

Then Validate GD Resolved in Summary Page

Then Validate Header
|Current Status|
|New-Load|

Then Validate GD or PR case details
|Type|Case Status|Assigned To|
|GD|NEW-LOAD|PHYCONLOADINGWB|

Then Logout
|User Name|
|PhyConAutoResearcher|




Given Supervisor Login using below fields
|User Name|Password|
|PhyconAutoSupervisor|rules|

Then Switch App
|User Name|
|PhyConAutoSupervisor|


Then Navigate to Bulk Actions Page

Then Move GD from Work Basket to Operator
|Select WorkBasket|Transfer to an Operator|
|LoadingWB|PhyconAutoLoader|

Then Logout
|User Name|
|PhyConAutoSupervisor|


Given Loader Submitted Login form using below fields
|User Name|Password|
|PhyconAutoLoader|rules|

Then Switch App
|User Name|
|PhyconAutoLoader|

Then Open GD or PR Screen
|Type|
|GD|

Then Validate Header
|Current Status|
|InProgress-Load|

Then Double Click on Pega element "practitionerFlag" in "AssignmentPage"

Then Click on "btn_Apply" button in "AssignmentPage"

Then Enter "1234" into "Predict1" textbox in "AssignmentPage"

Then Select text "Complete" from "list_Status" dropdown in "AssignmentPage"

Then Click on "btn_Apply" button in "AssignmentPage"

Then Click on "btn_Submmit" button in "AssignmentPage"

Then Validate GD Resolved in Summary Page

Then Validate Header
|Current Status|
|Resolved-Completed|

Then Validate GD or PR case details
|Type|Case Status|Assigned To|
|GD|RESOLVED-COMPLETED|PHYCONAUTOLOADER|

Then Logout
|User Name|
|PhyconAutoLoader|

