package pkgmavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgr {
	@Test
	public void StartBrowser() {

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		driver.quit();
	}
}
