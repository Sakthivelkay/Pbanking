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

public class DependentsSeekCarePage extends BasePage
{
	private WebDriver DependentsSeekCarePage;	
	private String currentScreenName;

	public DependentsSeekCarePage(WebDriver driver)
	{		
		this.DependentsSeekCarePage=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_HowManyTimesDependentsSeekCareText()
	{
		WebElement element= SeleniumHelper.findElement_poc(DependentsSeekCarePage, readORProperties(currentScreenName, "label_HowManyTimesDependentsSeekCareText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_HowManyTimesDependentsSeekCareText in DependentsSeekCarePage");
		return element;
	}
	
	public boolean label_HowManyTimesDependentsSeekCareText1(){
		boolean element= SeleniumHelper.findElementpopup(DependentsSeekCarePage, readORProperties(currentScreenName, "label_HowManyTimesDependentsSeekCareText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement link_SkipThis()
	{
		WebElement element= SeleniumHelper.findElement_poc(DependentsSeekCarePage, readORProperties(currentScreenName, "link_SkipThis"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "link_SkipThis in DependentsSeekCarePage");
		return element;
	}
	
	

	public void Click_DependentsSeekCarePageSkipThisLink()
	{
		WaitForExistenceOfanElement(label_HowManyTimesDependentsSeekCareText1());
		String pageLableText = SeleniumHelper.getElementText(label_HowManyTimesDependentsSeekCareText());		
		TestNGHelper.assertEqual(pageLableText, "How many times did you and your dependents", "DependentsSeekCarePage Page Navigation", "yes", "DependentsSeekCarePage");
		SeleniumHelper.clickElement(link_SkipThis());		
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