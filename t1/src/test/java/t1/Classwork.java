package t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Classwork {
	WebDriver d;
	@Given("user navigate to newtours")
	public void user_navigate_to_newtours() {
	    System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	}

	@When("user get uname and password from property list")
	public void user_get_uname_and_password_from_property_list() {
		
	 
	}

	@Then("user click on link register and screenshot")
	public void user_click_on_link_register_and_screenshot() {

	}

	@And("all the country names and user navigated to home page")
	public void all_the_country_names_and_user_navigated_to_home_page() {
	  
	}




}
