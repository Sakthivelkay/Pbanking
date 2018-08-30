package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberOfYourFamilyPregnantPage extends BasePage
{
	private WebDriver memberOfYourFamilyPregnantPageDriver;
	private String currentScreenName;

	public MemberOfYourFamilyPregnantPage(WebDriver driver)
	{		
		this.memberOfYourFamilyPregnantPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_MemberOfYourFamilyPregnantPageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(memberOfYourFamilyPregnantPageDriver, readORProperties(currentScreenName, "label_MemberOfYourFamilyPregnantPageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "MemberOfYourFamilyPregnantPage Label in MemberOfYourFamilyPregnantPage");
		return element;
	}
	
	public boolean label_MemberOfYourFamilyPregnantPageText1(){
		boolean element= SeleniumHelper.findElementpopup(memberOfYourFamilyPregnantPageDriver, readORProperties(currentScreenName, "label_MemberOfYourFamilyPregnantPageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
    public WebElement link_SkipThis() {
        WebElement element = SeleniumHelper.findElement_poc(memberOfYourFamilyPregnantPageDriver, readORProperties(currentScreenName, "link_SkipThis"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_SkipThis in MemberOfYourFamilyPregnantPage");
        return element;
    }
	public WebElement link_Yes() {
		WebElement element = SeleniumHelper.findElement_poc(memberOfYourFamilyPregnantPageDriver, readORProperties(currentScreenName, "link_Yes"), Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.PRESENCE, "link_Yes in MemberOfYourFamilyPregnantPage");
		return element;
	}
	

	public void Click_MemberOfYourFamilyPregnantPageSkipThisLink()
	{
		SeleniumHelper.threadSleep(3000);
//		WaitForExistenceOfanElement(label_MemberOfYourFamilyPregnantPageText1());
//		String pageLableText = SeleniumHelper.getElementText(label_MemberOfYourFamilyPregnantPageText());
//		TestNGHelper.assertEqual(pageLableText, "Are you or a member of your family currently pregnant with a due date after 9/1/2018?", "MemberOfYourFamilyPregnantPage Navigation", "yes", "MemberOfYourFamilyPregnantPage");
//		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(memberOfYourFamilyPregnantPageDriver, link_SkipThis());

		SeleniumHelper.clickElement(link_SkipThis());

	}
	public void Click_Yes_MemberOfYourFamilyPregnantPage()
	{
		SeleniumHelper.threadSleep(3000);
		SeleniumHelper.ScrollToElement(memberOfYourFamilyPregnantPageDriver, link_Yes());
		SeleniumHelper.clickElement(link_Yes());

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





