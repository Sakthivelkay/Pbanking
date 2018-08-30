package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HealthProgramSummaryPage extends BasePage
{
	private WebDriver HealthProgramSummaryPageDriver;
	private String currentScreenName;

	public HealthProgramSummaryPage(WebDriver driver)
	{		
		this.HealthProgramSummaryPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
/*
	public WebElement btn_MakeChangesHealthProgPage() {
		List<WebElement> element = SeleniumHelper.findElements(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "btn_MakeChangesHealthProgPage"));
//                SeleniumHelper.ExplicitConditions.PRESENCE, "Click on Beneficiaries link");

		return element.get(0);
	}
*/

	public List<WebElement> btn_MakeChangesHealthProgPage(){
		List<WebElement> elements= SeleniumHelper.findElements(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "btn_MakeChangesHealthProgPage"),Constants.getLongSyc(),
				SeleniumHelper.ExplicitConditions.PRESENCE);
		System.out.println("======"+elements.size());
		return elements;
	}
	/*public WebElement btn_MakeChangesHealthProgPage()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "btn_MakeChangesHealthProgPage"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_MakeChangesHealthProgPage in HealthProgramSummaryPage");
		return element;
	}*/
	public WebElement btn_Ok()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "btn_Ok"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Ok in HealthProgramSummaryPage");
		return element;
	}
	public WebElement btn_Continue_HealthProgram()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "btn_Continue_HealthProgram"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue button in HealthProgramSummaryPage");
		return element;
	}

	public WebElement label_HealthProgramsTxt()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthProgramSummaryPageDriver, readORProperties(currentScreenName, "label_HealthProgramsTxt"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_HealthProgramsTxt in HealthProgramSummaryPage");
		return element;
	}

	public void click_MakeChanges() {
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Make Changes on HealthProgramSummaryPage");
		SeleniumHelper.waitForPageLoad(HealthProgramSummaryPageDriver);
		SeleniumHelper.threadSleep(3000);
		SeleniumHelper.ScrollToElement(HealthProgramSummaryPageDriver, label_HealthProgramsTxt());
		SeleniumHelper.DoubleclickElement(btn_MakeChangesHealthProgPage().get(0),HealthProgramSummaryPageDriver);
	}

	public void click_Ok() {
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click OK for are sure on HealthProgramSummaryPage");
		SeleniumHelper.waitForPageLoad(HealthProgramSummaryPageDriver);
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.DoubleclickElement(btn_Ok(),HealthProgramSummaryPageDriver);
	}
	public void continueLink_Click() {
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Continue on HealthProgramSummaryPage");
		SeleniumHelper.waitForPageLoad(HealthProgramSummaryPageDriver);
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(HealthProgramSummaryPageDriver, btn_Continue_HealthProgram());
		SeleniumHelper.clickElement(btn_Continue_HealthProgram());
	}

}





