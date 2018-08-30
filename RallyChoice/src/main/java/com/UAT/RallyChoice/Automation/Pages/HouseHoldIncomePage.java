package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HouseHoldIncomePage extends BasePage {
    private WebDriver houseHoldIncomePageDriver;
    private String currentScreenName;

    public HouseHoldIncomePage(WebDriver driver)
    {
        this.houseHoldIncomePageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }
    public WebElement link_SkipThis() {
        WebElement element = SeleniumHelper.findElement_poc(houseHoldIncomePageDriver, readORProperties(currentScreenName, "link_SkipThis"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_SkipThis in HouseHoldIncomePage");
        return element;
    }
    public WebElement label_BenefitPortfolio() {
        WebElement element = SeleniumHelper.findElement_poc(houseHoldIncomePageDriver, readORProperties(currentScreenName, "label_BenefitPortfolio"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_BenefitPortfolio in HouseHoldIncomePage");
        return element;
    }
    public boolean label_BenefitPortfolio1(){
        boolean element= SeleniumHelper.findElementpopup(houseHoldIncomePageDriver, readORProperties(currentScreenName, "label_BenefitPortfolio"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }


    public void houseHoldIncomePage_SkipClick() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click on skip on House Hold Income Page");
        SeleniumHelper.waitForPageLoad(houseHoldIncomePageDriver);
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(houseHoldIncomePageDriver, link_SkipThis());
        SeleniumHelper.clickElement(link_SkipThis());
    }

    public void verifySkipThisClickOnIncomePage() {

        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_BenefitPortfolio1());
        String strTxt =  SeleniumHelper.getElementText(label_BenefitPortfolio());
        TestNGHelper.assertEqual(strTxt,"Here is your benefits portfolio","yes","SkipThisClickOnIncomePageVerification");

    }
    public void WaitForExistenceOfanElement(boolean ElementToInspect) {
        //SeleniumHelper.threadSleep(2000);
        for (int i = 0; i <= 100; i++) {
            boolean waitForEle = ElementToInspect;
            String waitForEle1 = String.valueOf(waitForEle);
            if (waitForEle1 == "true") {
                SeleniumHelper.logStepDetails("Element found and performing next actions required ");
                SeleniumHelper.threadSleep(2000);
                break;
            }
        }
    }


}

