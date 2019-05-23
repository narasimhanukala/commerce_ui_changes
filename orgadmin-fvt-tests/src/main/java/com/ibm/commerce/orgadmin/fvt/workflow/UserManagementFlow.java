package com.ibm.commerce.orgadmin.fvt.workflow;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.CreateUserPage;
import com.ibm.commerce.cmc.ui.orgadmintool.pages.UserManagementPage;
import com.ibm.commerce.orgadmin.fvt.test.AbstractSingleSessionTest;

@Singleton
public class UserManagementFlow extends AbstractSingleSessionTest{

	@Inject 
	UserManagementPage userManagement;
	
	CreateUserPage createUser;
	
	private String logonId;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	private String passwordConfirm;
	private String accountPolicy;
	private String accountStatus;
	private String employeeId;
	private String employeeType;
	private String departmentNumber;
	private String managerName;
	private String secretaryName;
	private String language;
	private String parentOrg;
	private String streetAddress;
	private String streetAddress2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String email1;
	private String email2;
	private String phone1;
	private String phone2;
	private String fax1;
	private String fax2;
	private String rorg;
	private String role;
	private String includeGroup;
	private String excludeGroup;
	
	public String getLogonId() {
		return logonId;
	}
	
	public String geTtitle() {
		return title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	
	public String getAccountPolicy() {
		return accountPolicy;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeType() {
		return employeeType;
	}
	
	public String getDepartmentNumber() {
		return departmentNumber;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public String getSecretaryName() {
		return secretaryName;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String getParentOrg() {
		return parentOrg;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getStreetAddress2() {
		return streetAddress2;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getEmail1() {
		return email1;
	}
	
	public String getEmail2() {
		return email2;
	}
	
	public String getPhone1() {
		return phone1;
	}
	
	public String getPhone2() {
		return phone2;
	}
	
	public String getFax1() {
		return fax1;
	}
	
	public String getFax2() {
		return fax2;
	}
	
	public String getROrganization() {
		return rorg;
	}
	
	public String getRole() {
		return role;
	}
	
	public String getIncludeGroup() {
		return includeGroup;
	}
	
	public String getExcludeGroup() {
		return excludeGroup;
	}
	
	public UserManagementFlow setLogonId(String logonId) {
		this.logonId = logonId;
		return this;
	}
	
	public UserManagementFlow setTitle(String title) {
		this.title=title;
		return this;
		
	}
	
	public UserManagementFlow setFirstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	
	public UserManagementFlow setMiddleName(String middleName) {
		this.middleName=middleName;
		return this;
	}
	
	public UserManagementFlow setLastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	
	public UserManagementFlow setPassword(String password) {
		this.password=password;
		return this;
	}
	
	public UserManagementFlow setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
		return this;
	}
	
	public UserManagementFlow setAccountPolicy(String accountPolicy) {
		this.accountPolicy=accountPolicy;
		return this;
	}
	
	public UserManagementFlow setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
		return this;
	}
	
	public UserManagementFlow setEmployeeId(String employeeId) {
		this.employeeId =  employeeId;
		return this;
	}
	
	public UserManagementFlow setEmployeeType(String employeeType) {
		this.employeeType = employeeType; 
		return this;
	}
	
	public UserManagementFlow setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
		return this;
	}
	
	public UserManagementFlow setManagerName(String managerName) {
		this.managerName = managerName;
		return this;
	}
	
	public UserManagementFlow setSecretaryName(String secretaryName) {
		this.secretaryName = secretaryName;
		return this;
	}
	
	public UserManagementFlow setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	public UserManagementFlow setParentOrg(String parentOrg) {
		this.parentOrg =  parentOrg;
		return this;
	}
	
	public UserManagementFlow setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}
	
	public UserManagementFlow setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
		return this;
	}
	
	public UserManagementFlow setCity(String city) {
		this.city = city;
		return this;
	}
	
	public UserManagementFlow setState(String state) {
		this.state = state;
		return this;
	}
	
	public UserManagementFlow setZip(String zip) {
		this.zip = zip;
		return this;
	}
	
	public UserManagementFlow setCountry(String country) {
		this.country = country;
		return this;
	}
	
	public UserManagementFlow setEmail1(String email1) {
		this.email1 = email1;
		return this;
	}

	public UserManagementFlow setEmail2(String email2) {
		this.email2 = email2;
		return this;
	}
	
	public UserManagementFlow setPhone1(String phone1) {
		this.phone1 = phone1;
		return this;
	}

	public UserManagementFlow setPhone2(String phone2) {
		this.phone2 = phone2;
		return this;
	}
	
	public UserManagementFlow setFax1(String fax1) {
		this.fax1=fax1;
		return this;
	}
	
	public UserManagementFlow setFax2(String fax2) {
		this.fax2=fax2;
		return this;
	}
	
	public UserManagementFlow setROrganization(String rorg) {
		this.rorg = rorg;
		return this;
	}
	
	public UserManagementFlow setRole(String role) {
		this.role=role;
		return this;
	}
	
	public UserManagementFlow setIncludeGroup(String includeGroup) {
		this.includeGroup=includeGroup;
		return this;
	}
	
	public UserManagementFlow setExcludeGroup(String excludeGroup) {
		this.excludeGroup=excludeGroup;
	return this;
	}
	
	
	public UserManagementFlow manageUserThroughUI() {
		userManagement.selectIFrame();
		createUser = userManagement.goToUserDetail(logonId);
		if (!email1.isEmpty()) {
			createUser.typeEmail1(email1);
		}
		createUser.typePassward(password);
		createUser.typePasswordConfirmation(passwordConfirm);
		createUser.selectParentOrganization(parentOrg);
		createUser.selectAccountPolicy(accountPolicy);
		createUser.clickNext();
		
		
		createUser.selectTitle(title);
		
		if (!firstName.isEmpty()) {
			createUser.typeFirstName(firstName);
		}
		if (!lastName.isEmpty()) {
			createUser.typeLastName(lastName);
		}
		createUser.typeStreetAddress(streetAddress);
		createUser.typeStreetAddress2(streetAddress2);
		createUser.typeCity(city).typeState(state).typePostalCode(zip);
		createUser.clickNext();
		
		//Roles code to be added here
		
		createUser.selectOrganizationForRoles(rorg);
		
		createUser.selectFromAvailableRoles(role);
		
		createUser.clickNext();
		
		//Groups Code to be added here
		createUser.findAGroupToInclude(includeGroup);
		//createUser.selectAGroupToInclude(includeGroup);
		createUser.selectAGroupToInclude(includeGroup);
		
		createUser.submit();
		userManagement.getMainFrame();
		
		return this;
	}
	
	public UserManagementFlow validateManageUser() {
		userManagement.selectIFrame();
		userManagement.validateUserExist(logonId, firstName, lastName);
		return this;
	}

	
	
}
