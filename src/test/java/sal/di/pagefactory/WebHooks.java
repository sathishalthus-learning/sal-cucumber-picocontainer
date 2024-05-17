package sal.di.pagefactory;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebHooks {
	//
	WebDriverFactory wdf;
	
	public WebHooks(WebDriverFactory wdf) {
		this.wdf = wdf;
	}

	@Before
	public void setup() {
		wdf.driver = new ChromeDriver();
		wdf.driver.manage().window().maximize();
		wdf.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@After 
	public void teardown() {
		wdf.driver.quit();
	}
}
