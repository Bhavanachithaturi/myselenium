package friday;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromeDriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		POM2 a2=new POM2(d);
		a2.Fname();
		a2.Lname();
		a2.phone();
		a2.Uname();
		a2.country();
		Thread.sleep(2000);
		d.close();
		
	}

}
