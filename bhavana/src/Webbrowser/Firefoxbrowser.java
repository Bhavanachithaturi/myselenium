package Webbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver d=new FirefoxDriver();
d.get("http://www.amazon.com");
d.manage().window().maximize();
System.out.println(d.getTitle());
System.out.println(d.getCurrentUrl());
d.close();



	}

}
