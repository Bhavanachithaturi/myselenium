package PACKAGE4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=11136763886231949432&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-299123108802&hydadcr=5841_2362028&gclid=CjwKCAjw8JKbBhBYEiwAs3sxNxYr-5-ig_3imCDWvJISG2fuAI4YCHKqczDFxPmm0F2v4RRHiS_aBxoC5V8QAvD_BwE");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
		}
		
		File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a,new File("D://new1.png"));
	}

}
