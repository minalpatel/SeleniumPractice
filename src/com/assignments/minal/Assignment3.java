package com.assignments.minal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		/*w.until(ExpectedConditions.elementToBeClickable(By
				.id("results")));*/
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());
	}
}
