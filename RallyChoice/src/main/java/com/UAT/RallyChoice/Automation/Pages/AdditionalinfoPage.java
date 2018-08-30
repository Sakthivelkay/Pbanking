package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdditionalinfoPage extends BasePage
{
	private WebDriver AdditionalinfoPageDriver;
	private String currentScreenName;

	public AdditionalinfoPage(WebDriver driver)
	{		
		this.AdditionalinfoPageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_AdditionalInfo()
	{
		WebElement element= SeleniumHelper.findElement_poc(AdditionalinfoPageDriver, readORProperties(currentScreenName, "label_AdditionalInfo"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_AdditionalInfo in AdditionalinfoPage");
		return element;
	}
	public boolean label_AdditionalInfo1(){
		boolean element= SeleniumHelper.findElementpopup(AdditionalinfoPageDriver, readORProperties(currentScreenName, "label_AdditionalInfo"),Constants.getShortSyc(),
				SeleniumHelper.ExplicitConditions.VISIBLE);
		return element ;
	}

	public WebElement btn_AdditionalContinue()
	{
		WebElement element= SeleniumHelper.findElement_poc(AdditionalinfoPageDriver, readORProperties(currentScreenName, "btn_AdditionalContinue"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_AdditionalContinue in AdditionalinfoPage");
		return element;
	}

	public WebElement btn_MakeChangesAddInfo()
	{
		WebElement element= SeleniumHelper.findElement_poc(AdditionalinfoPageDriver, readORProperties(currentScreenName, "btn_MakeChangesAddInfo"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "btn_MakeChangesAddInfo in AdditionalinfoPage");
		return element;
	}




	public void Click_ContinueAdditionalInfoPage()
	{
		WaitForExistenceOfanElement(label_AdditionalInfo1());
		String pageLableText = SeleniumHelper.getElementText(label_AdditionalInfo());
		TestNGHelper.assertEqual(pageLableText, "Additional information summary", "Additional information summary navigation", "yes", "AdditionalinfoPage");
		SeleniumHelper.threadSleep(2000);
		SeleniumHelper.ScrollToElement(AdditionalinfoPageDriver, btn_AdditionalContinue());
		SeleniumHelper.clickElement(btn_AdditionalContinue());
	}

	public void Click_MakeChangesAdditionalInfoPage()
	{
		WaitForExistenceOfanElement(label_AdditionalInfo1());
		String pageLableText = SeleniumHelper.getElementText(label_AdditionalInfo());
		TestNGHelper.assertEqual(pageLableText, "Additional information summary", "Additional information summary navigation", "yes", "AdditionalinfoPage");
		SeleniumHelper.clickElement(btn_MakeChangesAddInfo());
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





