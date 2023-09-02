package DataDrivenFramework;

public class DataDrivenMainClass {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		FileLib flib=new FileLib();
		int rc=flib.getRowCount("./Test Data/Book1.xlsx", "Sheet1");
		System.out.println(rc);
		for(int i=0;i<=rc;i++)
		{
			String value=flib.readExcelData("./Test Data/Book1.xlsx", "Sheet1",i,1);
			System.out.println(value);
			flib.writeExcelData("./Test Data/Book1.xlsx", "Sheet1",i,2,"RAMYA BEHARA");
		}

	}

}
