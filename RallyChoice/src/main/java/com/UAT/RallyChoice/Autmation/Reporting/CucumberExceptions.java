package com.UAT.RallyChoice.Autmation.Reporting;

import com.UAT.RallyChoice.Automation.Utilities.CucumberRunner;

import cucumber.runtime.CucumberException;
import cucumber.runtime.model.CucumberFeature;

@SuppressWarnings("serial")
public class CucumberExceptions extends CucumberException
{

	public CucumberExceptions(String message) {
		super(message);		
	}
	
	

}
