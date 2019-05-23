package com.ibm.commerce.cmc.ui.orgadmintool.pages.impl;

import org.testng.Assert;

import com.ibm.commerce.cmc.ui.orgadmintool.pages.CatalogsHomePage;
import com.ibm.commerce.cmc.ui.page.impl.AbstractCMCPage;
import com.ibm.commerce.qa.wte.framework.page.Identifier;

//import junit.framework.Assert;

public class CatalogsHomePageImpl extends AbstractCMCPage implements CatalogsHomePage {
	
	public static final Identifier PAGE_HEADING = Identifier.byXPath(".//*[@class='catlogMargin']//strong");

	@Override
	public CatalogsHomePage validateHomePageTest(String actual, String expected) {
		
		Assert.assertEquals(actual,expected, "Expected string not matched with Actual" );
		return this;
		// TODO Auto-generated method stub
		
	}

}
