package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promtwindow {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
public void title()
{
	System.out.println(d.getTitle());
}
public void Current_url()
{
	System.out.println(d.getCurrentUrl());
}
public void Prompt_window()
{
	d.findElement(By.id("promtButton")).click();
	Alert alt=d.switchTo().alert();
	System.out.println(d.getText());
d.sendkeys("welcome to selenium");
	Thread.sleep(2000);
	alt.accept();
	WebElement w1=d.findElement(By.id(""));

}
public void close() {
	d.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Promtwindow p1=new Promtwindow();
p1.opening_browser();
p1.title();
p1.Current_url();
p1.prompt_window();
p1.close();

	}

}
