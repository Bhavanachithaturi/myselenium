package Webbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https:www.amazon.com");
d.manage().window().maximize();
System.out.println(d.getTitle());
System.out.println(d.getCurrentUrl());
WebElement a=d.findElement(By.xpath("/html/body"));
List<WebElement>b=a.findElements(By.tagName("a"));
System.out.println(b.size());
for(int i=0;i<b.size();i++)
{
	System.out.println(b.get(i).getText());
}
	}

}
