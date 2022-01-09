package ultilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Driver {
	static private WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			switch (Config.getProperty("browser")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Config.getProperty("chromedriverpath"));
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", Config.getProperty("geckodriverpath"));
				driver = new FirefoxDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			}
		}
		return driver;
	}
}
