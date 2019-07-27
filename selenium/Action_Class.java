package Understanding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Action_Class {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	Mouse_Hovering();	
		
		 
		 
	}

	
	public static void Mouse_Hovering() throws InterruptedException {
		
         driver = new ChromeDriver();
		
		System.setProperty("ChromeDriver", "/home/myupchar/Automation/Selinium/chromedriver_linux64");
		
		
		driver.manage().window().maximize();
		 
		 driver.get("https://www.spicejet.com/");
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 Actions mouseHover = new Actions(driver);
		 
		 mouseHover.moveToElement(driver.findElement(By.xpath("//a[@id = 'ctl00_HyperLinkLogin']"))).build().perform();
		
		 Thread.sleep(4000);
		
		driver.navigate().back();
		
		
	}
	
	public static void Drag_and_Drop() {
	
driver = new ChromeDriver();
		
		System.setProperty("ChromeDriver", "/home/myupchar/Automation/Selinium/chromedriver_linux64");
		
		
		driver.manage().window().maximize();
		 
		 driver.get("https://www.spicejet.com/");
		
		
		
	}
	
}
