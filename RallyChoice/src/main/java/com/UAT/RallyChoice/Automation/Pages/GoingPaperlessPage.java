package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoingPaperlessPage extends BasePage {
    private WebDriver goingPaperlessPageDriver;
    private String currentScreenName;

    public GoingPaperlessPage(WebDriver driver)
    {
        this.goingPaperlessPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }

    public WebElement btn_GoPaperless()
    {
        WebElement element= SeleniumHelper.findElement_poc(goingPaperlessPageDriver, readORProperties(currentScreenName, "btn_GoPaperless"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_GoPaperless in GoingPaperlessPage");
        return element;
    }

    public WebElement label_AlmostThere()
    {
        WebElement element= SeleniumHelper.findElement_poc(goingPaperlessPageDriver, readORProperties(currentScreenName, "label_AlmostThere"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_AlmostThere in GoingPaperlessPage");
        return element;
    }
    public boolean label_AlmostThere1(){
        boolean element= SeleniumHelper.findElementpopup(goingPaperlessPageDriver, readORProperties(currentScreenName, "label_AlmostThere"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public void click_GoingPaperless() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Going Paperless link on GoingPaperlessPage ");
        SeleniumHelper.waitForPageLoad(goingPaperlessPageDriver);
         SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(goingPaperlessPageDriver, btn_GoPaperless());
        SeleniumHelper.clickElement(btn_GoPaperless());
    }

    public void GoingPaperlessPageSave_Verification()
    {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_AlmostThere1());
        String strTxt =  SeleniumHelper.getElementText(label_AlmostThere());
        TestNGHelper.assertEqual(strTxt,"Almost there! Just one more step","yes","GoingPaperlessPageSaveVerification");
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

