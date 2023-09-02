package qspPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoWebShop {

	public static void main(String[] args)throws InterruptedException
	 {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ravi");
		driver.findElement(By.id("LastName")).sendKeys("korra");
		
		driver.findElement(By.id("Email")).sendKeys("korraravinde@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("korra1999");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("korra1999");
		
		
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button]")).click();	
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();	
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("ravi");
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("korraravinde@gmail.com");
		driver.findElement(By.id("add-to-cart-button-2")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		
		
		
	}

}
