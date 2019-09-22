package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	
	public CreateLeadPage enterCompanyName()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		return this;
	}
	public CreateLeadPage enterFirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Vignesh");
		return this;
	}
	public CreateLeadPage enterLastName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Thangavel");
		return this;
	}
	public ViewLeadPage clickSubmit()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
	
}
