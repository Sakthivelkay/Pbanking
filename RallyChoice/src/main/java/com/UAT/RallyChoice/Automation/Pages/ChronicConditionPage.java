package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChronicConditionPage extends BasePage
{
	private WebDriver chronicConditionPageDriver;
	private String currentScreenName;

	public ChronicConditionPage(WebDriver driver)
	{		
		this.chronicConditionPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_ChronicConditionPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(chronicConditionPageDriver, readORProperties(currentScreenName, "label_ChronicConditionPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "ChronicConditionPage Label in chronicConditionPage");
		return element;
	}
	
	public boolean label_ChronicConditionPageText1(){
		boolean element= SeleniumHelper.findElementpopup(chronicConditionPageDriver, readORProperties(currentScreenName, "label_ChronicConditionPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
    public WebElement link_SkipThis() {
        WebElement element = SeleniumHelper.findElement_poc(chronicConditionPageDriver, readORProperties(currentScreenName, "link_SkipThis"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_SkipThis in label_ChronicConditionPage");
        return element;
    }
	
	public void Click_label_ChronicConditionPageLink()
	{
		WaitForExistenceOfanElement(label_ChronicConditionPageText1());
		String pageLableText = SeleniumHelper.getElementText(label_ChronicConditionPageText());		
		TestNGHelper.assertEqual(pageLableText, "Are you or anyone in your family struggling with a crisis or a chronic condition?", "MemberOfYourFamilyPregnantPage Navigation", "yes", "MemberOfYourFamilyPregnantPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(chronicConditionPageDriver, link_SkipThis());

		SeleniumHelper.clickElement(link_SkipThis());
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





