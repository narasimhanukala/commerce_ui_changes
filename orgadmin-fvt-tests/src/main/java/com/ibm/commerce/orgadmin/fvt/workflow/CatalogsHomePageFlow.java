package com.ibm.commerce.orgadmin.fvt.workflow;

import com.ibm.commerce.cmc.ui.orgadmintool.pages.CatalogsHomePage;
import com.ibm.commerce.orgadmin.fvt.test.AbstractSingleSessionTest;

public class CatalogsHomePageFlow extends AbstractSingleSessionTest{
	CatalogsHomePage chomepage;
	
	private String actual;
	private String expected;
	public String getDescription(String actual) {
		return actual;
	}
	
	public CatalogsHomePageFlow validateCatalogsHomePageTest() {
		chomepage.validateHomePageTest(actual, expected);
		return this;
		
	}

}
