package package7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

		ChromeDriver d= new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id='datapicker']")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();

	}
	//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[7]/a
	
		
	}

		
	


