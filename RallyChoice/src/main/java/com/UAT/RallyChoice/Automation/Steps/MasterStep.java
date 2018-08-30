package com.UAT.RallyChoice.Automation.Steps;

import java.io.File;
import java.lang.reflect.Method;
import com.UAT.RallyChoice.Automation.Pages.EmployeeInfoPage;
import com.UAT.RallyChoice.Automation.Pages.EmployeeListPage;
import com.UAT.RallyChoice.Automation.Pages.EmployerSearchPage;
import com.UAT.RallyChoice.Automation.Pages.EnrollmentIsOpenPage;
import com.UAT.RallyChoice.Automation.Pages.HomePage;
import com.UAT.RallyChoice.Automation.Pages.HowManyPrescriptionPage;
import com.UAT.RallyChoice.Automation.Pages.DependentsSeekCarePage;
import com.UAT.RallyChoice.Automation.Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import com.UAT.RallyChoice.Autmation.Reporting.ExtentUtilities;
import com.UAT.RallyChoice.Automation.Pages.AvailableEnrollmentsPage;
import com.UAT.RallyChoice.Automation.Pages.BasePage;
import com.UAT.RallyChoice.Automation.Pages.CasesPage;
import com.UAT.RallyChoice.Automation.Pages.DependentDetailsPage;
import com.UAT.RallyChoice.Automation.Pages.DoYouHaveDependentsPage;
import com.UAT.RallyChoice.Automation.Pages.DoYouHaveDoctorPage;
import com.UAT.RallyChoice.Automation.Pages.LoginPage;
import com.UAT.RallyChoice.Automation.Pages.ReviewYourInformationPage;
import com.UAT.RallyChoice.Automation.Pages.YouarewellonyourwayPage;
import com.UAT.RallyChoice.Automation.Pages.YourFamilyPage;
import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;

public class MasterStep extends AutomationCore {
	public WebDriver testDriver;
	public LoginPage loginPage = null;
	public HomePage homePage = null;
	public CasesPage casesPage = null;
	public EmployeeInfoPage employeeInfoPage = null;
	public EmployerSearchPage employersSearchPage = null;
	public EmployeeListPage employeeListPage = null;
	public AvailableEnrollmentsPage availableEnrollmentsPage = null;
	public EnrollmentIsOpenPage enrollmentIsOpenPage = null;
	public ReviewYourInformationPage reviewYourInformationPage = null;
	public DoYouHaveDependentsPage doYouHaveDependentsPage = null;
	public DependentDetailsPage dependentDetailsPage = null;
	public YourFamilyPage yourFamilyPage = null;
	public YouarewellonyourwayPage youarewellonyourwayPage = null;
	public DoYouHaveDoctorPage doYouHaveDoctorPage = null;
	public HowManyPrescriptionPage howManyPrescriptionPage = null;
	public DependentsSeekCarePage howManyTimesDependentsSeekCarePage = null;
	public BenefitsPortfolioPage benefitsPortfolioPage = null;
	public CheckoutPage checkoutPage = null;
	public ChooseHealthPlansPage chooseHealthPlansPage = null;
	public ContactPhoneNumberPage contactPhoneNumberPage = null;
	public GoingPaperlessPage goingPaperlessPage = null;
	public HouseHoldIncomePage houseHoldIncomePage = null;
	public ReviewandAcceptPage reviewandAcceptPage = null;
	public SelectBeneficiariesPage selectBeneficiariesPage = null;
	public WeAreAlmostTherePage wearealmosttherPage = null;
	public YourContactInfoPage yourContactInfoPage = null;
    public HealthBenefitsPage healthBenefitsPage = null;
	public DentalBenefitsPage dentalBenefitsPage = null;
	public VisionBenefitsPage visionBenefitsPage = null;
	//new screens_nitish
	public AdditionalinfoPage additionalinfoPage = null;
	public MoreThanBenefitPage moreThanBenefitPage = null;
	public PrimaryCarePhysicianPage primaryCarePhysicianPage = null;
	//new screens Sandeep
    public MemberOfYourFamilyPregnantPage memberOfYourFamilyPregnantPage = null;
    public AreYouInterestedInLosingWeightPage areYouInterestedInLosingWeightPage = null;
    public StressAffectingPage stressAffectingPage = null;
    public ChronicConditionPage chronicConditionPage = null;
    public HealthBeginPage healthBeginPage = null;
    public CommunicationPreferencesPage communicationPreferencesPage = null;
    public WeAreAlmostTherePage weAreAlmostTherePage = null;
    public EnrollmentCompletePage enrollmentCompletePage = null;
    public EnrollmentClosedPage enrollmentClosedPage = null;
    public HealthProgramSummaryPage healthProgramSummaryPage = null;
	public SummaryOfYourBenefitsPage summaryOfYourBenefitsPage = null;
	public LifeInsurancePage lifeInsurancePage = null;
	public HowMuchCoverageWouldYouLikePage howMuchCoverageWouldYouLikePage = null;
    
	// RallyChoice_Pages Instances
	
	public String testName = null;
	public boolean status = true;
	public int totalIterations = 0;
	public int currentIteration = 1;
	public String initialTIme = null;
	public static String currentScreen = "";
	public static String currentScenario = "";

	/* RDE_Pages Instances started */

	public String testStartTime() {
		String startTIme = formatDateAndTime(getCurrentDateAndTime(), Environment("testTimeFormat"));
		return startTIme;
	}

	public String testEndTime() {
		String endTime = formatDateAndTime(getCurrentDateAndTime(), Environment("testTimeFormat"));
		return endTime;
	}

	public void updateStatus(boolean statusVal) {
		if (statusVal == false) {
			status = statusVal;
		}
		currentIteration = currentIteration + 1;
	}

	public void ReportSummary(String scenarioName, String scenarioDesc) {
		if (status == false && totalIterations == currentIteration - 1) {
			ReportTestSummary(testName, scenarioName, scenarioDesc, "FAIL", initialTIme, testEndTime(),
					timeDiffInSeconds(initialTIme, testEndTime(), Environment("testTimeFormat")));
			currentIteration = 1;
			status = true;
			Assert.fail();
		} else if (status == true && totalIterations == currentIteration - 1) {
			ReportTestSummary(testName, scenarioName, scenarioDesc, "PASS", initialTIme, testEndTime(),
					timeDiffInSeconds(initialTIme, testEndTime(), Environment("testTimeFormat")));
			currentIteration = 1;
			status = true;
		}
	}

	@SuppressWarnings("rawtypes")
	public static Object getPage(Class pageName) {

		try {
			return pageName.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void getLoginPage() {
		loginPage = new LoginPage(testDriver);
	}
	public void getHomePage() {
		homePage = new HomePage(testDriver);
	}
	public void getEmployeePage() {
		employeeInfoPage = new EmployeeInfoPage(testDriver);
	}
	
	public void getCasesPage() {
		casesPage = new CasesPage(testDriver);
	}
	
	public void getEmployersSearchPage() {
		employersSearchPage = new EmployerSearchPage(testDriver);
	}
	public void getEmployeeListPage() {
		employeeListPage = new EmployeeListPage(testDriver);
	}
	public void getAvailableEnrollmentsPage() {
		availableEnrollmentsPage = new AvailableEnrollmentsPage(testDriver);
	}
	
	public void getEnrollmentOpenPage() {
		enrollmentIsOpenPage = new EnrollmentIsOpenPage(testDriver);
	}
	
	public void getReviewYourInformationPage() {
		reviewYourInformationPage = new ReviewYourInformationPage(testDriver);
	}
	
	public void getDoYouHaveDependentsPage() {
		doYouHaveDependentsPage = new DoYouHaveDependentsPage(testDriver);
	}
	public void getDependentDetailsPage() {
		dependentDetailsPage = new DependentDetailsPage(testDriver);
	}
	public void getYourFamilyPage() {
		yourFamilyPage = new YourFamilyPage(testDriver);
	}
	
	public void getYouarewellonyourwayPage() {
		youarewellonyourwayPage = new YouarewellonyourwayPage(testDriver);
	}
	
	public void getDoYouHaveDoctorPage() {
		doYouHaveDoctorPage = new DoYouHaveDoctorPage(testDriver);
	}
	public void getHowManyPrescriptionPage() {
		howManyPrescriptionPage = new HowManyPrescriptionPage(testDriver);
	}
	public void getHowManyTimesDependentsSeekCarePage() {
		howManyTimesDependentsSeekCarePage = new DependentsSeekCarePage(testDriver);
	}
	
	public void getBenefitsPortfolioPage() {
		benefitsPortfolioPage = new BenefitsPortfolioPage(testDriver);
	}

	public void getCheckoutPage() {
		checkoutPage = new CheckoutPage(testDriver);
	}
	public void getChooseHealthPlansPage() {
		chooseHealthPlansPage = new ChooseHealthPlansPage(testDriver);
	}
	public void getContactPhoneNumberPage() {
		contactPhoneNumberPage = new ContactPhoneNumberPage(testDriver);
	}
	public void getGoingPaperlessforRequiredCommunicationsPage() {
		goingPaperlessPage = new GoingPaperlessPage(testDriver);
	}
	public void getHouseHoldIncomePage() {
		houseHoldIncomePage = new HouseHoldIncomePage(testDriver);
	}
	public void getReviewandAcceptPage() {
		reviewandAcceptPage = new ReviewandAcceptPage(testDriver);
	}
	public void getSelectBeneficiariesPage() {
		selectBeneficiariesPage = new SelectBeneficiariesPage(testDriver);
	}
	public void getWearealmosttherPage() {
		wearealmosttherPage = new WeAreAlmostTherePage(testDriver);
	}
	public void getYourContactInfoPage() {
		yourContactInfoPage = new YourContactInfoPage(testDriver);
	}
	public void getHealthBenefitsPage() {
		healthBenefitsPage = new HealthBenefitsPage(testDriver);
	}
	
	public void getDentalBenefitsPage() {
		dentalBenefitsPage = new DentalBenefitsPage(testDriver);
	}
	
	public void getVisionBenefitsPage() {
		visionBenefitsPage = new VisionBenefitsPage(testDriver);
	}

	public void getadditionalinfoPage(){
		additionalinfoPage = new AdditionalinfoPage(testDriver);
	}
	public void getMoreThanBenefitPage(){
		moreThanBenefitPage = new MoreThanBenefitPage(testDriver);
	}
	public void getPrimaryCarePhysicianPage(){
		primaryCarePhysicianPage = new PrimaryCarePhysicianPage(testDriver);
	}
	public void getMemberOfYourFamilyPregnantPage(){
		memberOfYourFamilyPregnantPage = new MemberOfYourFamilyPregnantPage(testDriver);
	}
	public void getAreYouInterestedInLosingWeightPage(){
		areYouInterestedInLosingWeightPage = new AreYouInterestedInLosingWeightPage(testDriver);
	}
	public void getStressAffectingPage(){
		stressAffectingPage = new StressAffectingPage(testDriver);
	}
	
	public void getChronicConditionPage(){
		chronicConditionPage = new ChronicConditionPage(testDriver);
	}
	
	public void getHealthBeginPage(){
		healthBeginPage = new HealthBeginPage(testDriver);
	}
	
	public void getCommunicationPreferencesPage(){
		communicationPreferencesPage = new CommunicationPreferencesPage(testDriver);
	}
	
	
	
	

	public void getEnrollmentCompletePage(){
		enrollmentCompletePage = new EnrollmentCompletePage(testDriver);
	}
	
	public void getEnrollmentClosedPage(){
		enrollmentClosedPage = new EnrollmentClosedPage(testDriver);
	}


	public void getHealthProgramSummaryPage(){
		healthProgramSummaryPage = new HealthProgramSummaryPage(testDriver);
	}

	public void getSummaryOfYourBenefitsPage(){
		summaryOfYourBenefitsPage = new SummaryOfYourBenefitsPage(testDriver);
	}
	
	public void getLifeInsurancePage(){
		lifeInsurancePage = new LifeInsurancePage(testDriver);
	}
	
	public void getHowMuchCoverageWouldYouLikePage(){
		howMuchCoverageWouldYouLikePage = new HowMuchCoverageWouldYouLikePage(testDriver);
	}


	
	
	
	
	
	public void quitDriver() {
		BasePage.logInState = false;
		if (testDriver != null) {
			BasePage.switchToDefault(testDriver);
			testDriver.quit();
		}
	}

	@BeforeSuite
	public void suiteInitiate() {
		closeAllOpenedBrowsers();
		killExcel();
		closeAllOpenedDrivers();
		ExtentUtilities.initilaizeExtentReport();
	}

	@AfterSuite
	public void suiteClean() {
		closeAllOpenedBrowsers();
		killExcel();
		closeAllOpenedDrivers();
	}

	@BeforeMethod
	public void logTestClassNameInReport(Method method) {
		if (!(method.getName().contains("getBrowser"))) {
			SeleniumHelper.logTestCaseNameInReport(method.getName(), AutomationCore.testSetName);
		}
	}

	public void StartDriver(String browser, String platform) {
		AutomationCore.currentBrowser = Environment("Browser");
		AutomationCore.platform = "sauce";
		switch (platform) {
		case "local":
			testDriver = SeleniumHelper.createWebDriverLocal(browser);
			break;
		case "sauce":
			testDriver = SeleniumHelper.createWebDriverSauce(browser);
			break;
		default:
			Assert.fail("Invalid platform parameter + [" + platform + "] passed");

		}
		testDriver.manage().window().maximize();
	}

	public void StartDriver() {

		AutomationCore.currentBrowser = Environment("Browser");
		AutomationCore.platform = "local";

		switch (platform) {
		case "local":
			testDriver = SeleniumHelper.createWebDriverLocal(currentBrowser);
			System.out.println(testDriver);
			break;
		/*case "sauce":
			testDriver = SeleniumHelper.createWebDriverSauce(currentBrowser);
			break;*/
		default:
			Assert.fail("Invalid platform parameter + [" + platform + "] passed");

		}

		testDriver.manage().window().maximize();
	}
  
	@AfterMethod
	public void afterTest() {
		BasePage.stepNum = 0;
		System.out.println(BasePage.stepNum);
	}

	@BeforeTest
	public void logTestSetNameInReport(ITestContext tc) {
		AutomationCore.testSetName = tc.getName();
		SeleniumHelper.logTestSetNameInReport(tc.getName());
	}

	@DataProvider
	public Object[][] DLITestData(Method method) {
		testName = method.getName();
		AutomationCore.testName = testName;
		System.out.println(AutomationCore.testFileAttachmentPath);
		System.out.println(System.getProperty("user.dir"));
		AutomationCore.testFileAttachmentPath = System.getProperty("user.dir") + File.separator
				+ Environment("testAttachmentFilePath");
		System.out.println(AutomationCore.testFileAttachmentPath);
		System.out.println(AutomationCore.testName);
		BasePage.testNameValue = testName;
		Object[][] dliTestDaat = ReadDataFromExcel(testName);
		totalIterations = dliTestDaat.length;
		initialTIme = testStartTime();
		return dliTestDaat;
	}

}
