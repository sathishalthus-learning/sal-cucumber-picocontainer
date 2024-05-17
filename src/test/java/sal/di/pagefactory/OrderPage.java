package sal.di.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	//
	WebDriver driver;

	//
	public OrderPage(WebDriverFactory wdf) {
		//
		PageFactory.initElements(wdf.driver, this);
		this.driver = wdf.driver;
	}


	//
	@FindBy(linkText =  "FINISH")
	private WebElement btnFinish;
	
	
	public void confirmOrder() {
		btnFinish.click();
		
	}

}
