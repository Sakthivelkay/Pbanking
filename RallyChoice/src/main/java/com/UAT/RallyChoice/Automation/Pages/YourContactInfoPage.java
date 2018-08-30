package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourContactInfoPage extends BasePage {
    private WebDriver yourContactInfoPageDriver;
    private String currentScreenName;

    public YourContactInfoPage(WebDriver driver)
    {
        this.yourContactInfoPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }
    public WebElement btn_ContactInfo()
    {
        WebElement element= SeleniumHelper.findElement_poc(yourContactInfoPageDriver, readORProperties(currentScreenName, "btn_ContactInfo"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_ContactInfo in yourContactInfoPage");
        return element;
    }
    public WebElement label_PaperLess()
    {
        WebElement element= SeleniumHelper.findElement_poc(yourContactInfoPageDriver, readORProperties(currentScreenName, "label_PaperLess"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_PaperLess in yourContactInfoPage");
        return element;
    }
    public boolean label_PaperLess1(){
        boolean element= SeleniumHelper.findElementpopup(yourContactInfoPageDriver, readORProperties(currentScreenName, "label_PaperLess"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public void click_ContactInfoButton() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Continue on yourContactInfoPage ");
        SeleniumHelper.waitForPageLoad(yourContactInfoPageDriver);
          SeleniumHelper.threadSleep(2000);
          SeleniumHelper.ScrollToElement(yourContactInfoPageDriver,btn_ContactInfo());
        SeleniumHelper.clickElement(btn_ContactInfo());
    }

    public void YourContactInfoPageSaveVerification()
    {
        WaitForExistenceOfanElement(label_PaperLess1());
        String strTxt =  SeleniumHelper.getElementText(label_PaperLess());
        TestNGHelper.assertEqual(strTxt,"Going paperless for required communications","yes","YourContactInfoPageSaveVerification");
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

