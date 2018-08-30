package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import cucumber.api.DataTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class HomePage extends BasePage {
    private WebDriver homePageDriver;
    private String currentScreenName;
    public static String employerName = "";
    public HomePage(WebDriver driver)
    {
        this.homePageDriver=driver;
        currentScreenName=getClassName(this.getClass());
    }


    public WebElement txt_employerSearchBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "txt_employerSearchBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Click on search text box");
        return element;
    }


    public void enterEmployersName(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);

        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employers Name");
        SeleniumHelper.waitForPageLoad(homePageDriver);
        SeleniumHelper.threadSleep(2000);
        //    SeleniumHelper.clickElement(click_EmployerSearchBox());

        SeleniumHelper.logStepDetails("Parameter: Employer Name-"+hmap.get("EmployerName"));
        employerName = hmap.get("EmployerName");
        SeleniumHelper.enterValueIntoTextField(txt_employerSearchBox(),hmap.get("EmployerName"));
        txt_employerSearchBox().sendKeys(Keys.ENTER);

        //SeleniumHelper.clickElement(btn_Submit());
        //   SeleniumHelper.threadSleep(8000);
        //TestNGHelper.assertEqual(loginPageDriver.getTitle(), "Choice Admin", "Login Failed. Home Page not displayed.", "yes", "Login");

    }

    public WebElement click_Employees()
    { 	
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "employeeTabClick"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Employee Tab Click");
        return element;
    }
    public WebElement tab_employeeTab()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "tab_employeeTab"),Constants.getShortSyc(),

                SeleniumHelper.ExplicitConditions.PRESENCE, "Employee Tab Click");
        return element;
    }
    public WebElement tab_manageEmployeeTab()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "tab_manageEmployeeTab"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Manage Employee Tab Click");
        return element;
    }

    public WebElement tab_addOneEmployeeTab()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "tab_addOneEmployeeTab"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Add one Employee Tab Click");
        return element;
    }
    public WebElement link_Employers()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "link_Employers"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Add one Employee Tab Click");
        return element;
    }
    
    public WebElement link_Employers1()
    {
        WebElement element= SeleniumHelper.findElement_poc(homePageDriver, readORProperties(currentScreenName, "link_Employers1"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Add one Employee Tab Click");
        return element;
    }

    public List<WebElement> link_EmployersDynamic()
    {
    		List<WebElement> elements= SeleniumHelper.findElements(homePageDriver, readORProperties(currentScreenName, "link_EmployersDynamic"),Constants.getLongSyc(),
    				SeleniumHelper.ExplicitConditions.PRESENCE);
    		return elements;
    }
    
    //    public void EmployeesPage()
//    {
//        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Click Employees tab");
//        SeleniumHelper.waitForPageLoad(homePageDriver);
//        //  SeleniumHelper.threadSleep(2000);
//        SeleniumHelper.clickElement(clickEmployers());
//        SeleniumHelper.clickElement(click_Employees());
//        SeleniumHelper.clickElement(click_Manage_Employees());
//        SeleniumHelper.clickElement(click_AddOne_Employee());
//
//    }
    public void navigateToEmployee_DetailPage()
    {
        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": navigate To Employee Detail Page");
        SeleniumHelper.waitForPageLoad(homePageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_Employers());
        //add validation
        SeleniumHelper.clickElement(tab_employeeTab());
        //add validation
        SeleniumHelper.mouseHover(homePageDriver,tab_manageEmployeeTab());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(tab_manageEmployeeTab());
        //add validation
        SeleniumHelper.clickElement(tab_addOneEmployeeTab());
        //add validation

    }
    
    public void navigateToEmployee_DetailPage1()
    {
        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": navigate To Employee Detail Page");
        SeleniumHelper.waitForPageLoad(homePageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_Employers1());
        //add validation
        SeleniumHelper.clickElement(tab_employeeTab());
        //add validation
        SeleniumHelper.mouseHover(homePageDriver,tab_manageEmployeeTab());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(tab_manageEmployeeTab());
        //add validation
       // SeleniumHelper.clickElement(tab_addOneEmployeeTab());
        //add validation

    }

    public void navigateToAnyEmployee_DetailPage()
    {
        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": navigate To Employee Detail Page");
        SeleniumHelper.waitForPageLoad(homePageDriver);
        //  SeleniumHelper.threadSleep(2000);
        //SeleniumHelper.LinkSelection(link_EmployersDynamic(), employerName);
        List<WebElement> LnkColl = link_EmployersDynamic();
        //LnkColl.get(0).click();
		for(int i=0; i<LnkColl.size();i++){
		//WebElement local_link=LnkColl.get(i);
		String value = LnkColl.get(0).getText().toLowerCase();
		if(value.equalsIgnoreCase(employerName.toLowerCase())){	
			 LnkColl.get(0).click();
			//SeleniumHelper.DoubleclickElement(LnkColl.get(i), homePageDriver);
			SeleniumHelper.threadSleep(5000);
		break;
		}
		}
        //add validation
        SeleniumHelper.clickElement(tab_employeeTab());
        //add validation
        SeleniumHelper.mouseHover(homePageDriver,tab_manageEmployeeTab());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(tab_manageEmployeeTab());
        //add validation
        SeleniumHelper.clickElement(tab_addOneEmployeeTab());
        //add validation

    }
    
    //test
    /*public void navigateToEmployee_DetailPage()
    {
        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": navigate To Employee Detail Page");
        SeleniumHelper.waitForPageLoad(homePageDriver);
         SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_Employers());
        //add validation
        SeleniumHelper.clickElement(tab_employeeTab());
        //add validation

        //add validation

    }*/

}

