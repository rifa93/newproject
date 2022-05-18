package org.Step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	
	static WebDriver driver;
	@Given("User must be in frank and faith page")
	public void user_must_be_in_frank_and_faith_page() {
launchBrowser("Chrome");	
launchUrl("https://www.facebook.com");

	
	}

	@When("User enters valid search value")
	public void user_enters_valid_search_value() {
		 WebElement user = driver.findElement(By.id("email"));
		 WebElement pas = driver.findElement(By.id("pass"));
		 user.sendKeys("rifa");
		 pas.sendKeys("45499");
		 
		
		
	}

	@When("User click search button")
	public void user_click_search_button() {
		WebElement log = driver.findElement(By.name("login"));
		clickButton(log);
	}
	

	@Then("Valid result is displayed")
	public void valid_result_is_displayed() {
System.out.println("the resuts are displayed");	}


}
