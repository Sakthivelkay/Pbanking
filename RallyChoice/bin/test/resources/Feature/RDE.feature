@tag
Feature: Rapid Data Entry  Scenarios

  @tag1
  Scenario: RDE1 Entry with Zipcode 78610
    Given User login  using below input Data
      | User Name | Password |
      | ritaRES   | UHGrita1 |
    When User Clicks on RDE Quote Link from Activities
    #Product and Plan information Page
    Then Enter below mutlichoice package name for medical
      | MulChoicePkgName |
      | TX023            |
    And Click multiChoice plus button for medical
    And Enter multiChoice plan codes for medical
      | MedMultiPlanCode | MedMultiRXPlanCode | MedMultiMetalicLevel |
      | AMC3             | MM                 | Bronze               |
    And Enter BillType For Medical
      | MedBillType |
      | A           |
    Then Click Product and PlanInformation Page Continue button
    #Company Profile Page
    When Enter Company Profile Page with below Details
      | RecepientName | RecepientEmail           | State | RequestedEffectiveDate | GroupsLegalName | GroupsNametoappearonCard | TaxID      | StreetAddress | City | ZipCode | FirstName | LastName | Telephone      | NoOfYearsInBusiness | SICCode | TotalEligibleEmployees | AvgTotalNoOfEmployees | TotalEmployeesApplying | WaivingAllCoverage | NoOfHourstobeElible |
      | Raghu         | vadde_ramaraju@optum.com | Tx    |               02182018 | RDEGroup_Test1  | RDEGroup                 | 35-8978364 | TexasStreet   | City |   78610 | Raghu     | vadde    | (694) 853-0487 |                   5 |    6411 |                      3 |                     3 |                      3 |                  3 |                  30 |
    And Select Waiting Period For InitialEnrolles
    And Enter Average Employees for Medical Plan with below input Data
      | AvgTotalNoOfEmployees |
      |                     3 |
    And Select Medical Benifit Plan Radiobutton
    And Select Medical Dental Vision WaitingPeriod for MedicalDentalAndVisionPlans
    And Enter Number of Hours Eligible with below input Data
      | NoOfHourstobeElible |
      |                  30 |
    Then Click on Company Profile Page Continue button
    #General Information QuestionsPage
    When Enter General Information Questions Regarding GroupSize with below Input Data
      | AvgTotalEmp | FullTimeEmp |
      |           3 |           3 |
    And Select Optum Bank Radio button for Medical Plan
    And Select Continuation Status Radiobutton As COBRA for Medical Plan
    And Select CurrentCarrier Medical Coverage Radiobutton for Medical Plan
    And Check Wage and Tax Forms Recieved CheckBox for any Plan
    And Check binderCheck Recieved CheckBox for any Plan
    Then Click Product and Plan Information Page Continue button
    #EmployeeListPage
    When Import RDE Employee Census Template
    And Check the Total Employee Count verification with below TotalCount of Employee Imported using Template
      | CountToBeCompared |
      |                 3 |
    Then Click Employee List Page Continue button
    #PendingManagerPage
    When Verify Pend Manager Page NoIssuesFound();
    Then Click Rate Validation button
    Then Click Confirm Rates button from Rate Validation Page
    And Verify Pending inStallation Page Case Successfull message
    Then Click on Submit button from Finalize Enrollment Pending Installation Page
    #Dashboard Page
    Then Click SearchRDE Quote Link from Activities
    And Enter Created RDE GroupLegalName AND Click on Search button
      | GroupsLegalName |
      | RDEGroup_Test1  |
    Then Verify the GroupORCase Status either PendingORInternalReview
    And Logout From Page
    Then Verify the Logout is Successfull

  @tag1
  Scenario: RDE2 Entry with Zipcode 98001
    Given User login  using below input Data
      | User Name | Password |
      | ritaRES   | UHGrita1 |
    When User Clicks on RDE Quote Link from Activities
    #Product and Plan information Page
    Then Enter Dental Plan
      | DentalPlanCode |
      | P1215          |
    Then Enter Vision Plan
      | VisionPlanCode |
      | V1006          |
    And Click BasicLife CheckBox
    And Select BasicLifeFormulaFlatAndEnterAmount
      | BasicLifeFormula_FlatAmount |
      |                       15000 |
    And Enter Short Term Disability Plan
      | ShortTermDisabilityPlanCode |
      | ST0001SB006800              |
    And Enter Long Term Disability Plan
      | LongTermDisabilityPlanCode |
      | LT0001LB003210             |
    Then Click Product and PlanInformation Page Continue button
    #Company Profile Page
    When Enter Company Profile Page with below Details
      | RecepientName | RecepientEmail           | State | RequestedEffectiveDate | GroupsLegalName | GroupsNametoappearonCard | TaxID      | StreetAddress | City | ZipCode | FirstName | LastName | Telephone      | NoOfYearsInBusiness | SICCode | TotalEligibleEmployees | AvgTotalNoOfEmployees | TotalEmployeesApplying | WaivingAllCoverage | NoOfHourstobeElible |
      | Raghu         | vadde_ramaraju@optum.com | Tx    |               02182018 | RDEGroup_Test2  | RDEGroup                 | 35-8978364 | TexasStreet   | City |   98001 | Raghu     | vadde    | (694) 853-0487 |                   5 |    6411 |                     10 |                    10 |                     10 |                 10 |                  30 |
    And Select Waiting Period For InitialEnrolles
    And Enter Average Employees for Medical Plan with below input Data
      | AvgTotalNoOfEmployees |
      |                    10 |
    And Select Medical Dental Vision WaitingPeriod for MedicalDentalAndVisionPlans
    And Select Suplementary Life ShortTerm and LongTerm Plans
    And Enter BasicLife Percentage
    And Enter Number of Hours Eligible with below input Data
      | NoOfHourstobeElible |
      |                  30 |
    Then Click on Company Profile Page Continue button
    #General Information QuestionsPage
    When Enter General Information Questions Regarding GroupSize with below Input Data
      | AvgTotalEmp | FullTimeEmp |
      |          10 |          10 |
    And Select Continuation Status Radiobutton As COBRA for Medical Plan
    And Check Wage and Tax Forms Recieved CheckBox for any Plan
    And Check binderCheck Recieved CheckBox for any Plan
    Then Click Product and Plan Information Page Continue button
    #EmployeeListPage
    Then Import RDE Employee Census Template
    And Check the Total Employee Count verification with below TotalCount of Employee Imported using Template
      | CountToBeCompared |
      |                10 |
    Then Click Employee List Page Continue button
    #PendingManagerPage
    Then Verify Pend Manager Page NoIssuesFound();
    Then Click Rate Validation button
    Then Click Confirm Rates button from Rate Validation Page
    And Verify Pending inStallation Page Case Successfull message
    Then Click on Submit button from Finalize Enrollment Pending Installation Page
    #Dashboard Page
    Then Click SearchRDE Quote Link from Activities
    And Enter Created RDE GroupLegalName AND Click on Search button
      | GroupsLegalName |
      | RDEGroup_Test2  |
    Then Verify the GroupORCase Status either PendingORInternalReview
    And Logout From Page
    Then Verify the Logout is Successfull

  @tag1
  Scenario: RDE3 Entry with Zipcode 83301
    Given User login  using below input Data
      | User Name | Password |
      | ritaRES   | UHGrita1 |
    When User Clicks on RDE Quote Link from Activities
    #Product and Plan information Page
    Then Enter below mutlichoice package name for medical
      | MulChoicePkgName |
      | ID002            |
    And Click multiChoice plus button for medical
    And Enter multiChoice plan codes for medical
      | MedMultiPlanCode | MedMultiRXPlanCode | MedMultiMetalicLevel |
      | AKQS             |                254 | Silver               |
    And Enter BillType For Medical
      | MedBillType |
      | A           |
    And Click Basic Life CheckBox
    And Select Basic Life Formula Salary AND SelectAmount
    And Enter Dependent Basic Life PlanCode with below input Data
      | BasicLifeDependent_PlanCode |
      | 0A                          |
    Then Click Product and PlanInformation Page Continue button
    #Company Profile Page
    When Enter Company Profile Page with below Details
      | RecepientName | RecepientEmail           | State | RequestedEffectiveDate | GroupsLegalName | GroupsNametoappearonCard | TaxID      | StreetAddress | City | ZipCode | FirstName | LastName | Telephone      | NoOfYearsInBusiness | SICCode | TotalEligibleEmployees | AvgTotalNoOfEmployees | TotalEmployeesApplying | WaivingAllCoverage | NoOfHourstobeElible |
      | Raghu         | vadde_ramaraju@optum.com | Tx    |               02182018 | RDEGroup_Test3  | RDEGroup                 | 35-8978364 | TexasStreet   | City |   83301 | Raghu     | vadde    | (694) 853-0487 |                   5 |    6411 |                      3 |                     3 |                      3 |                  3 |                  30 |
    And Select Medical Benifit Plan
    And Select waiting Period For Initial Enrolles For SpecificState
    And Select Medical Dental Vision WaitingPeriod for MedicalDentalAndVisionPlans
    And Basic Life Percentage as 50
    And Enter_FullTimeEquivalents with below input Data
      | FullTimeEmployees |
      |                 3 |
    And Enter Number of Hours Eligible with below input Data
      | NoOfHourstobeElible |
      |                  30 |
    Then Click on Company Profile Page Continue button
    #General Information QuestionsPage
    When Enter General Information Questions Regarding GroupSize with below Input Data
      | AvgTotalEmp | FullTimeEmp |
      |           3 |           3 |
    And Select Optum Bank Radio button for Medical Plan
    And Select Continuation Status Radiobutton As COBRA for Medical Plan
    And Select CurrentCarrier Medical Coverage Radiobutton for Medical Plan
    And Select_whichPrimaryOptionDoYouHave_Radio button
    And Check Wage and Tax Forms Recieved CheckBox for any Plan
    And Check binderCheck Recieved CheckBox for any Plan
    Then Click Product and Plan Information Page Continue button
    #EmployeeListPage
    When Import RDE Employee Census Template
    And Check the Total Employee Count verification with below TotalCount of Employee Imported using Template
      | CountToBeCompared |
      |                 3 |
    Then Click Employee List Page Continue button
    #PendingManagerPage
    When Verify Pend Manager Page NoIssuesFound();
    Then Click Rate Validation button
    Then Click Confirm Rates button from Rate Validation Page
    And Verify Pending inStallation Page Case Successfull message
    Then Click on Submit button from Finalize Enrollment Pending Installation Page
    #Dashboard Page
    When Click SearchRDE Quote Link from Activities
    And Enter Created RDE GroupLegalName AND Click on Search button
      | GroupsLegalName |
      | RDEGroup_Test3  |
    Then Verify the GroupORCase Status either PendingORInternalReview
    And Logout From Page
    Then Verify the Logout is Successfull

  @tag1
  Scenario: RDE4 Entry with Zipcode 90210
    Given User login  using below input Data
      | User Name | Password |
      | ritaRES   | UHGrita1 |
    When User Clicks on RDE Quote Link from Activities
    #Product and Plan information Page
    Then Enter below mutlichoice package name for medical
      | MulChoicePkgName |
      | CA309            |
    And Click multiChoice plus button for medical
    And Enter multiChoice plan codes for medical
      | MedMultiPlanCode | MedMultiRXPlanCode | MedMultiMetalicLevel |
      | AKR6             |                733 | Bronze               |
    And Enter BillType For Medical
      | MedBillType |
      | A           |
    Then Enter Dental Plan
      | DentalPlanCode |
      | P1211          |
    And Click BasicLife CheckBox
    And Select BasicLifeFormulaFlatAndEnterAmount
      | BasicLifeFormula_FlatAmount |
      |                       15000 |
    And Enter Dependent BasicLife Plan
      | BasicLifeDependent_PlanCode |
      | 0B                          |
    And Enter Long Term Disability Plan
      | LongTermDisabilityPlanCode |
      | LT0001LB003210             |
    Then Click Product and PlanInformation Page Continue button
    #Company Profile Page
    When Enter Company Profile Page with below Details
      | RecepientName | RecepientEmail           | State | RequestedEffectiveDate | GroupsLegalName | GroupsNametoappearonCard | TaxID      | StreetAddress | City | ZipCode | FirstName | LastName | Telephone      | NoOfYearsInBusiness | SICCode | TotalEligibleEmployees | AvgTotalNoOfEmployees | TotalEmployeesApplying | WaivingAllCoverage | NoOfHourstobeElible |
      | Raghu         | vadde_ramaraju@optum.com | Tx    |               02182018 | RDEGroup_Test4  | RDEGroup                 | 35-8978364 | TexasStreet   | City |   90210 | Raghu     | vadde    | (694) 853-0487 |                   5 |    6411 |                      5 |                     5 |                      5 |                  5 |                  30 |
    And Select Waiting Period For InitialEnrolles
    And Enter Average Employees for Medical Plan with below input Data
      | AvgTotalNoOfEmployees |
      |                     5 |
    And Select Medical Benefit Plan
      | AvgTotalNoOfEmployees |
      |                     5 |
    And Select Medical Dental Vision WaitingPeriod for MedicalDentalAndVisionPlans
    And Enter Number of Hours Eligible with below input Data
      | NoOfHourstobeElible |
      |                  30 |
    And Select Suplementary Life ShortTerm and LongTerm Plans
    And Enter BasicLife Percentage
    Then Click on Company Profile Page Continue button
    #General Information QuestionsPage
    When Enter General Information Questions Regarding GroupSize with below Input Data
      | AvgTotalEmp | FullTimeEmp |
      |           5 |           5 |
    And Select CurrentCarrier SelectMedicalCoverageRadioBtn
    And Select Continuation Status Radiobutton As COBRA for Medical Plan
    And Check Wage and Tax Forms Recieved CheckBox for any Plan
    And Check binderCheck Recieved CheckBox for any Plan
    And Select StaffMode HMO Plan
    Then Click Product and Plan Information Page Continue button
    #EmployeeListPage
    When Import RDE Employee Census Template
    And Check the Total Employee Count verification with below TotalCount of Employee Imported using Template
      | CountToBeCompared |
      |                 5 |
    Then Click Employee List Page Continue button
    #PendingManagerPage
    When Verify Pend Manager Page NoIssuesFound();
    Then Click Rate Validation button
    Then Click Confirm Rates button from Rate Validation Page
    And Verify Pending inStallation Page Case Successfull message
    Then Click on Submit button from Finalize Enrollment Pending Installation Page
    #Dashboard Page
    Then Click SearchRDE Quote Link from Activities
    And Enter Created RDE GroupLegalName AND Click on Search button
      | GroupsLegalName |
      | RDEGroup_Test4  |
    Then Verify the GroupORCase Status either PendingORInternalReview
    And Logout From Page
    Then Verify the Logout is Successfull

  @tag1
  Scenario: RDE5 Entry with Zipcode 68001
    Given User login  using below input Data
      | User Name | Password |
      | ritaRES   | UHGrita1 |
    When User Clicks on RDE Quote Link from Activities
    #Product and Plan information Page
    Then Enter below mutlichoice package name for medical
      | MulChoicePkgName |
      | NE011            |
    And Click multiChoice plus button for medical
    And Enter multiChoice plan codes for medical
      | MedMultiPlanCode | MedMultiRXPlanCode | MedMultiMetalicLevel |
      | AUPY             |                396 | Bronze               |
    And Enter BillType For Medical
      | MedBillType |
      | A           |
    And Enter Dental Plan
      | DentalPlanCode |
      | P1211          |
    And Enter Vision Plan
      | VisionPlanCode |
      | V1006          |
    Then Click Product and PlanInformation Page Continue button
    #Company Profile Page
    When Enter Company Profile Page with below Details
      | RecepientName | RecepientEmail           | State | RequestedEffectiveDate | GroupsLegalName | GroupsNametoappearonCard | TaxID      | StreetAddress | City | ZipCode | FirstName | LastName | Telephone      | NoOfYearsInBusiness | SICCode | TotalEligibleEmployees | AvgTotalNoOfEmployees | TotalEmployeesApplying | WaivingAllCoverage | NoOfHourstobeElible |
      | Raghu         | vadde_ramaraju@optum.com | Tx    |               02182018 | RDEGroup_Test5  | RDEGroup                 | 35-8978364 | TexasStreet   | City |   68001 | Raghu     | vadde    | (694) 853-0487 |                   5 |    6411 |                      5 |                     5 |                      5 |                  5 |                  30 |
    And Select Waiting Period For InitialEnrolles
    And Enter Average Employees for Medical Plan with below input Data
      | AvgTotalNoOfEmployees |
      |                     5 |
    And Select Medical Benifit Plan Radiobutton
    And Select Medical Dental Vision WaitingPeriod for MedicalDentalAndVisionPlans
    And Enter Number of Hours Eligible with below input Data
      | NoOfHourstobeElible |
      |                  30 |
    Then Click on Company Profile Page Continue button
    #General Information QuestionsPage
    When Enter General Information Questions Regarding GroupSize with below Input Data
      | AvgTotalEmp | FullTimeEmp |
      |           5 |           5 |
    And Select Continuation Status Radiobutton As COBRA for Medical Plan
    And Select CurrentCarrier Medical Coverage Radiobutton for Medical Plan
    And Check Wage and Tax Forms Recieved CheckBox for any Plan
    And Check binderCheck Recieved CheckBox for any Plan
    Then Click Product and Plan Information Page Continue button
    #EmployeeListPage
    When Import RDE Employee Census Template
    And Check the Total Employee Count verification with below TotalCount of Employee Imported using Template
      | CountToBeCompared |
      |                 5 |
    Then Click Employee List Page Continue button
    #PendingManagerPage
    When Verify Pend Manager Page NoIssuesFound();
    And Click Rate Validation button
    Then Click Confirm Rates button from Page from Rate Validation Page
    Then Verify Pending inStallation Page Case Successfull message
    Then Click on Submit button from Finalize Enrollment Pending Installation Page
    #Dashboard Page
    Then Click SearchRDE Quote Link from Activities
    And Enter Created RDE GroupLegalName AND Click on Search button
      | GroupsLegalName |
      | RDEGroup_Test5  |
    Then Verify the GroupORCase Status either PendingORInternalReview
    And Logout From Page
    Then Verify the Logout is Successfull
