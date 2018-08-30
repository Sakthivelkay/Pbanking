@RallyChoice1234
Feature: RallyChoice Scenarios

  @NewHire_TC001234
  Scenario: NewHire_TC001_Employee completes their NH enrollment and submits before the 14 day period ends HR approves the submission
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 01 |
    #need modification
    And User navigates to Employee details page
    And Click on check box to autofill employee details
    And MyUser enters the Employee personal information using below input Data For Error
    Then User clicks on complete

  @NewHire_TC0012345
  Scenario: NewHire_TC001_Employee completes their NH enrollment and submits before the 14 day period ends HR approves the submission
    Given User login  into RallyChoice Application
    When User enters Employers Name
      | EmployerName                 |
      | New Hire Testing Customer 05 |
    #need modification
  And User navigates to Employee details page
    # And Click on check box to autofill employee details
    # Then User enters the Employee personal information using below input Data
    #  | EmployeeCityName | EmployeeZipCode | EmployeeState |
    # | Chicago          |           60606 | IL            |
    #And User enters the Employment Information using below input Data
    #  | ClassType |
    # | Non-Union |
    #Then User clicks on complete
    And Click on Pending link
    And Click on Employee Link from pending events banner of NH
    And Click on New Hire Enrollment Link
    Then Click on Reject Link
    And verify Step two page with Reject corresponding message is displayed
    Then Click on Submit button
    Then Click on View As Employee from Available Enrollments Page
    #EnrollmentClosedPage
    Then verify_ViewMyBenifitsisnotDisplayedForEnrollReject
    And Click on Exit from Enrollment Complete Page
    Then Logout from the Page
