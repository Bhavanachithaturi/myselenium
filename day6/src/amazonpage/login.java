package amazonpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	WebDriver d;
  @BeforeTest
  public void openingbrowser()
  {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	  ChromeDriver d=new ChromeDriver();
	  d.get("https://www.amazon.com");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void title()
  {
	  System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void currenturl() {
	  System.out.println(d.getCurrentUrl());
  }
@Test(priority=3)
public void dropdown()
{
	WebElement a=d.findElement(By.id("searchDropdownBox"));
	
	List<WebElement>a1=a.findElements(By.tagName("option"));
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i).getText());
	}
}

}

  
  
 
  
