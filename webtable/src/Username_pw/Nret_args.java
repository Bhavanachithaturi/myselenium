package Username_pw;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nret_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/");
d.manage().window().maximize();
public void details() {
args d.findElement(By.name("userName")).sendKeys("selenium");
WebElement a=d.find
}
	}

	
		
	}

}
