package qspPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokupp {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		
	WebElement lk=	driver.findElement(By.xpath("//a[@href='/windows/new']"));
		lk.click();	
		
	String parentWindow=driver.getWindowHandle();	
	Set<String> allwhs=driver.getWindowHandles();
	for(String wh:allwhs)
	{
		String title=driver.switchTo().window(wh).getTitle();
		if(title.equals("New Window"))
		{
			
			String text= driver.findElement(By.tagName("h3")).getText();
			System.out.println(text);
			break;
		}
		
	}
	Thread.sleep(2000);
	driver.switchTo().window(parentWindow);
	}

}
