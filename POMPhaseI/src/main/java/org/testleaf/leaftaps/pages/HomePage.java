package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
public LoginPage clickLogout() {
	driver.findElementByClassName("decorativeSubmit").click();
	return new LoginPage();
}

public MyHomePage clickCRMSFALink() {
	driver.findElementByLinkText("CRM/SFA").click();
	return new MyHomePage();
}
}










