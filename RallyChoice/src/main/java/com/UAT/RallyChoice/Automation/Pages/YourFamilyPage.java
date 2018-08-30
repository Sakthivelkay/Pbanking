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

public class YourFamilyPage extends BasePage
{
	private WebDriver yourFamilyPageDriver;	
	private String currentScreenName;

	public YourFamilyPage(WebDriver driver)
	{		
		this.yourFamilyPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_UrFamilyText()
	{
		WebElement element= SeleniumHelper.findElement_poc(yourFamilyPageDriver, readORProperties(currentScreenName, "label_UrFamilyText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_UrFamilyText in YourFamilyPage");
		return element;
	}
	
	public boolean label_UrFamilyText1(){
		boolean element= SeleniumHelper.findElementpopup(yourFamilyPageDriver, readORProperties(currentScreenName, "label_UrFamilyText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue()
	{
		WebElement element= SeleniumHelper.findElement_poc(yourFamilyPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Continue in YourFamilyPage");
		return element;
	}
	
	

	public void Click_YourFamilyPageContinueButton()
	{
		WaitForExistenceOfanElement(label_UrFamilyText1());
		String pageLableText = SeleniumHelper.getElementText(label_UrFamilyText());		
		TestNGHelper.assertEqual(pageLableText, "Your family", "Your Family Page Navigation", "yes", "YourFamilyPage");
		SeleniumHelper.clickElement(btn_Continue());
		SeleniumHelper.threadSleep(5000);
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





