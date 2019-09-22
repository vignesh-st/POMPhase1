package org.testleaf.leaftaps.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	
	
	public ViewLeadPage verifyLastname()
	{
		String text = driver.findElementById("viewLead_lastName_sp").getText();
		if(text.equals("Thangavel"))
		{
			System.out.println("Last Name is verified ");
		}
		else
		{
			System.out.println("last name is incorrect");
		}
		
		return new ViewLeadPage();
	}
	
	
}
