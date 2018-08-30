package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ChooseHealthPlansPage extends BasePage {
    private WebDriver chooseHealthPlansPageDriver;
    private String currentScreenName;

    public ChooseHealthPlansPage(WebDriver driver) {
        this.chooseHealthPlansPageDriver = driver;

        currentScreenName = getClassName(this.getClass());
    }

    public WebElement link_Skip() {
        WebElement element = SeleniumHelper.findElement_poc(chooseHealthPlansPageDriver, readORProperties(currentScreenName, "link_Skip"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_Skip in ChooseHealthPlansPage");
        return element;
    }
    public WebElement label_HouseHoldText() {
        WebElement element = SeleniumHelper.findElement_poc(chooseHealthPlansPageDriver, readORProperties(currentScreenName, "label_HouseHoldText"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_HouseHoldText in ChooseHealthPlansPage");
        return element;
    }

    public boolean label_HouseHoldText1(){
        boolean element= SeleniumHelper.findElementpopup(chooseHealthPlansPageDriver, readORProperties(currentScreenName, "label_HouseHoldText"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }


    public void healthPlan_SkipClick() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click on skip on Choose Health Plans Page");
        //SeleniumHelper.waitForPageLoad(chooseHealthPlansPageDriver);
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(chooseHealthPlansPageDriver, link_Skip());
        SeleniumHelper.clickElement(link_Skip());
    }

    public void verify_Navigation_to_HouseHoldPage() {

        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_HouseHoldText1());
        String strTxt =  SeleniumHelper.getElementText(label_HouseHoldText());
        TestNGHelper.assertEqual(strTxt,"What was your total household income for the previous tax year?","yes","NavigationToHouseHoldPageVerification");


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

