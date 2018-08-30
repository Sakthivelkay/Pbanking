@RallyChoice
Feature: RallyChoice Scenarios

  @tag1
  Scenario: RallyChoice 
    # Give Encrypted password(Don't give direct password)
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName |
      | New hire     |
    And User navigates to Employee details page
    Then User enters the Employee personal information using below input Data
      | EmployeeCityName | EmployeeZipCode | EmployeeState |
      | Chicago          |           60606 | IL            |
    And User enters the Employment Information using below input Data
      | ClassType |
      | Non-Union |
    Then User clicks on complete
    #EmployeeListPage
    Then Verify the Employee Created Successfull Message
    And Search for the Created Employee
    And Click on  Created Employee from displayed Results
    Then Click on View As Employee from Actions
    #Enrollment Open Page
    And Click on Get Started Now from Enrollment Open Page
    #ReviewYourInfoPage
    Then Click on LooksGood button from ReviewYourInfoPage
    #DoYouDependentsYouWouldLiketoCoverPage
    And Select your dependants to cover
      | DependantstoCover |
      | Yes               |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    Then click on letsGo button from YouarewellonyourwayPage
    #DoYouHaveDoctorPage
    And Click on IDontHave Doctor button from DoYouHaveDoctorPage
    #HowManyPrescriptionPage
    And Click on SkipThis link from HowManyPrescriptionPage
    #HowManyTimesDependentsSeekCarePage
    And Click on SkipThis link from DependentsSeekCarePage
    #ChooseHealthPlansPage
    And Click on SkipThis link from ChooseHealthPlansPage
    #HouseHoldIncomePage
    And Click on SkipThis link from HouseHoldIncomePage
    #BenefitsPortfolioPage
    Then Verify User in benefits portfolio Page
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Health Plans
    Then Verify the Waived Health Plans Successfull
    And Enroll Dental Plans
     And Click on View Available Plans for Dental Plans
    Then Click on Continue button from Your employer is offering the plan detailed below for Dental Plans
    Then Click on continue button from cover with this plan Page Dental Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Enroll Vision Plans
     And Click on View Available Plans for Vision Plans
    Then Click on Continue button from Your employer is offering the plan detailed below for Vision Plans
    Then Click on continue button from cover with this plan Page Vision Plans
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    #SelectBeneficiariesPage
    And Click on Add Beneficiary plus button
    Then Add Beneficary details
    And Verify Benificary Added Successfull message
    And Click on make Primary Link    
    And Click on Continue button from Select beneficiaries for your life insurance Page
    #WearealmosttherPage
    Then Click continue button from WearealmosttherPage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
    |PhoneNumber|PhoneType|
    |           |         |
    And Click on Continue button from ContactPhoneNumberPage
    Then Verify the Phonedded Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from 	GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending mesage displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Approve Link
    Then Click on Reject Link
    Then Click on Submit button
    Then Verify the Success message of event was approved
    


    #newScreens
    And Click Skip This on PrimaryCarePhysicianPage
    And Click yes i am sure on AreYouSurePage
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    And Click Continue on HealthBeginPage


    #makeChanges New Steps
    Then Click continue on AdditionalInfoPage
    And  Click on make changes on HealthProgramsSummaryPage
    And  click ok for Are you sure
    And Click continue button from CommunicationPreferencesPage
    
    

