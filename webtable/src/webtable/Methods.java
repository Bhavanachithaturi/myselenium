package webtable;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
WebDriver d;
	public void open_chrome(){
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe ");
 d=new ChromeDriver();
d.get("https//www.amazon.com");
d.manage().window().maximize();

	}
public void get_title() {
	System.out.println(d.getTitle());
}
public void get_current_url() {
	System.out.println(d.getCurrentUrl());
}
Public void drop() {
	WebElement a=d.findElement(By.id(""));
	List<WebElement> a1=a.findElement(By.tagName("option"));
	System.out.println(a1.size());
	for(int i=0;i<a1.size()) {
		System.out.println(a1.get(i).getText());
	}
}
Public void screenshot() {
	File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr,new file("D:"));
}
public static void main(String[] args) {

}
