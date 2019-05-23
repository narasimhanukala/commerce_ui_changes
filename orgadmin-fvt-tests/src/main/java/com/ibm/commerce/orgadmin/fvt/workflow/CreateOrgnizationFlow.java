package com.ibm.commerce.orgadmin.fvt.workflow;

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

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.*;
import com.ibm.commerce.orgadmin.fvt.test.AbstractSingleSessionTest;


@Singleton
public class CreateOrgnizationFlow extends AbstractSingleSessionTest{
	
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
	
	public CreateOrgnizationFlow setOrgName(String orgName) {
		this.orgName = orgName;
		return this;
	}
	
	public CreateOrgnizationFlow setDescription(String description) {
		this.description = description;
		return this;
	}
	
	public CreateOrgnizationFlow setOrgType(String orgType) {
		this.orgType = orgType;
		return this;
	}
	
	public CreateOrgnizationFlow setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
		return this;
	}
	
	public CreateOrgnizationFlow setContactName(String contactName) {
		this.contactName = contactName;
		return this;
	}
	
	public CreateOrgnizationFlow setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}
	
	public CreateOrgnizationFlow setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
		return this;
	}
	
	public CreateOrgnizationFlow setState(String state) {
		this.state = state;
		return this;
	}
	
	public CreateOrgnizationFlow setCity(String city) {
		this.city = city;
		return this;
	}
	
	public CreateOrgnizationFlow setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	public CreateOrgnizationFlow setCountry(String country) {
		this.country = country;
		return this;
	}
	
	public CreateOrgnizationFlow setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public CreateOrgnizationFlow setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public CreateOrgnizationFlow setAvailableRole(String availableRole) {
		this.availableRole = availableRole;
		return this;
	}
	
	public CreateOrgnizationFlow setAvailableApproval(String availableApproval) {
		this.availableApproval = availableApproval;
		return this;
	}
	
	public OrganizationPage createOrgThroughUI() {
		/*orgPage.selectIFrame();
		createOrgsPage = orgPage.newOrg();
		createOrgsPage.typeOrgName(orgName);
		if (!description.isEmpty()) {
			createOrgsPage.typeDescription(description);
		}
		
		createOrgsPage.selectOrganizationType(orgType).selectParentOrganization(parentOrg)
			.typeStreetAddress(streetAddress).typeState(state).typeCity(city).typePostalCode(postalCode)
			.typeCountryCode(country).typeEmail(email);
		
		if (!phone.isEmpty()) {
			createOrgsPage.typePhoneNumber(phone);
		}
		createOrgsPage.submit();
		orgPage.getMainFrame();
		return orgPage;*/
		
		orgPage.selectIFrame();
		createOrgsPage = orgPage.newOrg();
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
		return orgPage;
	}
	
	public CreateOrgnizationFlow validateCreateOrg() {
		orgPage.selectIFrame();
		createOrgsPage.validateCreateOrgFromList(orgName, parentOrg, orgType);
		orgPage.getMainFrame();
		return this;
	}
	
}
