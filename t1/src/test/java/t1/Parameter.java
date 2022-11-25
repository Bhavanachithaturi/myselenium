package t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameter {
	WebDriver d;
	@Given("user is in newtours")
	public void user_is_in_newtours() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().window().maximize();
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() {
	    
	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		d.close();
		
	  
	}

	@And("user navigated to home window")
	public void user_navigated_to_home_window() {
		System.out.println("user navigated to home page");
	    
	}




}
