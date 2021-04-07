package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	
		// Automating Browsers with Webdriver Manager

		public static void main(String[] args) {
			 ChromeOptions chromeOptions = new ChromeOptions();
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver(chromeOptions);
			 
			 // Navigate to the demoqa website
			 driver.get("https://www.demoqa.com");
			 
			 driver.quit();
			 
			 FirefoxOptions chromeOptions2 = new FirefoxOptions();
			 WebDriverManager.firefoxdriver().setup();
			 WebDriver driver1 = new FirefoxDriver(chromeOptions2);
			 
			 // Navigate to the demoqa website
			 driver1.get("https://www.demoqa.com");
			 
			 driver.quit();
			 
			 }
	
	

}
