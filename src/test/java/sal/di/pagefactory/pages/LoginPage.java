package sal.di.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sal.di.pagefactory.WebDriverFactory;

public class LoginPage {
	//
	WebDriver driver;

	//
	public LoginPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
	}

	@FindBy(css = "#user-name")
	private WebElement txtUsername;

	@FindBy(css = "#password")
	private WebElement txtPassword;

	@FindBy(id = "login-button")
	private WebElement btnLogin;

	public void loginWithValidCrendentials() {
		txtUsername.sendKeys("standard_user");
		txtPassword.sendKeys("secret_sauce");
		btnLogin.click();
	}

	public void navigateToLoginpage() {
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

}
