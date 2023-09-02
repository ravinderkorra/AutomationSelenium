package DataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args)throws Throwable{
		// TODO Auto-generated method stub
        // open file in read mode
		FileInputStream fis=new FileInputStream("C:\\kcsm6\\Automation Project\\Test Data\\Book1.xlsx");
		// take control of that file
		Workbook wb=WorkbookFactory.create(fis);
		//GO TO PARTICULAR SHEET
		Sheet sh=wb.getSheet("Sheet1");
		//GO TO PARTICULAR ROW
		Row r=sh.getRow(1);
		//go to particular cell
		Cell c=r.getCell(2);
		
		// capturing the string value present inside it
		String text=c.getStringCellValue();	
		System.out.println(text);
		
		
		//or
		
//		FileInputStream fis=new FileInputStream("C:\\kcsm6\\Automation Project\\Test Data\\Book1.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue());
//		
		

		
		
		
		
		
	}

}
