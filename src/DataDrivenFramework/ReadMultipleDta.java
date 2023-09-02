package DataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDta {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

		
		for(int i=0;i<4;i++) {
			
			FileInputStream fis=new FileInputStream("C:\\kcsm6\\Automation Project\\Test Data\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
			System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
			
			
			
			
		}
	}

}
