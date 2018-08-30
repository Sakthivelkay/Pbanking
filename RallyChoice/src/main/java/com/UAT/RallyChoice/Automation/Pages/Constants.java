package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;

public class Constants extends AutomationCore
{
	//Common Constants
		public static final String table_headerTagName="th";
		public static final String table_rowTagName="tr";
		public static final String table_colTagName="td";
		public static final String table_rowDivTagName="div";
		public static final String tagName_span="span";
		public static final String valueAttribute="value";
		public static final String elemantLocator_xpath ="xpath";
		public static final String elemantLocator_id ="id";
		public static final String elemantLocator_name ="name";
		public static final String DuplicateError="Possible Duplicates found, Please review below!!";
		public static final String OverRideReason="Previous Submission";
		public static final String MpinAddressExits="Yes";
		public static final String isExistingTin="No";
		public static final String GDerror="No items";
		//public static final String attr_title="title";
		public static final String attr_title="src";
		//public static final String myCasesFrameTitle="My Cases";
		public static final String myCasesFrameTitle="MCases";
//		public static final String newPhyconRequestFrameTitle="New";
		public static final String newPhyconRequestFrameTitle="createNewWork";
//		public static final String WorkListFrametitle="My WorkList";
		public static final String WorkListFrametitle="WorkList&";
		public static final String getNextFrameTitle="getNextWork";
		public static final String dashBoardTitle="Dashboard&";
		public static final String bulkProcessingFrameTitle="pyCMBulkActions";
		public static final String myDataTablesFrameTitle="EditPhyConDataTables";
		public static final String OperatorSearchFrameTItle="UserProfile_SearchResults";
		public static String  Tin="";
		
		
		public final static long getShortSyc()
		{
			switch (envName.toUpperCase()) {
			case "SIT":
				return 30;

			case "STAGE":
				return 30;
				
			case "UAT":
				return 25;
				
			default:
				return 60;
			}
		}
		
		public final static long getMediumSyc()
		{
			switch (envName.toUpperCase()) {
			case "SIT":
				return 35;

			case "STAGE":
				return 35;
				
			case "UAT":
				return 30;
				
			default:
				return 60;
			}
		}
		
		public final static long getLongSyc()
		{
			switch (envName.toUpperCase()) {
			case "SIT":
				return 60;

			case "STAGE":
				return 60;
				
			case "UAT":
				return 60;
				
			default:
				return 60;
			}
		}
	
}
