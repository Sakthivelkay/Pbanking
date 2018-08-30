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

public class YouarewellonyourwayPage extends BasePage
{
	private WebDriver youarewellonyourwayPageDriver;	
	private String currentScreenName;

	public YouarewellonyourwayPage(WebDriver driver)
	{		
		this.youarewellonyourwayPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_YouareWellOnyourWayText()
	{
		WebElement element= SeleniumHelper.findElement_poc(youarewellonyourwayPageDriver, readORProperties(currentScreenName, "label_YouareWellOnyourWayText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_YouareWellOnyourWayText in YouarewellonyourwayPage");
		return element;
	}
	
	public boolean label_YouareWellOnyourWayText1(){
		boolean element= SeleniumHelper.findElementpopup(youarewellonyourwayPageDriver, readORProperties(currentScreenName, "label_YouareWellOnyourWayText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_LetsGo()
	{
		WebElement element= SeleniumHelper.findElement_poc(youarewellonyourwayPageDriver, readORProperties(currentScreenName, "btn_LetsGo"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_LetsGo in YouarewellonyourwayPage");
		return element;
	}

	public WebElement btn_SkipAhead()
	{
		WebElement element= SeleniumHelper.findElement_poc(youarewellonyourwayPageDriver, readORProperties(currentScreenName, "btn_SkipAhead"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_SkipAhead in YouarewellonyourwayPage");
		return element;
	}


	public void Click_YouarewellonyourwayPageLetsGoButton()
	{
		WaitForExistenceOfanElement(label_YouareWellOnyourWayText1());
		String pageLableText = SeleniumHelper.getElementText(label_YouareWellOnyourWayText());		
		TestNGHelper.assertEqual(pageLableText, "You're well on your way!", "YouarewellonyourwayPage Navigation", "yes", "YouareWellOnyourWayPage");
		SeleniumHelper.clickElement(btn_LetsGo());		
	}

	public void Click_SkipAheadonYouarewellonyourwayPage()
	{
		WaitForExistenceOfanElement(label_YouareWellOnyourWayText1());
		String pageLableText = SeleniumHelper.getElementText(label_YouareWellOnyourWayText());
		TestNGHelper.assertEqual(pageLableText, "You're well on your way!", "YouarewellonyourwayPage Navigation", "yes", "YouareWellOnyourWayPage");
		SeleniumHelper.DoubleclickElement(btn_SkipAhead(), youarewellonyourwayPageDriver);
		SeleniumHelper.clickElement(btn_SkipAhead());
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





