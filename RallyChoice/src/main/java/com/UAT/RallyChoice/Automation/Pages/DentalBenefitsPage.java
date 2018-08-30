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

public class DentalBenefitsPage extends BasePage
{
	private WebDriver dentalBenefitsPageDriver;	
	private String currentScreenName;

	public DentalBenefitsPage(WebDriver driver)
	{		
		this.dentalBenefitsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_DentalBenefitsText()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_DentalBenefitsText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_DentalBenefits in DentalBenefitsPage");
		return element;
	}
	
	public boolean label_DentalBenefitsText1(){
		boolean element= SeleniumHelper.findElementpopup(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_DentalBenefitsText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_ViewAvailablePlans()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "btn_ViewAvailablePlans"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "ViewAvailablePlans Button in DentalBenefitsPage");
		return element;
	}
	
	public WebElement label_YouremployerisofferingtheplandetailedbelowText()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_YouremployerisofferingtheplandetailedbelowText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Youremployerisofferingtheplandetailedbelow page");
		return element;
	}
	
	public boolean label_YouremployerisofferingtheplandetailedbelowText1(){
		boolean element= SeleniumHelper.findElementpopup(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_YouremployerisofferingtheplandetailedbelowText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in Youremployerisofferingtheplandetailedbelow Page");
		return element;
	}
	
	public WebElement label_WhoWouldYouLikeToCoverWithThisPlanText()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_WhoWouldYouLikeToCoverWithThisPlanText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_WhoWouldYouLikeToCoverWithThisPlanText in Who would you like to cover with this plan page");
		return element;
	}
	
	public boolean label_WhoWouldYouLikeToCoverWithThisPlanText1(){
		boolean element= SeleniumHelper.findElementpopup(dentalBenefitsPageDriver, readORProperties(currentScreenName, "label_WhoWouldYouLikeToCoverWithThisPlanText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue_WouldYouLikeToCover()
	{
		WebElement element= SeleniumHelper.findElement_poc(dentalBenefitsPageDriver, readORProperties(currentScreenName, "btn_Continue_WouldYouLikeToCover"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in label_WhoWouldYouLikeToCoverWithThisPlan Page");
		return element;
	}
	
	
	public void Click_ViewAvailablePlansButton()
	{
		WaitForExistenceOfanElement(label_DentalBenefitsText1());
		String pageLableText = SeleniumHelper.getElementText(label_DentalBenefitsText());		
		TestNGHelper.assertEqual(pageLableText, "Dental Benefits", "DentalBenefits Navigation", "yes", "DentalBenefitsPage");
		SeleniumHelper.clickElement(btn_ViewAvailablePlans());
	}
	
	public void Click_ContinueButton()
	{
		WaitForExistenceOfanElement(label_YouremployerisofferingtheplandetailedbelowText1());
		String pageLableText = SeleniumHelper.getElementText(label_YouremployerisofferingtheplandetailedbelowText());		
		TestNGHelper.assertEqual(pageLableText, "Your employer is offering the plan detailed below", "Youremployerisofferingtheplandetailedbelow page Navigation", "yes", "Your employer is offering the plan detailed below Page");
		SeleniumHelper.ScrollToElement(dentalBenefitsPageDriver, btn_Continue());
		SeleniumHelper.clickElement(btn_Continue());	
	}
	
	public void Click_btn_Continue_WouldYouLikeToCover()
	{
		WaitForExistenceOfanElement(label_WhoWouldYouLikeToCoverWithThisPlanText1());
		String pageLableText = SeleniumHelper.getElementText(label_WhoWouldYouLikeToCoverWithThisPlanText());		
		TestNGHelper.assertEqual(pageLableText, "Who would you like to cover with this plan?", "Who would you like to cover with this plan page Navigation", "yes", "Who would you like to cover with this plan Page");
		SeleniumHelper.ScrollToElement(dentalBenefitsPageDriver, btn_Continue_WouldYouLikeToCover());
		SeleniumHelper.clickElement(btn_Continue_WouldYouLikeToCover());	
	}
	
	public void Enroll_DentalPlans()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Dental Enrollment Plans");
		WaitForExistenceOfanElement(label_DentalBenefitsText1());
		String pageLableText = SeleniumHelper.getElementText(label_DentalBenefitsText());		
		TestNGHelper.assertEqual(pageLableText, "Dental Benefits", "DentalBenefits Navigation", "yes", "DentalBenefitsPage");
		SeleniumHelper.DoubleclickElement(btn_ViewAvailablePlans(), dentalBenefitsPageDriver);
		WaitForExistenceOfanElement(label_YouremployerisofferingtheplandetailedbelowText1());
		String pageLableText_YourEmployerIsOffering = SeleniumHelper.getElementText(label_YouremployerisofferingtheplandetailedbelowText());		
		TestNGHelper.assertEqual(pageLableText_YourEmployerIsOffering, "Your employer is offering the plan detailed below", "Youremployerisofferingtheplandetailedbelow page Navigation", "yes", "Your employer is offering the plan detailed below Page");
		SeleniumHelper.clickElement(btn_Continue());
		SeleniumHelper.threadSleep(5000);
		WaitForExistenceOfanElement(label_WhoWouldYouLikeToCoverWithThisPlanText1());
		//String pageLableText_WhoWouldYouLikeToCoverWithThisPlan = SeleniumHelper.getElementText(label_WhoWouldYouLikeToCoverWithThisPlanText());		
		//TestNGHelper.assertEqual(pageLableText_WhoWouldYouLikeToCoverWithThisPlan, "Who would you like to cover with this plan?", "Who would you like to cover with this plan page Navigation", "yes", "Who would you like to cover with this plan Page");
		//SeleniumHelper.ScrollToElement(dentalBenefitsPageDriver, btn_Continue_WouldYouLikeToCover());
		SeleniumHelper.clickElement(btn_Continue_WouldYouLikeToCover());
		
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




