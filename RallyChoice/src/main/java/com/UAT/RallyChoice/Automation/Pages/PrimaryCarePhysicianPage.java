package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrimaryCarePhysicianPage extends BasePage
{
	private WebDriver PrimaryCarePhysicianPageDriver;
	private String currentScreenName;

	public PrimaryCarePhysicianPage(WebDriver driver)
	{		
		this.PrimaryCarePhysicianPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_Pcp()
	{
		WebElement element= SeleniumHelper.findElement_poc(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "label_Pcp"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_Pcp in PrimaryCarePhysicianPage");
		return element;
	}
	public boolean label_Pcp1(){
		boolean element= SeleniumHelper.findElementpopup(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "label_Pcp"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}

	
	public WebElement link_PcpSkipThis()
	{
		WebElement element= SeleniumHelper.findElement_poc(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "link_PcpSkipThis"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "link_PcpSkipThis in PrimaryCarePhysicianPage");
		return element;
	}
	public WebElement link_ImportantNotice()
	{
		WebElement element= SeleniumHelper.findElement_poc(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "link_ImportantNotice"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "link_ImportantNotice in PrimaryCarePhysicianPage");
		return element;
	}

	public boolean link_ImportantNotice1(){
		boolean element= SeleniumHelper.findElementpopup(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "link_ImportantNotice"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}
	public List<WebElement> btn_AreYouSure(){
		List<WebElement> elements= SeleniumHelper.findElements(PrimaryCarePhysicianPageDriver, readORProperties(currentScreenName, "btn_AreYouSure"),Constants.getLongSyc(),
				SeleniumHelper.ExplicitConditions.PRESENCE);
		System.out.println("======"+elements.size());
		return elements;
	}

	public void Click_PcpSkipThis()
	{
		/*WaitForExistenceOfanElement(label_Pcp1());
		String pageLablePlanFitsText = SeleniumHelper.getElementText(label_Pcp());
		TestNGHelper.assertEqual(pageLablePlanFitsText, "Select a primary care physician (PCP)", "PCP Navigation", "yes", "PrimaryCarePhysicianPage");
		*/SeleniumHelper.clickElement(link_PcpSkipThis());
	}
	public void Click_ImportantNotice()
	{
		WaitForExistenceOfanElement(link_ImportantNotice1());
		String pageLablePlanFitsText = SeleniumHelper.getElementText(link_ImportantNotice());
		TestNGHelper.assertEqual(pageLablePlanFitsText, "THAT'S OK WITH ME", "Important notice page Navigation", "yes", "PrimaryCarePhysicianPage");
		SeleniumHelper.DoubleclickElement(link_ImportantNotice(),PrimaryCarePhysicianPageDriver);
		SeleniumHelper.threadSleep(3000);
	}
	public void Click_AreYouSure()
	{
		SeleniumHelper.DoubleclickElement(btn_AreYouSure().get(1),PrimaryCarePhysicianPageDriver);
		SeleniumHelper.threadSleep(3000);
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





