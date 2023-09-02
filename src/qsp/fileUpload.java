package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='dz-success-mark dz-clickable']")).sendKeys("C:\\Users\\RAVINDER\\Desktop");;
		
		//WebElement fb=driver.findElement(By.xpath("//input[@id='file-submit']"));
		//fb.sendKeys("");
		driver.findElement(By.id("file-upload"));
		//.sendKeys("C:\\Users\\RAVINDER\\Desktop");
		
	}}
