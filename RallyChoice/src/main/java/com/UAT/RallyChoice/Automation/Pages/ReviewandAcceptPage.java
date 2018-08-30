package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;

import cucumber.api.DataTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ReviewandAcceptPage extends BasePage {
    private WebDriver reviewandAcceptPageDriver;
    private String currentScreenName;
    public int eventIntCount;

    public static String healthCost;
    public static String dentalCost;
    public static String visionCost;

    public ReviewandAcceptPage(WebDriver driver) {
        this.reviewandAcceptPageDriver = driver;

        currentScreenName = getClassName(this.getClass());
    }


    public WebElement btn_Approve() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "btn_Approve"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Approve in ReviewandAcceptPage");
        return element;
    }

    public WebElement btn_Reject() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "btn_Reject"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Reject in ReviewandAcceptPage");
        return element;
    }

    public WebElement btn_Submit() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "btn_Submit"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Submit in ReviewandAcceptPage");
        return element;
    }
    public WebElement btn_RequestRevision() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "btn_RequestRevision"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_RequestRevision in ReviewandAcceptPage");
        return element;
    }
    public WebElement label_PendingEmpLink() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEmpLink"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Pending in ReviewandAcceptPage");
        return element;
    }

      public boolean label_PendingEmpLink1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEmpLink"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public WebElement label_PendingEventPage() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEventPage"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_PendingEventPage in ReviewandAcceptPage");
        return element;
    }

    public boolean label_PendingEventPage1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEventPage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_Approve() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_Approve"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Approve in ReviewandAcceptPage");
        return element;
    }

    public boolean label_Approve1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_Approve"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public WebElement label_SuccessMessage() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_SuccessMessage"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_SuccessMessage in ReviewandAcceptPage");
        return element;
    }

    public boolean label_SuccessMessage1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_SuccessMessage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }

    public List<WebElement> link_EmpName(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "link_EmpName"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public WebElement link_NewHireEnroll() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "link_NewHireEnroll"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_NewHireEnroll in ReviewandAcceptPage");
        return element;
    }

    public WebElement label_RejectMsg() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_RejectMsg"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_RejectMsg in ReviewandAcceptPage");
        return element;
    }

    public boolean label_RejectMsg1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_RejectMsg"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    
    //New method for NH verification - Sandeep
    
    public WebElement Label_NewHireEnrollmentPendingEvent() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "Label_NewHireEnrollmentPendingEvent"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_RejectMsg in ReviewandAcceptPage");
        return element;
    }

    public boolean Label_NewHireEnrollmentPendingEvent1(){
        boolean element= SeleniumHelper.findElementpopup(reviewandAcceptPageDriver, readORProperties(currentScreenName, "Label_NewHireEnrollmentPendingEvent"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    
    public void Verify_Label_NewHireEnrollmentPendingEvent()
	{
		SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify NewHire Enrollment Label");
		WaitForExistenceOfanElement(Label_NewHireEnrollmentPendingEvent1());
		String pageLableText_NHLabel = SeleniumHelper.getElementText(Label_NewHireEnrollmentPendingEvent());		
		TestNGHelper.assertEqual(pageLableText_NHLabel, "New Hire Enrollment", "New Hire Label Enrollment Verification", "yes", "ReviewAndAcceptPage");		
	}
    
    public WebElement txt_ApproveRejectCommentMsgBox() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "txt_ApproveRejectCommentMsgBox"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "txt_ApproveRejectCommentMsgBox in ReviewandAcceptPage");
        return element;
    }


   //new methods
   public List<WebElement> label_NewHireEnrollment(){
       List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_NewHireEnrollment"),Constants.getLongSyc(),
               SeleniumHelper.ExplicitConditions.PRESENCE);
       return elements;
   }
    public List<WebElement> icon_PushPin(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "icon_PushPin"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public List<WebElement> label_NewHire(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_NewHire"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public List<WebElement> icon_Calender(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "icon_Calender"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    
    //New Sandeep methods
    
    public List<WebElement> label_PendingEOI(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEOI"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }

    //new methods
    public List<WebElement> label_EventType_NewHire(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_EventType_NewHire"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public List<WebElement> label_DateOfEvent(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_DateOfEvent"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public List<WebElement> label_PersonsInvolved(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PersonsInvolved"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    
    public WebElement label_Step2ApproveMsg() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_Step2ApproveMsg"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Step2ApproveMsg in ReviewandAcceptPage");
        return element;
    }
    
    public WebElement label_Step2RejectMsg() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_Step2RejectMsg"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_Step2RejectMsg in ReviewandAcceptPage");
        return element;
    }
    
    public WebElement btn_Cancel() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "btn_Cancel"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_Cancel in ReviewandAcceptPage");
        return element;
    }
    public List<WebElement> label_PendingEventsProfile(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingEventsProfile"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }

    public List<WebElement> label_PendingPlansCost(){
        List<WebElement> elements= SeleniumHelper.findElements(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_PendingPlansCost"),Constants.getLongSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE);
        return elements;
    }
    public WebElement label_visionInsurance() {
        WebElement element = SeleniumHelper.findElement_poc(reviewandAcceptPageDriver, readORProperties(currentScreenName, "label_visionInsurance"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_visionInsurance in ReviewandAcceptPage");
        return element;
    }
    public void clickApprove() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Approve ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
          SeleniumHelper.threadSleep(3000);
        SeleniumHelper.clickElement(btn_Approve());
    }

    public void clickReject() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Reject on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
          //SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(btn_Reject());
        SeleniumHelper.threadSleep(2000);
        TestNGHelper.assertEqual("","","yes","RejectingEnrollmentPage");
    }

    public void clickSubmit() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Submit on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(btn_Submit());
    }
    public void clickRequestRevision() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click RequestRevision on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(btn_RequestRevision());
    }
    public void VerifyPendingLink() {
        SeleniumHelper.threadSleep(5000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": VerifyPendingLink on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        WaitForExistenceOfanElement(label_PendingEmpLink1());
        String pageLableText = SeleniumHelper.getElementText(label_PendingEmpLink());

        if (pageLableText.contains("pending event")) {
            TestNGHelper.assertTrue(true, "pending events Displayed", "yes", "VerifyPendingLink");
        } else {
            Assert.fail();
        }
    }


    public void clickPendingLink() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Pending Link on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
          SeleniumHelper.threadSleep(3000);
        SeleniumHelper.clickElement(label_PendingEmpLink());
    }

    public void clickEmployeeNameLink() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Employee Name Link on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
          SeleniumHelper.threadSleep(2000);
        String empName = EmployeeInfoPage.EmployeeName;
       // SeleniumHelper.LinkSelection(link_EmpName(),empName);
        //click Emp
        WebElement elm  = reviewandAcceptPageDriver.findElement(By.xpath("//*[contains(text(),'"+empName+"')]"));
        elm.click();

        //test emp
     /* String empN= "UVMRGV";
      //test
        WebElement elm  = reviewandAcceptPageDriver.findElement(By.xpath("//*[contains(text(),'"+empN+"')]"));
        elm.click();*/
    }

    public void verifyPendingEnrollmentListedForEmployee() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": verify Pending Enrollment Listed For Employee on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        SeleniumHelper.threadSleep(2000);
        String empName = EmployeeInfoPage.EmployeeName;
        List<WebElement> elmEmp  = reviewandAcceptPageDriver.findElements(By.xpath("//*[contains(text(),'"+empName+"')]"));
       int EmpNameSize = elmEmp.size();
        if (EmpNameSize>0) {
            TestNGHelper.assertTrue(true, "Employee appears as expected.", "yes", "verifyPendingEnrollmentListedForEmployee");

        } else {
            TestNGHelper.fail("Employee did not appear as expected");
        }

    }
    public void verify_Pending_EventPage() {

        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_PendingEventPage1());
        String strTxt =  SeleniumHelper.getElementText(label_PendingEventPage());
        TestNGHelper.assertEqual(strTxt,"Pending","yes","PendingEventPageVerification");
    }

    public void verify_ApproveClick() {

        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_Approve1());
        String strTxt =  SeleniumHelper.getElementText(label_Approve());
        TestNGHelper.assertEqual(strTxt,"Approve","yes","ApproveEnrollmentPage");
    }
    public void verify_SuccessMessage() {

        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_SuccessMessage1());
        String strTxt =  SeleniumHelper.getElementText(label_SuccessMessage());
        TestNGHelper.assertEqual(strTxt,"Success! The event was approved and the employee and carriers have been notified.","yes","SuccessMessageVerification");
    }

    public void clickNewHireEnrollLink() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click New hire Link on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        //  SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_NewHireEnroll());
    }
    
    public void verify_RejectMessage() {
        SeleniumHelper.threadSleep(2000);
        WaitForExistenceOfanElement(label_RejectMsg1());
        String strTxt =  SeleniumHelper.getElementText(label_RejectMsg());
        TestNGHelper.assertEqual(strTxt,"The employee's event has successfully been rejected and they have been notified.","yes","RejectMessageVerification");
    }

    
    public void getPendingCount() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": get pending event count on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        SeleniumHelper.threadSleep(3000);
        String strTxt = SeleniumHelper.getElementText(label_PendingEmpLink());
        String eventCount = strTxt.split(" pending event")[0];
        System.out.println("=====================" + eventCount);
        String myString = eventCount;
        eventIntCount = Integer.parseInt(myString);

//        return eventIntCount;
    }

    public void verifyPendingCountAfterApproveOrReject() {
        SeleniumHelper.threadSleep(3000);

        int num = eventIntCount;
        int decCount = num - 1;

        List<WebElement> elm = reviewandAcceptPageDriver.findElements(By.cssSelector(".banner>div>a"));
        if (elm.size() > 0) {
            String strNewTxt = SeleniumHelper.getElementText(label_PendingEmpLink());
            String eventDecCount = strNewTxt.split(" pending event")[0];
            System.out.println("=====================" + eventDecCount);
            String myNewString = eventDecCount;
            int fooDecCount = Integer.parseInt(myNewString);

            if (fooDecCount == decCount) {
                TestNGHelper.assertTrue(true, "pending count decreased by 1 count after event reject", "yes", "verifyPendingCountAfterApproveOrReject");

            } else {
                TestNGHelper.fail("Event count did not change");
            }

        }else {
            TestNGHelper.assertTrue(true, "Pending event no longer present", "yes", "verifyPendingCountAfterApproveOrReject");

        }
    }
    public void verifyEnrollmentPendingEmployeeNoLongerPresent() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": verify Enrollment Pending Employee No Longer Present on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        SeleniumHelper.threadSleep(2000);
        String empName = EmployeeInfoPage.EmployeeName;

      List<WebElement >elm  = reviewandAcceptPageDriver.findElements(By.xpath("//*[contains(text(),'"+empName+"')]"));
        if(elm.size()==0){
            TestNGHelper.assertTrue(true,"Enrollment Pending Employee No Longer Present","yes");
        }else {
            TestNGHelper.fail("Enrollment Pending Employee still Present");
        }
    }


    public void VerifyPendingEventLinkRedirect()
    {
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Pending Event Link Redirect on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
       int pendingEventSize = link_EmpName().size();

        if (pendingEventSize>0) {
            TestNGHelper.assertTrue(true, "System redirects to the pending event list after clicking on the link within the pending event banner", "yes", "VerifyPendingEventLinkRedirect");
        } else {
            Assert.fail("unable to redirect to the pending event list after clicking on the link within the pending event banner");
        }
    }

   public void Enter_ApproveORRejectCommentsMessage(DataTable table){
	   final List<Map<String, String>> rows = table.asMaps(String.class, String.class);
       final Map<String, String> hmap = rows.get(0);
      
       txt_ApproveRejectCommentMsgBox().click();
	   SeleniumHelper.enterValueIntoTextField(txt_ApproveRejectCommentMsgBox(), hmap.get("ApprovedORRejected"));
   }

   //new methods_nitish

    public void NewHireEnrollmentTextValidation(){
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        int z = label_NewHireEnrollment().size();
        int counter = 0;
        Boolean newHiretxtstatus=false;
        for(int i=0;i<z;i++)
        {
           Boolean newHiretxt = label_NewHireEnrollment().get(i).getText().contains("New Hire Enrollment");
           counter=counter+1;
        }
        if(counter==z){
           newHiretxtstatus=true;
        }
        TestNGHelper.assertTrue(newHiretxtstatus, "New Hire Enrollment Text successfully Validated", "yes", "NewHireEnrollmentTextValidation");
    }

    public void pushPinIconValidation(){
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        if(icon_PushPin().size()>0)
        TestNGHelper.assertTrue(true, "push Pin Icon successfully Validated", "yes", "pushPinIconValidation");
    }
    public void CalenderIconValidation(){
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        if(icon_Calender().size()>0)
            TestNGHelper.assertTrue(true, "Calender Icon successfully Validated", "yes", "CalenderIconValidation");
    }
    public void NewHireTextValidation(){
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        int z = label_NewHireEnrollment().size();
        int counter = 0;
        Boolean newHiretxtstatus=false;
        for(int i=0;i<z;i++)
        {
            Boolean newHiretxt = label_NewHire().get(i).getText().contains("New Hire");
            counter=counter+1;
        }
        if(counter==z){
            newHiretxtstatus=true;
        }
        TestNGHelper.assertTrue(newHiretxtstatus, "New Hire Text successfully Validated", "yes", "NewHireTextValidation");
    }
    
    public void EOIValidation(){
        SeleniumHelper.threadSleep(4000);
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        int z = label_PendingEOI().size();
        int counter = 0;
        Boolean EOItxtstatus=false;
        for(int i=0;i<z;i++)
        {
            Boolean EOItxt = label_PendingEOI().get(i).getText().contains("Pending Evidence of Insurability");
            counter=counter+1;
        }
        if(counter==z){
        	EOItxtstatus=true;
        }
        TestNGHelper.assertTrue(EOItxtstatus, "EOI text successfully Validated", "yes", "EOITextValidation");
    }


    public void VerifyEventType_NewHire()
    {
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify EventType NewHire  on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);
        System.out.println(label_EventType_NewHire().size());
        if(label_EventType_NewHire().get(0).getText().contains("Event Type")&& (label_EventType_NewHire().get(0).getText().contains("New Hire Enrollment"))){
            TestNGHelper.assertTrue(true, "Event type and New Hire Enrollment text successfully validated", "yes", "VerifyEventType_NewHire");
        } else {
            Assert.fail("unable to verify Event type and New Hire Enrollment text ");
        }
    }

    public void Verify_DateOfEvent()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMMMMM d, yyyy");
        String formattedDate = dateFormat.format(new Date()).toString();
        System.out.println(formattedDate);

        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Date of Event on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);

        if(label_DateOfEvent().get(1).getText().contains("Date of Event")&& (label_DateOfEvent().get(1).getText().contains(formattedDate))){
            TestNGHelper.assertTrue(true, "Date of Event successfully validated", "yes", "Verify_DateOfEvent");
        } else {
            Assert.fail("unable to verify Date of Event");
        }
    }

    public void Verify_PersonsInvolved()
    {
        String empName = EmployeeInfoPage.EmployeeName;
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify employee name on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);

        if(label_PersonsInvolved().get(2).getText().contains("Persons Involved")&& (label_PersonsInvolved().get(2).getText().contains(empName))){
            TestNGHelper.assertTrue(true, "employee name successfully validated", "yes", "Verify_PersonsInvolved");
        } else {
            Assert.fail("unable to verify employee name ");
        }
    }

    public void verify_RejectText() {

        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(btn_Reject());
        TestNGHelper.assertEqual(strTxt,"Reject","yes","verifyRejectText");
    }
    public void verify_ApproveText() {

        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(btn_Approve());
        TestNGHelper.assertEqual(strTxt,"Approve","yes","verifyApproveText");
    }
    public void verify_RequestRevisionText() {

        SeleniumHelper.threadSleep(2000);
        String strTxt =  SeleniumHelper.getElementText(btn_RequestRevision());
        TestNGHelper.assertEqual(strTxt,"Request Revision","yes","verifyRequestRevisionText");
    }
    public void Scroll_Down() {
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.scrollDown(reviewandAcceptPageDriver);
     }
    

    public void click_CancelButton(){
    	SeleniumHelper.ScrollToElement(reviewandAcceptPageDriver, btn_Cancel());
    	SeleniumHelper.DoubleclickElement(btn_Cancel(), reviewandAcceptPageDriver);
    }
    
    public void verifyEnrollCancelNavigation(){
    	SeleniumHelper.threadSleep(2000);
    	String btnText = SeleniumHelper.getElementText(btn_Approve());
    	TestNGHelper.assertEqual(btnText, "Approve", "Enrollment Cancel Failed", "yes", "EnrollmentStep1NavigationFromRejectORCancel");
    }
    
    public void verify_Step2ApproveMessage(){
    	SeleniumHelper.ScrollToElement(reviewandAcceptPageDriver, label_Step2ApproveMsg());
    	SeleniumHelper.highlightElement(reviewandAcceptPageDriver, label_Step2ApproveMsg());
    	String txt_Step2Aprove = SeleniumHelper.getElementText(label_Step2ApproveMsg());
    	boolean txt_Status = txt_Step2Aprove.contains("Human resources has approved your benefits enrollment request. To view your updated benefit summary, log in to UnitedHealthcare’s enrollment site. If you have any questions, please contact your Human Resources office.");
        TestNGHelper.assertTrue(txt_Status, "yes", "Step2ApproveMessageVerification");	
    	
    }
    
    public void verify_Step2RejectMessage(){
    	SeleniumHelper.ScrollToElement(reviewandAcceptPageDriver, label_Step2RejectMsg());
    	SeleniumHelper.highlightElement(reviewandAcceptPageDriver, label_Step2RejectMsg());
    	String txt_Step2Aprove = SeleniumHelper.getElementText(label_Step2RejectMsg());
    	boolean txt_Status = txt_Step2Aprove.contains("Human resources has denied your benefits enrollment request. You will not be enrolled in the benefits you elected. For information, please contact your Human Resources office.");
        TestNGHelper.assertTrue(txt_Status, "yes", "Step2RejectMessageVerification");	
    	
    }

    public void get_PlanPayCost()
    {
        SeleniumHelper.threadSleep(2000);
        healthCost = label_PendingPlansCost().get(0).getText();
        SeleniumHelper.threadSleep(2000);
        dentalCost = label_PendingPlansCost().get(1).getText();
        SeleniumHelper.threadSleep(2000);
        visionCost = label_PendingPlansCost().get(2).getText();
    }

    public void Verify_PendingEventsOnEmployeeProfilePage()
    {
        String empName = EmployeeInfoPage.EmployeeName;
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Verify Pending Event on employee profile list ");
        SeleniumHelper.waitForPageLoad(reviewandAcceptPageDriver);

        if(label_PendingEventsProfile().get(0).getText().contains(healthCost)&& (label_PendingEventsProfile().get(0).getText().contains(empName))&& (label_PendingEventsProfile().get(0).getText().contains("Health Insurance"))){
            TestNGHelper.assertTrue(true, "Pending Health event is validated", "yes", "Verify_PendingEventsOnEmployeeProfilePage");
        } else {
            Assert.fail("unable to verify Pending Health event on employee profile list");
        }
        SeleniumHelper.threadSleep(2000);
        if(label_PendingEventsProfile().get(1).getText().contains(dentalCost)&& (label_PendingEventsProfile().get(1).getText().contains(empName))&& (label_PendingEventsProfile().get(1).getText().contains("Dental Insurance"))){
            TestNGHelper.assertTrue(true, "Pending dental event is validated", "yes", "Verify_PendingEventsOnEmployeeProfilePage");
        } else {
            Assert.fail("unable to verify Pending dental event on employee profile list");
        }
        SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(reviewandAcceptPageDriver,label_visionInsurance());
        if(label_PendingEventsProfile().get(2).getText().contains(visionCost)&& (label_PendingEventsProfile().get(2).getText().contains(empName))&& (label_PendingEventsProfile().get(2).getText().contains("Vision Insurance"))){
            TestNGHelper.assertTrue(true, "Pending vision event is validated", "yes", "Verify_PendingEventsOnEmployeeProfilePage");
        } else {
            Assert.fail("unable to verify Pending vision event on employee profile list");
        }
        SeleniumHelper.scrollToUP(reviewandAcceptPageDriver);
        SeleniumHelper.threadSleep(2000);
    }
    
    //test
    public void clickNewHireEnrollLinktest() {
    	//test emp
         String empN= "U";
         //test
           WebElement elm  = reviewandAcceptPageDriver.findElement(By.xpath("//*[contains(text(),'"+empN+"')]"));
           elm.click();
    }
    public void WaitForExistenceOfanElement(boolean ElementToInspect) {
        //SeleniumHelper.threadSleep(2000);
        for (int i = 0; i <= 100; i++) {

        	SeleniumHelper.threadSleep(2000);
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