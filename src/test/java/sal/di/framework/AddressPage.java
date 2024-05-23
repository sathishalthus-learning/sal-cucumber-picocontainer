package sal.di.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	//
	WebDriver driver;

	//
	public AddressPage(WebDriverManager wdm) {
		//
		this.driver = wdm.driver;
	}


	//
	@FindBy(id = "first-name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last-name")
	private WebElement txtLastName;
	
	@FindBy(id = "postal-code")
	private WebElement txtPostalCode;
	
	@FindBy( css = ".cart_button")
	private WebElement btnContinue;

	public void enterAddressInformaiton() {
		txtFirstName.sendKeys("Sathish");
		txtLastName.sendKeys("Johnson");
		txtPostalCode.sendKeys("333333");
	}
	
	public void continueToOrder() {
		btnContinue.click();
		
	}

}
