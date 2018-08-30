package com.UAT.RallyChoice.Automation.Steps;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.UAT.RallyChoice.Autmation.Reporting.ExtentManager;
import com.UAT.RallyChoice.Autmation.Reporting.ExtentUtilities;
import com.UAT.RallyChoice.Automation.Pages.EnrollmentClosedPage;
import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.UAT.RallyChoice.Automation.Pages.BasePage.getStepNumber;

public class RallyChoiceSteps extends MasterStep {

	@Before
	public void tearUp(Scenario scenario) {
		/* local */
		appURL = Environment("URL");
		envName = "UAT01";

		/* sauce */

		/*
		 * appURL = System.getenv("url"); appURLForManager =
		 * Environment("appURLForManager"); envName =
		 * System.getenv("environment");
		 */

		currentScenario = scenario.getName().replace(" ", "");
		System.out.println(System.getProperty("user.dir"));
		AutomationCore.testFileAttachmentPath = System.getProperty("user.dir") + File.separator
				+ Environment("testAttachmentFilePath");
		System.out.println(AutomationCore.testFileAttachmentPath);

		ExtentUtilities.initilaizeExtentReport();
		ExtentManager.setExtentReportName();
		ExtentUtilities.createParentTest(scenario.getName());

		if(Environment("EnvironmentToExecute").equals("Local")){
			StartDriver();
		}
		else if(System.getenv("EnvironmentToExecute").toLowerCase().equals("sauce"))
		{
			System.out.println("Sauce Labs Execution is Started");
			StartDriver(System.getenv("browsertype"),"sauce");
		}
		else
		{
			if(System.getenv("EnvironmentToExecute").toLowerCase().equals("vm"))
				System.out.println("VM Execution is Started......");
			StartDriver();
		}

		getLoginPage();
		getHomePage();
		getEmployeePage();
		getBenefitsPortfolioPage();
		getCheckoutPage();
		getChooseHealthPlansPage();
		getContactPhoneNumberPage();
		getGoingPaperlessforRequiredCommunicationsPage();
		getHouseHoldIncomePage();
		getReviewandAcceptPage();
		getSelectBeneficiariesPage();
		getWearealmosttherPage();
		getYourContactInfoPage();
		getEmployeeListPage();
		getEmployersSearchPage();
		getCasesPage();
		getAvailableEnrollmentsPage();
		getEnrollmentOpenPage();
		getReviewYourInformationPage();
		getDoYouHaveDependentsPage();
		getDependentDetailsPage();
		getYourFamilyPage();
		getYouarewellonyourwayPage();
		getDoYouHaveDoctorPage();
		getHowManyPrescriptionPage();
		getHowManyTimesDependentsSeekCarePage();

		getHealthBenefitsPage();
		getDentalBenefitsPage();
		getadditionalinfoPage();
		getMoreThanBenefitPage();
		getPrimaryCarePhysicianPage();
		getMemberOfYourFamilyPregnantPage();
		getAreYouInterestedInLosingWeightPage();
		getStressAffectingPage();
		getEnrollmentCompletePage();
		getEnrollmentClosedPage();
		getVisionBenefitsPage();
		getChronicConditionPage();
		getHealthBeginPage();
		getCommunicationPreferencesPage();
		getHealthProgramSummaryPage();
		getSummaryOfYourBenefitsPage();
		getLifeInsurancePage();
		getHowMuchCoverageWouldYouLikePage();

	}

	@After
	public void tearDown() {
		System.out.println("tear down");
		ExtentUtilities.extentFlush();
		quitDriver();
	}


	@When("^User enters Employers Name$")
	public void enter_Employers_Name(DataTable table) throws Throwable {
		homePage.enterEmployersName(table);

	}
	
	@When("^User enters Employers Name for Customerone$")
	public void enter_Employers_Name_for_CustomerOne(DataTable table) throws Throwable {
		homePage.enterEmployersName(table);

	}


	@And("^User navigates to Employee details page")
	public void Employee_Name() throws Throwable {
		homePage.navigateToEmployee_DetailPage();

	}
	
	@And("^User navigates to Employee Customer Zero One")
	public void Employee_Name_One() throws Throwable {
		homePage.navigateToEmployee_DetailPage1();

	}
	
	@Then("^User enters the Employee personal information using below input Data")
	public void Employee_PI(DataTable table) throws Throwable {
		employeeInfoPage.EmployeeDetails(table);

	}
	
	@Then("^MyUser enters the Employee personal information using below input Data For Error")
	public void Employee_PIError() throws Throwable {
		employeeInfoPage.EmploymentInfoError();

	}
	@Then("^User populates the Emp Personal info with below data")
	public void Employee_Details(DataTable table) throws Throwable {
		employeeInfoPage.EmployeeDetails_Customer01(table);

	}
	@And("^User enters the Employment Information using below input Data")
	public void EmploymentInfo(DataTable table) throws Throwable {
		employeeInfoPage.EmploymentInfo(table);

	}
	@And("^User enters the Employee Info with the below Data")
	public void EmploymentInfo_WithInfoData(DataTable table) throws Throwable {
		employeeInfoPage.EmploymentInfo1(table);

	}
	@Then("^User clicks on complete")
	public void completeClick() throws Throwable {
		employeeInfoPage.clickComplete();
		employeeInfoPage.verify_OopsError_and_ReEnter_SSN_and_ClickOnCompleteButton();

	}

	@Given("^User login  into RallyChoice Application$")
	public void user_login_into_RallyChoice_Application() throws Throwable {
		loginPage.login();
	}


	@Then("^Verify the Employee Created Successfull Message$")
	public void verify_the_Employee_Created_Successfull_Message() throws Throwable {
		employeeInfoPage.EmployeeAddSuccess();

	}

	@Then("^Search for the Created Employee$")
	public void search_for_the_Created_Employee() throws Throwable {
		employeeListPage.EmployeeSearch();
	}

	@Then("^Click on  Created Employee from displayed Results$")
	public void click_on_Created_Employee_from_displayed_Results() throws Throwable {
		employeeListPage.SelectEmployee();

	}

	@Then("^Click on View As Employee from Actions$")
	public void click_on_View_As_Employee_from_Actions() throws Throwable {
		availableEnrollmentsPage.ViewAsEmployee();

	}

	@Then("^Click on Get Started Now from Enrollment Open Page$")
	public void click_on_Get_Started_Now_from_Enrollment_Open_Page() throws Throwable {
		enrollmentIsOpenPage.VerifyEnrollmentIsOpenPage();
		enrollmentIsOpenPage.LetsGetStarted();
	}

	@Then("^Click on LooksGood button from ReviewYourInfoPage$")
	public void click_on_LooksGood_button_from_ReviewYourInfoPage() throws Throwable {
		reviewYourInformationPage.VerifyReviewYourInfoPage();
		reviewYourInformationPage.Click_Btn_LooksGood();
	}

	@Then("^Select your dependents to cover$")
	public void select_your_dependents_to_cover(DataTable arg1) throws Throwable {
		doYouHaveDependentsPage.VerifyDoYouHaveDependentsPage();
		doYouHaveDependentsPage.click_DependantsToCover(arg1);
	}

	@Then("^Enter your dependent details in Dependent Details Page$")
	public void enter_your_dependent_details_in_dependent_details_page(DataTable table) throws Throwable {
		dependentDetailsPage.DependentDetails(table);
	}

	@Then("^Click on continue button from YourFamilyPage$")
	public void click_on_continue_button_from_YourFamilyPage() throws Throwable {
		yourFamilyPage.Click_YourFamilyPageContinueButton();
	}

	@Then("^click on letsGo button from YouarewellonyourwayPage$")
	public void click_on_letsGo_button_from_YouarewellonyourwayPage() throws Throwable {
		youarewellonyourwayPage.Click_YouarewellonyourwayPageLetsGoButton();
	}
	@Then("^click on skipAhead button from YouarewellonyourwayPage$")
	public void click_on_skipAhead_button_from_YouarewellonyourwayPage() throws Throwable {
		youarewellonyourwayPage.Click_SkipAheadonYouarewellonyourwayPage();
	}

	@Then("^Click on IDontHave Doctor button from DoYouHaveDoctorPage$")
	public void click_on_IDontHave_Doctor_button_from_DoYouHaveDoctorPage() throws Throwable {
		doYouHaveDoctorPage.Click_IDontHaveADoctorButton();
	}

	@Then("^Click on SkipThis link from HowManyPrescriptionPage$")
	public void click_on_SkipThis_link_from_HowManyPrescriptionPage() throws Throwable {
		howManyPrescriptionPage.Click_HowManyPrescriptionPagelink_SkipThis();
	}

	@Then("^Click on SkipThis link from DependentsSeekCarePage$")
	public void click_on_SkipThis_link_from_DependentsSeekCarePage() throws Throwable {
		howManyTimesDependentsSeekCarePage.Click_DependentsSeekCarePageSkipThisLink();
	}

	@Then("^Click on SkipThis link from ChooseHealthPlansPage$")
	public void click_on_SkipThis_link_from_ChooseHealthPlansPage() throws Throwable {
		chooseHealthPlansPage.healthPlan_SkipClick();
		chooseHealthPlansPage.verify_Navigation_to_HouseHoldPage();
	}

	@Then("^Click on SkipThis link from HouseHoldIncomePage$")
	public void click_on_SkipThis_link_from_HouseHoldIncomePage() throws Throwable {
		houseHoldIncomePage.houseHoldIncomePage_SkipClick();
		houseHoldIncomePage.verifySkipThisClickOnIncomePage();
	}

	@Then("^Verify User in benefits portfolio Page$")
	public void verify_User_in_benefits_portfolio_Page() throws Throwable {


	}

	@Then("^Enroll Health Plans$")
	public void enroll_Health_Plans() throws Throwable {
		benefitsPortfolioPage.enrollHealth();
	}

	@Then("^Click on View Available Plans for Health Plans$")
	public void click_on_View_Available_Plans_for_Health_Plans() throws Throwable {
		healthBenefitsPage.clickAvailableHealthPlans();

	}

	@Then("^Click on Continue button from Which Plan best fits for you Health Plans$")
	public void click_on_Continue_button_from_Which_Plan_best_fits_for_you_Health_Plans() throws Throwable {
		healthBenefitsPage.clickContinueHealthPlans();

	}
	@Then("^Click on Continue with Texas  button from Which Plan best fits for you Health Plans$")
	public void click_on_ContinuewithTexas_button_from_Which_Plan_best_fits_for_you_Health_Plans() throws Throwable {
		healthBenefitsPage.clickContinuewithTexas();

	}

	@Then("^Click on continue button from cover with this plan Page Health Plans$")
	public void click_on_continue_button_from_cover_with_this_plan_Page_Health_Plans() throws Throwable {
		healthBenefitsPage.clickContinueCoverHealthPlans();

	}

	@Then("^Waive the Health Plans$")
	public void waive_the_Health_Plans() throws Throwable {
		benefitsPortfolioPage.waiveHealth();
		SeleniumHelper.threadSleep(3000);
	}

	@Then("^Verify the Waived Health Plans Successfull$")
	public void verify_the_Waived_Health_Plans_Successfull() throws Throwable {
		benefitsPortfolioPage.heathWaivedVerification();

	}

	@Then("^Enroll Dental Plans$")
	public void enroll_Dental_Plans() throws Throwable {


	}

	@Then("^Click on View Available Plans for Dental Plans$")
	public void click_on_View_Available_Plans_for_Dental_Plans() throws Throwable {


	}

	@Then("^Click on Continue button from Your employer is offering the plan detailed below for Dental Plans$")
	public void click_on_Continue_button_from_Your_employer_is_offering_the_plan_detailed_below_for_Dental_Plans() throws Throwable {


	}

	@Then("^Click on continue button from cover with this plan Page Dental Plans$")
	public void click_on_continue_button_from_cover_with_this_plan_Page_Dental_Plans() throws Throwable {


	}

	@Then("^Waive the Dental Plans$")
	public void waive_the_Dental_Plans() throws Throwable {
		benefitsPortfolioPage.waiveDental();
		SeleniumHelper.threadSleep(3000);
	}

	@Then("^Waive the Health Savings Account Plans$")
	public void waive_the_Health_Savings_Plans() throws Throwable {
		benefitsPortfolioPage.waiveHealthSavingsAccount();
		SeleniumHelper.threadSleep(3000);
	}

	@Then("^Verify Waived Dental Plans Successfull$")
	public void verify_Waived_Dental_Plans_Successfull() throws Throwable {
		benefitsPortfolioPage.dentalWaivedVerification();

	}
	@Then("^Verify Health account Savings Plans waived Successfull$")
	public void verify_Health_account_Savings_Plans_waived_Successfull() throws Throwable {
		benefitsPortfolioPage.healthSavingsAccountWaivedVerification();

	}
	@Then("^Enroll Vision Plans$")
	public void enroll_Vision_Plans() throws Throwable {
         benefitsPortfolioPage.enrollVision();

	}

	@Then("^Click on View Available Plans for Vision Plans$")
	public void click_on_View_Available_Plans_for_Vision_Plans() throws Throwable {
               visionBenefitsPage.Click_ViewAvailablePlansButton();

	}

	@Then("^Click on Continue button from Your employer is offering the plan detailed below for Vision Plans$")
	public void click_on_Continue_button_from_Your_employer_is_offering_the_plan_detailed_below_for_Vision_Plans() throws Throwable {
            visionBenefitsPage.Click_btn_Continue_Youremployerisoffering();

	}

	@Then("^Click on continue button from cover with this plan Page Vision Plans$")
	public void click_on_continue_button_from_cover_with_this_plan_Page_Vision_Plans() throws Throwable {
            visionBenefitsPage.Click_btn_Continue_WhoWouldYouLikeToCoverWithThisPlan();

	}

	@Then("^Waive the Vision Plans$")
	public void waive_the_Vision_Plans() throws Throwable {
		benefitsPortfolioPage.waiveVision();
		SeleniumHelper.threadSleep(3000);
	}
	@Then("^Waive the Life Insurance Plans$")
	public void Waive_the_Life_Insurance_Plans() throws Throwable {
		benefitsPortfolioPage.waiveLifeInsurance();
		SeleniumHelper.threadSleep(3000);
	}
	@Then("^Verify Waived Life Insurance Plan Successfull$")
	public void Verify_Waived_Life_Insurance_Plans_Successfull() throws Throwable {
		benefitsPortfolioPage.lifeInsuranceWaivedVerification();
	}
	@Then("^Verify Waived Vision Plans Successfull$")
	public void verify_Waived_Vision_Plans_Successfull() throws Throwable {
		benefitsPortfolioPage.visionWaivedVerification();

	}

	@Then("^Click on Save and Continue button from BenefitsPortfolioPage$")
	public void click_on_Save_and_Continue_button_from_BenefitsPortfolioPage() throws Throwable {
		benefitsPortfolioPage.saveAndContinue();
		//SeleniumHelper.threadSleep(5000);
		//benefitsPortfolioPage.enrollmentSaveVerifiction();
	}

	@Then("^Click on Add Beneficiary plus button$")
	public void click_on_Add_Beneficiary_plus_button() throws Throwable {


	}

	@Then("^Add Beneficary details$")
	public void add_Beneficary_details() throws Throwable {


	}

	@Then("^Verify Benificary Added Successfull message$")
	public void verify_Benificary_Added_Successfull_message() throws Throwable {


	}

	@Then("^Click on make Primary Link$")
	public void click_on_make_Primary_Link() throws Throwable {
		selectBeneficiariesPage.selectBeneficiaries();

	}

	@Then("^Click on Continue button from Select beneficiaries for your life insurance Page$")
	public void click_on_Continue_button_from_Select_beneficiaries_for_your_life_insurance_Page() throws Throwable {
		selectBeneficiariesPage.continueLink_Click();
		//selectBeneficiariesPage.SelectBeneficiariesPageVerification();
	}

	@Then("^Click continue button from WeAreAlmostTherePage$")
	public void click_continue_button_from_WearealmosttherPage() throws Throwable {
		wearealmosttherPage.clickButton();
		wearealmosttherPage.wearealmosttherPageSaveVerification();

	}

	@Then("^Enter PhoneNumber and Phone type from ContactPhoneNumberPage$")
	public void enter_PhoneNumber_and_Phone_type_from_ContactPhoneNumberPage(DataTable table) throws Throwable {
		contactPhoneNumberPage.enterPhoneNo(table);
		contactPhoneNumberPage.clickPhoneType();
		contactPhoneNumberPage.selectPhoneType();

	}

	@Then("^Click on Continue button from ContactPhoneNumberPage$")
	public void click_on_Continue_button_from_ContactPhoneNumberPage() throws Throwable {
		contactPhoneNumberPage.clickContinue();
		contactPhoneNumberPage.contactPhoneNumberSaveVerification();
	}

	@Then("^Verify the Phone added Success message$")
	public void verify_the_Phone_added_Success_message() throws Throwable {
		contactPhoneNumberPage.contactPhoneNumberSaveVerification();

	}

	@Then("^Click on Continue button from YourContactInfoPage$")
	public void click_on_Continue_button_from_YourContactInfoPage() throws Throwable {
		yourContactInfoPage.click_ContactInfoButton();
		yourContactInfoPage.YourContactInfoPageSaveVerification();

	}

	@Then("^Click on GoPaperLess button from GoingPaperlessforRequiredCommunicationsPage$")
	public void click_on_GoPaperLess_button_from_GoingPaperlessforRequiredCommunicationsPage() throws Throwable {
		goingPaperlessPage.click_GoingPaperless();

	}
	@Then("^Verify checkoutpage$")
	public void Verify_checkoutpage() throws Throwable {
		goingPaperlessPage.GoingPaperlessPageSave_Verification();

	}
	@Then("^Click on Check Out Now button$")
	public void click_on_Check_Out_Now_button() throws Throwable {
		checkoutPage.clickCheckoutNow();

	}

	@Then("^Check the CheckBox of By checking this box, I agree that from Last step Please review and accept the terms below$")
	public void check_the_CheckBox_of_By_checking_this_box_I_agree_that_from_Last_step_Please_review_and_accept_the_terms_below() throws Throwable {
		checkoutPage.clickCheckBox();

	}

	@Then("^Click on Complete Enrollment$")
	public void click_on_Complete_Enrollment() throws Throwable {
		checkoutPage.clickCompleteEnrol();

	}

	@Then("^Verify the Enrollment Complete message$")
	public void verify_the_Enrollment_Complete_message() throws Throwable {
		checkoutPage.completeEnrolVerifiction();

	}

	@Then("^Click on Exit from Enrollment Complete Page$")
	public void click_on_Exit_from_Enrollment_Complete_Page() throws Throwable {
		checkoutPage.clickExit();

	}

	@Then("^Verify the Pending message displayed$")
	public void verify_the_Pending_mesage_displayed() throws Throwable {
		reviewandAcceptPage.VerifyPendingLink();

	}

	@Then("^Click on Pending link$")
	public void click_on_Pending_link() throws Throwable {
		reviewandAcceptPage.clickPendingLink();

	}

	@Then("^Verify the user is on Pending EventsPage and Click on Employee Link$")
	public void verify_the_user_is_on_Pending_EventsPage_and_Click_on_Employee_Link() throws Throwable {
		reviewandAcceptPage.clickEmployeeNameLink();
		reviewandAcceptPage.verify_Pending_EventPage();
	}

	@Then("^Click on New Hire Enrollment Link$")
	public void click_on_New_Hire_Enrollment_Link() throws Throwable {
		//reviewandAcceptPage.clickNewHireEnrollLink();
		//test
		reviewandAcceptPage.clickNewHireEnrollLinktest();

	}

	@Then("^Click on Approve Link$")
	public void click_on_Approve_Link() throws Throwable {
		reviewandAcceptPage.clickApprove();

	}
	@Then("^Verify Approve Link click$")
	public void Verify_on_Approve_Link() throws Throwable {
		reviewandAcceptPage.verify_ApproveClick();

	}

	@Then("^Click on Reject Link$")
	public void click_on_Reject_Link() throws Throwable {
		reviewandAcceptPage.clickReject();

	}

	@Then("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		reviewandAcceptPage.clickSubmit();

	}

	@Then("^Verify the Success message of event was approved$")
	public void verify_the_Success_message_of_event_was_approved() throws Throwable {
		reviewandAcceptPage.verify_SuccessMessage();

	}
	@Then("^Validate that HR is notified of pending enrollment$")
	public void Validate_that_HR_is_notified_of_pending_enrollment() throws Throwable {


	}
	@Then("^Validate that the enrollment window is still open$")
	public void Validate_that_the_enrollment_window_is_still_open() throws Throwable {
		enrollmentCompletePage.verify_VieworModify();

	}
	@Then("^Click on modify or view changes$")
	public void Click_on_modify_or_view_changes() throws Throwable {
        enrollmentCompletePage.click_VieworModify();

	}
	@Then("^click on make changes$")
	public void click_on_make_changes() throws Throwable {
     summaryOfYourBenefitsPage.Click_MakeChanges();

	}
	@Then("^Click continue on AdditionalInfoPage$")
	public void Click_continue_on_AdditionalInfoPage() throws Throwable {
            additionalinfoPage.Click_ContinueAdditionalInfoPage();

	}
	@Then("^Click on make changes on HealthProgramsSummaryPage$")
	public void Click_on_make_changes_on_HealthProgramsSummaryPage$() throws Throwable {
		healthProgramSummaryPage.click_MakeChanges();

	}
	@Then("^Click continue on HealthProgramsSummaryPage$")
	public void Click_continue_on_HealthProgramsSummaryPage$() throws Throwable {
		healthProgramSummaryPage.continueLink_Click();

	}
	@Then("^click ok for Are you sure$")
	public void click_ok_for_Are_you_sure() throws Throwable {
		healthProgramSummaryPage.click_Ok();

	}
	@Then("^Click Skip this on StressAffectingPage$")
	public void Click_Skip_this_on_StressAffectingPage() throws Throwable {
           stressAffectingPage.Click_StressAffectingPageSkipThisLink();

	}
	@Then("^Click Skip this on ChronicConditionPage$")
	public void Click_Skip_this_on_ChronicConditionPage() throws Throwable {
		chronicConditionPage.Click_label_ChronicConditionPageLink();

	}
	@Then("^Click Continue on HealthBeginPage$")
	public void Click_Continue_on_HealthBeginPage() throws Throwable {
		healthBeginPage.Click_label_HealthBeginPageLink();

	}
	@Then("^Click continue button from CommunicationPreferencesPage$")
	public void Click_continue_button_from_CommunicationPreferencesPage() throws Throwable {
          communicationPreferencesPage.click_Continue_CommunicationPreferencesPage();

	}
	@Then("^Validate when I return to the welcome page the pending banner is displayed$")
	public void Validate_when_I_return_to_the_welcome_page_the_pending_banner_is_displayed() throws Throwable {


	}
	//new screens
	@Then("^Click Skip This on PrimaryCarePhysicianPage$")
	public void Click_Skip_This_on_PrimaryCarePhysicianPage() throws Throwable {
		primaryCarePhysicianPage.Click_PcpSkipThis();

	}
	@Then("^Click Important Notice on PrimaryCarePhysicianPage$")
	public void Click_Important_Notice_on_PrimaryCarePhysicianPage() throws Throwable {
		primaryCarePhysicianPage.Click_ImportantNotice();

	}
	@Then("^Click Are You Sure on PrimaryCarePhysicianPage$")
	public void Click_Are_You_Sure_on_PrimaryCarePhysicianPage() throws Throwable {
		primaryCarePhysicianPage.Click_AreYouSure();

	}
	@Then("^Click lets go on MoreThanBenefitPage$")
	public void Click_lets_go_on_MoreThanBenefitPage() throws Throwable {
		moreThanBenefitPage.Click_ContinueBenefitsPage();

	}
	@Then("^Click Skip this on MemberOfYourFamilyPregnantPage$")
	public void Click_Skip_this_on_MemberOfYourFamilyPage() throws Throwable {
		memberOfYourFamilyPregnantPage.Click_MemberOfYourFamilyPregnantPageSkipThisLink();

	}
	@Then("^Click Yes on MemberOfYourFamilyPregnantPage$")
	public void Click_Yes_on_MemberOfYourFamilyPage() throws Throwable {
		memberOfYourFamilyPregnantPage.Click_Yes_MemberOfYourFamilyPregnantPage();

	}
	@Then("^Click Skip this on LosingWeightPage$")
	public void Click_Skip_this_on_LosingWeightPage() throws Throwable {
		areYouInterestedInLosingWeightPage.Click_AreYouInterestedInLosingWeightPageSkipThisLink();

	}
	@Then("^Logout from the Page$")
	public void logout_from_the_Page() throws Throwable {
		loginPage.logOut();

	}

	@Then("^Verify the Reject message of event$")
	public void verify_the_Reject_message_of_event() throws Throwable {
		reviewandAcceptPage.verify_RejectMessage();
	}

	@And("^Add the ApprovedORRejected message$")
	public void add_the_ApprovedORRejected_message(DataTable table) throws Throwable {
		reviewandAcceptPage.Enter_ApproveORRejectCommentsMessage(table);
	}


	@Then("^Click on View As Employee from Available Enrollments Page$")
	public void click_on_View_As_Employee_from_Available_Enrollments_Page() throws Throwable {
      availableEnrollmentsPage.Click_ViewAsEmployeebtn();

	}

	@Then("^Click on view my benefits$")
	public void click_on_view_my_benefits() throws Throwable {
		enrollmentClosedPage.Verify_EnrollmentCompletePage();
        enrollmentClosedPage.click_ViewMyBenifits();
	}
	
	@Then("^verify_ViewMyBenifitsisnotDisplayedForEnrollReject$")
	public void verify_ViewMyBenifitsisnotDisplayedForEnrollReject() throws Throwable {
		//enrollmentClosedPage.Verify_EnrollmentCompletePage();
        enrollmentClosedPage.verify_ViewMyBenifitsisnotDisplayedForEnrollReject();
	}

	@Then("^Verify the Summary is displayed$")
	public void verify_the_Summary_is_displayed() throws Throwable {
		enrollmentClosedPage.Verify_BenefitsfromSummaryPage();
	}

	@Then("^Verify the Enrollment Has Closed status is displayed$")
	public void verify_the_Enrollment_Has_Closed_status_is_displayed() throws Throwable {
		enrollmentClosedPage.Verify_EnrollmentCompletePage();

	}

	@Then("^Add the Rejeted message$")
	public void add_the_Rejeted_message() throws Throwable {

	}
	@Then("^Validate the Notification your coverage is pending$")
	public void Validate_the_Notification_your_coverage_is_pending() throws Throwable {
        benefitsPortfolioPage.coverageIsPendingVerification();

	}
	@Then("^Validate the pending notification on benefitPortfolioPage$")
	public void Validate_the_pending_notification_on_benefitPortfolioPage() throws Throwable {
		benefitsPortfolioPage.pendingNotificationVerification();

	}
	@Then("^Click on Employee Link from pending events banner of NH$")
	public void Click_on_Employee_Link_from_pending_events_banner_of_NH() throws Throwable {
		reviewandAcceptPage.clickEmployeeNameLink();
	}

	@Then("^Validate that the pending enrollment is listed for the employee$")
	public void Validate_that_the_pending_enrollment_is_listed_for_the_employee() throws Throwable {
		reviewandAcceptPage.verifyPendingEnrollmentListedForEmployee();
	}
	@Then("^Validate that the pending tab is active for the employee$")
	public void Validate_that_the_pending_tab_is_active_for_the_employe() throws Throwable {
		reviewandAcceptPage.verify_Pending_EventPage();
	}

	@Then("^Validate that the pending events banner shows a count of NH$")
	public void Validate_that_the_pending_events_banner_shows_a_count_of_NH() throws Throwable {
		reviewandAcceptPage.getPendingCount();

	}
	@Then("^Validate that when the link is clicked the system redirects to the pending event list$")
	public void Validate_that_when_the_link_is_clicked_the_system_redirects_to_the_pending_event_list() throws Throwable {
		reviewandAcceptPage.VerifyPendingEventLinkRedirect();

	}
	@Then("^Validate the pending tab remains active and the EOI event is visible when the administrator views the employee profile list of pending events$")
	public void Validate_the_pending_tab_remains_active() throws Throwable {


	}
	@Then("^Validate the following First,last name,event label, Event Type$")
	public void Validate_the_following_First_last_name_event_label_Event_Type() throws Throwable {


	}

	@Then("^Delete the Employee enrollment$")
	public void Delete_the_Employee_enrollment() throws Throwable {


	}
	@Then("^Validate that the the pending event count is decreased by 1$")
	public void Validate_that_the_pending_event_count_is_decreased_by_1() throws Throwable {
		reviewandAcceptPage.verifyPendingCountAfterApproveOrReject();

	}
	@Then("^Valdiate that the NH enrollment event on the employee profile pending list has been removed$")
	public void Valdiate_that_the_NH_enrollment_event_on_the_employee_profile_pending_list_has_been_removed() throws Throwable {


	}
	@Then("^Validate that the NH enrollment event on the pending events list under the employees navigation tab has been removed$")
	public void Validate_that_the_NH_enrollment_event() throws Throwable {


	}
	@Then("^Click on check box to autofill employee details$")
	public void Click_on_check_box_to_autofill_employee_details() throws Throwable {
		employeeInfoPage.checkBox_click();

	}
	@Then("^User gets Pending event counts$")
	public void User_gets_Pending_event_counts() throws Throwable {
		reviewandAcceptPage.getPendingCount();
	//	reviewandAcceptPage.verifyPendingCountAfterReject();
	}
	/*@Then("^User gets Pending event counts After event being reject$")
	public void User_gets_Pending_event_counts_After_Event_being_Reject() throws Throwable {
		reviewandAcceptPage.verifyPendingCountAfterReject();

	}*/
	@Then("^Verify Enrollment employee no longer present$")
	public void verify_Enrollment_employee_no_longer_present() throws Throwable {
		reviewandAcceptPage.verifyEnrollmentPendingEmployeeNoLongerPresent();

	}

	@Then("^Click on the Enroll button to enroll the Dental plans$")
	public void Click_on_the_Enroll_button_to_enroll_the_Dental_plans() throws Throwable {
		benefitsPortfolioPage.enrollDental();

	}
	@And("^Click on View Available Plans button in Dental Benfits Page$")
	public void Click_on_View_Available_Plans_button_in_Dental_Benfits_Page() throws Throwable {
		dentalBenefitsPage.Click_ViewAvailablePlansButton();

	}
	@And("^Click on Continue button in Your Employer is offering page$")
	public void Click_on_Continue_button_in_Your_Employer_is_offering_page() throws Throwable {
		dentalBenefitsPage.Click_ContinueButton();

	}
	@And("^Click on Continue button in Who Would you like to cover with this plan page$")
	public void Click_on_Continue_button_in_Who_Would_you_like_to_cover_with_this_plan_page() throws Throwable {
		dentalBenefitsPage.Click_btn_Continue_WouldYouLikeToCover();

	}
	

	@Then("^Verify Pending banner$")
	public void Verify_Pending_banner() throws Throwable {
		enrollmentCompletePage.verify_Banner();

	}
	@Then("^Verify New Hire Enrollment Text$")
	public void Verify_New_Hire_Enrollment_Text() throws Throwable {
		reviewandAcceptPage.NewHireEnrollmentTextValidation();

	}
	@Then("^Verify New Hire Text$")
	public void Verify_New_Hire_Text() throws Throwable {
		reviewandAcceptPage.NewHireTextValidation();

	}
	@Then("^Verify Push pin icon$")
	public void Verify_Push_pin_icon() throws Throwable {
		reviewandAcceptPage.pushPinIconValidation();

	}
	@Then("^Verify Calender icon$")
	public void Verify_Calender_icon() throws Throwable {
		reviewandAcceptPage.CalenderIconValidation();

	}

	@Then("^Verify New Hire Label for Pending Employee$")
	public void Verify_NH_Label() throws Throwable {
		reviewandAcceptPage.Verify_Label_NewHireEnrollmentPendingEvent();

	}
	@And("^Click on Learn More Or Make Changes button$")
	public void Click_On_ClickORLearnMoreChanges_Button() throws Throwable {
		benefitsPortfolioPage.Click_LearnMoreOrMakeChangesButton();

	}
	@And("^Click on View Available Plans button in LifeInsurance Page$")
	public void Click_On_ViewAvailablePlans_Button_In_LifeInsurancePage() throws Throwable {
		lifeInsurancePage.Click_ViewAvailablePlansButton();

	}
	@And("^Click on Customize Your Coverage Link in HowMuchCoverageWouldYouLikePage$")
	public void Click_on_Customize_Your_Coverage_Link_in_HowMuchCoverageWouldYouLikePage() throws Throwable {
		howMuchCoverageWouldYouLikePage.Click_link_CustomizeYourCoverage();

	}
	@And("^Enter Life Coverage value in HowMuchCoverageWouldYouLikePage$")
	public void Enter_Life_Coverage_value_in_HowMuchCoverageWouldYouLikePage(DataTable table) throws Throwable {
		howMuchCoverageWouldYouLikePage.enterCoverage(table);

	}	
	@And("^Click on Continue button from HowMuchCoverageWouldYouLikePage$")
	public void Click_on_Continue_button_from_HowMuchCoverageWouldYouLikePage() throws Throwable {
		howMuchCoverageWouldYouLikePage.Click_ContinueButton();

	}
	@And("^Click on OkayGotIt button from HowMuchCoverageWouldYouLikePage$")
	public void Click_on_OkGotIt_button_from_HowMuchCoverageWouldYouLikePage() throws Throwable {
		howMuchCoverageWouldYouLikePage.Click_OkGotItButton();

	}
	@Then("^Verify EOI event is visible$")
	public void Verify_EOI_event_is_visible() throws Throwable {
		reviewandAcceptPage.EOIValidation();

	}
	@And("^Click on View My Benefits button from EnrollmentHasClosed Page$")
	public void Click_on_View_My_Benefits_button_from_EnrollmentHasClosed_Page() throws Throwable {
		enrollmentClosedPage.click_ViewMyBenifits();

	}
	@Then("^Verify the Banner shows your elections have been approved$")
	public void Verify_the_Banner_shows_your_elections_have_been_approved() throws Throwable {
		summaryOfYourBenefitsPage.Verify_YourElectionsHaveBeenApprovedLabelText();

	}

	@Then("^Verify Event Type on NH review")
	public void Verify_Event_Type_on_NH_review() throws Throwable {
		reviewandAcceptPage.VerifyEventType_NewHire();

	}
	@Then("^Verify Date of Event on NH review$")
	public void Verify_Date_of_Event() throws Throwable {
		reviewandAcceptPage.Verify_DateOfEvent();

	}

	@Then("^Verify Employee name on NH review$")
	public void Verify_Employee_name_on_NH_review() throws Throwable {
		reviewandAcceptPage.Verify_PersonsInvolved();

	}
	@Then("^Verify Approve Text on NH review$")
	public void Verify_Approve_Text_on_NH_review() throws Throwable {
		reviewandAcceptPage.verify_ApproveText();

	}

	@Then("^Verify Reject Text on NH review$")
	public void Verify_Reject_Text_on_NH_review() throws Throwable {
		reviewandAcceptPage.verify_RejectText();

	}

	@Then("^Verify RequestRevisionText Text on NH review$")
	public void Verify_RequestRevisionText_Text_on_NH_review() throws Throwable {
		reviewandAcceptPage.verify_RequestRevisionText();


	}
	@Then("^User is able to scroll down the page if list of benefits is long$")
	public void User_is_able_to_scroll_down() throws Throwable {
		reviewandAcceptPage.Scroll_Down();

	}
	
	@Then("^verify Step two page with Approve corresponding message is displayed$")
	public void verify_Step_two_page_with_Approve_corresponding_message_is_displayed() throws Throwable {
	    reviewandAcceptPage.verify_Step2ApproveMessage();
	}

	@Then("^verify Step two page with Reject corresponding message is displayed$")
	public void verify_Step_two_page_with_Reject_corresponding_message_is_displayed() throws Throwable {
	   reviewandAcceptPage.verify_Step2RejectMessage();
	}

	
	@Then("^Click Cancel button$")
	public void click_Cancel_button() throws Throwable {
		reviewandAcceptPage.click_CancelButton();
	}

	@Then("^Verify user is redirected to the pending review page step one$")
	public void verify_user_is_redirected_to_the_pending_review_page_step_one() throws Throwable {
		reviewandAcceptPage.verifyEnrollCancelNavigation();
	}

	@Then("^Verify new bullet after I authorize bullet on the terms and conditions page displays as_I understand that my benefits will not be effective unless first approved by my company's benefits administrator or other relevant party$")
	public void verify_new_bullet_after_I_authorize_bullet_on_the_terms_and_conditions_page_displays_as_I_understand_that_my_benefits_will_not_be_effective_unless_first_approved_by_my_company_s_benefits_administrator_or_other_relevant_party() throws Throwable {
	   checkoutPage.Label_AgreeMessageverification();
	}

	@Then("^Get the Pending plan details from the benefit summary page$")
	public void Get_the_Pending_plan_details_from_the_benefit_summary_page() throws Throwable {
		reviewandAcceptPage.get_PlanPayCost();
	}
	@Then("^Verify the employee profile list of pending events is displayed$")
	public void Verify_the_employee_profile_list_of_pending_events_is_displayed() throws Throwable {
		reviewandAcceptPage.Verify_PendingEventsOnEmployeeProfilePage();
	}
	@Then("^Verify Your Coverage Is Pending header in Summary Of Your Benefits Page$")
	public void Verify_Your_Coverage_Is_Pending_header_in_Summary_Of_Your_Benefits_Page() throws Throwable {
		summaryOfYourBenefitsPage.Verify_label_YourCoverageIsPendingText();

	}
	@And("^Click continue on HealthProgramSummaryPage$")
	public void Click_continue_on_HealthProgramSummaryPage() throws Throwable {
		healthProgramSummaryPage.continueLink_Click();

	}
	
	@Then("^Validate Notice your elections have been approved is displayed$")
	public void Validate_Notice_your_elections_have_been_approved_is_displayed() throws Throwable {
		enrollmentClosedPage.Verify_BenefitsfromSummaryPage();
		enrollmentClosedPage.Verify_yourElectionsText();
	}
}
