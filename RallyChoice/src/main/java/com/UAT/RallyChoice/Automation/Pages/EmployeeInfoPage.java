package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.sun.glass.ui.Robot;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

public class EmployeeInfoPage extends BasePage
{
    private WebDriver EmployeeInfoPageDriver;
    private String currentScreenName;
    public static String EmployeeName="";
    public EmployeeInfoPage(WebDriver driver)
    {
        this.EmployeeInfoPageDriver=driver;
        currentScreenName=getClassName(this.getClass());
    }
    public WebElement txt_Name()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Name"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Name in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_MiddleName()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_MiddleName"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_MiddleName in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_LastName()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_LastName"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_LastName in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Desig()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Desig"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Desig in EmployeeInfoPage");
        return element;
    }

    public WebElement txt_DOB()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_DOB"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_DOB in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_SSN()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_SSN"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_DOB in EmployeeInfoPage");
        return element;
    }
    public WebElement list_Gender()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "list_Gender"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_Gender in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_GenderDropBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_GenderDropBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_GenderDropBox in EmployeeInfoPage");
        return element;
    }
    //employee Address
    public WebElement txt_Street()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Street"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Street in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Unit()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Unit"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Unit in EmployeeInfoPage");
        return element;
    }
    public WebElement list_City()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "list_City"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_City in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Zip()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Zip"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Zip in EmployeeInfoPage");
        return element;
    }
    public WebElement list_State()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "list_State"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_State in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_StateDropBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_StateDropBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_StateDropBox in EmployeeInfoPage");
        return element;
    }

    public WebElement txt_Phone()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Phone"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Phone in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Email()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Email"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Email in EmployeeInfoPage");
        return element;
    }

    public WebElement list_CountryDropBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "list_CountryDropBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_CountryDropBox in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Country()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Country"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Country in EmployeeInfoPage");
        return element;
    }

    public WebElement txt_ID()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_ID"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_ID in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_DOH()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_DOH"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_DOH in EmployeeInfoPage");
        return element;
    }
    public WebElement list_PayrollDropBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "list_PayrollDropBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_PayrollDropBox in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Payroll()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Payroll"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Payroll in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Salary()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Salary"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Salary in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_HoursPerWeek()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_HoursPerWeek"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_HoursPerWeek in EmployeeInfoPage");
        return element;
    }

    //Department
    public WebElement txt_Division()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Division"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Division in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Department()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Department"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Department in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Occupation()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Occupation"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Occupation in EmployeeInfoPage");
        return element;
    }
    public WebElement txt_Location()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "txt_Location"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Location in EmployeeInfoPage");
        return element;
    }
    public WebElement btn_Complete()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "btn_Complete"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Complete in EmployeeInfoPage");
        return element;
    }
    public WebElement chk_EmployeeDetails()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "chk_EmployeeDetails"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "chk_EmployeeDetails in EmployeeInfoPage");
        return element;
    }


    public WebElement label_EmployeeAddSuccess()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "label_EmployeeAddSuccess"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "chk_EmployeeDetails in EmployeeInfoPage");
        return element;
    }
    public List<WebElement> emp_ClassType(){
        List<WebElement> elements= SeleniumHelper.findElements(EmployeeInfoPageDriver, readORProperties(currentScreenName, "emp_ClassType"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }

    public List<WebElement> emp_ClassType_default(){
        List<WebElement> elements= SeleniumHelper.findElements(EmployeeInfoPageDriver, readORProperties(currentScreenName, "emp_ClassType_default"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public WebElement emp_ClassTypeDropBox()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "emp_ClassTypeDropBox"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Employee ClassType textbox in RallyChoice_EmployeeInfoPage");
        return element;
    }

   /* public List<WebElement> btn_TakeMeBack(){
		List<WebElement> elements= SeleniumHelper.findElements(EmployeeInfoPageDriver, readORProperties(currentScreenName, "btn_TakeMeBack"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}*/
    
    public WebElement label_OopsError()
    {
        WebElement element= SeleniumHelper.findElement_poc(EmployeeInfoPageDriver, readORProperties(currentScreenName, "label_OopsError"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_OopsError in RallyChoice_EmployeeInfoPage");
        return element;
    }
    
    public void EmployeeDetails(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);

       /* SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employee Personal Information");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        SeleniumHelper.threadSleep(2000);*/
        AutomationCore core = new AutomationCore();
        EmployeeName = core.generateRandomString(6, "AN");
        txt_Name().clear();
        SeleniumHelper.enterValueIntoTextField(txt_Name(),EmployeeName);
        SeleniumHelper.logStepDetails("Parameter: Employee Name-"+EmployeeName);
/*
        SeleniumHelper.enterValueIntoTextField(txt_MiddleName(),hmap.get("EmployeeMiddleName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Middle Name-"+hmap.get("EmployeeMiddleName"));

        SeleniumHelper.enterValueIntoTextField(txt_LastName(),hmap.get("EmployeeLastName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Last Name-"+hmap.get("EmployeeLastName"));

        SeleniumHelper.enterValueIntoTextField(txt_Desig(),hmap.get("EmployeeDesignation"));
        SeleniumHelper.logStepDetails("Parameter: Employee Designation -"+hmap.get("EmployeeDesignation"));

        SeleniumHelper.enterValueIntoTextField(txt_DOB(),hmap.get("EmployeeDateofBirth"));
        SeleniumHelper.logStepDetails("Parameter: Employee Date of Birth -"+hmap.get("EmployeeDateofBirth"));

        SeleniumHelper.enterValueIntoTextField(txt_SSN(),hmap.get("SSNorITIN"));
        SeleniumHelper.logStepDetails("Parameter: SSN or ITIN -"+hmap.get("SSNorITIN"));
*/
        //dopdown
 /*       SeleniumHelper.clickElement(txt_GenderDropBox());

        SeleniumHelper.clickElement(list_Gender());
        SeleniumHelper.logStepDetails("Parameter: Employee Gender-"+hmap.get("EmployeeGender"));
     //Enter Employee address
        SeleniumHelper.enterValueIntoTextField(txt_Street(),hmap.get("EmployeeStreetName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Street Name-"+hmap.get("EmployeeStreetName"));

        SeleniumHelper.enterValueIntoTextField(txt_Unit(),hmap.get("EmployeeUnitName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Unit Name -"+hmap.get("EmployeeUnitName"));*/

        SeleniumHelper.enterValueIntoTextField(list_City(),hmap.get("EmployeeCityName"));
        SeleniumHelper.logStepDetails("Parameter: Employee City Name -"+hmap.get("EmployeeCityName"));

        SeleniumHelper.enterValueIntoTextField(txt_Zip(),hmap.get("EmployeeZipCode"));
        SeleniumHelper.logStepDetails("Parameter: Employee Zip Code -"+hmap.get("EmployeeZipCode"));
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(list_State());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(txt_StateDropBox());
        SeleniumHelper.logStepDetails("Parameter: Employee State-"+hmap.get("EmployeeState"));

     /*   SeleniumHelper.enterValueIntoTextField(txt_Phone(),hmap.get("EmployeePhone"));
        SeleniumHelper.logStepDetails("Parameter: Employee Phone-"+hmap.get("EmployeePhone"));

        SeleniumHelper.enterValueIntoTextField(txt_Email(),hmap.get("EmployeeEmail"));
        SeleniumHelper.logStepDetails("Parameter: Employee Email -"+hmap.get("EmployeeEmail"));

        SeleniumHelper.clickElement(list_CountryDropBox());
        SeleniumHelper.clickElement(txt_Country());
        SeleniumHelper.logStepDetails("Parameter: Employee Country-"+hmap.get("EmployeeCountry"));*/

     //get the employee name and return as a string
    }
    
    public void EmployeeDetails_Customer01(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);

       /* SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employee Personal Information");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        SeleniumHelper.threadSleep(2000);*/
        AutomationCore core = new AutomationCore();
        EmployeeName = core.generateRandomString(6, "AN");
        txt_Name().clear();
        SeleniumHelper.enterValueIntoTextField(txt_Name(),EmployeeName);
        SeleniumHelper.logStepDetails("Parameter: Employee Name-"+EmployeeName);
/*
        SeleniumHelper.enterValueIntoTextField(txt_MiddleName(),hmap.get("EmployeeMiddleName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Middle Name-"+hmap.get("EmployeeMiddleName"));

        SeleniumHelper.enterValueIntoTextField(txt_LastName(),hmap.get("EmployeeLastName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Last Name-"+hmap.get("EmployeeLastName"));

        SeleniumHelper.enterValueIntoTextField(txt_Desig(),hmap.get("EmployeeDesignation"));
        SeleniumHelper.logStepDetails("Parameter: Employee Designation -"+hmap.get("EmployeeDesignation"));

        SeleniumHelper.enterValueIntoTextField(txt_DOB(),hmap.get("EmployeeDateofBirth"));
        SeleniumHelper.logStepDetails("Parameter: Employee Date of Birth -"+hmap.get("EmployeeDateofBirth"));

        SeleniumHelper.enterValueIntoTextField(txt_SSN(),hmap.get("SSNorITIN"));
        SeleniumHelper.logStepDetails("Parameter: SSN or ITIN -"+hmap.get("SSNorITIN"));
*/
        //dopdown
 /*       SeleniumHelper.clickElement(txt_GenderDropBox());

        SeleniumHelper.clickElement(list_Gender());
        SeleniumHelper.logStepDetails("Parameter: Employee Gender-"+hmap.get("EmployeeGender"));
     //Enter Employee address
        SeleniumHelper.enterValueIntoTextField(txt_Street(),hmap.get("EmployeeStreetName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Street Name-"+hmap.get("EmployeeStreetName"));

        SeleniumHelper.enterValueIntoTextField(txt_Unit(),hmap.get("EmployeeUnitName"));
        SeleniumHelper.logStepDetails("Parameter: Employee Unit Name -"+hmap.get("EmployeeUnitName"));*/

        SeleniumHelper.enterValueIntoTextField(list_City(),hmap.get("EmployeeCityName"));
        SeleniumHelper.logStepDetails("Parameter: Employee City Name -"+hmap.get("EmployeeCityName"));
        SeleniumHelper.threadSleep(3000);
        SeleniumHelper.enterValueIntoTextField(txt_Zip(),hmap.get("EmployeeZipCode"));
        SeleniumHelper.logStepDetails("Parameter: Employee Zip Code -"+hmap.get("EmployeeZipCode"));
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, list_State());
        SeleniumHelper.clickElement(list_State());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, txt_StateDropBox());
        SeleniumHelper.clickElement(txt_StateDropBox());
        SeleniumHelper.logStepDetails("Parameter: Employee State-"+hmap.get("EmployeeState"));

     /*   SeleniumHelper.enterValueIntoTextField(txt_Phone(),hmap.get("EmployeePhone"));
        SeleniumHelper.logStepDetails("Parameter: Employee Phone-"+hmap.get("EmployeePhone"));

        SeleniumHelper.enterValueIntoTextField(txt_Email(),hmap.get("EmployeeEmail"));
        SeleniumHelper.logStepDetails("Parameter: Employee Email -"+hmap.get("EmployeeEmail"));

        SeleniumHelper.clickElement(list_CountryDropBox());
        SeleniumHelper.clickElement(txt_Country());
        SeleniumHelper.logStepDetails("Parameter: Employee Country-"+hmap.get("EmployeeCountry"));*/

     //get the employee name and return as a string
    }


    public void EmploymentInfo(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);
        SeleniumHelper.threadSleep(4000);

   /*     SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employment Information");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        SeleniumHelper.threadSleep(2000);

        SeleniumHelper.enterValueIntoTextField(txt_ID(),hmap.get("EmployeeID"));
        SeleniumHelper.logStepDetails("Parameter: Employee ID-"+hmap.get("EmployeeID"));

        SeleniumHelper.enterValueIntoTextField(txt_DOH(),hmap.get("DateofHire"));
        SeleniumHelper.logStepDetails("Parameter: Date of Hire-"+hmap.get("DateofHire"));

        SeleniumHelper.clickElement(list_PayrollDropBox());
        SeleniumHelper.clickElement(txt_Payroll());
        SeleniumHelper.logStepDetails("Parameter: Payroll Frequency-"+hmap.get("PayrollFrequency"));
*/
        SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, emp_ClassTypeDropBox());
        SeleniumHelper.clickElement(emp_ClassTypeDropBox());
        //SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(emp_ClassType().get(0));
        SeleniumHelper.logStepDetails("Parameter: Class Type-"+hmap.get("ClassType"));

/*        SeleniumHelper.enterValueIntoTextField(txt_Salary(),hmap.get("Salary"));
        SeleniumHelper.logStepDetails("Parameter: Salary-"+hmap.get("Salary"));

        SeleniumHelper.enterValueIntoTextField(txt_HoursPerWeek(),hmap.get("HoursPerWeek"));
        SeleniumHelper.logStepDetails("Parameter: Employee Name-"+hmap.get("HoursPerWeek"));

//Department
        SeleniumHelper.enterValueIntoTextField(txt_Division(),hmap.get("Division"));
        SeleniumHelper.logStepDetails("Parameter: Division-"+hmap.get("Division"));

        SeleniumHelper.enterValueIntoTextField(txt_Department(),hmap.get("Department"));
        SeleniumHelper.logStepDetails("Parameter: Department-"+hmap.get("Department"));

        SeleniumHelper.enterValueIntoTextField(txt_Occupation(),hmap.get("Occupation"));
        SeleniumHelper.logStepDetails("Parameter: Occupation-"+hmap.get("Occupation"));

        SeleniumHelper.enterValueIntoTextField(txt_Location(),hmap.get("Location"));
        SeleniumHelper.logStepDetails("Parameter: Location-"+hmap.get("Location"));*/

    }
    
    public void EmploymentInfo1(DataTable table)
    {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);
        SeleniumHelper.threadSleep(4000);

   /*     SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Enter Employment Information");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        SeleniumHelper.threadSleep(2000);

        SeleniumHelper.enterValueIntoTextField(txt_ID(),hmap.get("EmployeeID"));
        SeleniumHelper.logStepDetails("Parameter: Employee ID-"+hmap.get("EmployeeID"));

        SeleniumHelper.enterValueIntoTextField(txt_DOH(),hmap.get("DateofHire"));
        SeleniumHelper.logStepDetails("Parameter: Date of Hire-"+hmap.get("DateofHire"));

        SeleniumHelper.clickElement(list_PayrollDropBox());
        SeleniumHelper.clickElement(txt_Payroll());
        SeleniumHelper.logStepDetails("Parameter: Payroll Frequency-"+hmap.get("PayrollFrequency"));
*/
        SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, emp_ClassTypeDropBox());
        SeleniumHelper.clickElement(emp_ClassTypeDropBox());
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(emp_ClassType_default().get(0));
        SeleniumHelper.logStepDetails("Parameter: Class Type-"+hmap.get("ClassType"));

/*        SeleniumHelper.enterValueIntoTextField(txt_Salary(),hmap.get("Salary"));
        SeleniumHelper.logStepDetails("Parameter: Salary-"+hmap.get("Salary"));

        SeleniumHelper.enterValueIntoTextField(txt_HoursPerWeek(),hmap.get("HoursPerWeek"));
        SeleniumHelper.logStepDetails("Parameter: Employee Name-"+hmap.get("HoursPerWeek"));

//Department
        SeleniumHelper.enterValueIntoTextField(txt_Division(),hmap.get("Division"));
        SeleniumHelper.logStepDetails("Parameter: Division-"+hmap.get("Division"));

        SeleniumHelper.enterValueIntoTextField(txt_Department(),hmap.get("Department"));
        SeleniumHelper.logStepDetails("Parameter: Department-"+hmap.get("Department"));

        SeleniumHelper.enterValueIntoTextField(txt_Occupation(),hmap.get("Occupation"));
        SeleniumHelper.logStepDetails("Parameter: Occupation-"+hmap.get("Occupation"));

        SeleniumHelper.enterValueIntoTextField(txt_Location(),hmap.get("Location"));
        SeleniumHelper.logStepDetails("Parameter: Location-"+hmap.get("Location"));*/

    }



    public void clickComplete()
    {
        //EmployeeName = SeleniumHelper.getElementText(txt_Name());

       // System.out.println(EmployeeName);

//       WebElement elm = EmployeeInfoPageDriver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/section/div/div/div[2]/div/fieldset/div/div[2]/div/div/div/div/div[1]/div/div/div/input"));
//       String emp = elm.getText();

        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Click on complete button");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, btn_Complete());
        SeleniumHelper.clickElement(btn_Complete());
        System.out.println(EmployeeName);
        SeleniumHelper.threadSleep(5000);
    }
    public void checkBox_click()
    {
        SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": select check box");
        SeleniumHelper.waitForPageLoad(EmployeeInfoPageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(chk_EmployeeDetails());
    }

    public void EmployeeAddSuccess()
    {
        String strTxt =  SeleniumHelper.getElementText(label_EmployeeAddSuccess());
        TestNGHelper.assertEqual(strTxt,"Success! Your employee was added successfully.","yes","Employee Add Success Validation");
    }

    public void EmploymentInfoError()
    {
    	 txt_Name().clear();
         SeleniumHelper.enterValueIntoTextField(txt_Name(),"E15TE");
         SeleniumHelper.enterValueIntoTextField(txt_DOB(),"09/03/1981");
         SeleniumHelper.enterValueIntoTextField(txt_SSN(),"666-81-0903");         
    }
    
    public void verify_OopsError_and_ReEnter_SSN_and_ClickOnCompleteButton(){
        List<WebElement> btn_TakeMeBack = EmployeeInfoPageDriver.findElements(By.xpath("//*[@class='ci-modal-button-ok btn btn-lg btn-success']"));

        int TakeMeBackBtnsCount = btn_TakeMeBack.size();
    	if(TakeMeBackBtnsCount>0){
    		SeleniumHelper.highlightElement(EmployeeInfoPageDriver, btn_TakeMeBack.get(0));
    		SeleniumHelper.DoubleclickElement(btn_TakeMeBack.get(0), EmployeeInfoPageDriver);
    		SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, label_OopsError());
    		SeleniumHelper.highlightElement(EmployeeInfoPageDriver, label_OopsError());
    		SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver, txt_SSN());
    		txt_SSN().click();
    		try {
				java.awt.Robot robot = new java.awt.Robot();
				robot.keyPress(KeyEvent.VK_DELETE);
				AutomationCore core = new AutomationCore();
				 String randomSSNSingleChar = core.generateRandomString(1, "N");
				txt_SSN().sendKeys(randomSSNSingleChar);
				SeleniumHelper.ScrollToElement(EmployeeInfoPageDriver,btn_Complete());
				SeleniumHelper.clickElement(btn_Complete());
				
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}
    	
	  
    }

}
