package KeyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

        //openfile in read in mode
		FileInputStream fis=new FileInputStream ("./Test Data/config.properties");
		// create an object of properties file
		Properties prop=new Properties();
		// keep the file ready for reading purpose
		prop.load(fis);
		//give the key to  get its value
		//   String value=prop.getProperty("Browser");
		
		String value=prop.getProperty("browser","incorrect key");
		//print it
		System.out.println(value);
		
		
		
	}

}
