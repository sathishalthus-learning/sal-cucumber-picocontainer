package sal.di.constructor;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogoutSteps {
	//
	DriverFactory df;

	public LoginLogoutSteps(DriverFactory df) {
		this.df = df;
	}

	//
	@Given("navigated to login page")
	public void navigated_to_login_page() {
		//
		df.driver.get("https://www.saucedemo.com/v1/index.html");

	}

	@When("passing credentials")
	public void passing_credentials() {
		//
		df.driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		df.driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		df.driver.findElement(By.cssSelector("#login-button")).click();
	}
	
	@Then("should see products page")
	public void should_see_products_page() {
		//
		String header = df.driver.findElement(By.className("product_label")).getText();
		
		assertTrue(header.contentEquals("Products"));
	}
	

	@Then("logs out")
	public void logs_out() {
		//
		df.driver.findElement(By.className("bm-burger-button")).click();
		df.driver.findElement(By.linkText("Logout")).click();
		
	}



}
