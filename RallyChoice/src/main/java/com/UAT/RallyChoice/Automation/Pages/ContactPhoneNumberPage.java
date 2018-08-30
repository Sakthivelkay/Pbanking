package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

public class ContactPhoneNumberPage extends BasePage {
    private WebDriver contactPhoneNumberPageDriver;
    private String currentScreenName;

    public ContactPhoneNumberPage(WebDriver driver)
    {
        this.contactPhoneNumberPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }
    public WebElement txt_Number()
    {
        WebElement element= SeleniumHelper.findElement_poc(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "txt_Number"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_Number in ContactPhoneNumberPage");
        return element;
    }

    public WebElement list_Type()
    {
        WebElement element= SeleniumHelper.findElement_poc(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "list_Type"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "list_Type in contactPhoneNumberPage");
        return element;
    }
    public WebElement label_Type()
    {
        WebElement element= SeleniumHelper.findElement_poc(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "label_Type"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Type in contactPhoneNumberPage");
        return element;
    }
    public WebElement btn_Continue()
    {
        WebElement element= SeleniumHelper.findElement_poc(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "btn_Continue"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Continue in contactPhoneNumberPage");
        return element;
    }

    public WebElement label_contactInfo()
    {
        WebElement element= SeleniumHelper.findElement_poc(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "label_contactInfo"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_contactInfo in contactPhoneNumberPage");
        return element;
    }
    public boolean label_contactInfo1(){
        boolean element= SeleniumHelper.findElementpopup(contactPhoneNumberPageDriver, readORProperties(currentScreenName, "label_contactInfo"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public void enterPhoneNo(DataTable table) {
        final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        final Map<String, String> hmap = rows.get(0);
        SeleniumHelper.enterValueIntoTextField(txt_Number(), hmap.get("ContactNo"));
        SeleniumHelper.logStepDetails("Parameter: phone no-" + hmap.get("ContactNo"));

    }

    public void clickPhoneType() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click On Phone type on contactPhoneNumberPage ");
        SeleniumHelper.waitForPageLoad(contactPhoneNumberPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(list_Type());
    }

    public void selectPhoneType() {
    	  try {
  			Robot robot = new Robot();
  			robot.setAutoDelay(2000);
  			robot.keyPress(KeyEvent.VK_DOWN);
  			robot.keyRelease(KeyEvent.VK_DOWN);
  			robot.keyPress(KeyEvent.VK_ENTER);
  			robot.keyRelease(KeyEvent.VK_ENTER);
  		} catch (AWTException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      /*  SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Select Phone type on contactPhoneNumberPage ");
        SeleniumHelper.waitForPageLoad(contactPhoneNumberPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(label_Type());*/
    }
    public void clickContinue() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Continue on contactPhoneNumberPage ");
        SeleniumHelper.waitForPageLoad(contactPhoneNumberPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(contactPhoneNumberPageDriver, btn_Continue());
        SeleniumHelper.DoubleclickElement(btn_Continue(),contactPhoneNumberPageDriver);
    }

    public void contactPhoneNumberSaveVerification()
    {
        WaitForExistenceOfanElement(label_contactInfo1());
        String strTxt =  SeleniumHelper.getElementText(label_contactInfo());
        TestNGHelper.assertEqual(strTxt,"Your contact information","yes","contactPhoneNumberSaveVerification");
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

