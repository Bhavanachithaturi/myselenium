package basics_methods;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program2{
	WebDriver d;
//@BeforeMethod
  @BeforeClass
	public void opening_browser() {
	  System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	   d=new ChromeDriver(); 
	   d.get("https://www.amazon.com");
		   d.manage().window().maximize();
  }
@Test(priority=1)
public void gettitle() {
	System.out.println(d.getTitle());
	
}
@Test(priority=2)
public void currenturl()
{
System.out.println(d.getCurrentUrl());
}
@Test(priority=3)
public <file> void screenshot() throws IOException
{
File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("D://cal.png"));
}
//@AfterMethod
@AfterClass
public void close()
{
	d.close();
}
}


