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

public class DoYouHaveDependentsPage extends BasePage
{
	private WebDriver doYouhaveDependentsPageDriver;	
	private String currentScreenName;

	public DoYouHaveDependentsPage(WebDriver driver)
	{		
		this.doYouhaveDependentsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement btn_No_DoYouHaveDependents()
	{
		WebElement element= SeleniumHelper.findElement_poc(doYouhaveDependentsPageDriver, readORProperties(currentScreenName, "btn_No"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "No button in Do You have dependent you would like to cover page");
		 return element;
	}
	
	public WebElement btn_Yes_DoYouHaveDependents()
	{
		WebElement element= SeleniumHelper.findElement_poc(doYouhaveDependentsPageDriver, readORProperties(currentScreenName, "btn_Yes"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Yes button in Do You have dependent you would like to cover page");
		 return element;
	}
	
	public WebElement label_DoYouHaveDependents()
	{
		WebElement element= SeleniumHelper.findElement_poc(doYouhaveDependentsPageDriver, readORProperties(currentScreenName, "label_DoYouHaveDependents"),Constants.getShortSyc(),
		ExplicitConditions.PRESENCE, "label verify got YourEmployeeAddedSuccessfuly in EmployeeListPage");
		return element;
	}
	
	public boolean label_DoYouHaveDependents1()
	{
        boolean element= SeleniumHelper.findElementpopup(doYouhaveDependentsPageDriver, readORProperties(currentScreenName, "label_DoYouHaveDependents"),Constants.getShortSyc(),
        ExplicitConditions.PRESENCE);
        return element ;
    }
	
	public void VerifyDoYouHaveDependentsPage(){
		WaitForExistenceOfanElement(label_DoYouHaveDependents1());
		String Txt_label_DoYouHaveDependentsPage = SeleniumHelper.getElementText(label_DoYouHaveDependents());
		TestNGHelper.assertEqual(Txt_label_DoYouHaveDependentsPage, "Do you have any dependents you'd like to cover?","Do you have dependents Page Verify", "yes", "DoYouHaveDependentsPage Navigation");
	}
	
	
	public void click_DependantsToCover(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);
        
        if(hmap.get("DependantstoCover").toLowerCase().equals("yes")){
        	SeleniumHelper.clickElement(btn_Yes_DoYouHaveDependents());
        	SeleniumHelper.threadSleep(2000);
        	TestNGHelper.assertEqual("", "","Depedant Details ", "yes", "Dependant Details");
        }
        else if(hmap.get("DependantstoCover").toLowerCase().equals("no")){
        	SeleniumHelper.clickElement(btn_No_DoYouHaveDependents());
        }
        
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





