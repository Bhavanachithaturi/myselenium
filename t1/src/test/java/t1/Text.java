package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Text {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	   d= new ChromeDriver();
	   d.get("http://www.amazon.com");
	   d.manage().window().maximize();
	}

	@When("user searchs for some text")
	public void user_searchs_for_some_text() {
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	 
	}

	@Then("user click on sigon button")
	public void user_click_on_sigon_button() throws InterruptedException {
		
		Thread.sleep(2000);
		d.close();
	    
	}

	@And("user navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("user navigate dto home page");
	    
	}




}
