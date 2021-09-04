package com.assignments.minal;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		driver.findElement(By.cssSelector("a[href*='windows/new']")).click();
		
		Set<String> switchWindows = driver.getWindowHandles();
		Iterator<String> iterate = switchWindows.iterator();
		String parentID = iterate.next();
		String childID = iterate.next();
		driver.switchTo().window(childID);
		
		String s = driver.findElement(By.cssSelector(".example")).getText();
		
		System.out.println(s);
		driver.switchTo().window(parentID);
		
		s = driver.findElement(By.cssSelector(".example")).getText().split("Click")[0].trim();		
		System.out.println(s);
		
		driver.close();
		
	}
	

}
