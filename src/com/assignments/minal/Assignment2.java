package com.assignments.minal;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args)throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();
		// driver.findElement(By.cssSelector(".DayPicker-Day--today")).click();

		 WebElement staticDropdown = driver.findElement(By.cssSelector("select.bc-neutral-100.bg-transparent"));
		 Select dropDown = new Select(staticDropdown);
		 dropDown.selectByIndex(3); 
		
		driver.findElement(By.cssSelector(""));
		 
	}
}
