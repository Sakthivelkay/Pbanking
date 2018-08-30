@RallyChoice4
Feature: RallyChoice Scenarios

  @NewHire_TC009
  Scenario:NewHire_TC009_ChoiceAdmin: Ability for HR to be notified when a NH enrollment has been submitted

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
  And click on skipAhead button from YouarewellonyourwayPage
#  #BenefitsPortfolioPage
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
    Then Logout from the Page


  @NewHire_TC010
  Scenario: NewHire_TC010_NH enrollments with enabled review process to be marked as Pending

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
    Then Click on View As Employee from Actions
    And Validate that the enrollment window is still open
    And Click on modify or view changes
    And click on make changes
    And Click on Save and Continue button from BenefitsPortfolioPage
    Then Click continue on AdditionalInfoPage
    # And Click continue on HealthProgramsSummaryPage
    And  Click on make changes on HealthProgramsSummaryPage
    And click ok for Are you sure
    And Click Yes on MemberOfYourFamilyPregnantPage
    And Click Skip this on StressAffectingPage
    And Click Skip this on ChronicConditionPage
    Then Click Continue on HealthBeginPage
    And Click continue button from CommunicationPreferencesPage
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page



  @NewHire_TC011
  Scenario: NewHire_TC011_As a Choice user, I want to be informed that any elections I make during my new hire enrollment are pending so that I am not under the impression that my elections are final upon completing enrollment. (Banner)

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
    Then Click on View As Employee from Actions
    And Verify Pending banner
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page



  @NewHire_TC012
  Scenario: NewHire_TC012_As a Choice user, I want to be informed that any elections I make during my new hire enrollment are pending so that I'm not under the impression that my elections are final upon completing enrollment. (Benefits Portfolio)
   # Give Encrypted password(Don't give direct password)
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
    And click on skipAhead button from YouarewellonyourwayPage
        #BenefitsPortfolioPage
    And Enroll Health Plans
    And Click on View Available Plans for Health Plans
    And Click on Continue button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    Then Waive the Dental Plans
    And Verify Waived Dental Plans Successfull
  #VisionBenefits Page
    And Enroll Vision Plans
    And Click on View Available Plans for Vision Plans
    Then Click on Continue button from Your employer is offering the plan detailed below for Vision Plans
    And Click on continue button from cover with this plan Page Vision Plans
    And Validate the Notification your coverage is pending
    Then Validate the pending notification on benefitPortfolioPage
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
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page


  @NewHire_TC023
  Scenario:NewHire_TC023_As a Choiceadmin user, I am notified of pending NH events when I am within ChoiceAdmin. (Banner Counts)

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
    And Waive the Vision Plans
    And Verify Waived Vision Plans Successfull
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
    And User gets Pending event counts
    Then Logout from the Page


  @NewHire_TC024
  Scenario:NewHire_TC024_As a Choiceadmin user, I am notified of pending NH events when I am within ChoiceAdmin. (Redirection)
   # Give Encrypted password(Don't give direct password)
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
    And Validate that when the link is clicked the system redirects to the pending event list
    Then Logout from the Page


  @NewHire_TC025
  Scenario:NewHire_TC025_As a Choiceadmin user, I am notified of pending NH events when I am within ChoiceAdmin (EE Tab)

    Given User login  into RallyChoice Application
    When User enters Employers Name for Customerone
      | EmployerName                 |
      | New Hire Testing Customer 01 |
 #need modification
    And User navigates to Employee Customer Zero One
    And Click on check box to autofill employee details
    Then User populates the Emp Personal info with below data
      | EmployeeCityName | EmployeeZipCode | EmployeeState |
      | Chicago          |           60606 | IL            |
    And User enters the Employee Info with the below Data
      | ClassType |
      | Default |
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
    And Click on Continue with Texas  button from Which Plan best fits for you Health Plans
    Then Click on continue button from cover with this plan Page Health Plans
    And Waive the Health Savings Account Plans
    And Verify Health account Savings Plans waived Successfull
    Then Waive the Dental Plans
    And Verify Waived Dental Plans Successfull
    And Click on Save and Continue button from BenefitsPortfolioPage
    And Click Skip This on PrimaryCarePhysicianPage
    Then Click Are You Sure on PrimaryCarePhysicianPage
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
    And Click on Pending link
    Then Verify EOI event is visible
    Then Logout from the Page



  @NewHire_TC026
  Scenario:NewHire_TC026_As a user in ChoiceAdmin, I am able to see any NH pending events when I view the pending event list page (under employees tab)

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
    And Waive the Vision Plans
    And Verify Waived Vision Plans Successfull
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
    And Validate that the pending enrollment is listed for the employee
    And Validate that when the link is clicked the system redirects to the pending event list
    And Verify New Hire Enrollment Text
    And Verify New Hire Text
    And Verify Push pin icon
    Then Verify Calender icon
    Then Logout from the Page

  @NewHire_TC027
  Scenario:NewHire_TC027_As an admin, I am able to review a New Hire's pending enrollment benefits so that I can see if they elected the correct products and covered only eligible people

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
    And Validate that the pending enrollment is listed for the employee
    And Validate that when the link is clicked the system redirects to the pending event list
    And Click on Employee Link from pending events banner of NH
    And Click on New Hire Enrollment Link
    And Verify Event Type on NH review
    And Verify Date of Event on NH review
    And Verify Employee name on NH review
    And Verify Approve Text on NH review
    And Verify Reject Text on NH review
    And Verify RequestRevisionText Text on NH review
    Then Logout from the Page

  @NewHire_TC039
  Scenario:NewHire_TC039_Manage a pending NH enrollment when HR has not taken action by the due date

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
    And User gets Pending event counts
    And Click on Reject Link
    Then Click on Submit button
    And Validate that the the pending event count is decreased by 1
  # And Click on Pending link
   #And Verify Enrollment employee no longer present
    Then Logout from the Page

