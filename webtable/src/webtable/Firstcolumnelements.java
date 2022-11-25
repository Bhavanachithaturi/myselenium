package webtable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcolumnelements {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

		ChromeDriver d= new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();

		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[";
		String c="]";
for(int i=0;i<36;i++)
{
	for(int j=1;j<=2;j++)
	{
String e=d.findElement(By.xpath(a+i+b+j+c)).getText();
System.out.println(e);
	}
}
	}
}


