import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream propertyFile = new FileInputStream("C:\\Users\\minal\\workspace\\Selenium Practice\\src\\dataFile.properties");
		properties.load(propertyFile);
		properties.getProperty("browser"); // get browser property value
		properties.setProperty("browser", "firefox"); 	// temporary change the value of browser property
		FileOutputStream outputStream =  new FileOutputStream("C:\\Users\\minal\\workspace\\Selenium Practice\\src\\dataFile.properties");
		properties.store(outputStream, null);
	}
}
