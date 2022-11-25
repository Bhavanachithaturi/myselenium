package hub;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hub {
WebDriver d1;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
String baseurl="http://www.google.com";
DesiredCapabilities cap=DesiredCapabilities.chrome();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WINDOWS);
WebDriver d1=new RemoteWebDriver(new URL(nodeurl),cap);

System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
d1=new ChromeDriver();
d1.get(baseurl);
d1.manage().window().maximize();
Thread.sleep(2000);
d1.close();
	}

}
