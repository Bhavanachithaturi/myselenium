package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Work {
WebDriver d;
@Given("user is on newtours page")
public void user_is_on_newtours_page() {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
   d=new ChromeDriver();
   d.get("https://demo.guru99.com/test/newtours/register.php");
   d.manage().window().maximize();
}

@When("user click on register window")
public void user_click_on_register_window() {
	d.findElement(By.name("country")).sendKeys("india");
  
}

@Then("user selects india from the dropdown box")
public void user_selects_india_from_the_dropdown_box() throws InterruptedException {
	Thread.sleep(2000);
	d.close();
  
}

@And("user close the window")
public void user_close_the_window() {
  System.out.println("user navigated to home page");
}
}


