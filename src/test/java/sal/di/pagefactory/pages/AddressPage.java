package sal.di.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sal.di.pagefactory.WebDriverFactory;

public class AddressPage {
	//
	WebDriver driver;

	//
	public AddressPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
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
