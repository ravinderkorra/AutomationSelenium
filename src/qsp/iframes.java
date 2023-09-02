package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("iframe.contains(text,'Child Iframe')")));
	
		
		
		
		
		
		
		
}}
