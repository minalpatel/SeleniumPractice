import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for chrome browsers
		//C:\Users\minal\Downloads\chromedriver_win32\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		/* for firefox 
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\minal\\Downloads\\gecko.exe");
		  WebDriver driver = new FirefoxDriver();
		 */
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");	
		
		//Navigate Front and back 
		System.out.println(driver.getWindowHandle());
		driver.navigate().to("https://www.yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close();//close current browser
		// driver.quit(); //close all the web browser
		
	}

}
