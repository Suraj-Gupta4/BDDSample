package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {

	@Before(order=2, value="@RegressionTest")
	public void setupDB() {
		System.out.println("Configure DB One");
	}
	
	@Before(order=1, value="@RegressionTest")
	public void initChrome() {
		System.out.println("Init Chrome");
	}
	
	@Before(order=1, value="@SmokeTest")
	public void initEdge() {
		System.out.println("Init Edge");
	}
	
	@Before(order=2, value="@SmokeTest")
	public void setupDBTwo() {
		System.out.println("Configure DB Two");
	}
	
	
//	@Before(order=1)
//	public void readFromFile() {
//		System.out.println("Read from Property File");
//	}
	
//	@Before("@RegressionTest,@SmokeTest")
//	public void initChrome() {
//		System.out.println("Init Chrome");
//	}
//	
//	@Before("@SmokeTest")
//	public void initEdge() {
//		System.out.println("Init Edge");
//	}
	
	  @When("User create a new Task")
	  public void user_create_a_new_Task() {
    	 System.out.println("User create a new Task");
				}


     @When("User view Task details")
	 public void user_view_Task_details() {
    	 System.out.println("User view Task details");   
					}

					
     @When("User update a Task details")
	public void user_update_a_Task_details() {
    	 System.out.println("User update a Task details");		  
						}
//	@After
//	public void closeDB() {
//		System.out.println("Close DB");
//	}
}
