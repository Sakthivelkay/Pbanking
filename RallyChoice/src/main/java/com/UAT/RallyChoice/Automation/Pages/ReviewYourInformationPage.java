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

public class ReviewYourInformationPage extends BasePage
{
	private WebDriver reviewYourInformationdriver;	
	private String currentScreenName;

	public ReviewYourInformationPage(WebDriver driver)
	{		
		this.reviewYourInformationdriver=driver;
		currentScreenName=getClassName(this.getClass());
	}
	
	public WebElement Label_ReviewYourInfoPage()
	{
		WebElement element= SeleniumHelper.findElement_poc(reviewYourInformationdriver, readORProperties(currentScreenName, "label_ReviewYourInfoPage"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "ReviewYourInfoPage Label in ReviewYourInfoPage page");
		return element;
	}
	
	public WebElement Btn_LooksGood()
	{
		WebElement element= SeleniumHelper.findElement_poc(reviewYourInformationdriver, readORProperties(currentScreenName, "btn_LookGood"),Constants.getShortSyc(),
				ExplicitConditions.PRESENCE, "Looks Good button in Review your information page");
		 return element;
	}
	
	public boolean Label_ReviewYourInfoPage1()
	{
        boolean element= SeleniumHelper.findElementpopup(reviewYourInformationdriver, readORProperties(currentScreenName, "label_ReviewYourInfoPage"),Constants.getShortSyc(),
        ExplicitConditions.PRESENCE);
        return element ;
    }
	
	public void VerifyReviewYourInfoPage(){
		WaitForExistenceOfanElement(Label_ReviewYourInfoPage1());
		String ReviewYourInfoLabelText = SeleniumHelper.getElementText(Label_ReviewYourInfoPage());
		TestNGHelper.assertEqual(ReviewYourInfoLabelText, "Let's start by reviewing your information","ReviewYourInfo label text Verify", "yes", "ReviewYourInfo Page Navigation");
	}
	
	public void Click_Btn_LooksGood(){
		SeleniumHelper.threadSleep(2000);
		//SeleniumHelper.clickElement(btn_Action());
		SeleniumHelper.ScrollToElement(reviewYourInformationdriver, Btn_LooksGood());
		SeleniumHelper.DoubleclickElement(Btn_LooksGood(),reviewYourInformationdriver);
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





