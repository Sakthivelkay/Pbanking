package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthBeginPage extends BasePage
{
	private WebDriver healthBeginPageDriver;
	private String currentScreenName;

	public HealthBeginPage(WebDriver driver)
	{		
		this.healthBeginPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_HealthBeginPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(healthBeginPageDriver, readORProperties(currentScreenName, "label_HealthBeginPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "HealthBeginPage Label in HealthBeginPage");
		return element;
	}
	
	public boolean label_HealthBeginPageText1(){
		boolean element= SeleniumHelper.findElementpopup(healthBeginPageDriver, readORProperties(currentScreenName, "label_HealthBeginPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public WebElement btn_Continue()
	{
		WebElement element= SeleniumHelper.findElement_poc(healthBeginPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Continue Button in HealthBeginPage");
		return element;
	}
	
	public void Click_label_HealthBeginPageLink()
	{
		WaitForExistenceOfanElement(label_HealthBeginPageText1());
		String pageLableText = SeleniumHelper.getElementText(label_HealthBeginPageText());		
		TestNGHelper.assertEqual(pageLableText, "The first steps to better health begin here", "HealthBeginPage Navigation", "yes", "HealthBeginPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(healthBeginPageDriver, btn_Continue());

		SeleniumHelper.clickElement(btn_Continue());
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





