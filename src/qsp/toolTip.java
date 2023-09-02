package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTip {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
	//	driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		
		

		
		
	}

}
