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

	WebDriver driver = null;

	@Parameters("Browser")
	@Test
	public void StartBrowser(String browsserName) {

		System.out.println("Parameter value is: " + browsserName);

		if (browsserName.contains("Chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chromedriver.driver", ".\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsserName.contains("Edge")) {
			driver = new EdgeDriver();
			System.setProperty("webdriver.chromedriver.driver", ".\\src\\main\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browsserName.contains("Firefox")) {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.chromedriver.driver", ".\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Wrong browser input!");
		}

		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
	}

}
