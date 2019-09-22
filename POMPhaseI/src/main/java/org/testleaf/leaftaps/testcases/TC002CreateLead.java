package org.testleaf.leaftaps.testcases;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.leaftaps.pages.LoginPage;
import org.testng.annotations.Test;

public class TC002CreateLead extends ProjectSpecificMethods {

	
	@Test
	public void TC002CreateLead()
	{
		new LoginPage()
		.enterUsername("DemoCSR")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRMSFALink()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickSubmit()
		.verifyLastname();
	}
	
}
