package KeyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String readPropertyData(String propPath,String key)throws Throwable
	{
	
		FileInputStream fis=new FileInputStream (propPath);
		
		Properties prop=new Properties ();
		
	    prop.load(fis);
	  
	  String propValue= prop.getProperty(key,"Incorrect Key");
	  
		return propValue;
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
