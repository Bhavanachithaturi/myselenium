package datadriventesting;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt1_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://Book4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Amazon");
		Row r=null;
		Cell c=null;
		String baseurl="http://www.amazon.com";
		System.setProperty("Webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		//capturing all the drop down elements from amazon page
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>b=a.findElements(By.tagName("Option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(b.get(i).getText());
			b.get(i).click();
			if(!b.get(i).isSelected())
			{
				r.createCell(1).setCellValue("fail");
				
			}
			else
			{
				r.createCell(1).setCellValue("pass");
				
			}
		}
		FileOutputStream f1=new FileOutputStream("D://Book4.xlsx");
		wb.write(f1);
		f1.close();

	}

}
