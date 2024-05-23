package sal.di.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	//
	Framework fw;

	//
	public OrderPage(Framework fw) {
		//
		this.fw = fw;
	}


	//
	@FindBy(linkText =  "FINISH")
	private WebElement btnFinish;
	
	
	public void confirmOrder() {
		btnFinish.click();
		
	}

}
