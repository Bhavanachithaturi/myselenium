package Webbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class get_prac {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://b1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("ammulu");
		Row r;
		Cell c;
		r=ws.createRow(1);
		r.createCell(1).setCellValue("name");
		r=ws.createRow(2);
		r.createCell(2).setCellValue("ids");
		r=ws.createRow(3);
		r.createCell(3).setCellValue("links");
		FileOutputStream f1=new FileOutputStream("d://b1.xlsx");
		wb.write(f1);
		f1.close();

	}

}
