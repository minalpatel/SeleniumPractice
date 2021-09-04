import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@class='gb_f']")).click();
		//driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		//driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("minal26patel");
		//driver.findElement(By.cssSelector("span[class='VfPpkd-vQzf8d']")).click();
	}

}


