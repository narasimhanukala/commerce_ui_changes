package com.ibm.commerce.orgadmin.fvt.workflow;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.CreateOrganizationsPage;

import com.ibm.commerce.cmc.ui.orgadmintool.pages.OrganizationPage;

import com.ibm.commerce.orgadmin.fvt.test.AbstractSingleSessionTest;

@Singleton
public class OrganizationManagementFlow extends AbstractSingleSessionTest{

	@Inject 
	OrganizationPage orgPage;
	
	CreateOrganizationsPage createOrgsPage;
	
	private String orgName;
	private String description;
	private String orgType;
	private String parentOrg;
	private String contactName;
	private String streetAddress;
	private String streetAddress2;
	private String state;
	private String city;
	private String postalCode;
	private String country;
	private String email;
	private String phone;
	private String availableRole;
	private String availableApproval;
	
	public String getOrgName() {
		return orgName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getOrgType() {
		return orgType;
	}
	
	public String getParentOrg() {
		return parentOrg;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getStreetAddress2() {
		return streetAddress2;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAvailableRole() {
		return availableRole;
	}
	
	public String getAvailableApproval() {
		return availableApproval;
	}
	
	public OrganizationManagementFlow setOrgName(String orgName) {
		this.orgName = orgName;
		return this;
	}
	
	public OrganizationManagementFlow setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public OrganizationManagementFlow setOrgType(String orgType) {
		this.orgType = orgType;
		return this;
	}
	
	public OrganizationManagementFlow setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
		return this;
	}
	
	public OrganizationManagementFlow setContactName(String contactName) {
		this.contactName = contactName;
		return this;
	}
	
	public OrganizationManagementFlow setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}
	
	public OrganizationManagementFlow setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
		return this;
	}
	
	public OrganizationManagementFlow setState(String state) {
		this.state = state;
		return this;
	}
	
	public OrganizationManagementFlow setCity(String city) {
		this.city = city;
		return this;
	}
	
	public OrganizationManagementFlow setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	public OrganizationManagementFlow setCountry(String country) {
		this.country = country;
		return this;
	}
	
	public OrganizationManagementFlow setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public OrganizationManagementFlow setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public OrganizationManagementFlow setAvailableRole(String availableRole) {
		this.availableRole = availableRole;
		return this;
	}
	
	public OrganizationManagementFlow setAvailableApproval(String availableApproval) {
		this.availableApproval = availableApproval;
		return this;
	}
	
	
	public OrganizationManagementFlow manageOrganizationThroughUI() {
		orgPage.selectIFrame();
		createOrgsPage = orgPage.goToOrgDetail(orgName);
		createOrgsPage.typeOrgName(orgName);
		if (!description.isEmpty()) {
			createOrgsPage.typeDescription(description);
		}
		
		createOrgsPage.selectOrganizationType(orgType).selectParentOrganization(parentOrg).next()
		.typeContactName(contactName).typeEmail(email).typeStreetAddress(streetAddress)
		.typeStreetAddress2(streetAddress2).typeCity(city).typeState(state).next()
		.selectFromAvailableRoles(availableRole).next().selectFromAvailableApprovals(availableApproval);
		
		
		createOrgsPage.submit();
		orgPage.getMainFrame();
		
		
		return this;
	}
	
	public OrganizationManagementFlow validateManageOrganization() {
		orgPage.selectIFrame();
		orgPage.validateOrganizationExist(orgName, parentOrg, orgType);
		orgPage.getMainFrame();
		return this;
	}

	
	
}
