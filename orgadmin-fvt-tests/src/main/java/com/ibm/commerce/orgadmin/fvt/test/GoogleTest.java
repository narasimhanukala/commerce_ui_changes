package com.ibm.commerce.orgadmin.fvt.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ibm.commerce.cmc.ui.page.LogonCMC;
import com.ibm.commerce.cmc.ui.page.impl.GooglePages;
import com.ibm.commerce.cmc.ui.utils.CMCUIModule;
import com.ibm.commerce.qa.util.junit.runners.GuiceTestRunner;
import com.ibm.commerce.qa.util.junit.runners.TestModules;
import com.ibm.commerce.qa.wte.framework.page.Identifier;
import com.ibm.commerce.qa.wte.util.WcModule;

@RunWith(GuiceTestRunner.class)
@TestModules({WcModule.class, CMCUIModule.class})
public class GoogleTest extends AbstractSingleSessionTest{
	//public static final Identifier searchBox=Identifier.byXPath("");
	
	@Test
	public void setUp() {
		GooglePages log=getSession().continueToPage(getConfig().getCMCUrl(), GooglePages.class);
	}

}
