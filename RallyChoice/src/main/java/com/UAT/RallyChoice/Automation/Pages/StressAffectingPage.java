package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StressAffectingPage extends BasePage
{
	private WebDriver stressAffectingPageDriver;
	private String currentScreenName;

	public StressAffectingPage(WebDriver driver)
	{		
		this.stressAffectingPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_StressAffectingPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(stressAffectingPageDriver, readORProperties(currentScreenName, "label_StressAffectingPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "StressAffectingPage Label in stressAffectingPage");
		return element;
	}
	
	public boolean label_StressAffectingPageText1(){
		boolean element= SeleniumHelper.findElementpopup(stressAffectingPageDriver, readORProperties(currentScreenName, "label_StressAffectingPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
    public WebElement link_SkipThis() {
        WebElement element = SeleniumHelper.findElement_poc(stressAffectingPageDriver, readORProperties(currentScreenName, "link_SkipThis"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_SkipThis in StressAffectingPage");
        return element;
    }
	
	public void Click_StressAffectingPageSkipThisLink()
	{
		SeleniumHelper.threadSleep(2000);
		WaitForExistenceOfanElement(label_StressAffectingPageText1());
		String pageLableText = SeleniumHelper.getElementText(label_StressAffectingPageText());		
		TestNGHelper.assertEqual(pageLableText, "Do you feel that stress is affecting your health?", "StressAffectingPage Navigation", "yes", "StressAffectingPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(stressAffectingPageDriver, link_SkipThis());
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





