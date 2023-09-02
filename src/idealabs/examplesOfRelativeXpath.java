package idealabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplesOfRelativeXpath {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://www.freejobalert.com/");
		Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//td[@id='qlink2']/descendant::a[@ href='https://www.freejobalert.com/ibps-so-2021/947456/']")).click();
		
		//driver.findElement(By.xpath("//a[@href='https://www.freejobalert.com/admit-card-call-letter/22406/']")).click();
		
		
}}
