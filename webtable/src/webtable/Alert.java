package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	WebDriver d;
public void alert_message()
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
	

public void url()
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
		Alert a1=new Alert();
		a1.title();
		a1.url();
		a1.alert();
		a1.close();
		
		

	}

		
	}


