package t1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dezlearn {
	WebDriver d;
	@Given("user is in dezlearn")
	public void user_is_in_dezlearn() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user get the url and title")
	public void user_get_the_url_and_title() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	  
	}

	@Then("user work on simple alert")
	public void user_work_on_simple_alert() {
	  d.findElement(By.id("s_alert1")).click();
	  Alert alt=d.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.accept();
	  
	}

	@And("user captures screenshot and close the window")
	public void user_captures_screenshot_and_close_the_window() throws IOException, InterruptedException {
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    Files.copy(src,new File("D://new1.png"));
	    Thread.sleep(2000);
	    d.close();
	}




}
