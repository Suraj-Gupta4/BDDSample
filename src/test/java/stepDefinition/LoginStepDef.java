package stepDefinition;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	WebDriver driver;

		@Given("User is on Login Page")
		public void user_is_on_login_page() {
			WebDriverManager.chromiumdriver().setup();
			   driver=new ChromeDriver();
			   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   driver.get("http://the-internet.herokuapp.com/login");
		}


		
//		@When("User enter login credentials")
//		public void user_enter_login_credentials() {
//		    driver.findElement(By.name("username")).sendKeys("tomsmith");
//		    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		    driver.findElement(By.cssSelector(".radius")).click();
//		    
//		}
		
		
           //Parametrization with scenerio outline
//			@When("User enter {string} and {string}")
//			public void user_enter_and(String strUser, String strPwd) {
//				driver.findElement(By.name("username")).sendKeys(strUser);
//			    driver.findElement(By.name("password")).sendKeys(strPwd);
//			    driver.findElement(By.cssSelector(".radius")).click();
//			}
         
		//DataTable as Map
//			@When("User enter login credentials")
//			public void user_enter_login_credentials(DataTable userCred) {
//			   List<List<String>> data=userCred.asLists();
//				
//				driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//			    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//			    driver.findElement(By.cssSelector(".radius")).click();
//			}
         
		//DataTable As Map
			@When("User enter login credentials")
			public void user_enter_login_credentials(DataTable userCred) {
			   List<Map<String,String>> data=userCred.asMaps();
				
			   System.out.println("Got data from Datatable");
				driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
			    driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
			    driver.findElement(By.cssSelector(".radius")).click();
			}

		@Then("User is on Home page")
		public void user_is_on_home_page() {
			boolean isSuccess=driver.findElement(By.cssSelector("div.success")).isDisplayed();
			Assert.assertTrue(isSuccess);
			driver.close();
		}



	
}
