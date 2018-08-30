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

public class CasesPage extends BasePage
{
	private WebDriver casesPageDriver;	
	private String currentScreenName;

	public CasesPage(WebDriver driver)
	{		
		this.casesPageDriver=driver;
		casesPageDriver.get(appURL);
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement CasesLink()
	{
		WebElement element= SeleniumHelper.findElement_poc(casesPageDriver, readORProperties(currentScreenName, "CasesLink"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Cases Link in Cases Page");
		return element;
	}
	
	public WebElement CasesLabel()
	{
		WebElement element= SeleniumHelper.findElement_poc(casesPageDriver, readORProperties(currentScreenName, "CasesLabel"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Cases Label in Cases page");
		return element;
	}
	
	public void VerifyCasesPage(){
		String CaseLabelText = SeleniumHelper.getElementText(CasesLabel());
		TestNGHelper.assertEqual(CaseLabelText, "Cases","Cases text Verify", "yes", "Cases Page Navigation");
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





