package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class L3 {
	WebDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
	    System.setProperty("webdriver.chome.driver","c://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	    
	}

	@When("user enters uname and password")
	public void user_enters_uname_and_password() {
	    d.findElement(By.name("userName")).sendKeys("mercury");
	    d.findElement(By.name("password")).sendKeys("mercury@123");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    d.findElement(By.name("submit")).click();
	    Thread.sleep(2000);
	    d.close();
	}

	@And("user back to home page")
	public void user_back_to_home_page() {
System.out.println("user navigated to home page");	    
	}
}

