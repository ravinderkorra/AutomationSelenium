package idealabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchForCourse {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();

	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/courses']")).click();
		driver.findElement(By.id("search")).click(); 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Course']")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.close();		
	}

}