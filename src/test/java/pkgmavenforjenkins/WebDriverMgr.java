package pkgmavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// run as maven command with parameter value for browser
// C:\Users\Iroshan\eclipse-workspace\SeleniumWebDriverManager>mvn clean test -DBrowser=Chrome

public class WebDriverMgr {
	@Parameters("Browser")
	@Test
	public void StartBrowser(String browsserName) {

		WebDriver driver = null;
		System.out.println("Parameter value is: " + browsserName);

		if (browsserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browsserName.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Wrong browser input!");
		}

		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
	}

}
