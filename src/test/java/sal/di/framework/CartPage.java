package sal.di.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	//
	Framework fw;

	//
	public CartPage(Framework fw) {
		//
		this.fw = fw;
	}


	//
	@FindBy(css = ".checkout_button")
	private WebElement btnCheckout;
	

	
	public void checkooutCart() {
		btnCheckout.click();
		
	}

}
