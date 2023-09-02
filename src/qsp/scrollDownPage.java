package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class scrollDownPage {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://www.freejobalert.com/");
		Thread.sleep(2000);
		
		
		//scrool down page typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(100,200)");
		
		
		
		
		//scrool down page downcasting
//		RemoteWebDriver  rwd=(RemoteWebDriver)driver;
//		rwd.executeScript("window.scrollBy(100,200)");
//		
//		
		
		
		//scrool down page element address
//		WebElement ups=driver.findElement(By.xpath("//a[@href='https://www.freejobalert.com/upsessb-tgt-pgt-2021/908821/']"));
//
//		Point loc=ups.getLocation();
//		System.out.println(loc);
//		
//		JavascriptExecutor jsp=(JavascriptExecutor)driver;
//		  jsp.executeScript("window.scrollBy"+loc);
//		  driver.close();
//			
		
		
		
		
		
		
	}

}
