package implementation;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class UsingHooks {

	@Before
	public void beforeMethod(Scenario sc) {
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());

	}
	
	@After
	public void afterMethod(Scenario sc) {
		System.out.println(sc.getStatus());
	}
	
}
