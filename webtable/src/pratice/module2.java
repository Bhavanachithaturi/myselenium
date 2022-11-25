package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module2 {
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
public void newuser()
{
	d.findElement(By.id("FirstName")).sendKeys("bhavana");
	d.findElement(By.id("Surname")).sendKeys("chithaturi");
	d.findElement(By.id("E_post")).sendKeys("w@123");
	d.findElement(By.id("Mobile")).sendKeys("4345667778");
	d.findElement(By.id("Username")).sendKeys("bhavana");
	d.findElement(By.id("Password")).sendKeys("Wd123#");
	d.findElement(By.id("ConfirmPassword")).sendKeys("Wd123#");
	d.findElement(By.id("submit")).click();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
module2 s2=new module2();
s2.openurl();
s2.signup();
s2.newuser();
	}

}
