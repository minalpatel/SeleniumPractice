package com.selenium.version4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class RelativeLocators {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By
				.cssSelector("[name='name']"));
		
		/* WITH TAG NAME IS AVAILABLE FOR SELENIUM VERSION 4.0 AND I HAVE USED 3.14 AS IT IS MORE STABLE
		 
		System.out.println(driver.findElement(
			withTagName("label").above(nameEditBox)).getText());
		
		WebElement dateofBirth = driver.findElement(By
			.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(withTagName("input").below(dateofBirth)).sendKeys(
				"02/02/1992");
		
		WebElement iceCreamLabel = driver
				.findElement(By
						.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel))
				.click();

		// Get me the label of first Radio button

		WebElement rb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(
				withTagName("label").toRightOf(rb)).getText());
				
		*/
		
	}

}