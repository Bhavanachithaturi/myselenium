package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt {
	

	
    WebDriver d;
	public void alert_message()
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
		

	public void url()throws NullPointerException
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void alert()throws InterruptedException
	{
		d.findElement(By.id("alertButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
	}
	public void close()
	{
		d.close();
	}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			alt a1=new alt();
			a1.alert_message();
			a1.title();
			a1.url();
			a1.alert();
			a1.close();
			

	
	

	}

}
