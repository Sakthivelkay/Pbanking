package com.UAT.RallyChoice.Automation.Pages;

import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

import cucumber.api.DataTable;

public class VisionBenefitsPage extends BasePage
{
	private WebDriver visionBenefitsPageDriver;	
	private String currentScreenName;

	public VisionBenefitsPage(WebDriver driver)
	{		
		this.visionBenefitsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_VisionBenefitsText()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_VisionBenefitsText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_VisionBenefits in VisionBenefitsPage");
		return element;
	}
	
	public boolean label_VisionBenefitsText1(){
		boolean element= SeleniumHelper.findElementpopup(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_VisionBenefitsText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_ViewAvailablePlans()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "btn_ViewAvailablePlans"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "ViewAvailablePlans Button in VisionBenefitsPage");
		return element;
	}
	
	public WebElement label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Youremployerisofferingtheplandetailedbelow page");
		return element;
	}
	
	public boolean label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText1(){
		boolean element= SeleniumHelper.findElementpopup(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue_Youremployerisoffering()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "btn_Continue_Youremployerisoffering"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in Youremployerisofferingtheplandetailedbelow Page");
		return element;
	}
	
	public WebElement label_WhoWouldYouLikeToCoverWithThisPlanText()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_WhoWouldYouLikeToCoverWithThisPlanText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_YouremployerisofferingtheplandetailedbelowText in Who would you like to cover with this plan page");
		return element;
	}
	
	public boolean label_WhoWouldYouLikeToCoverWithThisPlanText1(){
		boolean element= SeleniumHelper.findElementpopup(visionBenefitsPageDriver, readORProperties(currentScreenName, "label_WhoWouldYouLikeToCoverWithThisPlanText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue_WhoWouldYouLikeToCoverWithThisPlan()
	{
		WebElement element= SeleniumHelper.findElement_poc(visionBenefitsPageDriver, readORProperties(currentScreenName, "btn_Continue_WhoWouldYouLikeToCoverWithThisPlan"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in label_WhoWouldYouLikeToCoverWithThisPlan Page");
		return element;
	}
	
	
	public void Click_ViewAvailablePlansButton()
	{
		SeleniumHelper.threadSleep(2000);
		WaitForExistenceOfanElement(label_VisionBenefitsText1());
		String pageLableText = SeleniumHelper.getElementText(label_VisionBenefitsText());		
		TestNGHelper.assertEqual(pageLableText, "Vision Benefits", "VisionBenefits Navigation", "yes", "VisionBenefitsPage");
		SeleniumHelper.ScrollToElement(visionBenefitsPageDriver, btn_ViewAvailablePlans());
		SeleniumHelper.clickElement(btn_ViewAvailablePlans());	
	}
	
	public void Click_btn_Continue_Youremployerisoffering()
	{
		WaitForExistenceOfanElement(label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText1());
		String pageLableText = SeleniumHelper.getElementText(label_VisionBenefits_YouremployerisofferingtheplandetailedbelowText());		
		TestNGHelper.assertEqual(pageLableText, "Your employer is offering the plan detailed below", "Youremployerisofferingtheplandetailedbelow page Navigation", "yes", "Your employer is offering the plan detailed below Page");
		SeleniumHelper.ScrollToElement(visionBenefitsPageDriver, btn_Continue_Youremployerisoffering());
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(btn_Continue_Youremployerisoffering());
	}
	
	public void Click_btn_Continue_WhoWouldYouLikeToCoverWithThisPlan()
	{
		WaitForExistenceOfanElement(label_WhoWouldYouLikeToCoverWithThisPlanText1());
		String pageLableText = SeleniumHelper.getElementText(label_WhoWouldYouLikeToCoverWithThisPlanText());		
		TestNGHelper.assertEqual(pageLableText, "Who would you like to cover with this plan?", "Who would you like to cover with this plan page Navigation", "yes", "Who would you like to cover with this plan Page");
		SeleniumHelper.ScrollToElement(visionBenefitsPageDriver, btn_Continue_WhoWouldYouLikeToCoverWithThisPlan());
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(btn_Continue_WhoWouldYouLikeToCoverWithThisPlan());
	}
	
	
	public void WaitForExistenceOfanElement(boolean ElementToInspect){
	//SeleniumHelper.threadSleep(2000);				
	for(int i=0;i<=100;i++){
		SeleniumHelper.threadSleep(2000);
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




