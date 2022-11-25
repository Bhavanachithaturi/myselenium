package t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newtours {
	WebDriver d;
	@Given("user in newtours page")
	public void user_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	  
	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() {
	
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    
	}

	@And("user take screenshot and close the page")
	public void user_take_screenshot_and_close_the_page() {
	 
	}




}
