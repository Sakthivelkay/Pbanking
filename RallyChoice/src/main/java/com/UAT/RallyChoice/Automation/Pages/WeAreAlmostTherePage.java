package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeAreAlmostTherePage extends BasePage {
    private WebDriver wearealmosttherPageDriver;
    private String currentScreenName;

    public WeAreAlmostTherePage(WebDriver driver)
    {
        this.wearealmosttherPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }

    public WebElement link_Continue() {
        WebElement element = SeleniumHelper.findElement_poc(wearealmosttherPageDriver, readORProperties(currentScreenName, "link_Continue"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_Continue in WeAreAlmostTherePage");
        return element;
    }

    public WebElement label_PhoneNumber()
    {
        WebElement element= SeleniumHelper.findElement_poc(wearealmosttherPageDriver, readORProperties(currentScreenName, "label_PhoneNumber"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, " label_PhoneNumber in WeAreAlmostTherePage");
        return element;
    }
    public boolean label_PhoneNumber1(){
        boolean element= SeleniumHelper.findElementpopup(wearealmosttherPageDriver, readORProperties(currentScreenName, "label_PhoneNumber"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public void clickButton() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click on button on We are almost there Page");
        SeleniumHelper.waitForPageLoad(wearealmosttherPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(wearealmosttherPageDriver, link_Continue());
        SeleniumHelper.clickElement(link_Continue());
    }

    public void wearealmosttherPageSaveVerification()
    {
        WaitForExistenceOfanElement(label_PhoneNumber1());
        String strTxt =  SeleniumHelper.getElementText(label_PhoneNumber());
        TestNGHelper.assertEqual(strTxt,"What's the best phone number for contacting you?","yes","wearealmosttherPageSaveVerification");
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

