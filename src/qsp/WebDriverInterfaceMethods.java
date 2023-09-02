package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInterfaceMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://www.freejobalert.com/");
		driver.manage().window().maximize();
		
		
//String pageurl=driver.getCurrentUrl()	;
//System.out.println("pageurl");
//if(pageurl.equals("https://www.freejobalert.com/"))
//{
//System.out.println("Freejob alert page is displayed");
//}
//else {
//	
//
//	System.out.println("Freejob alert page is not displayed");
//	
	
	
	
	
//	String srccode=driver.getPageSource();
//		
//	if(srccode.contains("https://www.freejobalert.com/")) {
//		System.out.println(srccode);
//	
//		System.out.println("Freejob alert page src code is displayed");
//	}
//	else {
//		
//
//		System.out.println("Freejob alert page src code is not displayed");
//		
//	
//		
		
		
		
		String title=driver.getTitle();	
		System.out.println(title);
		
	if(title.equals("FreeJobAlert.Com : Free job alerts Government, Bank Jobs and All")) {
			
			System.out.println("Freejob alert title page  is displayed");
		}
	else {
			System.out.println("Freejob alert title  page is not displayed");
//			
//		
		
	//	Thread.sleep(2000);
//	Dimension d=new Dimension(200,300); 
////	driver.manage().window().setSize(d);
////	
////	Thread.sleep(2000);
////	Point p=new Point(200,300);
////	driver.manage().window().setPosition(p);
////	Thread.sleep(2000);
////	
////	driver.navigate().to("https://www.instagram.com");
////	Thread.sleep(2000);
////	driver.navigate().back();
////	Thread.sleep(2000);
////	driver.navigate().forward();
////	Thread.sleep(2000);
////	driver.navigate().refresh();	
//		
		
	}}}
	


