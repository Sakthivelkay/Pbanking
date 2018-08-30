@RallyChoice1
Feature: RallyChoice Scenarios

  @NewHire_TC13
  Scenario: NewHire_TC13_As a Choice user I want to be informed that any elections I make during my new hire enrollment are pending so that Im not under the impression that my elections are final upon completing enrollment_Benefits Summary
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
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
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    Then Click on View As Employee from Actions
    #EnrollmentComplete
    And Click on modify or view changes
    #BenefitsPortfolioPage
    Then Verify Your Coverage Is Pending header in Summary Of Your Benefits Page
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  #Then Verify Your Coverage Is Pending header is always the first notification displayed in benefits portfolio Page
  @NewHire_TC14
  Scenario: NewHire_TC14_As a Choice user I want to be informed when my elections have been approved.
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName |
      | New hire     |
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
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
    # And Add the ApprovedORRejected message
    #  | ApprovedORRejected |
    # | Test               |
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Click on View As Employee from Available Enrollments Page
    And Click on view my benefits
    #BenefitsPortfolioPage
    Then Verify the Banner shows your elections have been approved
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  #Then Verify the Pending message displayed
  #And Click on Pending link
  #And Verify the user is on Pending EventsPage and Click on Employee Link
  #Then Click on View As Employee from Actions
  #Then Click on view my benefits
  #Then Verify approved banner only shows the first time the EE returns to the benefits summary page
  @NewHire_TC15
  Scenario: NewHire_TC15_As a Choice user I want to see that my elections will first require admin approval before they are able to become effective so that I am fully aware of what is required before my benefits become effective.
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName |
      | New hire     |
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
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    Then Verify new bullet after I authorize bullet on the terms and conditions page displays as_I understand that my benefits will not be effective unless first approved by my company's benefits administrator or other relevant party
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  @NewHire_TC16
  Scenario: NewHire_TC16_As an administrator I can see pending events for a specific employee and act upon them_Pending tab
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
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
    Then click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    Then Waive the Dental Plans
    And Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    And Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    Then Verify Waived Life Insurance Plan Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Important Notice on PrimaryCarePhysicianPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
    And Click lets go on MoreThanBenefitPage
    And Click Skip this on MemberOfYourFamilyPregnantPage
    And Click Skip this on LosingWeightPage
    #//-----------------------
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
    And Validate that the pending enrollment is listed for the employee
    And Click on Employee Link from pending events banner of NH
    And Click on New Hire Enrollment Link
    Then Validate that the pending tab is active for the employee
    Then Logout from the Page

  @NewHire_TC17
  Scenario: NewHire_TC17_As an administrator I can see pending events for a specific employee and act upon them_Profile list
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
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
    And Get the Pending plan details from the benefit summary page
    And Click on Exit from Enrollment Complete Page
    Then Verify the Pending message displayed
    And Click on Pending link
    And Validate that the pending enrollment is listed for the employee
    And Click on Employee Link from pending events banner of NH
    And Click on New Hire Enrollment Link
    Then Validate that the pending tab is active for the employee
    And Verify the employee profile list of pending events is displayed
    Then Logout from the Page

  @NewHire_TC28
  Scenario: NewHire_TC28_As an admin I am able to approve a pending NH enrollment so that it can be sent to the carrier and processed_Approval
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
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
    Then click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    # And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    And verify Step two page with Approve corresponding message is displayed
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Click on View As Employee from Available Enrollments Page
    #EnrollmentClosedPage
    Then Click on view my benefits
    Then Validate Notice your elections have been approved is displayed
    #BenefitsPortfolioPage
    And Validate that the the pending event count is decreased by 1
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  @NewHire_TC29
  Scenario: NewHire_TC29_As an admin I am able to approve a pending NH enrollment so that it can be sent to the carrier and processed_Cancel
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName |
      | New hire     |
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
    Then click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    And verify Step two page with Approve corresponding message is displayed
    Then Click Cancel button
    Then Verify user is redirected to the pending review page step one
    Then Logout from the Page

  @NewHire_TC30
  Scenario: NewHire_TC30_As an admin I am able to reject a NH enrollment so that it does not get sent to the carrier and become effective_Reject
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
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
    Then click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    # And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    And verify Step two page with Reject corresponding message is displayed
    Then Click on Submit button
    Then Click on View As Employee from Available Enrollments Page
    #EnrollmentClosedPage
    Then verify_ViewMyBenifitsisnotDisplayedForEnrollReject
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page

  @NewHire_TC31
  Scenario: NewHire_TC31_As an admin I am able to reject a NH enrollment so that it does not get sent to the carrier and become effective_Cancel
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName |
      | New hire     |
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
    Then click on skipAhead button from YouarewellonyourwayPage
    #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    Then Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Dental Plans
    Then Verify Waived Dental Plans Successfull
    And Waive the Vision Plans
    Then Verify Waived Vision Plans Successfull
    And Waive the Life Insurance Plans
    #Then Verify Waived Life insurance Plans Successfull
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
      | 666-666-6666 | Mobile    |
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
    And verify Step two page with Reject corresponding message is displayed
    Then Click Cancel button
    Then Verify user is redirected to the pending review page step one
    Then Logout from the Page
