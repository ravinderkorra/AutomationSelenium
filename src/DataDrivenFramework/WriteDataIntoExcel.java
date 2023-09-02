package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("./Test Data/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(3);
		//keep the cell ready for writting purpose
		Cell c=r.createCell(2);
		//provide data
		c.setCellValue("RAMYA BEHARA");
		
		//OPEN THE FILE IN WRITE MODE
		FileOutputStream fos=new FileOutputStream("./Test Data/Book1.xlsx");
		//save the changes made in the file
		wb.write(fos);
		System.out.println("done writing");
		
		
		
		
		
		
	}

}
