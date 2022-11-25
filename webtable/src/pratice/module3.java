package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class module3 {
	WebDriver d;
	public void openurl()
	{
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d.get("https://itera-qa.azurewebsites.net/");
	
	d.manage().window().maximize();
	d.getTitle();}
	public void links()
	{
		//WebElement link=d.findElement(By.xpath("//*[@]"))
List<WebElement> b=d.findElements(By.tagName("a"));
System.out.println(b.size());
for(int i=0;i<b.size();i++)
{
	System.out.println(b.get(i).getText());
}
	}
public void expectedvsactual()
{
String exp="itera";
String Act=d.getTitle();

if(exp.equals(Act))
{
	System.out.println("similar title");
}
{
	System.out.println("not similar");
}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
module3 s=new module3();
s.openurl();
s.links();
s.expectedvsactual();
	}

}
