@RallyChoice3
Feature: RallyChoice Scenarios

  @NewHire_TC001
  Scenario: NewHire_TC001_Employee completes their NH enrollment and submits before the 14 day period ends HR approves the submission
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    #need modification
    And User navigates to Employee details page
    And Click on check box to autofill employee details
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
    And Select your dependents to cover
      | DependantstoCover |
      | yes               |
    #DependentDetailsPage
    And Enter your dependent details in Dependent Details Page
      | DependentFirstName | DependentLastName | DependentType | DependentRelationship | DependentSSN | DependentGender | DependentDOB |
      | Sandy              | Joe               | Spouse        | Wife                  |   6663455432 | Female          |     05061995 |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    And click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    Then Waive the Dental Plans
    And Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    And Verify Waived Vision Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
    # And Click on make Primary Link
    #And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    #WearealmosttherPage
    Then Click continue button from WeAreAlmostTherePage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
      | ContactNo    | PhoneType |
      | 666-666-6666 | Home      |
    And Click on Continue button from ContactPhoneNumberPage
    #Then Verify the Phone added Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    And Verify checkoutpage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Approve Link
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Logout from the Page

  @NewHire_TC002
  Scenario: NewHire_TC002_Employee completes their NH enrollment and submits before the 14 day period ends HR rejects the submission
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    And User navigates to Employee details page
    And Click on check box to autofill employee details
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
    And Select your dependents to cover
      | DependantstoCover |
      | yes               |
    #DependentDetailsPage
    And Enter your dependent details in Dependent Details Page
      | DependentFirstName | DependentLastName | DependentType | DependentRelationship | DependentSSN | DependentGender | DependentDOB |
      | Sandy              | Joe               | Spouse        | Wife                  |   6663455432 | Female          |     05061995 |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    And click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    Then Click on the Enroll button to enroll the Dental plans
    #DentalBenefits Page
    And Click on View Available Plans button in Dental Benfits Page
    And Click on Continue button in Your Employer is offering page
    And Click on Continue button in Who Would you like to cover with this plan page
    #VisionBenefits Page
    And Enroll Vision Plans
    And Click on View Available Plans for Vision Plans
    Then Click on Continue button from Your employer is offering the plan detailed below for Vision Plans
    And Click on continue button from cover with this plan Page Vision Plans
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
    # And Click on make Primary Link
    #And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    #WearealmosttherPage
    Then Click continue button from WeAreAlmostTherePage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
      | ContactNo    | PhoneType |
      | 666-666-6666 | Home      |
    And Click on Continue button from ContactPhoneNumberPage
    #Then Verify the Phone added Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    And Verify checkoutpage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Reject Link
    Then Click on Submit button
    Then Verify the Reject message of event
    Then Logout from the Page

  @NewHire_TC0033
  Scenario: ewHire_TC0033 As an NH employee I am notified when my NH enrollments have been approved so I am aware of my benefit status_Append
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    And User navigates to Employee details page
    And Click on check box to autofill employee details
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
    And Select your dependents to cover
      | DependantstoCover |
      | yes               |
    #DependentDetailsPage
    And Enter your dependent details in Dependent Details Page
      | DependentFirstName | DependentLastName | DependentType | DependentRelationship | DependentSSN | DependentGender | DependentDOB |
      | Sandy              | Joe               | Spouse        | Wife                  |   6663455432 | Female          |     05061995 |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    And click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    #WearealmosttherPage
    Then Click continue button from WeAreAlmostTherePage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
      | ContactNo    | PhoneType |
      | 666-678-6346 | Home      |
    And Click on Continue button from ContactPhoneNumberPage
    Then Verify the Phone added Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Approve Link
    And Verify Approve Link click
    And Add the ApprovedORRejected message
      | ApprovedORRejected |
      | Test               |
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Click on View As Employee from Available Enrollments Page
    And Click on view my benefits
    Then Verify the Summary is displayed
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  @NewHire_TC0034
  Scenario: NewHire_TC0034 As an NH employee I am notified when my NH enrollment has been rejected so I am aware of my benefit status
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    And User navigates to Employee details page
    And Click on check box to autofill employee details
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
    And Select your dependents to cover
      | DependantstoCover |
      | yes               |
    #DependentDetailsPage
    And Enter your dependent details in Dependent Details Page
      | DependentFirstName | DependentLastName | DependentType | DependentRelationship | DependentSSN | DependentGender | DependentDOB |
      | Sandy              | Joe               | Spouse        | Wife                  |   6663455432 | Female          |     05061995 |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    And click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    Then Verify User in benefits portfolio Page
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
   # And Click on make Primary Link
    #And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    #WearealmosttherPage
    Then Click continue button from WeAreAlmostTherePage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
      | ContactNo    | PhoneType |
      | 666-666-6666 | Home      |
    And Click on Continue button from ContactPhoneNumberPage
    Then Verify the Phone added Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Reject Link
    Then Click on Submit button
    Then Click on View As Employee from Available Enrollments Page
    And Verify the Enrollment Has Closed status is displayed
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  @NewHire_TC0035
  Scenario: NewHire_TC0035_As an NH employee_I am notified when my NH enrollment has been rejected so I am aware of my benefit status_Append
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    And User navigates to Employee details page
    And Click on check box to autofill employee details
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
    And Select your dependents to cover
      | DependantstoCover |
      | yes               |
    #DependentDetailsPage
    And Enter your dependent details in Dependent Details Page
      | DependentFirstName | DependentLastName | DependentType | DependentRelationship | DependentSSN | DependentGender | DependentDOB |
      | Sandy              | Joe               | Spouse        | Wife                  |   6663455432 | Female          |     05061995 |
    #YourFamilyPage
    And Click on continue button from YourFamilyPage
    #YouarewellonyourwayPage
    And click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    Then Verify User in benefits portfolio Page
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
    #And Click on make Primary Link
    #And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    #WearealmosttherPage
    Then Click continue button from WeAreAlmostTherePage
    #ContactPhoneNumberPage
    And Enter PhoneNumber and Phone type from ContactPhoneNumberPage
      | ContactNo    | PhoneType |
      | 666-666-6666 | Home      |
    And Click on Continue button from ContactPhoneNumberPage
    #Then Verify the Phone added Success message
    #YourContactInfoPage
    And Click on Continue button from YourContactInfoPage
    #GoingPaperlessforRequiredCommunicationsPage
    And Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage
    #CheckoutPage
    And Verify checkoutpage
    Then Click on Check Out Now button
    #ReviewandAcceptPage
    And Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below
    Then Click on Complete Enrollment
    Then Verify the Enrollment Complete message
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Reject Link
    And Add the ApprovedORRejected message
      | ApprovedORRejected |
      | Test               |
    Then Click on Submit button
    Then Click on View As Employee from Available Enrollments Page
    And Verify the Enrollment Has Closed status is displayed
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page
