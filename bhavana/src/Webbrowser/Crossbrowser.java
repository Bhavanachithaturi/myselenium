package Webbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowser {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("firefox");
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		
		System.out.println("chromedriver");
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.com");
		d1.manage().window().maximize();
		System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		d1.close();
		
		//System.out.println("Internet explorer");
//System.setProperty("webdriver.ie.driver","c://IEDriver");
//InternetExplorerDriver d2=new InternetExplorerDriver();
//d2.get("https://www.amazon.com");
//d2.manage().window().maximize();
//System.out.println(d2.getTitle());
//System.out.println(d2.getCurrentUrl());
//d2.close();
	}

}
