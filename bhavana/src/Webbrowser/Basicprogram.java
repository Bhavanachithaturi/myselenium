package Webbrowser;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basicprogram {

	public static void main(String[] args)throws IOException,InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		

	}

}
