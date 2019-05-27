package com.ibm.commerce.orgadmin.fvt.test;

/*
 *-----------------------------------------------------------------
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * WebSphere Commerce
 *
 * (C) Copyright IBM Corp. 2019
 *
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has
 * been deposited with the U.S. Copyright Office.
 *-----------------------------------------------------------------
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.GroupsListPage;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.UserManagementPage;
import com.ibm.commerce.cmc.ui.page.CMCMainPage;
import com.ibm.commerce.cmc.ui.page.LogonCMC;
import com.ibm.commerce.cmc.ui.utils.CMCTools;
import com.ibm.commerce.cmc.ui.utils.CMCUIModule;
import com.ibm.commerce.orgadmin.fvt.workflow.CreateGroupsFlow;
import com.ibm.commerce.orgadmin.fvt.workflow.CreateUserFlow;
import com.ibm.commerce.orgadmin.fvt.workflow.LoginFlow;
import com.ibm.commerce.qa.util.junit.runners.GuiceTestRunner;
import com.ibm.commerce.qa.util.junit.runners.TestModules;
import com.ibm.commerce.qa.wte.util.WcModule;

@RunWith(GuiceTestRunner.class)
@TestModules({WcModule.class, CMCUIModule.class})
public class ApprovalsTest  extends AbstractSingleSessionTest{
	
	private final String USER_FILE_NAME = "data/groupTest.xml";

	private final String CREATE_GROUP_TEST_NAME = "ADDGROUP";
	
	private final String CREATE_GROUP_DATA_BLOCK = "groupInfo";
	
	@Inject
	private CMCMainPage mainPage;
	
	@Inject
	private LoginFlow loginFlow;
	
	@Inject
	private CreateGroupsFlow createGroupsFlow;
	
	@Before
	public void setUp() throws Exception{
		
		String FeatureName = "memberGroupManagement";
		
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
	public void testCreateGroup() throws Exception{
		
		dsm.setDataFile(USER_FILE_NAME);
		dsm.setTestName(CREATE_GROUP_TEST_NAME);
		dsm.setDataBlock(CREATE_GROUP_DATA_BLOCK);
		
		GroupsListPage groupsPage = mainPage.goToCMCToolPage(CMCTools.GROUP);
		Thread.sleep(30000);
		
		//mainPage.acceptAlert();
		//mainPage.clickOKOnAlert();
		mainPage.verifyCMCToolActive(CMCTools.GROUP);
		
		
		createGroupsFlow.setGroupType(dsm.getInputParameter("groupType")).setGroupName(dsm.getInputParameter("groupName"))
		.setGroupDescription(dsm.getInputParameter("groupDescription")).setParentOrganization(dsm.getInputParameter("parentOrganization"))
		.setAccount(dsm.getInputParameter("account")).setAccountSize(dsm.getInputParameter("accountSize"))
		.setAccountGeoLocation(dsm.getInputParameter("accountGeoLocation")).setAccountOperationLocation(dsm.getInputParameter("accountOperationLocation"))
		.setAccountIndustry(dsm.getInputParameter("accountIndustry")).setAccountBusiness(dsm.getInputParameter("accountBusiness"))
		.setAccountSales(dsm.getInputParameter("accountSales")).setAccountSalesAmount(dsm.getInputParameter("accountSalesAmount"))
		.createGroupThroughUI().validateCreateGroup();
		
	}

}
