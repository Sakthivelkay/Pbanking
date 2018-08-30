package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollmentClosedPage extends BasePage {
    private WebDriver enrollmentClosedPageDriver;
    private String currentScreenName;

    public EnrollmentClosedPage(WebDriver driver)
    {
        this.enrollmentClosedPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }


    public WebElement label_EnrollmentHasClosedPageText()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_EnrollmentHasClosedPageText"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_EnrollmentClosedPageText in EnrollmentClosedPage");
        return element;
    }
    
	public boolean label_EnrollmentHasClosedPageText1(){
		boolean element= SeleniumHelper.findElementpopup(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_EnrollmentHasClosedPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}


    public WebElement btn_ViewMyBenifits()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentClosedPageDriver, readORProperties(currentScreenName, "btn_ViewMyBenifits"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE, "btn_ViewMyBenifits in Enrollment is open page");
        return element;
    }
    
    public WebElement label_benefitsEffective()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_benefitsEffective"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE, "label_benefitsEffective in Summary of your benefits page");
        return element;
    }
    
    public boolean label_benefitsEffective1()
    {
        boolean element= SeleniumHelper.findElementpopup(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_benefitsEffective"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE);
        return element ;
    }
    
    public WebElement label_YourElectionsHaveBeenApproved()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_YourElectionsHaveBeenApproved"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE, "label_YourElectionsHaveBeenApproved in Summary of your benefits page");
        return element;
    }
    
    public boolean label_YourElectionsHaveBeenApproved1()
    {
        boolean element= SeleniumHelper.findElementpopup(enrollmentClosedPageDriver, readORProperties(currentScreenName, "label_benefitsEffective"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE);
        return element ;
    }

    public boolean btn_ViewMyBenifits1()
    {
        boolean element= SeleniumHelper.findElementpopup(enrollmentClosedPageDriver, readORProperties(currentScreenName, "btn_ViewMyBenifits"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE);
        return element ;
    }
    
    public void Verify_EnrollmentCompletePage() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Enrollment closed Label in Enrollment closed Page");
		WaitForExistenceOfanElement(label_EnrollmentHasClosedPageText1());
        //SeleniumHelper.threadSleep(4000);
		SeleniumHelper.highlightElement(enrollmentClosedPageDriver, label_EnrollmentHasClosedPageText());
		String pageLableText = SeleniumHelper.getElementText(label_EnrollmentHasClosedPageText());		
		TestNGHelper.assertEqual(pageLableText, "Enrollment Has Closed", "Enrollment Has Closed page Navigation", "yes", "Enrollment Has Closed");
    }


    
    
    public void click_ViewMyBenifits()
    {
    	SeleniumHelper.ScrollToElement(enrollmentClosedPageDriver, btn_ViewMyBenifits());
        SeleniumHelper.clickElement(btn_ViewMyBenifits());
    }
    
    public void Verify_BenefitsfromSummaryPage(){
        WaitForExistenceOfanElement(label_benefitsEffective1());
        String pageLableText = SeleniumHelper.getElementText(label_benefitsEffective());
        SeleniumHelper.highlightElement(enrollmentClosedPageDriver, label_benefitsEffective());
        boolean status = pageLableText.contains("Benefits effective");
        TestNGHelper.assertTrue(status, "Successfully Clicked on ViewMyBenefits Page", "yes", "SummaryPageNavigation");
        SeleniumHelper.threadSleep(2000);
    }

    public void Verify_yourElectionsText(){
        WaitForExistenceOfanElement(label_YourElectionsHaveBeenApproved1());
        String pageLableText = SeleniumHelper.getElementText(label_YourElectionsHaveBeenApproved());
        SeleniumHelper.highlightElement(enrollmentClosedPageDriver, label_YourElectionsHaveBeenApproved());
        boolean status = pageLableText.contains("Your elections have been approved.");
        TestNGHelper.assertTrue(status, "verified your elections approved text", "yes", "YourElectionsApprovedTextinSummaryPage");
        SeleniumHelper.threadSleep(2000);
    }

    public void verify_ViewMyBenifitsisnotDisplayedForEnrollReject()
    {
    	SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enrollment closed screen");
		SeleniumHelper.waitForPageLoad(enrollmentClosedPageDriver);
		WaitForExistenceOfanElement(btn_ViewMyBenifits1());
		SeleniumHelper.threadSleep(3000);		
		boolean handle= btn_ViewMyBenifits1();
		String handle1 = String.valueOf(handle);		
		if(handle1 == "false"){			
			SeleniumHelper.logStepDetails("Button View My Button - Enrollment Reject is successfull");		
			TestNGHelper.assertEqual("", "", "Enrollment Rejected", "yes", "Enrollment Rejected-ViewMyBenefits button is not displayed");
		}
		else{
			SeleniumHelper.logStepDetails("Parameter: InformationalPopUpContinue- is  present to click");
			SeleniumHelper.clickElement(btn_ViewMyBenifits());	
			TestNGHelper.assertEqual("", "false", "Enrollment Rejected", "yes", "Enroll Rejection Failed ViewMyBenefits button displaying");
		}	
    }

    public void WaitForExistenceOfanElement(boolean ElementToInspect){
    	SeleniumHelper.threadSleep(2000);				
    	for(int i=0;i<=100;i++){
    		//SeleniumHelper.threadSleep(2000);
    		boolean waitForEle= ElementToInspect;
    		String waitForEle1 = String.valueOf(waitForEle);
    		if(waitForEle1=="true"){			
    			SeleniumHelper.logStepDetails("Element found and performing next actions required " );
    			//SeleniumHelper.threadSleep(2000);
    			break;
    		}	
    	}
    }
    

}

