package com.automation;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> originalList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> listString = originalList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedString = listString.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(sortedString.equals(listString));
		
/*		While Loop
 		List<String> price = originalList.stream().filter(s->s.getText().contains("Rice"))
				.map(s->getPrice(s)).collect(Collectors.toList());;
		price.forEach(a->System.out.println(a));
		
		while (price.size() < 1) {
			originalList = driver.findElements(By.xpath("//tr/td[1]"));			
			price = originalList.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getPrice(s)).collect(Collectors.toList());
					
					price.forEach(a->System.out.println(a));
					if(price.size() < 1){
						driver.findElement(By.cssSelector("a[aria-label='Next']")).click();			
			}			
		} 		
*/
		//Search for Veggie / Fruit and then find the value in search and then compare whether value is found or not
		
		List<String> price = null ;
		
		 do {
			originalList = driver.findElements(By.xpath("//tr/td[1]"));			
			price = originalList.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getPrice(s)).collect(Collectors.toList());
					
					price.forEach(a->System.out.println(a));
					if(price.size() < 1){
						driver.findElement(By.cssSelector("a[aria-label='Next']")).click();			
			}			
		} while (price.size() < 1);
		 
		driver.findElement(By.id("search-field")).sendKeys("Wheat");
		List<WebElement> value = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> valuesFetched = value.stream().filter(s->s.getText().equals("Wheat")).collect(Collectors.toList());
		Assert.assertEquals(value.size(), valuesFetched.size());
		System.out.println("Code success");
		driver.close();
		
	}
	
	private static String getPrice(WebElement s)
	{
		
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
