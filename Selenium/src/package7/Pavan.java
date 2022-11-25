package package7;

import java.io.IOException;
import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pavan {

	public static void main(String[] args)throws IOException,InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/menu");
		d.manage().window().maximize();
		
		
		
		
	//music
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
	Thread.sleep(2000);
	
	//jazz
	WebElement jazz=d.findElement(By.id(""));
	jazz.click();
	Thread.sleep(2000);
	//modern
	WebElement modern=d.findElement(By.id("ui-id-16"));
modern.click();
Thread.sleep(2000);


Actions act=new Actions(d);
act.moveToElement(music).moveToElement(music).moveToElement(jazz).moveToElement(modern).build().perform();
	
	
	
	
	//action

	}

}
