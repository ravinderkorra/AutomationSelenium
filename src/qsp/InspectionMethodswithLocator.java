package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InspectionMethodswithLocator {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://www.freejobalert.com/");
		Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//td[@id='qlink2']/descendant::a[@ href='https://www.freejobalert.com/ibps-so-2021/947456/']")).click();
		
		
//	List<WebElement> ALL= driver.findElements(By.tagName("a"));
//	int nooflinks=ALL.size()	;
//	System.out.println("nooflinks: "+nooflinks);
//	for(int i=0;i<ALL.size()-1;i++);
//			
//	{
//
//	}
//		WebElement onleLinkText=ALL.get(i);
//		String link=onleLinkText.getText();	
	//	System.out.println(link);	    
	//	System.out.println(ALL.get(i).getText());
		
		//ALL.get(ALL.size()-1).click();
		
	
		
	// move to element 	
		
	//	Actions ac=new Actions(driver);
		//   WebElement lk=driver.findElement(By.xpath("//a[@href='https://www.freejobalert.com/mrb-tn-food-safety-officer-2021/944512/']"));
	//	ac.moveToElement(lk).perform();
	//	ac.contextClick(lk).perform();
	//	ac.doubleClick(lk).perform();
		
		
		
		//scrool down page typecasting
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//  js.executeScript("window.scrollBy(100,200)");
		
		
		
		
		//scrool down page downcasting
	//	RemoteWebDriver  rwd=(RemoteWebDriver)driver;
	//	rwd.executeScript("window.scrollBy(100,200)");
		
		
		
		
		//scrool down page element address
		WebElement ups=driver.findElement(By.xpath("//a[@href='https://www.freejobalert.com/upsessb-tgt-pgt-2021/908821/']"));

		Point loc=ups.getLocation();
		System.out.println(loc);
		
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		  jsp.executeScript("window.scrollBy"+loc);
			
		
		
		
		
		
		
		
	//}
	}}



