package Webbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class give_prac {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

	FileInputStream f=new FileInputStream("d://Book3.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("bhavas");
	Row r;
	Cell c;
	Iterator<Row>row=ws.iterator();
	while(row.hasNext())
	{
		r=row.next();
		Iterator<Cell>cell=r.iterator();
		while(cell.hasNext())
		{
			c=cell.next();
		if(c.getCellType()==c.CELL_TYPE_NUMERIC)
		{
			System.out.println(c.getNumericCellValue());
		}
		else
		{
			System.out.println(c.getStringCellValue());
			}
		
		}
	}
	
	
	

}
}