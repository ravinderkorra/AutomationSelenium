//package hybrid_datadriven_keyworddriven;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import DataDrivenFramework.FileLib;
//
//public class BaseTest implements IAutoConstants {
//	
////	public static WebDriver driver;
//	
//	public void openBrowser() throws Throwable
//	{
//		
//	//	FileLib flib=new FileLib();
//	//	String browserValue=flib.readPropertyData(PROP_PATH,"Browser");
//		
////		if(browserValue.equals("Chrome"))
////		{
////		
////		System.setProperty(CHROME_KEY, CHROME_VALUE);
////		driver=new ChromeDriver();
////		
////		}
////		
//		else if(browserValue.equalsIgnoreCase("firefox")) 
//		{
//
//			System.setProperty(GECKO_KEY, GECKO_VALUE);
//			driver=new FirefoxDriver();
//			
//		}
//			
//		else {
//			System.out.println("Enter proper browser name");
//			
//		}
//		
//		driver.manage().window().maximize();
//		String appUrl=flib.readPropertyData(PROP_PATH,"url");
//		driver.get(appUrl);
//		
//		WebDriverWait wlib=new WebDriverWait();
//		wlib.verify(flib.readPropertyData(PROP_PATH,"loginTitle"),( wlib.getPageTitle(),"Login Page");
//		
//		
//	}
//	
//	public void closeBrowser() 
//	{
//driver.quit();
//	}
//	
//}
