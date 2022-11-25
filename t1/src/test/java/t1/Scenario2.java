package t1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2{
	ChromeDriver d;
	@Given("user opens amazon page")
	public void user_opens_amazon_page() {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();;
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");

		
	}

	@When("page is opened")
	public void page_is_opened() {
d.get("https://www.amzon.com");
		
		d.manage().window().maximize();
		

	}

	@Then("capture all the links")
	public void capture_all_the_links() {
		WebElement 
		
	    
	}

	@Then("get url and title of the page")
	public void get_url_and_title_of_the_page() {
		d.getTitle();
		d.getCurrentUrl();
	
	}

	@And("user store in xl sheet and user navigated to home page")
	public void user_store_in_xl_sheet_and_user_navigated_to_home_page() throws FileNotFoundException {
	    FileInputStream f=new FileInputStream("D://Book6.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("sheet4");
	    Row r;
	    Cell c;
	    Iterator<Row>row=ws.iterator();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
