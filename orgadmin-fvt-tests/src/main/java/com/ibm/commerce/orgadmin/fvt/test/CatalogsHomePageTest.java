package com.ibm.commerce.orgadmin.fvt.test;

import org.junit.After;
import org.junit.Before;

import com.ibm.commerce.cmc.ui.page.LogonCMC;

public class CatalogsHomePageTest extends AbstractSingleSessionTest {
	@Before
	public void setUp() throws Exception {
		
		String FeatureName = "organizationManagement";
		
		this.enableFeature(FeatureName);
		
				
		//perform log on action
		LogonCMC logonCMC = getSession().continueToPage(getConfig().getCMCUrl(), LogonCMC.class);
			
	}
	
	@After
	public void tearDown() throws Exception {
		//perform log off action
			}
}
