package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
WebDriver d;
	void  Opening_Browser() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void Navigate()
	{
	d.manage().window().maximize();	
	}
	public void usernameenter()
	{
		d.findElement(By.name("username")).sendKeys("bhavana");
	}
	public void password()
	{
		d.findElement(By.name("password")).sendKeys("bhavana@123");
		
	}
public void click()
{
	d.findElement(By.name("submit")).click();
}
}
