package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	
	public CreateLeadPage clickCreateLead() 
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
}
