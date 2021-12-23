package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {

	WebDriver driver;

		@Given("User is on Google Page")
		public void user_is_on_google_page() {
		   WebDriverManager.chromiumdriver().setup();
		   driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
 
		}


		

		@When("User search Java Tutorial")
		public void user_search_java_tutorial() {
			WebElement searchbox=driver.findElement(By.name("q"));
		      
		      searchbox.sendKeys("java tutorial");
		      searchbox.submit();
		}
		
		@Then("Should display Java Result Page")
		public void should_display_java_result_page() {
			Assert.assertEquals("java tutorial - Google Search",driver.getTitle());

		}
       
		
		@When("User search Selenium Tutorial")
   		public void user_search_Selenium_tutorial() {
   			WebElement searchbox=driver.findElement(By.name("q"));
   		      
   		      searchbox.sendKeys("Selenium tutorial");
   		      searchbox.submit();
   		}
   		
   		@Then("Should display Selenium Result Page")
   		public void should_display_Selenium_result_page() {
   			Assert.assertEquals("Selenium tutorial - Google Search",driver.getTitle());

   		}
          
		
		
           @Then("Close browser")
			public void close_browser() {
			   driver.close();
			}


         @After
         public void attachImage(Scenario scenario) throws IOException {
        	 if(scenario.isFailed()) {
        		 TakesScreenshot scr=(TakesScreenshot) driver;
        		 File scrFile=scr.getScreenshotAs(OutputType.FILE);
        		 byte[] byteImg=FileUtils.readFileToByteArray(scrFile);
        		 scenario.attach(byteImg, "image/png", "image1");
        	 }
         }


   		

   		
   		
             




}
