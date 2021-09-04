package com.assignments.minal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String optionSelected = driver.findElement(By.cssSelector("label[for='benz']")).getText().trim();
		System.out.println(optionSelected + " is Selected");
		
		List<WebElement> dropdown = driver.findElements(By.id(""));
		
		//Select the dropdown as per the option selected
		WebElement staticDropdown = driver.findElement(By
				.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByValue(optionSelected.toLowerCase());
		
		driver.findElement(By.id("name")).sendKeys(optionSelected);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertValue = driver.switchTo().alert().getText();		
		System.out.println("The alert contains the value of " + optionSelected + " True or False :- "+ alertValue.contains(optionSelected));
		driver.switchTo().alert().accept();
		driver.close();
	}
}
