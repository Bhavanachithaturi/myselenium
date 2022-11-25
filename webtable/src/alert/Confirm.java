package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {
	WebDriver d;
	public void open_browser()
	{

	System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demoqa.com/alerts");
	d.manage().window().maximize();
	}
	public void title()throws NullPointerException
	{
		System.out.println(d.getTitle());
	}
	public void url()throws NullPointerException
	{
		System.out.println(d.getCurrentUrl());
	}
	public void conformation()throws InterruptedException
	{
		d.findElement(By.id("confirmButton")).click();
	
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement s=d.findElement(By.id("confirmResult"));
		System.out.println(s.getText());	
	}
	public void close()
	{
		d.close();
	}
	public static void main(String[] args)throws InterruptedException
	{
		Confirm e=new Confirm();
		e.open_browser();
		e.title();
		e.url();
		e.conformation();
		e.close();
		
	}

}
