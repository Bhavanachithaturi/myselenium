package friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2 {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By phone=By.name("phone");
	By Uname=By.name("userName");
	By country=By.name("country");
POM2(WebDriver d)
{
	this.d=d;
}
public void Fname()
{
	d.findElement(Fname).sendKeys("selenium");
}
public void Lname()
{
	d.findElement(Lname).sendKeys("Testing");
}
public void phone() {
	d.findElement(phone).sendKeys("9346700999");
}
public void Uname()
{
	d.findElement(Uname).sendKeys("Testing123");
	
}
public void country()
{
	d.findElement(country).sendKeys("india");
}
}
