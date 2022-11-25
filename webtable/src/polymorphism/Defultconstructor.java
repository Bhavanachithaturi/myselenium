package polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defultconstructor {
WebDriver d;
Defultconstructor(){
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	d=new ChromeDriver();
	d.get("");
	d.manage().window().maximize();
	d.findElement(By.name(""))
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
