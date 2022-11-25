package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parmeter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.findElement(By.xpath("//input[@]id='userName']")).sendKeys(" Chithaturi bhavana");
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("bhavanachithaturi@gmail.com");
		d.findElement(By.xpath("//textarea[@id=currentAddress"]"));

	}//*[@id="userName"]//*[@id="userEmail"]

}
