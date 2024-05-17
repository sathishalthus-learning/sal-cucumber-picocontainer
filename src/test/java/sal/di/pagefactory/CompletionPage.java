package sal.di.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletionPage {
	//
	WebDriver driver;

	//
	public CompletionPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
	}


	//
	@FindBy(css =  ".pony_express")
	private WebElement imgPonyExpress;
	
	
	public boolean getOrderStatus() {
		return imgPonyExpress.isDisplayed();
		
	}

}
