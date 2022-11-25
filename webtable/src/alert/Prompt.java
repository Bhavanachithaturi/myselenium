package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
public void title()throws NullPointerException

{
	String a=d.getTitle();
	System.out.println(a);
}
public void Current_url()throws NullPointerException
{
	System.out.println(d.getCurrentUrl());
}
public void Prompt_window()throws InterruptedException
{
	d.findElement(By.id("promtButton")).click();
	Alert alt=d.switchTo().alert();
	System.out.println(alt.getText());
alt.sendKeys("welcome to selenium");
	Thread.sleep(5000);
	alt.accept();
	

}
public void close() {
	d.close();
}
	public static void main(String[] args) throws InterruptedException {
Prompt p1=new Prompt();		
p1.opening_browser();
p1.title();
p1.Current_url();
p1.Prompt_window();
p1.close();



	}

}
