package com.testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	public static WebDriver driver;
	
	//@BeforeMethod/
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.get("https://www.freejobalert.com/");
		driver.manage().window().maximize();
		
		
		
		//@Test
		//public void googleTitleTest() {
	//	driver.getTitle();
			System.out.println(driver.getTitle());
	//	}
//		
//	@AfterMethod	
//	public void tearDown() {
//		System.out.println("ramya");
//		driver.quit();
//	}
	}}
