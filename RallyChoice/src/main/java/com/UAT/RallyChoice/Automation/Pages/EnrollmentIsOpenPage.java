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

public class EnrollmentIsOpenPage extends BasePage
{
	private WebDriver enrollmentIsOpenDriver;	
	private String currentScreenName;

	public EnrollmentIsOpenPage(WebDriver driver)
	{		
		this.enrollmentIsOpenDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	

	public WebElement btn_GetStartedNow()
	{
		WebElement element= SeleniumHelper.findElement_poc(enrollmentIsOpenDriver, readORProperties(currentScreenName, "btn_GetStartedNow"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Get Started Now Button in Enrollment is open page");
		 return element;
	}

	public WebElement Label_EnrollmentIsOpen()
	{
		WebElement element= SeleniumHelper.findElement_poc(enrollmentIsOpenDriver, readORProperties(currentScreenName, "label_EnrollmentIsOpen"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "EnrollmentIsOpen Label in EnrollmentIsOpen page");
		return element;
	}

	public boolean Label_EnrollmentIsOpen1()
	{
		boolean element= SeleniumHelper.findElementpopup(enrollmentIsOpenDriver, readORProperties(currentScreenName, "label_EnrollmentIsOpen"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE);
		return element ;
	}

	public void LetsGetStarted(){
		//SeleniumHelper.threadSleep(5000);		
		SeleniumHelper.clickElement(btn_GetStartedNow());
	}

	public void VerifyEnrollmentIsOpenPage(){
		//SeleniumHelper.waitForPageLoad(enrollmentIsOpenDriver);
		WaitForExistenceOfanElement(Label_EnrollmentIsOpen1());
		String EnrollmentIsOpenLabelText = SeleniumHelper.getElementText(Label_EnrollmentIsOpen());
		TestNGHelper.assertEqual(EnrollmentIsOpenLabelText, "Enrollment is Open!","EnrollmentIsOpen label text Verify", "yes", "Enrollment Is Open Page Navigation");
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





