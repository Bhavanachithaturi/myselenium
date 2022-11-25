package Webbrowser;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
WebDriver d;
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
	d.manage().window().maximize();
	
	
}
public void nurl()
{
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
}

public void linkscount()
{
	//WebElement a=d.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/input"));
	List<WebElement>b=d.findElements(By.tagName("a"));
	System.out.println(b.size());
	for(int i=0;i<b.size();i++)
	{
		System.out.println(b.get(i).getText());
	}
}
public void expected()
{
	String e="itera";
	String g=d.getTitle();
	if(e.equals(g))
	{
		System.out.println("similar Title");
		
	}
	else
	{
		System.out.println("not similar");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
practice p=new practice();
p.openbrowser();
p.nurl();
p.linkscount();
p.expected();

	}

}
