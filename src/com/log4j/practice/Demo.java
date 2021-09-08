package com.log4j.practice;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	private static Logger log =  LogManager.getLogger(Demo.class.getName());
	
	/*******When to Use log. Error, debug and info methods in Selenium test cases*****************************	 

	Use log. Error() to log when elements are not displayed in the page or if any validations fail

	Use Log. Debug()

	When each Selenium action is performed like click, SendKeys, getText()

	Use log.info()

	When operation is successfully completed ex: After loading page, or after any successful validations

	It’s just counterpart to log. Error()

	MAIN WEBSITE FOR LOGGING EXAMPLES https://logging.apache.org/log4j/2.x/manual/configuration.html

	*****************sample Testcase is found at the end of this section********/
		
	public static void main(String[] args) {
		
		log.debug("Setting chrome driver property");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Window Maximized");
		log.debug("Now hitting Amazon server");
		driver.get("https://www.amazon.com/");
		log.info("Landed on amazon home page");
		Actions a = new Actions(driver);

		/*
		 * a.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id='twotabsearchtextbox']")))
		 * .click().keyDown(Keys.SHIFT).sendKeys
		 * ("capitalletters").doubleClick().build().perform();
		 * a.moveToElement(driver
		 * .findElement(By.cssSelector("a[id='nav-link-accountList']"
		 * ))).build().perform();
		 * a.moveToElement(driver.findElement(By.cssSelector
		 * ("a[id='nav-link-accountList']"))).contextClick().build().perform();
		 */

		driver.get("http://jqueryui.com/demos/droppable/");
		log.debug("Getting the frames count");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		log.info("Frames count retreived");
		try {
			driver.switchTo().frame(0);
			log.info("Successfully switched to frame");
		} catch (Exception e) {
			log.error("Cannot identify the frame");
		}
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		log.debug("Identifying Draggable objects");
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
		log.info("Drag and drop success");
		
	}
}
