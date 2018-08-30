package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreThanBenefitPage extends BasePage
{
	private WebDriver MoreThanBenefitPageDriver;
	private String currentScreenName;

	public MoreThanBenefitPage(WebDriver driver)
	{		
		this.MoreThanBenefitPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}

	public WebElement label_MoreBenefits()
	{
		WebElement element= SeleniumHelper.findElement_poc(MoreThanBenefitPageDriver, readORProperties(currentScreenName, "label_MoreBenefits"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_MoreBenefits in MoreThanBenefitPage");
		return element;
	}

	public boolean label_MoreBenefits1(){
		boolean element= SeleniumHelper.findElementpopup(MoreThanBenefitPageDriver, readORProperties(currentScreenName, "label_MoreBenefits"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}

	public WebElement btn_LetsGo()
	{
		WebElement element= SeleniumHelper.findElement_poc(MoreThanBenefitPageDriver, readORProperties(currentScreenName, "btn_LetsGo"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_LetsGo in MoreThanBenefitPage");
		return element;
	}

	public void Click_ContinueBenefitsPage()
	{
		WaitForExistenceOfanElement(label_MoreBenefits1());
		String pageLablePlanFitsText = SeleniumHelper.getElementText(label_MoreBenefits());
		TestNGHelper.assertEqual(pageLablePlanFitsText, "You're getting more than just benefits", "Benefits page Navigation", "yes", "MoreThanBenefitPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(MoreThanBenefitPageDriver, btn_LetsGo());
		SeleniumHelper.clickElement(btn_LetsGo());
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





