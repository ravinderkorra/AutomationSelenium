package qsp;
import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Hey user enter browser:");
	
	WebDriver driver=null;
		Scanner sc =new Scanner(System.in);
		String browsername=sc.next();
		
	
	if(browsername.equals("chrome"))
	
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	else if(browsername.equals("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		 driver= new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
//	File pathBinary = new File("firefox");
//	FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);  
//	DesiredCapabilities desired =new  DesiredCapabilities();
//	FirefoxOptions options = new FirefoxOptions();
//	desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//		WebDriver driver1 = new FirefoxDriver(options);
//		driver.get("https://www.google.co.in/");
	}
	else {	
		System.out.println("give proper user  browser:");
	
	}
//	File pathToBinary = new File("\"C:\\Users\\RAVINDER\\AppData\\Local\\Mozilla Firefox\\firefox.exe\"");
//	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	//FirefoxProfile firefoxProfile = new FirefoxProfile();       
	//WebDriver driver1 = new FirefoxDriver();
	}

	}


