package com.ibm.commerce.orgadmin.fvt.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.OrganizationPage;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.UserManagementPage;
import com.ibm.commerce.cmc.ui.page.CMCMainPage;
import com.ibm.commerce.cmc.ui.page.LogonCMC;
import com.ibm.commerce.cmc.ui.utils.CMCTools;
import com.ibm.commerce.cmc.ui.utils.CMCUIModule;
import com.ibm.commerce.orgadmin.fvt.workflow.CreateUserFlow;
import com.ibm.commerce.orgadmin.fvt.workflow.LoginFlow;
import com.ibm.commerce.orgadmin.fvt.workflow.OrganizationManagementFlow;
import com.ibm.commerce.orgadmin.fvt.workflow.UserManagementFlow;
import com.ibm.commerce.qa.util.junit.runners.GuiceTestRunner;
import com.ibm.commerce.qa.util.junit.runners.TestModules;
import com.ibm.commerce.qa.wte.util.WcModule;

@RunWith(GuiceTestRunner.class)
@TestModules({WcModule.class, CMCUIModule.class})
public class OrganizationManagementTest extends AbstractSingleSessionTest{
	
	private final String ORG_FILE_NAME = "data/organizationTest.xml";

	private final String CREATE_ORG_TEST_NAME = "MANAGEORG";
	
	private final String CREATE_ORG_DATA_BLOCK = "orgInfo";
	
	@Inject
	private CMCMainPage mainPage;
	
	@Inject
	private LoginFlow loginFlow;
	
	@Inject
	private OrganizationManagementFlow organizationManagementFlow;
	
	@Before
	public void setUp() throws Exception{
		
		String FeatureName = "organizationManagement";
		
		this.enableFeature(FeatureName);
		
		//loginFlow.login("baseOrgAdmin");
		
		//perform log on action
		LogonCMC logonCMC = getSession().continueToPage(getConfig().getCMCUrl(), LogonCMC.class);
			
		mainPage = logonCMC.logon();
		

	}
	
	@After
	public void tearDown() throws Exception {
		//perform log off action
		mainPage.getTopNavigation().logout().confirm();
	}
	
	@Test
	public void testCreateOrganization() throws Exception{
		
		dsm.setDataFile(ORG_FILE_NAME);
		dsm.setTestName(CREATE_ORG_TEST_NAME);
		dsm.setDataBlock(CREATE_ORG_DATA_BLOCK);
		
		OrganizationPage orgPage = mainPage.goToCMCToolPage(CMCTools.ORGANIZATION);
		Thread.sleep(30000);
		mainPage.verifyCMCToolActive(CMCTools.ORGANIZATION);
		
		 organizationManagementFlow.setOrgName(dsm.getInputParameter("orgName")).setDescription(dsm.getInputParameter("description"))
		.setOrgType(dsm.getInputParameter("orgType")).setParentOrg(dsm.getInputParameter("parentOrg")).setContactName(dsm.getInputParameter("contactName"))
		.setEmail(dsm.getInputParameter("email")).setStreetAddress(dsm.getInputParameter("streetAddress")).setStreetAddress2(dsm.getInputParameter("streetAddress2"))
		.setCity(dsm.getInputParameter("city")).setState(dsm.getInputParameter("state"))
		.setAvailableRole(dsm.getInputParameter("availableRole")).setAvailableApproval(dsm.getInputParameter("availableApproval")).manageOrganizationThroughUI();

		 organizationManagementFlow.validateManageOrganization();
		
	}
}
