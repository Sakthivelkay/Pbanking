package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BenefitsPortfolioPage extends BasePage {
    private WebDriver benefitsPortfolioPageDriver;
    private String currentScreenName;

    public BenefitsPortfolioPage(WebDriver driver)
    {
        this.benefitsPortfolioPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }

    public WebElement btn_EnrollHealth() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_EnrollHealth"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_EnrollHealth in BenefitsPortfolioPage");
        return element;
    }

    public WebElement btn_EnrollDental() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_EnrollDental"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_EnrollDental in BenefitsPortfolioPage");
        return element;
    }

    public WebElement btn_EnrollVision() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_EnrollVision"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_EnrollVision in BenefitsPortfolioPage");
        return element;
    }
    public WebElement btn_WaiveHealth() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_WaiveHealth"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_WaiveHealth in BenefitsPortfolioPage");
        return element;
    }

    public WebElement btn_WaiveDental() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_WaiveDental"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_WaiveDental in BenefitsPortfolioPage");
        return element;
    }

    public WebElement btn_WaiveVision() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_WaiveVision"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_WaiveVision in BenefitsPortfolioPage");
        return element;
    }
    public WebElement btn_WaiveLifeInsurance() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_WaiveLifeInsurance"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_WaiveLifeInsurance in BenefitsPortfolioPage");
        return element;
    }
    public WebElement btn_HealthSavingsAccount() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_HealthSavingsAccount"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_HealthSavingsAccount in BenefitsPortfolioPage");
        return element;
    }


    public WebElement btn_SaveAndContinue() {
        WebElement element = SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_SaveAndContinue"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_SaveAndContinue in BenefitsPortfolioPage");
        return element;
    }
    
    //Sandeep's method
 
	public List<WebElement> btn_LearnMoreOrMakeChanges(){
		List<WebElement> elements= SeleniumHelper.findElements(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "btn_LearnMoreOrMakeChanges"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}

    public WebElement label_Beneficiaries()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_Beneficiaries"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Beneficiaries in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_Beneficiaries1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_Beneficiaries"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_HealthWaived()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_HealthWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_HealthWaived in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_HealthWaived1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_HealthWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_DentalWaived()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_DentalWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_DentalWaived in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_DentalWaived1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_DentalWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_HealthSavingsAccountWaived()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_HealthSavingsAccountWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_HealthSavingsAccountWaived in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_HealthSavingsAccountWaived1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_HealthSavingsAccountWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_VisionWaived()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_VisionWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_VisionWaived in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_VisionWaived1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_VisionWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_LifeInsuranceWaived()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_LifeInsuranceWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_LifeInsuranceWaived in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_LifeInsuranceWaived1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_LifeInsuranceWaived"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_PendingCoverage()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_PendingCoverage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_PendingCoverage in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_PendingCoverage1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_PendingCoverage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_PendingNotification()
    {
        WebElement element= SeleniumHelper.findElement_poc(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_PendingNotification"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_PendingNotification in BenefitsPortfolioPage");
        return element;
    }
    public boolean label_PendingNotification1(){
        boolean element= SeleniumHelper.findElementpopup(benefitsPortfolioPageDriver, readORProperties(currentScreenName, "label_PendingNotification"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public void enrollHealth() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Enroll Health on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
          SeleniumHelper.threadSleep(4000);
        SeleniumHelper.clickElement(btn_EnrollHealth());
    }
    public void enrollDental() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Enroll Dental on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_EnrollDental());
        SeleniumHelper.clickElement(btn_EnrollDental());
       
    }
    public void enrollVision() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Enroll Vision on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_EnrollVision());
        SeleniumHelper.clickElement(btn_EnrollVision());
    }

    public void waiveHealth() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On waive Health on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(btn_WaiveHealth());
    }
    public void waiveDental() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On waive Dental on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_WaiveDental());
        SeleniumHelper.clickElement(btn_WaiveDental());
    }
      public void waiveVision() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On waive Vision on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
         SeleniumHelper.threadSleep(3000);
         SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_WaiveVision());
        SeleniumHelper.clickElement(btn_WaiveVision());
    }
    public void waiveLifeInsurance() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On waive Life Insurance on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
          SeleniumHelper.threadSleep(3000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_WaiveLifeInsurance());
        SeleniumHelper.clickElement(btn_WaiveLifeInsurance());
    }
    public void waiveHealthSavingsAccount() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On waive HealthSavingsAccount on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
        SeleniumHelper.threadSleep(3000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_HealthSavingsAccount());
        SeleniumHelper.clickElement(btn_HealthSavingsAccount());
    }
    public void saveAndContinue() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On saveAndContinue on Benefits Portfolio Page");
        SeleniumHelper.waitForPageLoad(benefitsPortfolioPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_SaveAndContinue());
        SeleniumHelper.clickElement(btn_SaveAndContinue());
        SeleniumHelper.threadSleep(5000);
    }

    public void heathWaivedVerification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_HealthWaived1());
        String strTxt =  SeleniumHelper.getElementText(label_HealthWaived());
        TestNGHelper.assertEqual(strTxt,"HEALTH IS WAIVED","yes","heath Waived Verification");
    }
    public void dentalWaivedVerification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_DentalWaived1());
        String strTxt =  SeleniumHelper.getElementText(label_DentalWaived());
        TestNGHelper.assertEqual(strTxt,"DENTAL IS WAIVED","yes","Dental Waived Verification");
    }
    public void visionWaivedVerification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_VisionWaived1());
        String strTxt =  SeleniumHelper.getElementText(label_VisionWaived());
        TestNGHelper.assertEqual(strTxt,"VISION IS WAIVED","yes","Vision Waived Verification");
    }
    public void lifeInsuranceWaivedVerification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_LifeInsuranceWaived1());
        String strTxt =  SeleniumHelper.getElementText(label_LifeInsuranceWaived());
        TestNGHelper.assertEqual(strTxt,"LIFE INSURANCE IS WAIVED","yes","Life Insurance Waived Verification");
    }
    public void healthSavingsAccountWaivedVerification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_HealthSavingsAccountWaived1());
        String strTxt =  SeleniumHelper.getElementText(label_HealthSavingsAccountWaived());
        TestNGHelper.assertEqual(strTxt,"HEALTH SAVINGS ACCOUNT IS WAIVED","yes","healthSavingsAccount Waived Verification");
    }

    public void enrollmentSaveVerifiction()
    {
        WaitForExistenceOfanElement(label_Beneficiaries1());
        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(label_Beneficiaries());
        TestNGHelper.assertEqual(strTxt,"Select beneficiaries for your life insurance","yes","enrollment Save Validation");
    }

    public void coverageIsPendingVerification()
    {
        WaitForExistenceOfanElement(label_PendingCoverage1());
        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(label_PendingCoverage());
        TestNGHelper.assertEqual(strTxt,"Your Coverage Is Pending","yes","Your Coverage is pending Validation");
    }

    public void pendingNotificationVerification()
    {
        WaitForExistenceOfanElement(label_PendingNotification1());
        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(label_PendingNotification());
        TestNGHelper.assertEqual(strTxt,"Your elections require approval by your HR or plan administrator. An email confirmation will be sent to you once they have been reviewed.","yes","Pending Notification Validation");
    }
    
    

	public void Click_LearnMoreOrMakeChangesButton()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On LearnMoreOrMakeChanges Button on Benefits Portfolio Page");
		//SeleniumHelper.ScrollToElement(benefitsPortfolioPageDriver, btn_LearnMoreOrMakeChanges());
		SeleniumHelper.clickElement(btn_LearnMoreOrMakeChanges().get(0));
		//SeleniumHelper.clickElement(btn_LearnMoreOrMakeChanges());
	}
    public void WaitForExistenceOfanElement(boolean ElementToInspect){
        //SeleniumHelper.threadSleep(2000);
        for(int i=0;i<=100;i++){
            boolean waitForEle= ElementToInspect;
            String waitForEle1 = String.valueOf(waitForEle);
            if(waitForEle1=="true"){
                SeleniumHelper.logStepDetails("Element found and performing next actions required " );
                SeleniumHelper.threadSleep(2000);
                break;
            }
        }
    }
}

