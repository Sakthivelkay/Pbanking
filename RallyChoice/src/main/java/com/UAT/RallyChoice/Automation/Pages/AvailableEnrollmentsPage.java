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

public class AvailableEnrollmentsPage extends BasePage
{
	private WebDriver availableEnrollmentsPageDriver;	
	private String currentScreenName;

	public AvailableEnrollmentsPage(WebDriver driver)
	{		
		this.availableEnrollmentsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement Btn_GetStartedNow()
	{
		WebElement element= SeleniumHelper.findElement_poc(availableEnrollmentsPageDriver, readORProperties(currentScreenName, "Btn_GetStartedNow"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Action button in Available Enrollments page");
		 return element;
	}
	public WebElement btn_Action()
	{
		WebElement element= SeleniumHelper.findElement_poc(availableEnrollmentsPageDriver, readORProperties(currentScreenName, "btn_Action"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Action in Enrollments page");
		return element;
	}

	public WebElement link_ViewAsEmployee()
	{
		WebElement element= SeleniumHelper.findElement_poc(availableEnrollmentsPageDriver, readORProperties(currentScreenName, "link_ViewAsEmployee"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "link_ViewAsEmployee in Enrollments page");
		return element;
	}
	public boolean ObjectExist()
	{
        boolean element= SeleniumHelper.findElementpopup(availableEnrollmentsPageDriver, readORProperties(currentScreenName, "NextBtn_EmployeeInformation"),Constants.getShortSyc(),
        ExplicitConditions.PRESENCE);
        return element ;
    }
	
	public void ViewAsEmployee(){
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(btn_Action());
		SeleniumHelper.clickElement(link_ViewAsEmployee());		
		SeleniumHelper.threadSleep(5000);
	}
		
	public void Click_ViewAsEmployeebtn(){
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.highlightElement(availableEnrollmentsPageDriver, link_ViewAsEmployee());
		SeleniumHelper.clickElement(link_ViewAsEmployee());		
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





