package com.assignments.minal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,575)");
		
		int rowSize = driver.findElements(By.cssSelector("div[class='left-align'] table tr")).size();
		int colSize = driver.findElements(By.cssSelector("div[class='left-align'] table th")).size();
		List<WebElement> secondRow = driver.findElements(By.cssSelector("div[class='left-align'] table tr:nth-child(3)"));
		
		System.out.println("Row Size " + rowSize);
		System.out.println("Column Size " + colSize);
		
		for (WebElement webElement : secondRow) {
			System.out.print(webElement.getText() + " ");
		}
		
		driver.close();	
		
	}
}
