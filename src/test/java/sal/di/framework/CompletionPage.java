package sal.di.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletionPage {
	//
	Framework fw;

	//
	public CompletionPage(Framework fw) {
		//
		this.fw = fw;
	}


	//
	@FindBy(css =  ".pony_express")
	private WebElement imgPonyExpress;
	
	
	public boolean getOrderStatus() {
		return imgPonyExpress.isDisplayed();
		
	}

}
