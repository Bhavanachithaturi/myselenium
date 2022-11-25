package friday;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromeDriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/";
		d.get(baseurl);
		d.manage().window().maximize();
		POM1 a1=new POM1(d);
		a1.uname();
		a1.pass();
		a1.button();
	Thread.sleep(2000);
	d.close();
		

	}

}
