package idealabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderProgram {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.className("ui-slider-handle"));
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDropBy(e, 220, 0).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
