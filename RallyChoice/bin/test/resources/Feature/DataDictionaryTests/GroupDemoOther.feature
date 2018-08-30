Feature: As a Phycon user i want to perfrom Group Demo Other Transaction

@Regression @Practitioner @DD
Scenario: As a Phycon user i want to perfrom Group Demo Other Transaction

Given Submitter submitted Login form using below fields
|User Name|Password|
|PhyconAutoSubmitter|rules|

Then Switch App
|User Name|
|PhyconAutoSubmitter|

Then Create Group Phycon Request from using below fields
|Submission Method|Subject|MPIN|Is the update for the Group Record Only?|Search by|Is this a National Provider submission?|Does your practitioner data exist in an external file?|
|Internal Submission|Group|10468|Y|MPIN|No|N|

Then Validate Header
|Reference Number - Read|Submitter Name|Current Status|
|Yes|PhyconAutoSubmitter|New-Draft|

Then Identify Transaction Details
|Transaction Category|Transaction Name|
|Demographic|Other|

Then Select Tin Details
|Primary Market Number|Zip|Tin Number|Select Tin Checkbox|
|42583|78205|742923024|Yes|

And Click on "btn_Next" button in "EnterTranscationDetailsPage"

Then Select Platforms
|Platform1|
|NDB|



