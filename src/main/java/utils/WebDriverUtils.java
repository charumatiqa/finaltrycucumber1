package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
	
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return driver;
	}
	
	public static void linkUrl()
	{
		//String url = "https://parabank.parasoft.com/parabank/index.htm";
		//return url;
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		}
}
