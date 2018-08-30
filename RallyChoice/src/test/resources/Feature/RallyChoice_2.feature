@RallyChoice2
Feature: RallyChoice Scenarios
  @NewHire_TC003
  Scenario: NewHire_TC003_Employee completes their NH enrollment and submits before the 14 day period ends. HR has not taken action on the enrollment (which would close the enrollment window).  Employee goes in and modifies their enrollment and then resubmits.  HR approves the submission.
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    Then Click on View As Employee from Actions
    And Click on modify or view changes
    #SummaryOfBenefitsPage
    And click on make changes
    #Benefits Portfolio Page
    Then Click on the Enroll button to enroll the Dental plans
    #DentalBenefits Page
    And Click on View Available Plans button in Dental Benfits Page
    And Click on Continue button in Your Employer is offering page
    And Click on Continue button in Who Would you like to cover with this plan page
    #BenefitsPortfolioPage
    And Click on Save and Continue button from BenefitsPortfolioPage
    #Additional Information Page
    And Click continue on AdditionalInfoPage
     #Health Program Summary Page
    And Click continue on HealthProgramSummaryPage
     #YourContactInformation Page
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

  @NewHire_TC004
  Scenario: NewHire_TC004_Employee completes their NH enrollment and submits before the 14 day period ends. HR has not taken action on the enrollment (which would close the enrollment window).  Employee goes in and modifies their enrollment and then resubmits.  HR rejects the submission.
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    Then Click on View As Employee from Actions
    And Click on modify or view changes
    #SummaryOfBenefitsPage
    And click on make changes
    #Benefits Portfolio Page
    Then Click on the Enroll button to enroll the Dental plans
    #DentalBenefits Page
    And Click on View Available Plans button in Dental Benfits Page
    And Click on Continue button in Your Employer is offering page
    And Click on Continue button in Who Would you like to cover with this plan page
    #BenefitsPortfolioPage
    And Click on Save and Continue button from BenefitsPortfolioPage
    #Additional Information Page
    And Click continue on AdditionalInfoPage
    #Health Program Summary Page
    And Click continue on HealthProgramSummaryPage
     #YourContactInformation Page
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

  @NewHire_TC005
  Scenario: NewHire_TC005_Employee completes their NH enrollment and submits on the last day of their 14 day enrollment window. Despite the window being closed, HR is still able to take action for an additional 7 days.  HR approves the submission
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Logout from the Page

  @NewHire_TC006
  Scenario: NewHire_TC006_Employee completes their NH enrollment and submits on the last day of their 14 day enrollment window. Despite the window being closed, HR is still able to take action for an additional 7 days.  HR rejects  the submission
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    Then Click on Reject Link
    Then Click on Submit button
    Then Verify the Reject message of event
    Then Logout from the Page

  @NewHire_TC007
  Scenario: NewHire_TC007_Employee completes their NH enrollment and HR never takes an action.
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Logout from the Page

  @NewHire_TC018
  Scenario: NewHire_TC018_As an administrator, I can see pending events for a specific employee and act upon them. (Display items).
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    And Verify New Hire Enrollment Text
    And Verify New Hire Text
    And Verify Push pin icon
    Then Verify Calender icon
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    Then Click on Approve Link
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Logout from the Page

  @NewHire_TC019
  Scenario: NewHire_TC019_As an administrator, I can see pending events for a specific employee and act upon them. (NH event).
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
    Then Waive the Dental Plans
    And Waive the Vision Plans
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
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    Then Logout from the Page
    
  @NewHire_TC020
  Scenario: NewHire_TC020_As an administrator, I can see pending events for a specific employee and act upon them.(EOI event).
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
    Then click on letsGo button from YouarewellonyourwayPage
    #DoYouHaveDoctorPage
    And Click on IDontHave Doctor button from DoYouHaveDoctorPage
    #HowManyPrescriptionPage
    And Click on SkipThis link from HowManyPrescriptionPage
    #HowManyTimesDependentsSeekCarePage
    And Click on SkipThis link from DependentsSeekCarePage
    #ChooseHealthPlansPage
    #And Click on SkipThis link from ChooseHealthPlansPage
    #HouseHoldIncomePage
    And Click on SkipThis link from HouseHoldIncomePage
    #BenefitsPortfolioPage
    And Waive the Health Plans
    Then Waive the Dental Plans
    #And Waive the Vision Plans
    And Click on Save and Continue button from BenefitsPortfolioPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
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
    And Click on Pending link
    Then Verify EOI event is visible
    Then Logout from the Page
    
     @NewHire_TC021
  Scenario: NewHire_TC021_As an administrator, I can see pending events for a specific employee and act upon them. (21 day)
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
    And Waive the Health Plans
    Then Waive the Dental Plans
    And Waive the Vision Plans
    And Waive the Life Insurance Plans
    And Click on Save and Continue button from BenefitsPortfolioPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
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
    
   @NewHire_TC022
  Scenario: NewHire_TC022_As a Choiceadmin user, I am notified of pending NH events when I am within ChoiceAdmin. (Banner)
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
    And Waive the Health Plans
    Then Waive the Dental Plans
    And Waive the Vision Plans
    And Click on Save and Continue button from BenefitsPortfolioPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
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
    #And Click on New Hire Enrollment Link
    #Then Click on Approve Link
    #And Verify Approve Link click
    #Then Click on Submit button
    #Then Verify the Success message of event was approved
    Then Logout from the Page
   
    @NewHire_TC036
    Scenario: NewHire_TC036_Manage_As an NH employee, I am notified when my NH enrollment has been rejected so I am aware of my benefit status. 
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
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    And User gets Pending event counts
    And Click on Reject Link
    Then Click on Submit button
    And Validate that the the pending event count is decreased by 1
  # And Click on Pending link
   #And Verify Enrollment employee no longer present
    Then Logout from the Page
    
     @NewHire_TC037
    Scenario: NewHire_TC037_Ensure that when HR approves an NH enrollment, the pending events banner is updated and enrollment no longer appears on the pending event lists. NH enrollments with EOI pending events will also impact the banner when the NH enrollment is approved.  (Without EOI) 
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
    And Verify the user is on Pending EventsPage and Click on Employee Link
    And Click on New Hire Enrollment Link
    And User gets Pending event counts
    And Click on Approve Link
    Then Click on Submit button
    And Validate that the the pending event count is decreased by 1
  # And Click on Pending link
   #And Verify Enrollment employee no longer present
    Then Logout from the Page
   @NewHire_TC038
  Scenario: Ensure that when HR approves an NH enrollment, the pending events banner is updated and enrollment no longer appears on the pending event lists. NH enrollments with EOI pending events will also impact the banner when the NH enrollment is approved. (With EOI)
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
    Then click on letsGo button from YouarewellonyourwayPage
    #DoYouHaveDoctorPage
    And Click on IDontHave Doctor button from DoYouHaveDoctorPage
    #HowManyPrescriptionPage
    And Click on SkipThis link from HowManyPrescriptionPage
    #HowManyTimesDependentsSeekCarePage
    And Click on SkipThis link from DependentsSeekCarePage
    #ChooseHealthPlansPage
    #And Click on SkipThis link from ChooseHealthPlansPage
    #HouseHoldIncomePage
    And Click on SkipThis link from HouseHoldIncomePage
    #BenefitsPortfolioPage
    And Waive the Health Plans
    Then Waive the Dental Plans
    #And Waive the Vision Plans
    And Click on Save and Continue button from BenefitsPortfolioPage
    #SelectBeneficiariesPage
    And Click on make Primary Link
    And Click on Continue button from Select beneficiaries for your life insurance Page
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
    Then Click on Approve Link
    And Verify Approve Link click
    Then Click on Submit button
    Then Verify the Success message of event was approved
    And Validate that the the pending event count is decreased by 1
    And Click on Pending link
    Then Verify EOI event is visible
    Then Logout from the Page
