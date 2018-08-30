package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnrollmentCompletePage extends BasePage {
    private WebDriver enrollmentCompletePageDriver;
    private String currentScreenName;

    public EnrollmentCompletePage(WebDriver driver)
    {
        this.enrollmentCompletePageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }

    public WebElement label_EnrollmentCompletePageText()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentCompletePageDriver, readORProperties(currentScreenName, "label_EnrollmentCompletePageText"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_EnrollmentComplete in EnrollmentCompletePage");
        return element;
    }
    
	public boolean label_EnrollmentCompletePageText1(){
		boolean element= SeleniumHelper.findElementpopup(enrollmentCompletePageDriver, readORProperties(currentScreenName, "label_EnrollmentCompletePageText"),Constants.getShortSyc(),
				ExplicitConditions.VISIBLE);
		return element ;
	}
    public WebElement btn_ViewOrModify()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentCompletePageDriver, readORProperties(currentScreenName, "btn_ViewOrModify"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE, "btn_ViewOrModify in Enrollment is open page");
        return element;
    }

    public boolean btn_ViewOrModify1()
    {
        boolean element= SeleniumHelper.findElementpopup(enrollmentCompletePageDriver, readORProperties(currentScreenName, "btn_ViewOrModify"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE);
        return element ;
    }

    public WebElement label_Banner()
    {
        WebElement element= SeleniumHelper.findElement_poc(enrollmentCompletePageDriver, readORProperties(currentScreenName, "label_Banner"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE, "label_Banner in Enrollment is open page");
        return element;
    }
    public boolean label_Banner1()
    {
        boolean element= SeleniumHelper.findElementpopup(enrollmentCompletePageDriver, readORProperties(currentScreenName, "label_Banner"),Constants.getShortSyc(),
                ExplicitConditions.PRESENCE);
        return element ;
    }
    public void Verify_EnrollmentCompletePage() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Enrollment Complete Label in Enrollment Complete Page");
		WaitForExistenceOfanElement(label_EnrollmentCompletePageText1());
		String pageLableText = SeleniumHelper.getElementText(label_EnrollmentCompletePageText());		
		TestNGHelper.assertEqual(pageLableText, "Your Enrollment is Complete!", "EnrollmentCompletePage Navigation", "yes", "EnrollmentCompletePage");
    }

    public void verify_VieworModify(){
        WaitForExistenceOfanElement(btn_ViewOrModify1());
        String pageLableText = SeleniumHelper.getElementText(btn_ViewOrModify());
        TestNGHelper.assertEqual(pageLableText, "VIEW OR MODIFY", "VieworModify Navigation", "yes", "VieworModifyClick");
        SeleniumHelper.threadSleep(2000);
        //SeleniumHelper.clickElement(btn_ViewOrModify());
    }
    public void click_VieworModify()
    {
        SeleniumHelper.threadSleep(4000);
        SeleniumHelper.clickElement(btn_ViewOrModify());
    }

    public void verify_Banner(){
        WaitForExistenceOfanElement(label_Banner1());
        String pageLableText = SeleniumHelper.getElementText(label_Banner());
        Boolean bannerTxt = pageLableText.contains("Your elections require approval by your HR or plan administrator");
        TestNGHelper.assertTrue(bannerTxt, pageLableText+" Banner has been displayed", "yes", "verify_Banner");

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

