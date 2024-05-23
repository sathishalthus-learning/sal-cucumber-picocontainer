package sal.di.framework;

import java.awt.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//
	Framework fw;

	//
	public LoginPage(Framework fw) {
		//
		this.fw = fw;
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
