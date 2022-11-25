package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module4 {
WebDriver d;
public void openurl()
{
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d.get("https://www.amazon.com");
	
	d.manage().window().maximize();
	d.getTitle();
	}
public void capturelinks()
{
	List<WebElement>b=d.findElements
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
