package qspPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		
		String text =driver.findElement(By.tagName("body")).getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		
	driver.close();	
	}

}
