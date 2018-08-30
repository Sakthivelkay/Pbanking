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

public class EmployerSearchPage extends BasePage
{
	private WebDriver employerSearchPageDriver;	
	private String currentScreenName;

	public EmployerSearchPage(WebDriver driver)
	{		
		this.employerSearchPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	

	
	public WebElement txt_EmployerSearch()
	{
		WebElement element= SeleniumHelper.findElement_poc(employerSearchPageDriver, readORProperties(currentScreenName, "SearchByName"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "SearchByName textbox in Employers Search page");
		return element;
	}
	
	public List<WebElement> Lnk_EmployerSearch(){
		List<WebElement> elements= SeleniumHelper.findElements(employerSearchPageDriver, readORProperties(currentScreenName, "EmployerLink"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	
	
	public void EmployerSearch(String stremployername){
		SeleniumHelper.logStepDetails("Parameter: Enter the Employer name-"+stremployername);
		SeleniumHelper.enterValueIntoTextField(txt_EmployerSearch(),stremployername);
		txt_EmployerSearch().sendKeys(Keys.ENTER);
		SeleniumHelper.threadSleep(5000);
	}
	
	
	public void VerifyEmployerSearch(String ExpLinkName){
		SeleniumHelper.LinkSelection(Lnk_EmployerSearch(), ExpLinkName);
		
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





