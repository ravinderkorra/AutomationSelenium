package idealabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		
		WebElement age=driver.findElement(By.id("age"));
		
		
		
		System.out.println(age.getAttribute("title"));
		
		Thread.sleep(3000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(age).perform();
		Thread.sleep(2000);
		
	driver.close();

	}

}
