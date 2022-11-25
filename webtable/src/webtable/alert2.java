package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	WebDriver d;
	public void open_browser()
	{

	System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demoqa.com/alerts");
	d.manage().window().maximize();
	}
	public void conformation()throws InterruptedException
	{
		d.findElement(By.id(""));
		Alert alt=d.switchTo().alert();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
