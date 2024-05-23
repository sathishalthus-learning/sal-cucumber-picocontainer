package sal.di.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PageObjectManager {
	//
	WebDriver driver;
	LoginPage loginPage;
	ProductsPage productpage;
	CartPage cartpage;
	AddressPage addresspage;
	OrderPage orderpage;
	CompletionPage completionpage;
	
	
	public PageObjectManager(WebDriverManager wdm) {
		driver = wdm.driver;
	}


}
