package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bhavana {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.amazon.com");
	d.manage().window().maximize();
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	d.close();

	}

}
