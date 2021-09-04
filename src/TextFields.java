import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextFields {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("minal26patel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	//	driver.findElement(By.xpath("//*[@id='u_0_a_g1']/div[3]")).click();
		
		//driver.findElement(By.linkText("Forgot Password?")).click();;
	}
}

