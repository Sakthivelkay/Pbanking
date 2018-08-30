package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryOfYourBenefitsPage extends BasePage
{
	private WebDriver summaryOfYourBenefitsPageDriver;
	private String currentScreenName;

	public SummaryOfYourBenefitsPage(WebDriver driver)
	{		
		this.summaryOfYourBenefitsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement btn_MakeChanges()
	{
		WebElement element= SeleniumHelper.findElement_poc(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "btn_MakeChanges"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_MakeChanges in SummaryOfYourBenefitsPage");
		return element;
	}
	
	public boolean btn_MakeChanges1(){
		boolean element= SeleniumHelper.findElementpopup(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "btn_MakeChanges"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement label_YourElectionsHaveBeenApproved()
    {
        WebElement element= SeleniumHelper.findElement_poc(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourElectionsHaveBeenApproved"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_YourElectionsHaveBeenApproved in EnrollmentClosedPage");
        return element;
    }
    
	public boolean label_YourElectionsHaveBeenApproved1(){
		boolean element= SeleniumHelper.findElementpopup(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourElectionsHaveBeenApproved"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement label_YourCoverageIsPending()
    {
        WebElement element= SeleniumHelper.findElement_poc(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourCoverageIsPending"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_YourCoverageIsPending in SummaryOfYourBenefitsPage");
        return element;
    }
    
	public boolean label_YourCoverageIsPending1(){
		boolean element= SeleniumHelper.findElementpopup(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourCoverageIsPending"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement label_YourElectionsRequireApproval()
    {
        WebElement element= SeleniumHelper.findElement_poc(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourElectionsRequireApproval"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_YourElectionsRequireApproval in SummaryOfYourBenefitsPage");
        return element;
    }
    
	public boolean label_YourElectionsRequireApproval1(){
		boolean element= SeleniumHelper.findElementpopup(summaryOfYourBenefitsPageDriver, readORProperties(currentScreenName, "label_YourElectionsRequireApproval"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}

	public void Click_MakeChanges()
	{
		/*WaitForExistenceOfanElement(btn_MakeChanges1());
		String pageLableText = SeleniumHelper.getElementText(btn_MakeChanges());
		TestNGHelper.assertEqual(pageLableText, "Make Changes", "Summary benefit page Navigation", "yes", "Click MakeChanges");
		*/
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(btn_MakeChanges());
		SeleniumHelper.threadSleep(2000);
	}
	
	 public void Verify_YourElectionsHaveBeenApprovedLabelText() {
	        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Enrollment closed Label in Summary Of your benefits Page");
			WaitForExistenceOfanElement(label_YourElectionsHaveBeenApproved1());
			String pageLableText = SeleniumHelper.getElementText(label_YourElectionsHaveBeenApproved());		
			TestNGHelper.assertEqual(pageLableText, "Your elections have been approved.", "Summary Of your benefits Page Navigation", "yes", "Summary Of your benefits");
	    }
	
	 public void Verify_label_YourCoverageIsPendingText() {
	        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify YourCoverageIsPending Label in Summary Of your benefits Page");
			WaitForExistenceOfanElement(label_YourCoverageIsPending1());
			String pageLableText = SeleniumHelper.getElementText(label_YourCoverageIsPending());		
			TestNGHelper.assertEqual(pageLableText, "Your Coverage Is Pending", "Summary Of your benefits Page Navigation", "yes", "Summary Of your benefits");
	    }
	 
	 public void Verify_label_YourElectionsRequireApproval() {
	        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify label_YourElectionsRequireApproval Label in Summary Of your benefits Page");
			WaitForExistenceOfanElement(label_YourElectionsRequireApproval1());
			String pageLableText = SeleniumHelper.getElementText(label_YourElectionsRequireApproval());		
			TestNGHelper.assertEqual(pageLableText, "Your elections require approval by your HR or plan administrator. An email confirmation will be sent to you once they have been reviewed.", "Summary Of your benefits Page Navigation", "yes", "Summary Of your benefits");
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





