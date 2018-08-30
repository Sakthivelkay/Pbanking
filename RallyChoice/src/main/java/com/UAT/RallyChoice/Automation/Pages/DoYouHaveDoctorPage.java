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

public class DoYouHaveDoctorPage extends BasePage
{
	private WebDriver doYouHaveDoctorPageDriver;	
	private String currentScreenName;

	public DoYouHaveDoctorPage(WebDriver driver)
	{		
		this.doYouHaveDoctorPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_DoYouHaveDoctorsText()
	{
		WebElement element= SeleniumHelper.findElement_poc(doYouHaveDoctorPageDriver, readORProperties(currentScreenName, "label_DoYouHaveDoctorsText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_DoYouHaveDoctorsText in DoYouHaveDoctorPage");
		return element;
	}
	
	public boolean label_DoYouHaveDoctorsText1(){
		boolean element= SeleniumHelper.findElementpopup(doYouHaveDoctorPageDriver, readORProperties(currentScreenName, "label_DoYouHaveDoctorsText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_IDontHaveADoctor()
	{
		WebElement element= SeleniumHelper.findElement_poc(doYouHaveDoctorPageDriver, readORProperties(currentScreenName, "btn_IDontHaveADoctor"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "IDontHaveADoctor Button in DoYouHaveDoctorPage");
		return element;
	}
	
	

	public void Click_IDontHaveADoctorButton()
	{
		WaitForExistenceOfanElement(label_DoYouHaveDoctorsText1());
		String pageLableText = SeleniumHelper.getElementText(label_DoYouHaveDoctorsText());		
		TestNGHelper.assertEqual(pageLableText, "Do you have any doctors you'd like covered by your plan?", "DoYouHaveDoctorPage Navigation", "yes", "DoYouHaveDoctorsPage");
		SeleniumHelper.clickElement(btn_IDontHaveADoctor());		
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




