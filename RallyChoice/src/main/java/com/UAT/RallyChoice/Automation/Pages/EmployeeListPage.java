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

	public class EmployeeListPage extends BasePage
{
	public static String EmployeeName;
	private WebDriver employeeListPageDriver;	
	private String currentScreenName;

	public EmployeeListPage(WebDriver driver)
	{		
		this.employeeListPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement txt_Name()
	  {
	     WebElement element= SeleniumHelper.findElement_poc(employeeListPageDriver, readORProperties(currentScreenName, "txt_Name"),Constants.getShortSyc(),
	     SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Name in EmployeeInfoPage");
	     return element;
	  }
	
	public WebElement EmployeeName()
	  {
	     WebElement element= SeleniumHelper.findElement_poc(employeeListPageDriver, readORProperties(currentScreenName, "EmployeeName"),Constants.getShortSyc(),
	     SeleniumHelper.ExplicitConditions.PRESENCE, "EmployeeName in EmployeeListPage");
	     return element;
	  }
	
	
	
	public WebElement label_YourEmployeeAddedSuccessfuly()
	{
		WebElement element= SeleniumHelper.findElement_poc(employeeListPageDriver, readORProperties(currentScreenName, "label_YourEmployeeAddedSuccessfuly"),Constants.getShortSyc(),
		ExplicitConditions.PRESENCE, "label verify got YourEmployeeAddedSuccessfuly in EmployeeListPage");
		return element;
	}
	
	public WebElement txt_SearchByEmployeeName()
	{
		WebElement element= SeleniumHelper.findElement_poc(employeeListPageDriver, readORProperties(currentScreenName, "txt_SearchByEmployeeName"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "SearchByName textbox in Employers Search page");
		return element;
	}
	
	
	public void VerifyEmployeeListPage(){
		String Txt_label_YourEmployeeAddedSuccessfuly = SeleniumHelper.getElementText(label_YourEmployeeAddedSuccessfuly());
		TestNGHelper.assertEqual(Txt_label_YourEmployeeAddedSuccessfuly, "EmployeeList","label_YourEmployeeAddedSuccessfuly text Verify", "yes", "EmployeeList Page Navigation");
	}
	
	public void EmployeeSearch(){

		 //EmployeeName = SeleniumHelper.getElementText(txt_Name());
		SeleniumHelper.logStepDetails("Parameter: Enter the Employer name-"+EmployeeInfoPage.EmployeeName);
		String empName = EmployeeInfoPage.EmployeeName;
		SeleniumHelper.enterValueIntoTextField(txt_SearchByEmployeeName(),empName);
		txt_SearchByEmployeeName().sendKeys(Keys.ENTER);
		SeleniumHelper.threadSleep(5000);
	}
	
	 public void enterEmployeeName(DataTable table)
	    {
	        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	        final Map<String, String> hmap = rows.get(0);

	        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employee Name");
	        SeleniumHelper.waitForPageLoad(employeeListPageDriver);
	        SeleniumHelper.threadSleep(2000);
	    //    SeleniumHelper.clickElement(click_EmployerSearchBox());
	        SeleniumHelper.logStepDetails("Parameter: Employer Name-"+hmap.get("EmployeeName"));
	        SeleniumHelper.enterValueIntoTextField(txt_SearchByEmployeeName(),hmap.get("EmployeeName"));
	        txt_SearchByEmployeeName().sendKeys(Keys.ENTER);

	        //SeleniumHelper.clickElement(btn_Submit());
	     //   SeleniumHelper.threadSleep(8000);
	        //TestNGHelper.assertEqual(loginPageDriver.getTitle(), "Choice Admin", "Login Failed. Home Page not displayed.", "yes", "Login");

	    }
	 
	 public void SelectEmployee(){
		 SeleniumHelper.clickElement(EmployeeName());
		 SeleniumHelper.threadSleep(5000);
		 //TestNGHelper.assertEqual(txtEmployeeName, "Employee List", "EmployeeList Page", "yes", "EmployeeList Page");
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





