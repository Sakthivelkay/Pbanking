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

public class HowManyPrescriptionPage extends BasePage
{
	private WebDriver howmanyprescriptionPageDriver;	
	private String currentScreenName;

	public HowManyPrescriptionPage(WebDriver driver)
	{		
		this.howmanyprescriptionPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_HowManyPrescriptionText()
	{
		WebElement element= SeleniumHelper.findElement_poc(howmanyprescriptionPageDriver, readORProperties(currentScreenName, "label_HowManyPrescriptionText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_HowManyPrescriptionText in Prescription page");
		return element;
	}
	
	public boolean label_HowManyPrescriptionText1(){
		boolean element= SeleniumHelper.findElementpopup(howmanyprescriptionPageDriver, readORProperties(currentScreenName, "label_HowManyPrescriptionText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement link_SkipThis()
	{
		WebElement element= SeleniumHelper.findElement_poc(howmanyprescriptionPageDriver, readORProperties(currentScreenName, "link_SkipThis"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "link_SkipThis in Prescription page");
		return element;
	}
	
	

	public void Click_HowManyPrescriptionPagelink_SkipThis()
	{
		WaitForExistenceOfanElement(label_HowManyPrescriptionText1());
		String pageLableText = SeleniumHelper.getElementText(label_HowManyPrescriptionText());		
		TestNGHelper.assertEqual(pageLableText, "How many prescriptions do you and your", "HowManyPrescription Page Navigation", "yes", "HowManyPrescriptionPage");
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





