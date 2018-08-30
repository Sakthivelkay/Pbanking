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

public class LoginPage extends BasePage
{
	private WebDriver loginPageDriver;	
	private String currentScreenName;

	public LoginPage(WebDriver driver)
	{		
		this.loginPageDriver=driver;
		loginPageDriver.get(appURL);
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement link_Login()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "link_Login"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "loginLink in Login page");
		return element;
	}
	
	public WebElement txt_UserName()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "txt_UserName"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "UserName textbox in Login page");
		return element;
	}

	public WebElement txt_Password()
	{		
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "txt_PassWord"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Password textbox in Login page");
		 return element;		
	}
	
	public WebElement btn_Submit()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "btn_submit"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Submit button in Login page");
		 return element;
	}

	public WebElement click_EmployerSearchBox()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "employerSearchBox"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Click on search text box");
		return element;
	}

	public boolean click_EmployerSearchBoxBoolean(){
		boolean element= SeleniumHelper.findElementpopup(loginPageDriver, readORProperties(currentScreenName, "employerSearchBox"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}

	public WebElement logo_HomePage()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "logo_HomePage"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Activities Link in quote creation page");
		return element;
	}

	public WebElement logo_ProfileIcon()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "logo_ProfileIcon"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Profile icon click on rallychoice App");
		return element;
	}

	public WebElement link_logOut()
	{
		WebElement element= SeleniumHelper.findElement_poc(loginPageDriver, readORProperties(currentScreenName, "link_logOut"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "logOut from rallychoice App");
		return element;
	}


	public boolean homePageLogo1(){
		boolean element= SeleniumHelper.findElementpopup(loginPageDriver, readORProperties(currentScreenName, "homePageLogo"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}


	public void login()
	{
		SeleniumHelper.threadSleep(2000);
		List<WebElement> elm = loginPageDriver.findElements(By.xpath(".//*[@id='action-button']"));
		if(elm.size()>0)
		{
			SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Login to RallyChoice Application");
			SeleniumHelper.threadSleep(3000);
		}
		else {
			TestNGHelper.assertEqual("", "", "Login Failed. Home Page not displayed.", "yes", "LoginPage");
			SeleniumHelper.logStepDetails("Step" +getStepNumber()+ ": Login to RallyChoice Application");
			SeleniumHelper.waitForPageLoad(loginPageDriver);
			SeleniumHelper.threadSleep(2000);
			 AutomationCore AutoCore = new AutomationCore();
			List<WebElement> elmUserNameList = loginPageDriver.findElements(By.xpath(".//*[@id='loginEmail']"));
			if(elmUserNameList.size()==0)
			 {
				 SeleniumHelper.DoubleclickElement(link_Login(),loginPageDriver);
			 }

			if(AutoCore.Environment("EnvironmentToExecute").equals("Local")){
				SeleniumHelper.logStepDetails("Parameter: userName-"+Environment("Username"));
				SeleniumHelper.threadSleep(2000);
				SeleniumHelper.clickElement(txt_UserName());
				SeleniumHelper.enterValueIntoTextField(txt_UserName(),Environment("Username"));
				SeleniumHelper.threadSleep(2000);
				SeleniumHelper.clickElement(txt_Password());
				SeleniumHelper.enterValueIntoTextField(txt_Password(),Environment("Password"));
			}
			
			else{
			//to read username, password from jenkins used system.getenv method		
			SeleniumHelper.logStepDetails("Parameter: userName-"+System.getenv("username"));
			SeleniumHelper.enterValueIntoTextField(txt_UserName(),System.getenv("username"));
			SeleniumHelper.enterValueIntoTextField(txt_Password(),AutomationCore.PasswordDecoder(System.getenv("password")));
			}
			txt_Password().sendKeys(Keys.ENTER);
			//	SeleniumHelper.clickElement(btn_Submit());
			SeleniumHelper.threadSleep(15000);
			List<WebElement> elmHomePage = loginPageDriver.findElements(By.xpath(".//*[@id='action-button']"));
			if(elmHomePage.size()==0)
			{
				SeleniumHelper.threadSleep(20000);

			}
			TestNGHelper.assertEqual(loginPageDriver.getTitle(), "Choice Admin", "Login Passed. Home Page displayed.", "yes", "HomePage");
		}
	}

	public void logOut() {
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": logOut ");
		SeleniumHelper.waitForPageLoad(loginPageDriver);
		  SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(logo_ProfileIcon());
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.clickElement(link_logOut());
		SeleniumHelper.threadSleep(2000);
		TestNGHelper.assertEqual("", "", "Logout Failed.", "yes", "LogoutCompleted");
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





