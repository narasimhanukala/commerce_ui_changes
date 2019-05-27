package com.ibm.commerce.orgadmin.fvt.workflow;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.CreateGroupsPage;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.GroupsListPage;

@Singleton
public class CreateGroupsFlow {
	
	@Inject
	GroupsListPage groupsListPage;
	
	CreateGroupsPage createGroupsPage;
	
	private String groupType;
	private String groupName;
	private String groupDescription;
	private String parentOrganization;
	private String account;
	private String accountSize;
	private String accountGeoLocation;
	private String accountOperationLocation;
	private String accountIndustry;
	private String accountBusiness;
	private String accountSales;
	private String accountSalesAmount;
	
	public String getGroupType() {
		return groupType;
	}
	
	public String getGroupName()
	{
		return groupName;
	}
	
	public String getGroupDescription() {
		return groupDescription;
	}
	
	public String getParentOrganization() {
		return parentOrganization;
	}
	
	public String getAccount() {
		return account;
	}
	
	public String getAccountSize() {
		return accountSize;
	}
	
	public String getAccountGeoLocation() {
		return accountGeoLocation;
	}
	
	public String getAccountOperationLocation() {
		return accountOperationLocation;
	}
	
	public String getAccountIndustry() {
		return accountIndustry;
	}
	
	public String getAccountBusiness() {
		return accountBusiness;
	}
	
	public String getAccountSales() {
		return accountSales;
	}
	
	public String getAccountSalesAmount() {
		return accountSalesAmount;
	}
	
	public CreateGroupsFlow setGroupType(String groupType) {
		this.groupType = groupType;
		return this;
	}
	
	public CreateGroupsFlow setGroupName(String groupName) {
		this.groupName = groupName;
		return this;
	}
	
	public CreateGroupsFlow setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
		return this;
	}
	
	public CreateGroupsFlow setParentOrganization(String parentOrganization) {
		this.parentOrganization = parentOrganization;
		return this;
	}
	
	public CreateGroupsFlow setAccount(String account) {
		this.account = account;
		return this;
	}
	
	public CreateGroupsFlow setAccountSize(String accountSize) {
		this.accountSize = accountSize;
		return this;
	}
	
	
	public CreateGroupsFlow setAccountGeoLocation(String accountGeoLocation) {
		this.accountGeoLocation = accountGeoLocation;
		return this;
	}
	
	public CreateGroupsFlow setAccountOperationLocation(String accountOperationLocation) {
		this.accountOperationLocation =  accountOperationLocation;
		return this;
	}
	
	public CreateGroupsFlow setAccountIndustry(String accountIndustry) {
		this.accountIndustry = accountIndustry;
		return this;
	}
	
	public CreateGroupsFlow setAccountBusiness(String accountBusiness) {
		this.accountBusiness = accountBusiness;
		return this;
	}
	
	public CreateGroupsFlow setAccountSales(String accountSales) {
		this.accountSales = accountSales;
		return this;
	}
	
	public CreateGroupsFlow setAccountSalesAmount(String accountSalesAmount) {
		this.accountSalesAmount = accountSalesAmount;
		return this;
	}
	
	public CreateGroupsFlow createGroupThroughUI() {
		groupsListPage.selectIFrame();		
		createGroupsPage = groupsListPage.newGroup();
		createGroupsPage.selectGroupType(groupType);
		createGroupsPage.typeGroupName(groupName);
		createGroupsPage.typeDescription(groupDescription);
		createGroupsPage.typeParentOrganization(parentOrganization);
		createGroupsPage.next();
		createGroupsPage.selectAccount(account);
		createGroupsPage.selectAccountSize(accountSize);
		createGroupsPage.selectAccountGeoLocation(accountGeoLocation);
		createGroupsPage.selectAccountOperationLocation(accountOperationLocation);
		createGroupsPage.selectAccountIndustry(accountIndustry);
		createGroupsPage.selectAccountBusiness(accountBusiness);
		createGroupsPage.selectAccountSales(accountSales);
		createGroupsPage.typeAccountSales(accountSalesAmount);
		createGroupsPage.submit();
		return this;
	}
	
	public CreateGroupsFlow validateCreateGroup() {
		groupsListPage.selectIFrame();
		groupsListPage.validateGroupExist(groupName,parentOrganization, groupDescription, groupType);
		groupsListPage.getMainFrame();
		return this;
	}
	

}
