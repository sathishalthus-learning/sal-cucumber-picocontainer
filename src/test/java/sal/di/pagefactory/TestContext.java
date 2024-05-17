package sal.di.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {

	//
	private WebDriver driver=null;
	public TestContext() {
		// TODO Auto-generated constructor stub
	}
	
	//
	void initBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	public WebDriver getDriver() {
		if(driver==null) {
			initBrowser();
		}
		return driver;
	}
}
