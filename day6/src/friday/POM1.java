package friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1 {
	
		WebDriver d;
		By uName=By.name("userName");
		By pass=By.name("password");
		By Button=By.name("submit");
		POM1(WebDriver d)
		{
			this.d=d;
		}
		public void uname() {
			
			d.findElement(uName).sendKeys("admin");
		}

		public void pass()
		{
		d.findElement(pass).sendKeys("admin123");	
		}
		public void button(){
			d.findElement(Button).click();
			
		}
	


		
	

}
