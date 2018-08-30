package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AreYouInterestedInLosingWeightPage extends BasePage
{
	private WebDriver areYouInterestedInLosingWeightPageDriver;
	private String currentScreenName;

	public AreYouInterestedInLosingWeightPage(WebDriver driver)
	{		
		this.areYouInterestedInLosingWeightPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_AreYouInterestedInLosingWeightPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(areYouInterestedInLosingWeightPageDriver, readORProperties(currentScreenName, "label_AreYouInterestedInLosingWeightPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "AreYouInterestedInLosingWeight Label in AreYouInterestedInLosingWeightPage");
		return element;
	}
	
	public boolean label_AreYouInterestedInLosingWeightPageText1(){
		boolean element= SeleniumHelper.findElementpopup(areYouInterestedInLosingWeightPageDriver, readORProperties(currentScreenName, "label_AreYouInterestedInLosingWeightPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
    public WebElement link_SkipThis() {
        WebElement element = SeleniumHelper.findElement_poc(areYouInterestedInLosingWeightPageDriver, readORProperties(currentScreenName, "link_SkipThis"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_SkipThis in AreYouInterestedInLosingWeightPage");
        return element;
    }
	
	

	public void Click_AreYouInterestedInLosingWeightPageSkipThisLink()
	{
		WaitForExistenceOfanElement(label_AreYouInterestedInLosingWeightPageText1());
		String pageLableText = SeleniumHelper.getElementText(label_AreYouInterestedInLosingWeightPageText());		
		TestNGHelper.assertEqual(pageLableText, "Are you interested in losing weight?", "MemberOfYourFamilyPregnantPage Navigation", "yes", "MemberOfYourFamilyPregnantPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(areYouInterestedInLosingWeightPageDriver, link_SkipThis());
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





