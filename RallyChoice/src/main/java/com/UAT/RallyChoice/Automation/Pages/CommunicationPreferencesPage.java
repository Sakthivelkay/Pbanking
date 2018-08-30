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

public class CommunicationPreferencesPage extends BasePage
{
	private WebDriver communicationPreferencesPageDriver;	
	private String currentScreenName;

	public CommunicationPreferencesPage(WebDriver driver)
	{		
		this.communicationPreferencesPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_CommunicationPreferencesPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(communicationPreferencesPageDriver, readORProperties(currentScreenName, "label_CommunicationPreferencesPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "CommunicationPreferencesPageText in CommunicationPreferencesPage");
		return element;
	}
	
	public boolean label_CommunicationPreferencesPageText1(){
		boolean element= SeleniumHelper.findElementpopup(communicationPreferencesPageDriver, readORProperties(currentScreenName, "label_CommunicationPreferencesPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue()
	{
		WebElement element= SeleniumHelper.findElement_poc(communicationPreferencesPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in CommunicationPreferencesPage");
		return element;
	}
	
	
	public void click_Continue_CommunicationPreferencesPage()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify CommunicationPreferencesPage");
		SeleniumHelper.waitForPageLoad(communicationPreferencesPageDriver);
		WaitForExistenceOfanElement(label_CommunicationPreferencesPageText1());
		String pageLableText = SeleniumHelper.getElementText(label_CommunicationPreferencesPageText());
		TestNGHelper.assertEqual(pageLableText, "Communication preferences", "Communication preferences Page", "yes", "Communication preferences Page");
		SeleniumHelper.clickElement(btn_Continue());
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




