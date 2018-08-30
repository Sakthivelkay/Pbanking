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

public class HowMuchCoverageWouldYouLikePage extends BasePage
{
	private WebDriver howMuchCoverageWouldYouLikePageDriver;	
	private String currentScreenName;

	public HowMuchCoverageWouldYouLikePage(WebDriver driver)
	{		
		this.howMuchCoverageWouldYouLikePageDriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement label_HowMuchCoverageWouldYouLikePageText()
	{
		WebElement element= SeleniumHelper.findElement_poc(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "label_HowMuchCoverageWouldYouLikePageText"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "label_LifeInsurance in LifeInsurancePage");
		return element;
	}
	
	public boolean label_HowMuchCoverageWouldYouLikePageText1(){
		boolean element= SeleniumHelper.findElementpopup(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "label_HowMuchCoverageWouldYouLikePageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
	
	public List<WebElement> link_CustomizeYourCoverage(){
		List<WebElement> elements= SeleniumHelper.findElements(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "link_CustomizeYourCoverage"),Constants.getLongSyc(),
				ExplicitConditions.PRESENCE);
		 return elements;
	}
	
	public WebElement txt_SupplementalLifeADandD()
	   {
	       WebElement element= SeleniumHelper.findElement_poc(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "txt_SupplementalLifeADandD"),Constants.getShortSyc(),
	                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_SupplementalLifeADandD in howMuchCoverageWouldYouLikePage");
	        return element;
	    }
	 
		public WebElement btn_Continue()
		{
			WebElement element= SeleniumHelper.findElement_poc(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
					ExplicitConditions.PRESENCE, "Continue Button in howMuchCoverageWouldYouLikePageDriver Page");
			return element;
		}
		
		public WebElement btn_OkGotIt()
		{
			WebElement element= SeleniumHelper.findElement_poc(howMuchCoverageWouldYouLikePageDriver, readORProperties(currentScreenName, "btn_OkGotIt"),Constants.getShortSyc(),
					ExplicitConditions.PRESENCE, "OkGotIt Button in howMuchCoverageWouldYouLikePageDriver Page");
			return element;
		}
			
	  public void enterCoverage(DataTable table) {
	        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
	        final Map<String, String> hmap = rows.get(0);
	        //SeleniumHelper.clearTextrField(txt_SupplementalLifeADandD());
	        SeleniumHelper.enterValueIntoTextField(txt_SupplementalLifeADandD(), hmap.get("LifeADandD"));
	        SeleniumHelper.logStepDetails("Parameter: Supplementary Life ADandD-" + hmap.get("LifeADandD"));

	    }
	
	public void Click_link_CustomizeYourCoverage()
	{
		WaitForExistenceOfanElement(label_HowMuchCoverageWouldYouLikePageText1());
		String pageLableText = SeleniumHelper.getElementText(label_HowMuchCoverageWouldYouLikePageText());		
		TestNGHelper.assertEqual(pageLableText, "How much coverage would you like?", "How much coverage would you like Page Navigation", "yes", "How much coverage would you like Page");
		//SeleniumHelper.ScrollToElement(howMuchCoverageWouldYouLikePageDriver, link_CustomizeYourCoverage());
		SeleniumHelper.clickElement(link_CustomizeYourCoverage().get(0));
	}
	
	public void Click_ContinueButton()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Continue Button in HowMuchCoverageWouldYouLikePage");
		SeleniumHelper.ScrollToElement(howMuchCoverageWouldYouLikePageDriver, btn_Continue());
		SeleniumHelper.clickElement(btn_Continue());	
	}
	
	public void Click_OkGotItButton()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click OkGotIt Button in HowMuchCoverageWouldYouLikePage");
		SeleniumHelper.ScrollToElement(howMuchCoverageWouldYouLikePageDriver, btn_OkGotIt());
		SeleniumHelper.clickElement(btn_OkGotIt());	
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




