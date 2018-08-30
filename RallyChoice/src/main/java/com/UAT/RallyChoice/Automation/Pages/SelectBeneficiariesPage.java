package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectBeneficiariesPage extends BasePage {
    private WebDriver selectBeneficiariesPageDriver;
    private String currentScreenName;

    public SelectBeneficiariesPage(WebDriver driver)
    {
        this.selectBeneficiariesPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }

    public WebElement link_Primary() {
        List<WebElement> element = SeleniumHelper.findElements(selectBeneficiariesPageDriver, readORProperties(currentScreenName, "link_Primary"));
//                SeleniumHelper.ExplicitConditions.PRESENCE, "Click on Beneficiaries link");

        return element.get(0);
    }

    public WebElement label_AlmostThere()
    {
        WebElement element= SeleniumHelper.findElement_poc(selectBeneficiariesPageDriver, readORProperties(currentScreenName, "label_AlmostThere"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_AlmostThere in SelectBeneficiariesPage");
        return element;
    }
    public boolean label_AlmostThere1(){
        boolean element= SeleniumHelper.findElementpopup(selectBeneficiariesPageDriver, readORProperties(currentScreenName, "label_AlmostThere"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement link_Continue()
    {
        WebElement element= SeleniumHelper.findElement_poc(selectBeneficiariesPageDriver, readORProperties(currentScreenName, "link_Continue"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_Continue in SelectBeneficiariesPage");
        return element;
    }
    public void selectBeneficiaries() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Beneficiaries to Make Primary on Benefits Select Beneficiaries Page");
        SeleniumHelper.waitForPageLoad(selectBeneficiariesPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_Primary());
    }

    public void SelectBeneficiariesPageVerification()
    {
        WaitForExistenceOfanElement(label_AlmostThere1());
        SeleniumHelper.threadSleep(4000);
        String strTxt =  SeleniumHelper.getElementText(label_AlmostThere());
        TestNGHelper.assertEqual(strTxt,"We're almost there!","yes","SelectBeneficiariesPageVerification");
    }

    public void continueLink_Click() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Continue on Benefits Select Beneficiaries Page");
        SeleniumHelper.waitForPageLoad(selectBeneficiariesPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(selectBeneficiariesPageDriver, link_Continue());
        SeleniumHelper.clickElement(link_Continue());
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

