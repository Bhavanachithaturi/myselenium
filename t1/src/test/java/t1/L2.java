package t1;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class L2 {
	WebDriver d;
	@Given("user is in newtours appliction")
	public void user_is_in_newtours_appliction() {

		System.out.println("user is in newtours application");
	    
	}

	@When("user needs to enter username and pass")
	public void user_needs_to_enter_username_and_pass() {
		
		System.out.println("usret needs to enter username and pass");
	  
	}

	@Then("user clicks on sigon button")
	public void user_clicks_on_sigon_button() {
	  
	}

	@And("user navigated to homepage")
	public void user_navigated_to_homepage() {
		System.out.println("usre navigated to homepage");
	   
	}




}
