package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module1 {
	WebDriver d;
	public void openurl()
	{
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://itera-qa.azurewebsites.net/");
	d.manage().window().maximize();
	
	}
	public void signup()
	{
		d.findElement(By.linkText("Sign Up")).click();
	}

public static void main(String[] args)
{
	module1 s1=new module1();
	s1.openurl();
	s1.signup();
	
}
}

