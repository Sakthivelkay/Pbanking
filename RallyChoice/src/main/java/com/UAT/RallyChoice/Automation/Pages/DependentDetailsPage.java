package com.UAT.RallyChoice.Automation.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class DependentDetailsPage extends BasePage
{
	private WebDriver dependentDetailsPageDriver;	
	private String currentScreenName;

	public DependentDetailsPage(WebDriver driver)
	{		
		this.dependentDetailsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_DependentDetails()
	{
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "label_DependentDetails"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "DependentDetailsPage Label in DependentDetails page");
		return element;
	}

	public boolean label_DependentDetails1()
	{
        boolean element= SeleniumHelper.findElementpopup(dependentDetailsPageDriver, readORProperties(currentScreenName, "label_DependentDetails"),Constants.getShortSyc(),
        ExplicitConditions.PRESENCE);
        return element ;
    }
	
	public boolean ObjectExist()
	{
        boolean element= SeleniumHelper.findElementpopup(dependentDetailsPageDriver, readORProperties(currentScreenName, "btn_Save"),Constants.getShortSyc(),
        ExplicitConditions.PRESENCE);
        return element ;
    }
	
	
	public WebElement txt_Dependent_FirstName(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "txt_Dependent_FirstName"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Dependent_FirstName Name WebEdit in Dependent Details page");
		return element;
	}
	
	public WebElement txt_Dependent_LastName(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "txt_Dependent_LastName"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Dependent_LastName Name WebEdit in Dependent Details page");
		return element;
	}
	
	public List<WebElement> list_DependentArow(){
		List<WebElement> elements= SeleniumHelper.findElements(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_DependentType"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
		
	public List<WebElement> list_DependentTypeCollection(){
		List<WebElement> elements= SeleniumHelper.findElements(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_DependentTypeCollection"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	
	
	public WebElement list_Relationship(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_Relationship"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Relationship Type list in Dependent Details Page");
		 return element;
	}
	
	public List<WebElement> list_RelationshipCollection(){
		List<WebElement> elements= SeleniumHelper.findElements(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_RelationshipCollection"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	
	public WebElement txt_SSN_TIN(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "txt_SSN_TIN"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "txt_SSN_TIN WebEdit in Dependent Details page");
		return element;
	}
		
	public WebElement list_Gender(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_Gender"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Gender type list in Dependent Details Page");
		 return element;
	}
	
	public List<WebElement> list_Genders(){
		List<WebElement> elements= SeleniumHelper.findElements(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_Gender"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	public List<WebElement> list_GenderType(){
		List<WebElement> elements= SeleniumHelper.findElements(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_GenderCollection"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	
	public WebElement txt_DateOfBirth(){
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "txt_DateOfBirth"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "DateOfBirth WebEdit in Dependent Details page");
		return element;
	}
	
	public WebElement btn_Save()
	{
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "btn_Save"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "DependentDetailsPage Label in DependentDetails page");
		 return element;
	}
	
	public WebElement list_GenderItem()
	{
		WebElement element= SeleniumHelper.findElement_poc(dependentDetailsPageDriver, readORProperties(currentScreenName, "list_GenderItem"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "list_GenderItem Item in DependentDetails page");
		 return element;
	}
	
	public void VerifyDependentDetailsPage(){
		WaitForExistenceOfanElement(label_DependentDetails1());
		String Txt_label_DoYouHaveDependentsPage = SeleniumHelper.getElementText(label_DependentDetails());
		TestNGHelper.assertEqual(Txt_label_DoYouHaveDependentsPage, "Dependant Details","Do you have dependents Page Verify", "yes", "DoYouHaveDependentsPage Navigation");
	}
	
	  public void DependentDetails(DataTable table)
	    {
	        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	        final Map<String, String> hmap = rows.get(0);

	        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Dependent Details");
	        SeleniumHelper.waitForPageLoad(dependentDetailsPageDriver);
	        SeleniumHelper.threadSleep(2000);

	        SeleniumHelper.enterValueIntoTextField(txt_Dependent_FirstName(),hmap.get("DependentFirstName"));
	        SeleniumHelper.logStepDetails("Parameter: Dependent FirstName-"+hmap.get("DependentFirstName"));
	        
	        SeleniumHelper.enterValueIntoTextField(txt_Dependent_LastName(),hmap.get("DependentLastName"));
	        SeleniumHelper.logStepDetails("Parameter: Dependent LastName-"+hmap.get("DependentLastName"));
	        //Click on Dependant Type
	        SeleniumHelper.clickElement(list_DependentArow().get(0));
	  	  	SeleniumHelper.LinkSelection(list_DependentTypeCollection(), hmap.get("DependentType"));
	  	    //list_DependentArow().get(0).sendKeys(Keys.TAB);
	  	  	//Click on RelationShip List
	  	  SeleniumHelper.clickElement(list_DependentArow().get(0));
	  	  	SeleniumHelper.LinkSelection(list_RelationshipCollection(), hmap.get("DependentRelationship"));
	  	  SeleniumHelper.scrollToUP(dependentDetailsPageDriver);
	  	  SeleniumHelper.scrollToUP(dependentDetailsPageDriver);
	  	  	SeleniumHelper.enterValueIntoTextField(txt_SSN_TIN(),hmap.get("DependentSSN"));
	  	    txt_SSN_TIN().sendKeys(Keys.TAB);
	        SeleniumHelper.logStepDetails("Parameter: SSN_TIN-"+hmap.get("DependentSSN"));
	        //Click on Gender
	        SeleniumHelper.threadSleep(2000);
	      // SeleniumHelper.clickElement(list_Gender());
	  	  //	SeleniumHelper.LinkSelection(list_GenderType(), hmap.get("DependentGender"));
	        SeleniumHelper.clickElement(list_Genders().get(7));
	        //SeleniumHelper.clickElement(list_GenderItem());
	        try {
			Robot robot = new Robot();
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	       // SeleniumHelper.LinkSelection(list_GenderType(), hmap.get("DependentGender"));
	  	  	SeleniumHelper.enterValueIntoTextField(txt_DateOfBirth(),hmap.get("DependentDOB"));
	        SeleniumHelper.logStepDetails("Parameter: Dependent DOB-"+hmap.get("DependentDOB"));
	        SeleniumHelper.clickElement(btn_Save());
	       
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





