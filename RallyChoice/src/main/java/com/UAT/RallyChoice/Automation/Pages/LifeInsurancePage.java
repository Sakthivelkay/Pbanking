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

public class LifeInsurancePage extends BasePage
{
	private WebDriver lifeInsurancePageDriver;	
	private String currentScreenName;

	public LifeInsurancePage(WebDriver driver)
	{		
		this.lifeInsurancePageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_LifeInsurancePageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(lifeInsurancePageDriver, readORProperties(currentScreenName, "label_LifeInsurancePageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_LifeInsurance in LifeInsurancePage");
		return element;
	}
	
	public boolean label_LifeInsurancePageText1(){
		boolean element= SeleniumHelper.findElementpopup(lifeInsurancePageDriver, readORProperties(currentScreenName, "label_LifeInsurancePageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_ViewAvailablePlans()
	{
		WebElement element= SeleniumHelper.findElement_poc(lifeInsurancePageDriver, readORProperties(currentScreenName, "btn_ViewAvailablePlans"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "ViewAvailablePlans Button in LifeInsurancePage");
		return element;
	}
	
	
	
	public void Click_ViewAvailablePlansButton()
	{
		WaitForExistenceOfanElement(label_LifeInsurancePageText1());
		String pageLableText_LifeInsurancePage = SeleniumHelper.getElementText(label_LifeInsurancePageText());		
		TestNGHelper.assertEqual(pageLableText_LifeInsurancePage, "Life Insurance", "LifeInsurance Page Navigation", "yes", "LifeInsurancePage");
		SeleniumHelper.ScrollToElement(lifeInsurancePageDriver, btn_ViewAvailablePlans());
		SeleniumHelper.clickElement(btn_ViewAvailablePlans());
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




