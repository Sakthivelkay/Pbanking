package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthBenefitsPage extends BasePage
{
	private WebDriver HealthBenefitsPageDriver;
	private String currentScreenName;

	public HealthBenefitsPage(WebDriver driver)
	{		
		this.HealthBenefitsPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	

	
	public WebElement btn_Plans(){
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "btn_Plans"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Continue in YourFamilyPage");
		return element;
	}
	
	public WebElement btn_Continue()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Continue in YourFamilyPage");
		return element;
	}
	public WebElement btn_ContinuewithTexas()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "btn_ContinuewithTexas"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_ContinuewithTexas in YourFamilyPage");
		return element;
	}
	public WebElement btn_Cover()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "btn_Cover"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_Cover in HealthBenefitsPage");
		return element;
	}

	public WebElement label_HealthBenefitsText()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_HealthBenefitsText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_HealthBenefits in HealthBenefitsPage");
		return element;
	}
	public boolean label_HealthBenefitsText1(){
		boolean element= SeleniumHelper.findElementpopup(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_HealthBenefitsText"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}
	public WebElement label_PlanFitsText()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_PlanFitsText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_PlanFitsText in HealthBenefitsPage");
		return element;
	}

	public boolean label_PlanFitsText1(){
		boolean element= SeleniumHelper.findElementpopup(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_PlanFitsText"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}
	public WebElement label_EmployerOffering()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_EmployerOffering"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_EmployerOffering in HealthBenefitsPage");
		return element;
	}

	public boolean label_EmployerOffering1(){
		boolean element= SeleniumHelper.findElementpopup(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_EmployerOffering"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}
	public WebElement label_CoverWithText()
	{
		WebElement element= SeleniumHelper.findElement_poc(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_CoverWithText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_CoverWithText in HealthBenefitsPage");
		return element;
	}
	public boolean label_CoverWithText1(){
		boolean element= SeleniumHelper.findElementpopup(HealthBenefitsPageDriver, readORProperties(currentScreenName, "label_CoverWithText"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}

	public void clickAvailableHealthPlans()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": clickAvailableHealthPlans in HealthBenefitsPage ");
		SeleniumHelper.waitForPageLoad(HealthBenefitsPageDriver);
		WaitForExistenceOfanElement(label_HealthBenefitsText1());
		String pageLableText = SeleniumHelper.getElementText(label_HealthBenefitsText());
		TestNGHelper.assertEqual(pageLableText, "Health Benefits", "HealthBenefits Navigation", "yes", "HealthBenefitsPage");
		SeleniumHelper.clickElement(btn_Plans());

		}

	public void clickContinueHealthPlans()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": clickContinueHealthPlans in HealthBenefitsPage ");
		WaitForExistenceOfanElement(label_PlanFitsText1());
		String pageLablePlanFitsText = SeleniumHelper.getElementText(label_PlanFitsText());
		TestNGHelper.assertEqual(pageLablePlanFitsText, "Which plan fits you best?", "Which plan fits you best Navigation", "yes", "HealthBenefitsPage");
		SeleniumHelper.ScrollToElement(HealthBenefitsPageDriver,btn_Continue());
		SeleniumHelper.DoubleclickElement(btn_Continue(),HealthBenefitsPageDriver);
		SeleniumHelper.threadSleep(2000);

	}
	public void clickContinuewithTexas()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": clickContinuewithTexas in HealthBenefitsPage ");
		WaitForExistenceOfanElement(label_EmployerOffering1());
		String pageLablePlanFitsText = SeleniumHelper.getElementText(label_EmployerOffering());
		TestNGHelper.assertEqual(pageLablePlanFitsText, "Your employer is offering the plan detailed below", "Which plan fits you best Navigation", "yes", "clickContinuewithTexas");
		SeleniumHelper.ScrollToElement(HealthBenefitsPageDriver,btn_ContinuewithTexas());
		SeleniumHelper.DoubleclickElement(btn_ContinuewithTexas(),HealthBenefitsPageDriver);
		SeleniumHelper.threadSleep(2000);
	}

	public void clickContinueCoverHealthPlans()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": clickContinueCoverHealthPlans in HealthBenefitsPage ");
		WaitForExistenceOfanElement(label_CoverWithText1());
		String pageLableCoverWithText = SeleniumHelper.getElementText(label_CoverWithText());
		TestNGHelper.assertEqual(pageLableCoverWithText, "Who would you like to cover with this plan?", "Cover With Navigation", "yes", "HealthBenefitsPage");
		SeleniumHelper.ScrollToElement(HealthBenefitsPageDriver,btn_Cover());
		SeleniumHelper.DoubleclickElement(btn_Cover(),HealthBenefitsPageDriver);
		SeleniumHelper.threadSleep(4000);
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





